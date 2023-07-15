package MenuRestaurant;
    public interface FoodProcess<T> {

        default T preparingProduct() {
            System.out.println("Preparing the dish...");
            return (T) this;
        }

        default T salt() {
            System.out.println("Salt..");
            return (T) this;
        }

        default T pepper() {
            System.out.println("Add spices..");
            return (T) this;
        }
}
