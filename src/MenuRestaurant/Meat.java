package MenuRestaurant;

public class Meat implements FoodProcess<Meat> {

    public Meat addThyme() {
        System.out.println("Add thyme..");
        return this;
    }

    public Meat addRosemary() {
        System.out.println("Add rosemary..");
        return this;
}

    @Override
    public Meat preparingProduct() {
        return FoodProcess.super.preparingProduct();
    }
    @Override
    public Meat salt() {
        return FoodProcess.super.salt();
    }

    @Override
    public Meat pepper() {
        return FoodProcess.super.pepper();
    }

}