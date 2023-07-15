package Worker;

import MenuRestaurant.Food;

import java.util.Map;

public class BurgerMan extends Employee implements Cook {
    private static boolean isBusy = false;

    String bun, meat, cheese, greens, mayonnaise;

    public BurgerMan(String bun, String meat, String cheese, String greens, String mayonnaise) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    @Override
    public boolean cookItem(Food food) {
        return false;
    }

    @Override
    public boolean cookItem(String nameOfDish, Map<String, Food> dishesToChose) {
        return false;
    }
}
