package com.example.shop;

public class User {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private int active;
    private Type type;
    private String[] productID;
    private String[] cardID;
    private String[] wishlistID;

    public User() {
    }

    public User(String id, String name, String surname, String email, String password, int active, Type type, String[] productID, String[] cardID, String[] wishlistID) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.active = active;
        this.type = type;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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
