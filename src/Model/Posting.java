package Model;

import java.util.ArrayList;

public class Posting {
    private int id;
    private String itemName;
    private String description;
    private ArrayList<Item> inventory;
    private RegisteredCustomer owner;

    public Posting(int id, String itemName, String description, ArrayList<Item> inventory, RegisteredCustomer owner) {
        this.id = id;
        this.itemName = itemName;
        this.description = description;
        this.inventory = inventory;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public RegisteredCustomer getOwner() {
        return owner;
    }

    public void setOwner(RegisteredCustomer owner) {
        this.owner = owner;
    }

    public void displayPosting() {
        System.out.println("-----------------------");
        System.out.println("Posting: " + this.itemName);
        System.out.println("Description: " + this.description);
        for (Item inventory : this.inventory) {
            System.out.println("items: " + inventory.getItem());
        }
        System.out.println("owner: " + owner);

    }
}
