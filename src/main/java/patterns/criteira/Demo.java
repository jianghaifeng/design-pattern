package patterns.criteira;

import patterns.bridge.Circle;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Robert","Male", false));
        people.add(new Person("Bobby","Male", false));
        people.add(new Person("John","Male", true));
        people.add(new Person("Laura","Female", true));
        people.add(new Person("Diana","Female", false));
        people.add(new Person("Mike","Male", false));

        System.out.println("====>Male:");
        Criteria male = new MaleCriteria();
        printPeople(male.meetCriteria(people));

        System.out.println("====>Married:");
        Criteria married = new MarriedCriteria();
        printPeople(married.meetCriteria(people));

        System.out.println("====>Male & Married:");
        Criteria andCriteria = new AndCriteria(male, married);
        printPeople(andCriteria.meetCriteria(people));
    }

    public static void printPeople(List<Person> people) {
        people.stream().forEach(System.out::println);
    }
}
