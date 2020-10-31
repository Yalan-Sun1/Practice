package assignment5;
import java.util.ArrayList;
public class Checkout {
    private static final double TAX_RATE=6.25;//MA tax
    private ArrayList<DessertItem> register;
    public Checkout(){
        register =new ArrayList<>();
    }

    public void clear (){
        register.clear();
        System.out.println("System cleared");//clear the Checkout to begin a new one
    }
    public void enterItem(DessertItem item){
        this.register.add(item); //add a dessert to the item list
    }
    public int numberOfItems(){
        return this.register.size();
    }
    public int totalCost(){//这里是不是用arraylist计算比较合适。。。。
        int tc=0;
        for (DessertItem i:register) {
            tc+=i.getCost();
        }
        return tc;     //total cost of items without tax and return
    }
    public int totalTax(){
        return(int)Math.round(totalCost()*DessertShoppe.TAX_RATE/100.00); //total tax on items in cents
    }
    @Override
    public String toString(){
        String s="\t"+DessertShoppe.STORE_NAME+" Dessert Shop"+"\n";
        s+="\t------------------\n\n";
        for (DessertItem i:register) {
            s+= i.getReceiptItem()+"\n";
        }

        return s;
    }
}
