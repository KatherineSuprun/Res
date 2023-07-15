package Worker;

import MenuRestaurant.Food;
import MenuRestaurant.MenuTEST;

import java.util.*;

public class Baker extends Employee implements Cook {

    Map<String, Food> dishesToCook = Map.of("Bread", new Food
            ("Bread", 10,List.of("bread,bread"), true) {
        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public List<String> getIngredients() {
            return super.getIngredients();
        }

        @Override
        public boolean isReady() {
            return super.isReady();
        }
    });
    public Baker(String name, String surname, String contactNumber, Map<String, Food> dishesToCook) {
        super(name, surname, contactNumber);
        this.dishesToCook = this.dishesToCook;
    }

    @Override
    public boolean cookItem(Food food) {
        return false;
    }
    @Override
    public boolean cookItem(String nameOfDish, Map<String, Food> dishesToChose) {
        ingredients(List.of("Meat", "Pizza"));
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

    private void ingredients(List<String> ings) {
        List<String> chopped = ings.stream().map(i -> i+ " is being chopped").toList();
        chopped.forEach(System.out::println);
    }
}

