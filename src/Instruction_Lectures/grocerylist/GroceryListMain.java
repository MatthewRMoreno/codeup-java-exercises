package Instruction_Lectures.grocerylist;

import Instruction_Lectures.grocerylist.GroceryItem;
import Instruction_Lectures.grocerylist.GroceryList;

public class GroceryListMain {
    public static void main(String[] args) {
//        GroceryItem [] groceryList = new GroceryItem[10];
//        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        GroceryList groceryList = new GroceryList();

        GroceryItem bananas = new GroceryItem("Bananas", 5);
        GroceryItem tocino = new GroceryItem("Bacon", 10);

        //add items to the list
        groceryList.addGroceryItem(bananas);
        groceryList.addGroceryItem(tocino);

        groceryList.printItems();

        groceryList.removeGroceryItem("Bacon");
        groceryList.printItems();

        groceryList.setItemQuantity("Oranges", 12);
        GroceryItem anItem = groceryList.getItemByName("Oranges");
        System.out.println(anItem);

        anItem = groceryList.getItemByName("Tangerines");

        GroceryListGateway.writeToFile(groceryList);

        GroceryList list2 = GroceryListGateway.readFromFile();
        System.out.println("list2's contents");
        list2.printItems();
    }
}
