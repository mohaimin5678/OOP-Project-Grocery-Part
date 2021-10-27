package GroceryPart;

public class Tea {
    public String name;
    public double price;
    public int pieces;

    //method overloading
    public Tea(String name, double price){
        this.name = name;
        this.price = price;
    }
    public Tea(String name, int pieces, double price){
        this.name = name;
        this.pieces = pieces;
        this.price = price;
    }
}
