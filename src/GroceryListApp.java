import java_two.util.Input;

import java.util.ArrayList;

public class GroceryListApp {
    private static Input input = new Input();

    public static void main(String[] args) {
        //A user should be prompted if they would like to create a grocery list.
        System.out.println("Would you like to create a grocery list?");
            if (!input.yesNo()) {
                System.out.println("Bye");
                return;
            }

        //If the users picks yes, they should be given the following three prompts:
        ArrayList<GroceryItem> groceries = getGroceryItemsFromUser();

        //User is done inputting items
        System.out.println("Done");
    }

    private static ArrayList<GroceryItem> getGroceryItemsFromUser() {
        ArrayList<GroceryItem> groceries = new ArrayList<>();
        //keep asking user to input items until he/she says done
        while(true){
            printGroceryCategories();

            System.out.println("Enter the number of the category: ");
            int categoryNum = input.getInt(1,2);

            System.out.println("Enter the name of the item: ");
            String itemName = input.getString();

            System.out.println("Enter the quantity of the item: ");
            int itemQty = input.getInt(0, 1000);

            GroceryItem item = new GroceryItem(itemName, categoryNum, itemQty);
            groceries.add(item);

            System.out.println("Would you like to add another grocery item?");
            if (!input.yesNo()) {
                System.out.println();
                return groceries;
            }
        }
    }
    public static void printGroceryCategories(){
        System.out.println("1. Produce");
        System.out.println("2. Meat");
    }

    private static void printGroceryList
            (ArrayList<GroceryItem> groceries) {;
    }
}
