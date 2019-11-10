package com.menu;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Foodnames {

    private static final String starterNames[] = {"Butternut Squash Soup", "Yeasted cauliflower,raisins,capers,mint", "Burnt apples with goat's curd,cobnut and watercress",
            "Vegans Ceaser Salad", "Cheddar and leek tarts", "Vegans Spring Rolls"};
    private static final String starterDescription[] = {"Delicious creamy soup with toasted butternut squash seeds,wild mushrooms or cheese toasties", "Tenderly baked cauliflower with fresh spices and herbs",
            "Smoked red apples with sour curd,cobnut and watercress", "Freshly cut vegetables mixed with mayonaisse", "Soft baked pancakes stuffed with cheese and tarts",
            "Long fried rolls stuffed with green veggies"};
    private static final Float starterPrices[] = {7.90f, 8.20f, 6.95f, 7.50f, 5.80f, 7.20f};

    private static final String mainCourseNames[] = {"Vegans Lasagna", "Lentils and Spinach", "Mexican Pasta", "Cuban Beans and Rice", "French fries", "Garlic bread", "Vegetable in black pepper sauce",
            "Mexican Bean Burger", "Vegetarian fried rice"};
    private static final Float mainCoursePrice[] = {12.45f, 11.20f, 10.50f, 12.90f, 12.50f, 12.30f, 13.40f, 12.50f, 9.60f};
    private static final String mainDescription[] = {"Baked square pancake with veggies", "Boiled lentils and fried spinach in mushroom sauce",
            "Whole grain spaghetti melted in parmesan cheese", "White rice dipped in brown baked beans", "Golden fried potatoes with ketchup",
            "Smoked bread in garlic", "Green leafy vegetable in chilli black sauce", "Old school burger stuffed with veg patty and cheese", "Chinese style rice with green peas"};
    private static final String dessertNames[] = {"Soda pop ice cream", "Dairy free chocolate pudding", "Vegan Brownies"};
    private static final Float desertPrices[] = {6.90f, 8.00f, 7.50f};
    private static final String dessertDescription[] = {"Ice cream dipped in white soda and topped with whipped cream", "Chocolate soy pudding", "Dark chocolate flakes"};

    private static final String drinksNames[] = {"Bloody Mary(8cl)", "Vodka Martini(8cl)", "Mai Tai(8cl)", "Coca-cola(500 ml)", "Juice(apple,orange,tomato,pineapple) (300ml)"};
    private static final Float drinksPrices[] = {4.50f, 4.00f, 6.90f, 5.00f, 3.50f};
    private static final String drinksDescription[] = {"World class vodka", "One of the famous vodkas", "Strong Rum", "Soft Drink", "Variety of juices"};

    public void addNames(RestaurantFoods restaurantFoods) {
        Transaction transaction = null;
        try {
            Session session = VeganRestaurantutil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(restaurantFoods);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < drinksNames.length; i++) {
            RestaurantFoods foodStarters = new RestaurantFoods(drinksNames[i], drinksDescription[i], drinksPrices[i], "Drinks");
            Foodnames foodnames = new Foodnames();
            foodnames.addNames(foodStarters);
        }
    }
}
