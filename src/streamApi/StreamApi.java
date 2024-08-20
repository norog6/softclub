package streamApi;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("John", 28, "Male", "New York"), new Person("Sarah", 35, "Female", "Los Angeles"), new Person("Mike", 40, "Male", "New York"), new Person("Jessica", 25, "Female", "Chicago"), new Person("Paul", 32, "Male", "New York"), new Person("Anna", 30, "Female", "Boston"));
        List<Order> orders = Arrays.asList(new Order(1, LocalDate.of(2024, 8, 10), Arrays.asList(new Product("Laptop", 1200.0, "Electronics"), new Product("Laptop", 1200.0, "Electronics"), new Product("Mouse", 50.0, "Electronics"))), new Order(2, LocalDate.of(2024, 6, 12), Arrays.asList(new Product("Tablet", 600.0, "Electronics"),

                new Product("Chair", 200.0, "Furniture"))), new Order(3, LocalDate.of(2024, 8, 14), Arrays.asList(new Product("Phone", 800.0, "Electronics"), new Product("Laptop", 1200.0, "Electronics"), new Product("Desk", 350.0, "Furniture"))), new Order(4, LocalDate.of(2024, 7, 15), Arrays.asList(new Product("Monitor", 1300.0, "Electronics"), new Product("Keyboard", 100.0, "Electronics"))));
        List<Student> students = Arrays.asList(new Student("Alice", Arrays.asList(85, 90, 78), "A"), new Student("Bob", Arrays.asList(70, 65, 75), "B"), new Student("Charlie", Arrays.asList(60, 55, 58), "A"), new Student("David", Arrays.asList(95, 92, 88), "B"), new Student("Eva", Arrays.asList(80, 85, 83), "B"));

//        System.out.println(Task2(people));
//        System.out.println(Task3(people));
        Task15(students);
        //System.out.println(Task10(orders));


    }

    //    Задание 1: Анализ и преобразование данных
//    У вас есть список объектов Person, представляющих людей, с полями name, age, gender и city. Напишите программу, которая выполнит следующие задачи:
//    1.Фильтрация: Найдите всех людей, чей возраст больше 30 лет и которые живут в городе "New York".
    private static void Task1(List<Person> people) {
        people.stream().filter(p -> (p.getAge() > 30) && (p.getCity().equals("New York"))).forEach(System.out::println);
    }

    //    2.Группировка: Сгруппируйте людей по городу проживания.
    private static Map<String, List<Person>> Task2(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getCity));
    }

    //    3.Поиск максимального значения: Найдите самого старого человека в каждой группе (каждому городу).
    private static Map<String, Optional<Person>> Task3(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.maxBy(Comparator.comparingInt(Person::getAge))));
    }

    //    4.Преобразование: Преобразуйте каждый объект Person в строку формата "Name: [name], Age: [age], City: [city]" и соберите их в список.
    private static void Task4(List<Person> people) {
        List<String> mod = people.stream().map(p -> " Name: " + p.getName() + " Age: " + p.getAge() + " City: " + p.getCity()).collect(Collectors.toList());
        System.out.println(mod);
    }

    //    5.Подсчет: Подсчитайте, сколько людей из каждого города соответствуют критерию из первого пункта.пункта
    private static void Task5(List<Person> people) {
        Map<String, Long> count = people.stream().filter(p -> p.getAge() >= 30).collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));

        System.out.println(count);
    }

    //### Задание 2: Работа с вложенными структурами
//            1. **Фильтрация**: Найдите все заказы, сделанные в текущем месяце, которые содержат хотя бы один продукт с ценой выше 1000.
    private static void Task6(List<Order> orders) {
        orders.stream().filter(o -> (o.getOrderDate().getMonth().equals(LocalDate.now().getMonth()) && (o.getProducts().stream().anyMatch(p -> p.getPrice() > 1000)))).forEach(order -> System.out.println(order));
    }

    //            2. **Плоское преобразование**: Преобразуйте список заказов в плоский список всех уникальных продуктов, заказанных в этом месяце.
    private static void Task7(List<Order> orders) {
        Set<Product> products = orders.stream().filter(o -> o.getOrderDate().getMonth().equals(LocalDate.now().getMonth())).flatMap(o -> o.getProducts().stream()).collect(Collectors.toSet());
        System.out.println(products);
    }

    //            3. **Сортировка**: Отсортируйте список продуктов по убыванию цены.
    private static void Task8(List<Order> orders) {
        orders.stream().flatMap(o -> o.getProducts().stream()).sorted(Comparator.comparingDouble(Product::getPrice).reversed()).forEach(o -> System.out.println(o));
    }

    //            4. **Агрегация**: Посчитайте общую сумму всех продуктов в этом списке.
    private static void Task9(List<Order> orders) {
        Double sum = orders.stream().flatMap(o -> o.getProducts().stream()).mapToDouble(Product::getPrice).sum();
        System.out.println(sum);
    }

    //            5. **Группировка**: Сгруппируйте продукты по категориям и найдите наиболее дорогой продукт в каждой категории.
    private static Map<String, Optional<Product>> Task10(List<Order> orders) {
        return orders.stream().flatMap(o -> o.getProducts().stream()).collect(Collectors.groupingBy(Product::getCategory, Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))));
    }

    //    ### Задание 3: Анализ данных о студентах
//  1. Преобразование и фильтрация: Преобразуйте список оценок каждого студента в их средний балл и отфильтруйте студентов с средним баллом ниже 60.
    private static void Task11(List<Student> students) {
        students.stream().filter(s -> s.getScores().stream().mapToInt(Integer::intValue).average().orElse(0) <= 60).forEach(System.out::println);
    }

    //            2. Группировка и сортировка: Сгруппируйте студентов по группам и внутри каждой группы отсортируйте студентов по их среднему баллу по убыванию.
    private static void Task12(List<Student> students) {
        Map<String, List<Student>> groupedAndSortedStudents = students.stream().collect(Collectors.groupingBy(Student::getGroup, Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().sorted(Comparator.comparingDouble(Student::averageScore).reversed()).collect(Collectors.toList()))));
    }

    //            3. Поиск топ-студента: Найдите студента с самым высоким средним баллом в каждой группе.
    private static void Task13(List<Student> students) {
        Map<String, Optional<Student>> topStudentsByGroup = students.stream().collect(Collectors.groupingBy(Student::getGroup, Collectors.maxBy(Comparator.comparingDouble(Student::averageScore))));
    }

    //            4. Объединение: Соберите всех студентов в одну строку формата "Group: [group], Top Student: [name], Average Score: [averageScore]" и выведите список таких строк.
    private static void Task14(List<Student> students) {
        List<String> result = students.stream().collect(Collectors.groupingBy(Student::getGroup, Collectors.maxBy(Comparator.comparingDouble(Student::averageScore)))).entrySet().stream().map(entry -> {
            String group = entry.getKey();
            Student topStudent = entry.getValue().orElse(null);
            return String.format("Group: %s, Top Student: %s, Average Score: %.2f", group, topStudent != null ? topStudent.getName() : "N/A", topStudent != null ? topStudent.averageScore() : 0.0);
        }).collect(Collectors.toList());
        System.out.println(result);
    }

    //5. Поиск минимального значения: Найдите группу с наименьшим средним баллом среди всех студентов.
    private static void Task15(List<Student> students) {
        String s = students.stream().collect(Collectors.groupingBy(Student::getGroup, Collectors.averagingDouble(Student::averageScore))).entrySet().stream().min(Map.Entry.comparingByValue()).map(m -> m.getKey() + " " + m.getValue()).orElse("no such group");
        System.out.println(s);
    }
}
