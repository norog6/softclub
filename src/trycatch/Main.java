package trycatch;

import streamApi.Person;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Person> people = Arrays.asList(new Person("John", 28, "Male", "New York"), new Person("Sarah", 35, "Female", "Los Angeles"), new Person("Mike", 40, "Male", "New York"), new Person("Jessica", 25, "Female", "Chicago"), new Person("Paul", 32, "Male", "New York"), new Person("Anna", 30, "Female", "Boston"));
        Resources res = new Resources(people.stream(), 1);
        System.out.println("Чтение файла");
        TaskResources();
        System.out.println("Проверяемые ошибки");
        TaskCheckedExceptions();
        System.out.println("Error");
        Errors();
        System.out.println("Стрим с ресурсами");
        StreamWithResources(res);
    }

    private static void TaskResources() {
        try (Stream<String> stream = Files.lines(Paths.get("/home/oem/IdeaProjects/softclub/src/text.txt"))) {
            stream.forEach(System.out::println);
            {
            }
        } catch (IOException e) {
            System.out.println("wrong name " + e.getMessage());
        } finally {
            System.out.println("Файл закончился");
        }
    }

    private static void TaskCheckedExceptions() {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an index <5: ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        }
    }

    private static void Recursion() {
        System.out.println("Recursion");
        Recursion();
    }

    private static void Errors() {
        try {
            Recursion();
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        }
    }

    private static void StreamWithResources(Resources res) {
        try (var data = res.getStream()) {
            data.filter(d -> d.getAge() > 30)
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try (var data = res.getStream()) {
            System.out.println(data.count());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
