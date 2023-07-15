package Worker;
import MenuRestaurant.Food;

import java.util.Map;

public class AquaMan extends Employee implements Cook {
    private static boolean isBusy = false;


    @Override
    public boolean cookItem(Food food) {
        return false;
    }

    @Override
    public boolean cookItem(String nameOfDish, Map<String, Food> dishesToChose) {
        isBusy = true;
        return false;
    }
}
