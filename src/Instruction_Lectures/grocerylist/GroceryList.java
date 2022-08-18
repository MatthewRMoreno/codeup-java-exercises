package Instruction_Lectures.grocerylist;

import Instruction_Lectures.grocerylist.GroceryItem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItem> groceryItems;

    public GroceryList() {
        groceryItems = new ArrayList<>();
    }

    public void addGroceryItem(GroceryItem item) {
        //array specific
        groceryItems.add(item);
    }

    public void printItems() {
        System.out.println("My Grocery List");
        for(GroceryItem item : groceryItems) {
            System.out.println("\t" + item);
        }
    }

    public void removeGroceryItem(String itemName) {
        //find the index of the grocery item with itemName
        int index = -1;
        for (int i = 0; i < groceryItems.size(); i++) {
            GroceryItem item = groceryItems.get(i);
            String itemNameInList = item.getName();
            if(itemNameInList.equalsIgnoreCase(itemName)){
                // we found it in the list so save its index
                index = i;
            }
        }
        //remove the item in the grocery list at that index
        if(index > -1) {
            groceryItems.remove(index);
        }
    }

    public void saveToFile() {
        //1. make a path object
        Path file = makeFileAndDirectory();
        //2. make a temp list of strings that are grocery items and write those to the file
        List<String> tempItems = new ArrayList<>();
        for(GroceryItem item : groceryItems) {
            tempItems.add(item.toString());
        }
        //3. use Files.write to send the data to the file
        try {
            Files.write(file, groceryItems);
        }catch(IOException e) {

        }
    }

    private void makeFileAndDirectory() {
        try {
            Path folder = Paths.get("grocery_list");
            Path file = Paths.get("grocery_list", "data.txt");
            if(Files.exists(folder)) {
                System.out.println("Hey the folder already exists!");
            }else {

            }
        }catch (IOException e) {

        }
    }
}
