package assignment5;

public class DessertShoppe {
    public final static double TAX_RATE=6.25;//MA consumer tax 6.25%
    public final static String STORE_NAME="M & M";//store name
    public final static int MAX_ITEM_NAME_SIZE=25;//the maximum size of an item name
    public final static int COST_WIDTH=6;//he width used to display the costs of the items
    public final static int MAX_CHECKOUT_ITEMS=50;// customer can't buy more than 50 items

    public static String cents2dollarsAndCents(int cents){
        String s="";
        if (cents<0){
            s+="-";
            cents*=-1;
        }
        int dollars=cents/100;
        cents=cents%100;
        if (dollars>0)
            s+=dollars;
            s+=".";
        if(cents<10)
            s+="0";
        s+=cents;
        return s;

    }

}
