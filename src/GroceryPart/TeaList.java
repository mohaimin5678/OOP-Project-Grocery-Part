package GroceryPart;

public class TeaList extends Tea{
    public TeaList(String name, double price) {
        super(name, price);
    }
    //both are method overloading
    public TeaList(String name, int pieces, double price) {
        super(name, pieces, price);
    }
}
