package tasks.grocery;

//1. Method addGroceryItem
//2. Method printGroceryList
//3. Method removeGroceryItem
//4. Method modifyGroceryItem
//5. Method searchItem


import java.util.ArrayList;

public class GroceryList {
    //Field
    private ArrayList<String> groceryList = new ArrayList<>(); //will dynamically change the List, can hold as manu items(String value) as we need

    //Methods

    //Method - Adding new item to the list
    public void addGroceryItem(String item){
        groceryList.add(item); //take input and put into array
    }

    //Method - Print all list items
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){ //get element one by one from array list
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    //Method - remove grocery item
    public void removeGroceryItem(String item){
        int position = findItem(item);
        //validation
        if(position >= 0){
            groceryList.remove(position);
            System.out.println(item + " was deleted");
        }else {
            System.out.println("Item is not in the list");
        }
    }

    //Method - Modify Grocery list item
    public void modifyGroceryItem(int position, String newItem){ //which change and to which to change. old what to change and new
        //validation
        if(position >= 0 && position < groceryList.size()){
            groceryList.set(position, newItem);
            System.out.println("Grocery item was modified");
        }else{
            System.out.println("Items position is not valid");
        }
    }

    //Method - search item in the list
    public boolean searchItem(String searchItem){
        return findItem(searchItem) >=0; //return boolean true or false
    }

    //Method - Delete all items
    public void deleteAllItems(){ //delete everything from the list
        groceryList.clear();
        System.out.println("All items in the list are deleted");
    }


    //Method - returning items index
    private int findItem(String searchItem){ //private because we use it only in this class
        return groceryList.indexOf(searchItem);
    }



}
