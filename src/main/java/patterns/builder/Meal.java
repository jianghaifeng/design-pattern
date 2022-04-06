package patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        return (float)items.stream().mapToDouble(Item::price).sum();
    }

    public void showItems() {
        items.stream().forEach(item -> {
            System.out.print("item: " + item.name());
            System.out.print(", packing: " + item.packing().pack());
            System.out.println(", price: " + item.price());
        });
    }
}
