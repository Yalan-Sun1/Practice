package assignment5;

public class Sundae extends IceCream{
    private double toppingsCost,cost;
    private String toppingName;
    public Sundae(String name, double iceCost, String toppingName, double toppingsCost){
        super(name, iceCost);
        this.toppingName = toppingName;
        this.toppingsCost=toppingsCost/100;
    }

    @Override
    public double getCost() {
        this.cost=super.getCost()+this.toppingsCost;
        return this.cost;
    }

    @Override
    public String getReceiptItem() {
        return this.name+" with\n"
                +this.toppingName +" "+this.toppingsCost;
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
