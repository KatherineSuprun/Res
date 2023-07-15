package MenuRestaurant;

public class Pizza implements FoodProcess<Pizza> {

    public Pizza prepareDough() {
        System.out.println("Roll out the dough..");
        return this;
    }

    public Pizza addIngredients() {
        System.out.println("Add tomatoes, chicken,mushrooms..");
        return this;
}
    @Override
    public Pizza preparingProduct() {
        return FoodProcess.super.preparingProduct();
    }
    @Override
    public Pizza salt() {
        return FoodProcess.super.salt();
    }

    @Override
    public Pizza pepper() {
        return FoodProcess.super.pepper();
    }

}
