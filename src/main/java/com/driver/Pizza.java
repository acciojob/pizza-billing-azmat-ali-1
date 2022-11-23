package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int topping;
    static  int cheese=80;
    static int paperpag=20;
    static int to=0;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price=300;
            to=0;
            this.topping=70;
        }
        else{
            price=400;
            to=0;
            this.topping=120;
        }
        System.out.println("Base Price Of The Pizza: "+price);

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        System.out.println("Extra Cheese Added: "+cheese);
        to+=cheese;
    }

    public void addExtraToppings(){
        // your code goes here
        System.out.println("Extra Toppings Added: "+topping);
        to+=topping;
    }

    public void addTakeaway(){
        // your code goes here
        System.out.println( "Paperbag Added: "+paperpag);
        to+=paperpag;
    }

    public String getBill(){
        // your code goes here
        bill ="Total Price: "+(to+price);
        return this.bill;
    }
}
