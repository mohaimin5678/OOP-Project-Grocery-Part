package GroceryPart;

public interface Masala {
    default void intro(){
        System.out.println("These are the list of different types of Masala");
    }
    public void masalaList();
}
