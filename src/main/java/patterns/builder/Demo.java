package patterns.builder;

public class Demo {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal meal1 = builder.prepareVegMeal();
        System.out.println("VegMeal: ");
        meal1.showItems();
        System.out.println("Total Price: " + meal1.getCost());

        Meal meal2 = builder.prepareChickenMeal();
        System.out.println("ChickenMeal: ");
        meal2.showItems();
        System.out.println("Total Price: " + meal2.getCost());


    }


}
