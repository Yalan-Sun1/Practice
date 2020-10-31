package assignment5;

public abstract class DessertItem {
    protected String name;

    public abstract double getCost();//round方法写在后边

    public abstract String getReceiptItem();

    public DessertItem(){
        this.name="";
    }
    public DessertItem(String name){

    }
    public final String getName(){
        return name;
    }


}
