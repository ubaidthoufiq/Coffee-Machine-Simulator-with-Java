package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        int[] resources = {400, 540, 120, 9, 550};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String currentAction = scanner.next();
            switch (currentAction) {
                case "buy":
                    buyAction(resources);
                    break;
                case "fill":
                    fillAction(resources);
                    break;
                case "take":
                    System.out.println("I gave you $" + resources[4]);
                    resources[4] = 0;
                    break;
                case "remaining":
                    printStatus(resources);
                    break;
                case "exit":
                    return;
            }
        }
    }

    public static void printStatus(int[] resources) {

        System.out.println("The coffee machine has:");
        System.out.println(resources[0] + " ml of water");
        System.out.println(resources[1] + " ml of milk");
        System.out.println(resources[2] + " g of coffee beans");
        System.out.println(resources[3] + " disposable cups");
        System.out.println("$" + resources[4] + " of money");
    }

    public static void buyAction(int[] resources) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner scanner = new Scanner(System.in);
        int waterQ = 0, milkQ = 0, beansQ = 0, cashQ = 0;
        switch(scanner.next()) {
            case "1":
                waterQ = 250; beansQ = 16; cashQ = 4;
                break;
            case "2":
                waterQ = 350; beansQ = 20; cashQ = 7; milkQ = 75;
                break;
            case "3":
                waterQ = 200; beansQ = 12; cashQ = 6; milkQ = 100;
                break;
            case "back":
                return;
        }
        if (resources[0] >= waterQ && resources[1] >= milkQ && resources[2] >= beansQ && resources[3] >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            resources[0] -= waterQ;
            resources[1] -= milkQ;
            resources[2] -= beansQ;
            resources[3] -= 1;
            resources[4] += cashQ;
        } else {
            System.out.println("Sorry, not enough resources!");
        }
    }

    public static void fillAction(int[] resources) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        resources[0] += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        resources[1] += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        resources[2] += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        resources[3] += scanner.nextInt();
    }
}

