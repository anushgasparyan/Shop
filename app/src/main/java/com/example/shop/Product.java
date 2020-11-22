package com.example.shop;

import java.util.Date;
import java.util.Locale;

public class Product {
    private String id;
    private String name;
    private String desc;
    private Category category;
    private double price;
    private int count;
    private int active;
    private double rating;
    private Date date;
    private String[] productID;
    private String[] cardID;
    private String[] wishlistID;

    public Product() {
    }

    public Product(String id, String name, String desc, Category category, double price, int count, int active, double rating, Date date, String[] productID, String[] cardID, String[] wishlistID) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.category = category;
        this.price = price;
        this.count = count;
        this.active = active;
        this.rating = rating;
        this.date = date;
        this.productID = productID;
        this.cardID = cardID;
        this.wishlistID = wishlistID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String[] getProductID() {
        return productID;
    }

    public void setProductID(String[] productID) {
        this.productID = productID;
    }

    public String[] getCardID() {
        return cardID;
    }

    public void setCardID(String[] cardID) {
        this.cardID = cardID;
    }

    public String[] getWishlistID() {
        return wishlistID;
    }

    public void setWishlistID(String[] wishlistID) {
        this.wishlistID = wishlistID;
    }
}
