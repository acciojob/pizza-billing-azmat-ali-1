package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheeseAdded;
    private boolean toppingAdded;
    private boolean bagAdded;

    private int cheese;
    private int topping;
    private int bag;
    private boolean bills;

    public Pizza(Boolean isVeg){
        this.bag = 20;
        this.bagAdded=false;

        this.cheese=80;
        this.cheeseAdded=false;

        this.toppingAdded=false;
        this.bills=false;
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.topping=70;
        }
        else{
            price=400;
            this.topping=120;
        }
        bill = "Base Price Of The Pizza: "+price+"\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded){
            this.price+=cheese;
            this.cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
      if(!toppingAdded){
          this.price+=topping;
          this.toppingAdded=true;
      }
    }

    public void addTakeaway(){
        // your code goes here
     if(!bagAdded){
         this.price+=bag;
         this.bagAdded=true;
     }
    }

    public String getBill(){
        // your code goes here
        if(!bills){
       if(cheeseAdded){
           bill+="Extra Cheese Added: "+cheese+"\n";
       }
        if(toppingAdded){
            bill+="Extra Topping Added: "+topping+"\n";
        }
        if(bagAdded){
            bill+="Paperbag Added: "+bag+"\n";
        }
        bill+="Total Price: "+price+"\n";
        bills=true;
        }
        return this.bill;
    }
}
