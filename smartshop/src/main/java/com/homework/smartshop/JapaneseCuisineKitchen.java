package com.homework.smartshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JapaneseCuisineKitchen{

    private static List<JapaneseCuisine> japaneseMenu = new ArrayList<>(Arrays.asList(
            new JapaneseCuisine("d0001", "Salmon Donburi", "Donburi", 190, "Rice bowl topped with Soy - marinated sashimi salmon."),
            new JapaneseCuisine("d0002", "Tempura Donburi", "Donburi", 119, "Rice bowl topped with crispy Tempura."),
            new JapaneseCuisine("n0001", "Spicy Ramen Champion", "Noodle", 159, "Spicy ramen soup topped with soft boiled egg, nori and tender chashu."),
            new JapaneseCuisine("n0002", "Sukiyaki Pork Udon", "Noodle", 155, "Sukiyaki soup that comes with udon. Top up with beef, chashu, and naruto(fish cake)."),
            new JapaneseCuisine("b0001", "Chicken Bento", "Bento", 199, "Bento box consists of pieces of chicken cooked in sauce served over rice."),
            new JapaneseCuisine("b0002", "Fish Bento", "Bento", 199, "Bento box consists of fish cooked in sauce served over rice."),
            new JapaneseCuisine("a0001", "California Roll", "Appetizer", 155, "A sushi rolled inside-out, containing cucumber, crab or imitation crab, and avocado."),
            new JapaneseCuisine("a0001", "Takoyaki", "Appetizer", 129, "Grilled octopus balls consisting of a pancake-like batter and a piece of octopus as a filling.")
    ));

    public static String getAllMenu(){
        String menu = "<b><u>Japanese Recommended Menu</u></b><br><br>";
        int counter = 1;
        for(int i = 0; i < japaneseMenu.size(); i++){
            String name = japaneseMenu.get(i).getMenu();
            String category = japaneseMenu.get(i).getCategory();
            int price = japaneseMenu.get(i).getPrice();
            menu += counter + ". " + name + ", Category: " + category + ", Price: " + price + " Bath" + "<br>";
            counter ++;
        }
        return menu;
    }

    public static String Description(String id){
        for(int i = 0; i < japaneseMenu.size(); i++){
            String name = japaneseMenu.get(i).getMenu();
            String description = japaneseMenu.get(i).getDescription();
            if (japaneseMenu.get(i).getId().equals(id)){
                return "<b><u>" + name + "</u></b><br><br>" + description;
            }
        }
        return "Menu not found.";
    }

    public static String calculate(String id){
        String[] idList = id.split(",");
        int total = 0;
        for (String searchID : idList){
            for(int i = 0; i < japaneseMenu.size(); i++){
                if (japaneseMenu.get(i).getId().equals(searchID) ){
                    total += japaneseMenu.get(i).getPrice();
                    break;
                }
            }
        }
        return "<b><u>Total Price</u></b><br><br>" + total + " Bath";
    }

}
