package dz.jtsgen.example;

import dz.jtsgen.annotations.TypeScript;

import java.util.List;

@TypeScript
public class Order {
    private Person customer;
    private List<Item> items;

    public Order(Person customer, List<Item> items) {
        this.customer = customer;
        this.items = items;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}