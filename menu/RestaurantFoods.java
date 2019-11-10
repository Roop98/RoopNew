package com.menu;

import javax.persistence.*;

@Entity
@Table(name = "FOODSTARTERS")
public class RestaurantFoods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STARTERID")
    private int starterId;

    @Column(name = "STARTERNAME")
    private String starterName;

    @Column(name = "DESCRIPTION")
    private String foodDescription;

    @Column(name = "PRICE")
    private float foodPrice;

    @Column(name = "FOODTYPE")
    private String foodType;


    public RestaurantFoods() {
    }


    //public RestaurantFoods(String foodStarters, String foodMainCourse, String drinks, String desserts, Timestamp timestamp) {
    //  this.mainCourse = foodMainCourse;
    //this.starters = foodStarters;
    //this.desserts = desserts;
    //this.drinks = drinks;
    //this.dateTime = timestamp;
    //}

    public RestaurantFoods(String foodStarters, String foodDescription, Float foodPrice) {
        this.foodDescription = foodDescription;
        this.starterName = foodStarters;
        this.foodPrice = foodPrice;
    }

    public RestaurantFoods(String foodStarters, String foodDescription, Float foodPrice, String type) {
        this.foodDescription = foodDescription;
        this.starterName = foodStarters;
        this.foodPrice = foodPrice;
        this.foodType = type;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public float getFoodPrice() {
        return foodPrice;
    }

    public int getStarterId() {
        return starterId;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public String getStarterName() {
        return starterName;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public void setFoodPrice(float foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setStarterId(int starterId) {
        this.starterId = starterId;
    }

    public void setStarterName(String starterName) {
        this.starterName = starterName;
    }


}
