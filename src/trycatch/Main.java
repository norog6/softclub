package trycatch;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       Errors();
    }

    private static void TaskResources() {
        FileReader reader = null;

        try (Stream <String> stream = Files.lines(Paths.get("/home/oem/IdeaProjects/softclub/src/text.txt"))) {
            stream.forEach(System.out::println); {
            }
        } catch (IOException e) {
            System.out.println("wrong name "+e.getMessage());
        } finally {
            System.out.println("Файл закончился");
                }
            }
         private static void TaskCheckedExceptions() {
             int[] numbers = {10, 20, 30, 40, 50};
             Scanner scanner = new Scanner(System.in);

             try {
                 System.out.print("Enter an index: ");
                 int index = scanner.nextInt();
                 System.out.println("Element at index " + index + ": " + numbers[index]);
             } catch (ArrayIndexOutOfBoundsException e) {
                 System.out.println("Invalid index: " + e.getMessage());
             }
         }
         public static void Recursion() {
             System.out.println("Recursion");
        Recursion();
         }
         public static void Errors() {
        try{
            Recursion();
        }catch (StackOverflowError e){
            //System.out.println("asdasda   " + e.getMessage());
        }
    }
}
