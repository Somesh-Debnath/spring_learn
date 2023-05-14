package com.cts.assignment;

public class ShoppingCart {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "ShoppingCart [id=" + id + ", items=" + items + "]";
    }
    private Item items;
    public Item getItems() {
        return items;
    }
    public void setItems(Item items) {
        this.items = items;
    }
}
