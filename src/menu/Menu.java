package menu;

import java.util.Scanner;

public class Menu {

        static String scan1() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Name: ");
            String name = scan.next();
            return name;
        }

        static double scan() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Price: ");
            double price = scan.nextDouble();
            return price;
        }


        public static void main(String[] args) {
            int count = 0;
            String name;
            double price;

            String[] array = new String[3];
            double[] array1 = new double[3];

            for (int i = 0; i < array.length; i++) {
                System.out.println();
                name = scan1();
                price = scan();
                array[i] = name;
                array1[i] = price;
                count++;
                for (int j = 0; j < count; j++) {

                    System.out.println(array[j] + " - " + array1[j]);

                }
            }
        }



/*
Phase 1:

        Create a menu with options:

        1. Add an item
        2. Display all items

        An item contains name & price.

        When adding an item, ask for a name and price of the item.
        Example:
        Name: Apple
        Price ($): 0.99

        When displaying all items, display item name and price. Example: Apple - $0.99


        Commit and push all the code to the above repository.




 */





}
