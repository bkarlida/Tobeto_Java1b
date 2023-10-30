package oopWithNLayered.entities.concretes;

import oopWithNLayered.entities.abstracts.Entity;

public class Car implements Entity {
    private int id;
    private int categoryId;
    private String name;
    private double unitPrice;

    public Car() {}

    public Car(int id, int categoryId, String name, double unitPrice)
    {
        super();
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
