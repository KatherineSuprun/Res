package Worker;

import MenuRestaurant.Food;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MeatMan extends Employee implements Cook {
    //    private static boolean isBusy = false;
//    String veal, rosemary, oil, salt;
    Map<String, Food> dishesToCook;
//    public MeatMan(String veal, String rosemary, String oil, String salt) {
//        this.veal = veal;
//        this.rosemary = rosemary;
//        this.oil = oil;
//        this.salt = salt;
//    }
//    public static void cookingMeat() {
//
//        isBusy = true;
//        System.out.println("The meat is cooking");
//    }

    @Override
    public boolean cookItem(Food food) {
        return false;
    }
// ПриготовитьБлюдо(строка ИмяБлюда, Мапа Строка, Еда  блюдоНаВыбор
    // ЕдаКласс = блюдоНаВыбор.значение,поток,отфильтровать и вывести имяБлюда
    @Override
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
