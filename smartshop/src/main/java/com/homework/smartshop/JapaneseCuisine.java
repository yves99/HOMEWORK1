package com.homework.smartshop;

public class JapaneseCuisine {

    private String id;
    private String menu;
    private String category;
    private String description;
    private int price;

    public JapaneseCuisine(String id, String menu, String category, int price, String description){
        this.id = id;
        this.menu = menu;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getMenu(){
        return this.menu;
    }
    public void setMenu(String menu){
        this.menu = menu;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

}
