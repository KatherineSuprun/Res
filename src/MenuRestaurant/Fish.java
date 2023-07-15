package MenuRestaurant;

public class Fish implements FoodProcess<Fish> {

    static String pack;
    static String removeTheBone;

    public static String getPack() {
        System.out.println("Packing");
        return pack;
    }

    public static String getRemoveTheBone() {
        System.out.println("Removing the bones");
        return removeTheBone;
    }

    public Fish addLemon() {
        System.out.println("Add lemon..");
        return this;
    }

    public Fish wrapInFoil() {
        System.out.println("Wrap in foil..");
        return this;
    }
    @Override
    public Fish preparingProduct() {
        return FoodProcess.super.preparingProduct();
    }
    @Override
    public Fish salt() {
        return FoodProcess.super.salt();
    }

    @Override
    public Fish pepper() {
        return FoodProcess.super.pepper();
    }

}
