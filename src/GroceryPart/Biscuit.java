package GroceryPart;

public interface Biscuit {
    default void intro(){
        System.out.println("These are the list of different types of Biscuits\n");
    }
    public void biscuitList();
}
