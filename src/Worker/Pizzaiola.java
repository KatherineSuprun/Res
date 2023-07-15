package Worker;

import MenuRestaurant.CookingProcess;
import MenuRestaurant.Food;
import MenuRestaurant.FoodProcess;
import MenuRestaurant.Pizza;

import java.util.Map;

public class Pizzaiola extends Employee implements Cook, FoodProcess {
   Pizzaiola pizzaiola = new Pizzaiola();
        @Override
    public boolean cookItem(Food food) {
        return false;
    }

    @Override
    public boolean cookItem(String nameOfDish, Map<String, Food> dishesToChose) {
        return false;
    }
}
