package assignment5;

public class Cookie extends DessertItem{

    private int number;
    private double pricePerDz;
    private double cost;
    public Cookie(String name, int number, double pricePerDz){
        this.name=name;
        this.number=number;
        this.pricePerDz=pricePerDz/100;
    }

    @Override
    public double getCost() {
        this.cost=Math.round((number*pricePerDz/12)*100)/100;
        return this.cost;
    }

    @Override
    public String getReceiptItem() {
        return this.number + " @ "+this.pricePerDz +" /dz\n"
                +this.name +" "+this.cost;
    }
    //Output
    //M & M Dessert Shoppe
    //--------------------
    //
    //2.25 lbs. @ 3.99 /lb.
    //Peanut Butter Fudge 8.98
    //Vanilla Ice Cream 1.05
    //Hot Fudge Sundae with
    //Choc. Chip Ice Cream 1.95
    //4 @ 3.99 /dz.
    //Oatmeal Raisin Cookies 1.33
    //Tax .87
    //Total Cost 14.18
}
