package patterns.criteira;

public class Person {
    private String name;
    private String gender;
    private boolean isMarried;

    public Person(String name, String gender, boolean isMarried) {
        this.name = name;
        this.gender = gender;
        this.isMarried = isMarried;
    }

    public String getGender() {
        return gender;
    }

    public boolean isMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
