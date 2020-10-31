package assignment5;

public class IceCream extends DessertItem{
    private double cost;
    public IceCream(String name,double cost){
        this.name=name;
        this.cost=cost;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public String getReceiptItem() {
        String item=String.format("%-10s\t%.2f\n",name,cost);
        return item;
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
