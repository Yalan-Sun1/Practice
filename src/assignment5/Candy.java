package assignment5;

public class Candy extends DessertItem{
    private double weight;
    private double pricePerPound;
    private double cost;
    public Candy(String name,double weight,double pricePerPound) {
        this.name=name;
        this.weight=weight;
        this.pricePerPound=pricePerPound/100;
    }
    public double getCost(){
        this.cost=Math.round((weight*pricePerPound)*100)/100.0;
        return this.cost;
    }

    @Override
    public String getReceiptItem() {
        return this.weight+ " lbs. @ "+this.pricePerPound+" /lb.\n"
                +this.name + this.cost;
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
