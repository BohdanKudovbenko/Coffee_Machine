package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterHas = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkHas = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int gramsOfCoffeeHas = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsNeeded = sc.nextInt();

        int water = waterHas / 200;
        int milk = milkHas / 50;
        int coffee = gramsOfCoffeeHas / 15;


        int countCanMake = (milk >= water) ?
                ((water >= coffee) ? coffee : water)
                : ((milk >= coffee) ? coffee : milk);

        if (waterHas >= 200 * cupsNeeded && milkHas >= 50 * cupsNeeded && gramsOfCoffeeHas >= 15 * cupsNeeded && cupsNeeded == countCanMake) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (waterHas >= 200 * cupsNeeded && milkHas >= 50 * cupsNeeded && gramsOfCoffeeHas >= 15 * cupsNeeded && cupsNeeded < countCanMake) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (countCanMake - cupsNeeded) + " more than that)");
        } else {
            System.out.println("No, I can make only " + countCanMake + " cup(s) of coffee");
        }


    }
}


