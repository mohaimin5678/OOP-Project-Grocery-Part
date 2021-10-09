import java.util.Scanner;
public class GroceryMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Grocery");
        System.out.println("Choose Option: ");
        int option;
        option = input.nextInt();
        if(option == 1){
            Grocery.groceryTypes();
            System.out.println("Choose another Option: ");
            int option2 = input.nextInt();
            if (option2 == 1){
                Groceries listrice = new GroceriesInfo();
                listrice.riceList();
                }
            else if (option2 == 2){
                Groceries listdal = new GroceriesInfo();
                listdal.dalList();
            }
            else if (option2 == 3){
                Groceries listsalt = new GroceriesInfo();
                listsalt.saltList();
            }
            else if (option2 == 4){
                Groceries listflour = new GroceriesInfo();
                listflour.flourList();
            }
            else if (option2 == 5){
                Groceries listmasala = new GroceriesInfo();
                listmasala.masalaList();
            }
            else if(option2 == 6){
                Groceries listsuji = new GroceriesInfo();
                listsuji.sujiList();
            }
            else if (option2 == 7){
                Groceries listegg = new GroceriesInfo();
                listegg.eggList();
            }
            else if (option2 == 8){
                Groceries listpeaflour = new GroceriesInfo();
                listpeaflour.peaFlourList();
            }
            else if(option2 == 9){
                Groceries listedibleoil = new GroceriesInfo();
                listedibleoil.edibleOilList();
            }
            else if (option2 == 10){
                Groceries listvinegar = new GroceriesInfo();
                listvinegar.VinegarList();
            }
            else if (option2 == 11){
                Groceries listteabag = new GroceriesInfo();
                listteabag.teaBagList();
            }
            else if (option2 == 12){
                Groceries listteapoly = new GroceriesInfo();
                listteapoly.teaList();
            }
            else if (option2 == 13){
                Groceries listvermicelli = new GroceriesInfo();
                listvermicelli.vermicelliList();
            }
            else if (option2 == 14){
                Groceries listpeanut = new GroceriesInfo();
                listpeanut.peanutList();
            }
            else if (option2 == 15){
                Groceries listbiscuit = new GroceriesInfo();
                listbiscuit.biscuitList();
            }
            else if (option2 == 16){
                Groceries listnoodles = new GroceriesInfo();
                listnoodles.noodlesList();
            }
            else if (option2 == 17){
                Groceries listpowmilk = new GroceriesInfo();
                listpowmilk.powderMilkList();
            }
            else if (option2 == 18){
                Groceries listsoftdrinks = new GroceriesInfo();
                listsoftdrinks.softDrinksList();
            }
            else{
                System.out.println("\nInvalid number\n\n");
            }
            }
        }
    }
