package MenuRestaurant;

import java.util.Map;
import java.util.Optional;

public class Burger implements FoodProcess<Burger> {
String pack, cutlet, tomatoes, cheese, salat, cucumber;

    public String getCutlet() {
        System.out.println("Beef cutlet is fried");
        return cutlet;
    }

    public String getTomatoes() {
        System.out.println("Adding tomatoes");
        return tomatoes;
    }

    public String getCheese() {
        System.out.println("Adding cheese");
        return cheese;
    }

    public String getSalat() {
        System.out.println("Adding a salad");
        return salat;
    }

    public String getCucumber() {
        System.out.println("Add cucumber");
        return cucumber;
    }

    public Burger addBun() {
        System.out.println("Preparing buns.. :)");
        return this;
    }

    public Burger cutCut() {
        System.out.println("Cut cucumbers..");
        return this;
    }
    public String packing() {
        System.out.println("Pack...") ;
        return pack;
    }
    public static void cookBurger() {
        Burger burgers = new Burger();
        burgers.getCutlet();
        burgers.getTomatoes();
        burgers.getCheese();
        burgers.getSalat();
        burgers.getCucumber();
        burgers.packing();
    }

    @Override
    public Burger preparingProduct() {
        return FoodProcess.super.preparingProduct();
    }

    @Override
    public Burger salt() {
        return FoodProcess.super.salt();
    }

    @Override
    public Burger pepper() {
        return FoodProcess.super.pepper();
    }

    public boolean cookItem(String nameOfDish, Map<String, Food> dishesToChose) {
        Optional<Food> f = dishesToChose.values().stream().filter(d -> d.getName().equals(nameOfDish))
                .findFirst();
        if (f.isPresent()) {
            Food food = f.get();
            System.out.println("Dish consists of:");
            food.getIngredients().forEach(System.out::println);
            food.setReady(true);
            return food.isReady();
        }
        return false;
    }
}