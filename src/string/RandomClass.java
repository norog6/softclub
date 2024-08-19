package string;

public class RandomClass {
    private String name;
    private int age;

    public RandomClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
