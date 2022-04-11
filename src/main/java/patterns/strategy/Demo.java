package patterns.strategy;

public class Demo {
    public static void main(String[] args) {
        Context contextAdd = new Context(new AddStrategy());
        Context contextSub = new Context(new SubStrategy());

        System.out.println("5 + 2 = " + contextAdd.calculate(5, 2));
        System.out.println("5 - 2 = " + contextSub.calculate(5, 2));
    }
}
