package com.example.foodapp.model;

public class AsiaFood {

    String name, price,restaurantname,rating;
    Integer imageUrl;

    public AsiaFood(String name, String price, String restaurantname, String rating, Integer imageUrl){
        this.name=name;
        this.price=price;
        this.imageUrl=imageUrl;
        this.restaurantname=restaurantname;
        this.rating=rating;
    }

    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
