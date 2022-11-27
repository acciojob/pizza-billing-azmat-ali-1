package com.driver;

public class Pizza {

    private int price;
    private int baseprice;
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
            this.baseprice=300;
            this.topping=70;
        }
        else{
            this.price=400;
            this.baseprice=400;
            this.topping=120;
        }
        this.bill = "Base Price Of The Pizza: "+price+"\n";

    }

    public int getPrice(){

        return this.baseprice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.cheeseAdded){
            this.price+=cheese;
            this.cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
      if(!this.toppingAdded){
          this.price+=topping;
          this.toppingAdded=true;
      }
    }

    public void addTakeaway(){
        // your code goes here
     if(!this.bagAdded){
         this.price+=bag;
         this.bagAdded=true;
     }
    }

    public String getBill(){
        // your code goes here
        if(!bills){
       if(cheeseAdded){
           this.bill+="Extra Cheese Added: "+this.cheese+"\n";
       }
        if(toppingAdded){
            this.bill+="Extra Topping Added: "+this.topping+"\n";
        }
        if(bagAdded){
            this.bill+="Paperbag Added: "+this.bag+"\n";
        }
        this.bill+="Total Price: "+this.price+"\n";
        bills=true;
        }
        return this.bill;
    }
}
