package Instruction_Lectures.grocerylist;

import Instruction_Lectures.grocerylist.GroceryItem;
import Instruction_Lectures.grocerylist.GroceryList;

public class GroceryListMain {
    public static void main(String[] args) {
//        GroceryItem [] groceryList = new GroceryItem[10];
//        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        GroceryList grocerylist = new GroceryList();

        GroceryItem bananas = new GroceryItem("Bananas", 5);
        GroceryItem tocino = new GroceryItem("Bacon", 10);

        //add items to the list
        grocerylist.addGroceryItem(bananas);
        grocerylist.addGroceryItem(tocino);

        grocerylist.printItems();

        grocerylist.removeGroceryItem("Bacon");
        grocerylist.printItems();

        grocerylist.saveToFile();
    }
}
