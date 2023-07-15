package MenuRestaurant;
import java.util.List;

public abstract class Food {

    private String name;
    private Integer price;
    private List<String> ingredients;
    private boolean isReady;

    public Food(String name, Integer price, List<String> ingredients, boolean isReady) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.isReady = isReady;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }
}
