package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hash12();

    }

    //Arraylist
    //1 Write a Java program to create an array list, add some colors (strings) and print out the collection.
    private static void Arr1() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println(colors);
    }

    //2 Write a Java program to iterate through all elements in an array list.
    private static void Arr2() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        for (String color : colors) {
            System.out.println("color=" + color);
        }
    }

    //3 Write a Java program to insert an element into the array list at the first position.
    private static void Arr3() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add(0, "purple");
        System.out.println(colors);
    }

    //4 Write a Java program to retrieve an element (at a specified index) from a given array list.
    private static void Arr4() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        String color = colors.get(1);
        System.out.println(color);
    }

    //5. Write a Java program to update an array element by the given element.
    private static void Arr5(String oldColor, String newColor) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        for (String color : colors) {
            if (color.equals(oldColor)) {
                color = newColor;
            }
        }
        System.out.println(colors);
    }

    //6. Write a Java program to remove the third element from an array list.
    private static void Arr6() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        colors.remove(2);
        System.out.println(colors);
    }

    //7. Write a Java program to search for an element in an array list.
    private static void Arr7(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        System.out.println(colors.indexOf(color));
    }

    // 8. Write a Java program to sort a given array list.
    private static void Arr8() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        Collections.sort(colors);
        System.out.println(colors);
    }

    // 9. Write a Java program to copy one array list into another.
    private static void Arr9() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        ArrayList<String> anotherColors = new ArrayList<>();
        anotherColors.addAll(colors);
        System.out.println(anotherColors);
    }

    //10. Write a Java program to shuffle elements in an array list.
    private static void Arr10() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        Collections.shuffle(colors);
        System.out.println(colors);
    }

    //11. Write a Java program to reverse elements in an array list.
    private static void Arr11() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        Collections.reverse(colors);
        System.out.println(colors);
    }

    //12. Write a Java program to extract a portion of an array list.
    private static void Arr12(int start, int end) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        List<String> anotherColors = colors.subList(start, end);
        System.out.println(anotherColors);
    }

    //13. Write a Java program to compare two array lists.
    private static void Arr13() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("red");
        colors2.add("crimson");
        colors2.add("orange");
        if (colors.equals(colors2)) {
            System.out.println("равны");
        } else System.out.println("не равны");
    }

    //14. Write a Java program that swaps two elements in an array list.
    private static void Arr14() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        Collections.swap(colors, 0, 2);
        System.out.println(colors);
    }

    //15. Write a Java program to join two array lists.
    private static void Arr15() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("white");
        colors2.add("crimson");
        colors2.add("orange");
        colors.addAll(colors2);
        System.out.println(colors);
    }

    //16. Write a Java program to clone an array list to another array list.
    private static void Arr16() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        ArrayList<String> colors2 = new ArrayList<>(colors);
        colors.add("white");
        System.out.println(colors2);
    }

    //17. Write a Java program to empty an array list.
    private static void Arr17() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.clear();
        System.out.println(colors);
    }

    //18. Write a Java program to test whether an array list is empty or not.
    private static void Arr18() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        if (colors.isEmpty()) {
            System.out.println("Empty");
        } else System.out.println("not empty");
        System.out.println(colors);
    }

    //19. Write a Java program for trimming the capacity of an array list.
    private static void Arr19() {
        ArrayList<String> colors = new ArrayList<>(100);
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.trimToSize();
        System.out.println(colors);
    }

    //20. Write a Java program to increase an array list size.
    private static void Arr20() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.ensureCapacity(10);
        System.out.println(colors);
    }

    //21. Write a Java program to replace the second element of an ArrayList with the specified element.
    private static void Arr21(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.set(1, color);
        System.out.println(colors);
    }

    //22. Write a Java program to print all the elements of an ArrayList using the elements' position.
    private static void Arr22() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("position=" + i + "color=" + colors.get(i));
        }
    }
//LinkedList
//    1. Write a Java program to append the specified element to the end of a linked list.
    private static void Linked1(String color){
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add(color);
        System.out.println(colors);
    }
//            2. Write a Java program to iterate through all elements in a linked list.
private static void Linked2(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    ListIterator<String> iterator = colors.listIterator();
    while (iterator.hasNext()) {
        System.out.println("color=" + iterator.next());
    }
}
//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
private static void Linked3(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    ListIterator<String> iterator = colors.listIterator(1);
    while (iterator.hasNext()) {
        System.out.println("color=" + iterator.next());
    }
}
//            4. Write a Java program to iterate a linked list in reverse order.
private static void Linked4(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    ListIterator<String> iterator = colors.listIterator(colors.size());
    while (iterator.hasNext()) {
        System.out.println("color=" + iterator.next());
    }
}
//            5. Write a Java program to insert the specified element at the specified position in the linked list.
private static void Linked5(String color){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    colors.add(1,color);
    System.out.println(colors);
}
//6. Write a Java program to insert elements into the linked list at the first and last positions.
private static void Linked6(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    colors.addLast("orange");
    colors.addFirst("yellow");
    System.out.println(colors);
}
//7. Write a Java program to insert the specified element at the front of a linked list.
private static void Linked7(String color){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    colors.addFirst(color);
    System.out.println(colors);
}
//            8. Write a Java program to insert the specified element at the end of a linked list.
private static void Linked8(String color){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    colors.addLast(color);
    System.out.println(colors);
}
//            9. Write a Java program to insert some elements at the specified position into a linked list.
private static void Linked9(ArrayList<String> color){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    colors.addAll(1,color);
    System.out.println(colors);
}
//            10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
private static void Linked10(String color){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    System.out.println("First"+colors.indexOf(color));
    System.out.println("Last"+colors.lastIndexOf(color));
}
//11. Write a Java program to display elements and their positions in a linked list.
private static void Linked11(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    for (int i=0;i<colors.size();i++){
        System.out.println("index=" + i + "element=" + colors.get(i));
    }
}
//            12. Write a Java program to remove a specified element from a linked list.
private static void Linked12(String color){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    colors.remove(color);
    System.out.println(colors);
}
//13. Write a Java program to remove the first and last elements from a linked list.
private static void Linked13(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    colors.removeFirst();
    colors.removeLast();
    System.out.println(colors);
}
//14. Write a Java program to remove all elements from a linked list.
private static void Linked14(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    colors.clear();
    System.out.println(colors);
}
//            15. Write a Java program that swaps two elements in a linked list.
private static void Linked15(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    Collections.swap(colors,0,2);
    System.out.println(colors);
}
//            16. Write a Java program to shuffle elements in a linked list.
private static void Linked16(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    Collections.shuffle(colors);
    System.out.println(colors);
}
//17. Write a Java program to join two linked lists.
private static void Linked17(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    LinkedList<String> colors2 = new LinkedList<>();
    colors.add("white");
    colors.add("yellow");
    colors.add("crimson");
    colors.addAll(colors2);
    System.out.println(colors);
}
//18. Write a Java program to copy a linked list to another linked list.
private static void Linked18(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    LinkedList<String> colors2 = new LinkedList<>(colors);
    System.out.println(colors2);
}
//19. Write a Java program to remove and return the first element of a linked list.
private static void Linked19(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    System.out.println(colors.pop());
    System.out.println(colors);
}
//20. Write a Java program to retrieve, but not remove, the first element of a linked list.
private static void Linked20(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    System.out.println(colors.getFirst());
    System.out.println(colors);
}
//            21. Write a Java program to retrieve, but not remove, the last element of a linked list.
private static void Linked21(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    System.out.println(colors.getLast());
    System.out.println(colors);
}
//            22. Write a Java program to check if a particular element exists in a linked list.
private static void Linked22(String color){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    if(colors.contains(color)){
        System.out.println("yes");
    }
    else System.out.println("no");
}
//            23. Write a Java program to convert a linked list to an array list.
private static void Linked23(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    ArrayList<String> colors1 = new ArrayList<>(colors);
    System.out.println(colors1);
}
//24. Write a Java program to compare two linked lists.
private static void Linked24(){
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    LinkedList<String> colors2 = new LinkedList<>();
    colors.add("white");
    colors.add("yellow");
    colors.add("crimson");
    if(colors.equals(colors2)){
        System.out.println("same");
    }
    else System.out.println("different");
}
//25. Write a Java program to check if a linked list is empty or not.
private static <T>boolean Linked25(LinkedList<T> colors){

    return colors.isEmpty();
}
//26. Write a Java program to replace an element in a linked list.
private static void Linked26(String oldColor,String newColor) {
    LinkedList<String> colors = new LinkedList<>();
    colors.add("red");
    colors.add("green");
    colors.add("purple");
    Collections.replaceAll(colors,oldColor,newColor);
    System.out.println(colors);
}
//HashSet
//1. Write a Java program to append the specified element to the end of a hash set.
private static void Hash1(String color){
        HashSet<String> colors=new HashSet<>();
    colors.add("purple");
    colors.add("green");
    colors.add("red");
    System.out.println(colors);
        colors.add(color);
    System.out.println(colors);

}

//            2. Write a Java program to iterate through all elements in a hash list.
private static void Hash2(){
    HashSet<String> colors=new HashSet<>();
    colors.add("purple");
    colors.add("green");
    colors.add("yellow");
    colors.add("red");
    Iterator<String> iterator=colors.iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
    System.out.println(colors);

}
//3. Write a Java program to get the number of elements in a hash set.
private static void Hash3(){
    HashSet<String> colors=new HashSet<>();
    colors.add("purple");
    colors.add("red");
    colors.add("green");
    System.out.println(colors.size());

}
//            4. Write a Java program to empty an hash set.
private static void Hash4(){
    HashSet<String> colors=new HashSet<>();
    colors.add("purple");
    colors.add("red");
    colors.add("green");
    colors.clear();
    System.out.println(colors.size());

}
//5. Write a Java program to test if a hash set is empty or not.
private static <T>boolean Hash5(HashSet<T> hashSet){
        return hashSet.isEmpty();
    }
//6. Write a Java program to clone a hash set to another hash set.
private static void Hash6() {
    HashSet<String> colors = new HashSet<>();
    colors.add("purple");
    colors.add("red");
    colors.add("green");
    HashSet<String> colors2 = new HashSet<>(colors);
    System.out.println(colors2);
}
//7. Write a Java program to convert a hash set to an array.
private static void Hash7() {
    HashSet<String> colors = new HashSet<>();
    colors.add("purple");
    colors.add("red");
    colors.add("green");
    String[] colors2 = colors.toArray(new String[colors.size()]);
    System.out.println(colors2);
}
//            8. Write a Java program to convert a hash set to a tree set.
private static void Hash8() {
    HashSet<String> colors = new HashSet<>();
    colors.add("purple");
    colors.add("red");
    colors.add("green");
   TreeSet<String> colors2 = new TreeSet<>(colors);
    System.out.println(colors2);
}
//9. Write a Java program to find numbers less than 7 in a tree set.
private static void Has9() {
    TreeSet<Integer> numbers = new TreeSet<>();
   numbers.add(1);
   numbers.add(2);
   numbers.add(17);
   numbers.add(3);
   numbers.add(4);
   numbers.add(5);
   numbers.add(6);
   numbers.add(7);
   numbers.add(8);
   numbers.add(9);
   numbers.add(10);
   TreeSet<Integer> lessThenSeven = (TreeSet<Integer>) numbers.headSet(7);
    System.out.println(lessThenSeven);
}
//            10. Write a Java program to compare two hash set.
private static void Hash10() {
        HashSet<String> colors = new HashSet<>();
        HashSet<String> colors2 = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors2.add("purple");
        colors2.add("yellow");
        if(colors.equals(colors2)){
            System.out.println("same");
        }
        else System.out.println("different");

}
//11. Write a Java program to compare two sets and retain elements that are the same.
    private static void Hash11() {
        HashSet<String> colors = new HashSet<>();
        HashSet<String> colors2 = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors2.add("purple");
        colors2.add("red");
        System.out.println("same elemets"+colors.retainAll(colors2));
    }
//12. Write a Java program to remove all elements from a hash set.
private static void Hash12() {
    HashSet<String> colors = new HashSet<>();
    colors.add("purple");
    colors.add("red");
    colors.add("green");
    colors.removeAll(colors);
    System.out.println(colors.size());
}
//hash map
//1. Write a Java program to associate the specified value with the specified key in a HashMap.
    private static void HashMap1(Integer key, String value) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(key,value);
        System.out.println(map);
    }
//            2. Write a Java program to count the number of key-value (size) mappings in a map.
private static void HashMap2() {
    HashMap<Integer,String> map = new HashMap<>();
    map.put(1,"kuku");
    map.put(2,"zaza");
    System.out.println(map.size());
}
//            3. Write a Java program to copy all mappings from the specified map to another map.
private static void HashMap3() {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "kuku");
    map.put(2, "zaza");
HashMap<Integer, String> map2 = new HashMap<>(map);
    System.out.println(map2);
}
//4. Write a Java program to remove all mappings from a map.
private static void HashMap4() {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "kuku");
    map.put(2, "zaza");
    map.clear();
    System.out.println(map);
}
//5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
    private static <K,V>boolean HashMap5(HashMap<K,V> map) {

        return map.isEmpty();
    }
//            6. Write a Java program to get a shallow copy of a HashMap instance.
private static void HashMap6() {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "kuku");
    map.put(2, "zaza");
    HashMap<Integer, String> map2 = new HashMap<>(map);
    map2.put(7, "dom");
    System.out.println(map2);
}
//7. Write a Java program to test if a map contains a mapping for the specified key.
    private static void HashMap7(Integer key) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "kuku");
        map.put(2, "zaza");
        if (map.containsKey(key)){
            System.out.println("yes");
        }else System.out.println("no");


    }
//8. Write a Java program to test if a map contains a mapping for the specified value.
private static void HashMap8(String value) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "kuku");
    map.put(2, "zaza");
    if (map.containsValue(value)){
        System.out.println("yes");
    }else System.out.println("no");
}
//9. Write a Java program to create a set view of the mappings contained in a map.
private static void HashMap9() {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "kuku");
    map.put(2, "zaza");
    Set<Map.Entry<Integer, String>> set=map.entrySet();
}

//            10. Write a Java program to get the value of a specified key in a map.
private static void HashMap10(Integer key) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "kuku");
    map.put(2, "zaza");
    String value = map.get(key);
    System.out.println(value);
}
//11. Write a Java program to get a set view of the keys contained in this map.
private static void HashMap11() {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "kuku");
    map.put(2, "zaza");
    Set<Integer> set = map.keySet();
    System.out.println(set);

}
//12. Write a Java program to get a collection view of the values contained in this map.
private static void HashMap12() {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "kuku");
    map.put(2, "zaza");
    Collection<String> collection = map.values();
    System.out.println(collection);
}
}