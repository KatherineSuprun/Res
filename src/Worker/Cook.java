package Worker;

import MenuRestaurant.Food;

import java.util.Map;

public interface Cook {


    boolean cookItem(Food food);

    boolean cookItem(String nameOfDish, Map<String, Food> dishesToChose);

    }

