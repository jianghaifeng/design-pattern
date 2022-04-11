package patterns.iterator;

public class Demo {
    public static void main(String[] args) {
        NameRepo repo = new NameRepo();

        for (Iterator iterator= repo.getIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
