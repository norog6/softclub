package streamApi;

import java.util.List;

public class Student {
    private String name;
    private List<Integer> scores;
    private String group;

    Student(String name, List<Integer> scores, String group) {
        this.name = name;
        this.scores = scores;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public Double averageScore() {
        return this.getScores().stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scores=" + scores +
                ", group='" + group + '\'' +
                '}';
    }
}
