package MenuRestaurant;

import java.lang.reflect.InvocationTargetException;

public class CookingProcess {

    public <T extends FoodProcess> T cook(Class<T> foodType)
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        System.out.println("Cook: " + foodType.getSimpleName());
        return foodType.getDeclaredConstructor().newInstance();
    }
}