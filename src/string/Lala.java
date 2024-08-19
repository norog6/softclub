package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lala {
    public static void main(String[] args) {
        Task19();
    }
//1. Сравнение строк через ==: Напишите программу, которая создает две строки с одинаковым содержимым. Сравните их с помощью оператора ==.
    private static void Task1(){
        String s1="aaz";
        String s2="aaz";
        if(s1==s2){
            System.out.println("Yes");
        }
        else System.out.println("no");

    }
//            2. Сравнение строк через equals(): Напишите программу, которая создает две строки с одинаковым содержимым. Сравните их с помощью метода equals().
private static void Task2(){
    String s1="aaz";
    String s2=new String("aaz");
    if(s1.equals(s2)){
        System.out.println("Yes");
    }
    else System.out.println("no");

}
//            3. Создание строки в пуле строк: Напишите программу, которая создает одну строку с помощью литерала и другую с помощью оператора new. Сравните их с помощью оператора ==.
             private static void Task3(){
        String s1="aaz";
        String s2=new String("aaz");
        if(s1==s2){
            System.out.println("Yes");
        }
        else System.out.println("no");

    }
//            4. Конкатенация строк: Напишите программу, которая создает строку путем конкатенации двух других строк с использованием оператора +.
    private static void Task4(){
        String s1="aaz"+"asdasdas";
        System.out.println(s1);
    }
//            5. Изменение строки: Напишите программу, которая пытается изменить символ в строке по индексу.
    private static void Task5(int index){
        String s1="abc";
        s1=s1.substring(0,index)+"35"+s1.substring(index+1,s1.length());
        System.out.println(s1);
    }
//6. Проверка на пустую строку: Напишите программу, которая проверяет, является ли строка пустой с использованием метода isEmpty().
    private static void Task6(){
        String s1=new String();
        if(s1.isEmpty()){
            System.out.println("Empty");
        }
        else System.out.println("Fine");
    }
//            7. Создание StringBuffer: Напишите программу, которая создает объект StringBuffer, добавляет к нему несколько строк и выводит результат.
private static void Task7(){
        StringBuffer sb=new StringBuffer();
        sb.append("abc");
        sb.append("lalala");
    System.out.println(sb);
}
//            8. Конвертация StringBuffer в строку: Напишите программу, которая создает объект StringBuffer, добавляет к нему строки и затем преобразует его в String.
private static void Task8(){
        StringBuffer sb=new StringBuffer();
        sb.append("abc");
        sb.append("lalala");
        String s1=sb.toString();
    System.out.println(s1.getClass());
    System.out.println(s1);
}
//            9. Использование StringBuilder: Напишите программу, которая создает объект StringBuilder, добавляет несколько строк и преобразует его в строку.
private static void Task9(){
    StringBuilder sb=new StringBuilder();
    sb.append("abc");
    sb.append("lalala");
    String s1=sb.toString();
    System.out.println(s1.getClass());
    System.out.println(s1);
}
//            10. Создание строки с использованием intern(): Напишите программу, которая создает строку с использованием оператора new,
//            а затем вызывает для нее метод intern(). Сравните результаты с помощью оператора ==.
private static void Task10(){
        String s1="abc";
        String s2=new String("abc");
        if(s1==s2){
            System.out.println("yes");
        }else System.out.println("no");
        s2=s2.intern();
    System.out.println("After intern");
        if (s1==s2){
            System.out.println("yes");
        }else System.out.println("no");
}
//            11. Оптимизация работы с String и StringBuffer: Напишите программу,
//            которая многократно выполняет конкатенацию строк с использованием String и StringBuffer. Измерьте время выполнения.
    private static void Task11(){
        String s1=new String();
        StringBuffer s2=new StringBuffer();
        StringBuilder s3=new StringBuilder();
        long start=System.currentTimeMillis();
        for(int i=0;i<=1000000;i++){
            s1+="a";
        }
        System.out.println("String "+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        for(int i=0;i<=1000000;i++){
            s2.append("a");
        }
        System.out.println("StringBuffer "+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        for(int i=0;i<=1000000;i++){
            s3.append("a");
        }
        System.out.println("StringBuilder "+(System.currentTimeMillis()-start));
    }
//12. Создание строки из массива символов: Напишите программу, которая создает строку из массива символов, затем изменяет массив и проверяет строку.
    private static void Task12(){
        List<Integer> i1=new ArrayList<Integer>();
        i1.add(1);
        i1.add(2);
        i1.add(3);
        String s1=i1.toString();
        System.out.println("Int "+ i1);
        System.out.println("String "+s1);
        i1.set(0,10);
        System.out.println("Int "+ i1);
        System.out.println("String "+s1);
    }
//            13. Проверка пула строк на большие объемы данных: Напишите программу, которая генерирует 10 000 строк и добавляет их в пул строк с использованием метода intern().
    private static void Task13(){
        String[] s1=new String[10000];
                for(int i=0;i<10000;i++){
                    s1[i]=i+"asd".intern();
                }
    }
//            14. Реверс строки с использованием StringBuilder: Напишите программу, которая принимает строку и переворачивает ее с помощью метода reverse()
//            в StringBuilder.
private static void Task14(String a){
        StringBuilder s1=new StringBuilder(a) ;
        s1.reverse();
    System.out.println(s1);
}
//            15. Иммутабельность строки в многопоточности: Напишите программу, где несколько потоков одновременно пытаются изменить одну и ту же строку.
    private static void Task15(){
        String s1="Umpa";
        Thread thread1 = new Thread(new Mod(s1, "Thread1"));
        Thread thread2 = new Thread(new Mod(s1, "Thread2"));
        Thread thread3 = new Thread(new Mod(s1, "Thread3"));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Строка:" + s1);

    }
//            16. Сравнение производительности StringBuffer и StringBuilder: Напишите программу,
//            которая многократно выполняет операции над строками в многопоточном окружении, и
//            спользуя StringBuffer и StringBuilder. Измерьте время выполнения.
//17. Сравнение строк в пуле и вне его
// : Напишите программу, которая создает строки с использованием литералов, оператора new, и метода intern().
// Сравните их между собой с помощью оператора ==.
    private static void Task17(){
        String s1="aaa";
        String s2=new String("aaa");
        String s3=new String("aaa").intern();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
    }
//            18. Изменение строки в цикле: Напишите программу, которая в цикле (например, 1 миллион итераций) изменяет строку,
//            добавляя символы, сначала с использованием String, затем StringBuffer, и StringBuilder. Сравните время выполнения.
private static void Task18(){
    String s1=new String();
    StringBuffer s2=new StringBuffer();
    StringBuilder s3=new StringBuilder();
    long start=System.currentTimeMillis();
    for(int i=0;i<=1000000;i++){
        s1+="a";
    }
    System.out.println("String "+(System.currentTimeMillis()-start));
    start=System.currentTimeMillis();
    for(int i=0;i<=1000000;i++){
        s2.append("a");
    }
    System.out.println("StringBuffer "+(System.currentTimeMillis()-start));
    start=System.currentTimeMillis();
    for(int i=0;i<=1000000;i++){
        s3.append("a");
    }
    System.out.println("StringBuilder "+(System.currentTimeMillis()-start));
}
//19. Создание класса с неизменяемым полем String: Напишите класс, у которого есть приватное поле String, и метод для получения значения этого поля.
// Убедитесь, что поле нельзя изменить после создания объекта.
private static void Task19(){
        RandomClass random=new RandomClass("Vasya",22);
        String s=random.getName();
        s="Stepa";
    System.out.println(random);
}
//20. Реализация собственного пула строк: Напишите программу, которая реализует пул строк с использованием коллекции.
// Реализуйте метод для добавления строки в пул и получения строки из пула.
    private static void Task20(){
        StringPool stringPool = new StringPool();

        String s1 = stringPool.addString("a");
        String s2 = stringPool.addString("b");
        String s3 = stringPool.addString("a");

        stringPool.printPool();

        System.out.println("Getting 'a': " + stringPool.getString("a"));
        System.out.println("Getting 'b': " + stringPool.getString("b"));
        System.out.println("Getting 'c': " + stringPool.getString("c")); // Не существует
    }

//            21. Конвертация строки в StringBuilder и обратно: Напишите программу, которая принимает строку, преобразует ее в StringBuilder,
//            модифицирует и затем преобразует обратно в строку.
    private static void Task21(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.append("ratata");
        s.intern();
        System.out.println(sb.toString());
    }
//22. Поиск уникальных строк: Напишите программу, которая находит уникальные строки в массиве строк с использованием метода intern().
    private static void Task22(){
        String[] s={"a","b","c","a","b","d","d"};
        Set<String> allStrings = new HashSet<>();
        Set<String> uniqueStrings = new HashSet<>();

        for (String str : s) {

            String internedStr = str.intern();


            if (allStrings.contains(internedStr)) {
                uniqueStrings.remove(internedStr);
            } else {
                allStrings.add(internedStr);
                uniqueStrings.add(internedStr);
            }
        }
        for (String str : uniqueStrings) {
            System.out.println(str);
        }
    }
//            23. Сравнение строк по лексикографическому порядку: Напишите программу, которая сравнивает две строки по лексикографическому порядку.
    private static void Task23(String s1,String s2){
        int res=s1.compareTo(s2);
        if (res < 0) {
            System.out.println( s1 +  " меньше "  + s2 );
        } else if (res == 0) {
            System.out.println(s1 + " равно " + s2 );
        } else {
            System.out.println( s1 + " больше " + s2);
        }
    }


//            24. Поиск подстроки в строке: Напишите программу, которая ищет подстроку в строке без использования стандартных библиотечных функций.
    private static void Task24(String string, String subString){
        int index=-1;
        for(int i=0;i<string.length()-subString.length();i++){
            for(int j=0;j<subString.length();j++){
                if (string.charAt(i+j) != subString.charAt(j)){break;
                }
                if (j==subString.length()){
                  index=1;
                }
            }
        }
        if(index!=-1){
            System.out.println("Index of substring is:"+index);
        }else System.out.println("no substring");
    }
//25. Глубокое копирование объектов со строками: Напишите программу, которая демонстрирует глубокое копирование объектов, содержащих строки. Убедитесь, что строки не изменяются при копировании.
private static void Task25(){
        String s1="banana";
        String s2=new String(s1);
    System.out.println(s1+" "+s2);
}
}
