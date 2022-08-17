package java_two.groceryapp;
import java_two.util.Input;
import java.util.ArrayList;
import java.util.Collections;

    public class GroceryListApp {
        public static final int Produce = 1;
        public static final int Meat = 2;
        public static final int Dairy = 3;
        public static final int Seafood = 4;
        public static final int Other = 5;


        private static Input input = new Input();

        public static void main(String[] args) {
            // A user should be prompted if they would like to create a grocery list.
            System.out.println("Would you like to create a grocery list?");
            if(!input.yesNo()) {
                System.out.println("Bye");
                return;
            }

            // ask user to keep inputting items until they are done
            ArrayList<GroceryItem> groceries = getGroceryListFromUser();

            // if we got here, then user is done inputting items
            printGroceryList(groceries);

            System.out.println("Done");
        }

        private static ArrayList<GroceryItem> getGroceryListFromUser() {
            ArrayList<GroceryItem> groceries = new ArrayList<>();

            // keep asking user to input items until he/she says done
            while(true) {
                printGroceryCategories();

                System.out.println("Enter the number of the category: ");
                int categoryNum = input.getInt(1,5);

                System.out.print("Enter the name of the item: ");
                String itemName = input.getString();

                System.out.println("Enter the quantity of the item: ");
                int itemQty = input.getInt(0,1000);

                // now that we have the 3 pieces of info for item, make the item
                GroceryItem item = new GroceryItem(itemName, categoryNum, itemQty);
                groceries.add(item);

                System.out.println("Would you like to add another grocery item?");
                if(!input.yesNo()) {
                    return groceries;
                }
            }
        }

        private static void printGroceryCategories() {
            System.out.println("Grocery Categories:");
            System.out.println("1. Produce");
            System.out.println("2. Meat");
            System.out.println("3. Dairy");
            System.out.println("4. Seafood");
            System.out.println("5. Other");

        }

        private static void printGroceryList(ArrayList<GroceryItem> groceries) {
            // 1. for each category
            printGroceryListByCategory(Produce, groceries);
            printGroceryListByCategory(Meat, groceries);
            printGroceryListByCategory(Dairy, groceries);
            printGroceryListByCategory(Seafood, groceries);
            printGroceryListByCategory(Other, groceries);
        }

        private static void printGroceryListByCategory(int category, ArrayList<GroceryItem> groceries) {
            // 2. fetch the grocery items for that category
            ArrayList<GroceryItem> categoryItems = new ArrayList<>();

            for(GroceryItem groceryItem : groceries) {
                if(groceryItem.getCategoryNum() == category) {
                    categoryItems.add(groceryItem);
                }
            }
            // at this point, categoryItems has the grocery items for the given category

            // 3. sort them alphabetically
            Collections.sort(categoryItems);

            // 4. print them w quantity
            if(category == Produce) {
                System.out.println("Produce:");
            } else if(category == Meat){
                System.out.println("Meat:");
            } else if(category == Dairy){
                System.out.println("Dairy:");
            } else if(category == Seafood){
                System.out.println("Seafood:");
            } else {
                System.out.println("Other:");
            }
            System.out.println(categoryItems);
        }
    }
