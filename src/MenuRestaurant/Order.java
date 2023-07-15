package MenuRestaurant;

import java.util.*;

public class Order {

    public static int quantity1;

    public static void createOrder() {

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            System.out.println("Choose the quantity");
        } else {
            System.out.println("You don`t write a word");
        }
        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNextInt()) {
            quantity1 = scanner1.nextInt();
        } else {
            System.out.println("You don`t write a quantity");
        }
        String order = sc.nextLine().toUpperCase();
        Menu dishes = Menu.valueOf(order);

        switch (dishes) {
            case FISH:

                System.out.println("*************");
                System.out.println("To pay " + Price.FISH + " UAH");
                System.out.println("Wait " + Menu.getTime(40) * quantity1 + " min.");
                Fish fish = new Fish();
                Fish.getRemoveTheBone();
                fish.preparingProduct().pepper().salt();
                fish.addLemon().wrapInFoil();
                Fish.getPack();
                break;

            case MEAT:

                System.out.println("*************");
                System.out.println("To pay " + Price.MEAT + " UAH");
                System.out.println("Wait " + Menu.getTime(25) * quantity1 + " min.");
                Meat meat = new Meat();
                meat.preparingProduct().pepper().salt();
                meat.addRosemary().addThyme();
                break;

            case BURGER:

                System.out.println("*************");
                System.out.println("To pay " + Price.BURGER + " UAH");
                System.out.println("Wait " + Menu.getTime(9) * quantity1 + " min.");
                Burger burger = new Burger();
                burger.preparingProduct().pepper().salt();
                burger.addBun().cutCut();
                Burger.cookBurger();
                break;

            case PIZZA:

                System.out.println("*************");
                System.out.println("To pay " + Price.PIZZA + " UAH. ");
                System.out.println("Wait " + Menu.getTime(5) * quantity1 + " min.");
                Pizza pizza = new Pizza();
                pizza.preparingProduct().pepper().salt();
                pizza.prepareDough().addIngredients();
                break;
        }
    }

    public static void createOrder2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to order more? Yes/No ");
        String write = scanner.nextLine().toLowerCase();

        if (write.equals("yes")) {
            System.out.println("Great! Meat, Fish, Burger, Pizza ? Write please");
            createOrder();
        } else if (write.equals("no")){
            System.out.println("We are waiting for you again!");
        }
        System.out.println("Thanks for your order. Bon appetit! ");
    }
}