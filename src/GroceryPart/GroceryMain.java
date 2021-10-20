package GroceryPart;
import java.util.Scanner;
public class GroceryMain {
    GroceryMain() {
        System.out.println("This is Grocery Part. Done By Muhyemin");
    }
    Scanner input = new Scanner(System.in);
    public void GroMain(){
        System.out.println("\n *** Grocery***\n\n1. Rice\n\n2. Dal\n\n3. Salt\n\n4. Flour\n\n5. Masala\n\n6. Suji\n\n7. Egg\n\n8. Pea-flour\n\n9. Edible Oil\n\n10. Vinegar\n\n11. Tea Bag\n\n12. Tea Poly Bag\n\n13. Vermicelli\n\n14. Peanut\n\n15. Biscuit\n\n16. Noodles\n\n17. Powder Milk\n\n18. Soft Drinks\n\n\n19. Back\n\n\n");
        int num = input.nextInt();
        switch (num){
            case 1:
                riceList();
                BackGroMain();
                break;
            case 2:
                dalList();
                BackGroMain();
                break;
            case 3:
                saltList();
                BackGroMain();
                break;
            case 4:
                flourList();
                BackGroMain();
                break;
            case 5:
                masalaList();
                BackGroMain();
                break;
            case 6:
                sujiList();
                BackGroMain();
                break;
            case 7:
                eggList();
                BackGroMain();
                break;
            case 8:
                peaFlourList();
                BackGroMain();
                break;
            case 9:
                edibleOilList();
                BackGroMain();
                break;
            case 10:
                VinegarList();
                BackGroMain();
                break;
            case 11:
                teaBagList();
                BackGroMain();
                break;
            case 12:
                teaList();
                BackGroMain();
                break;
            case 13:
                vermicelliList();
                BackGroMain();
                break;
            case 14:
                peanutList();
                BackGroMain();
                break;
            case 15:
                biscuitList();
                BackGroMain();
                break;
            case 16:
                noodlesList();
                BackGroMain();
                break;
            case 17:
                powderMilkList();
                BackGroMain();
                break;
            case 18:
                softDrinksList();
                BackGroMain();
                break;
            case 19:
                BackGroMain();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    public void riceList(){
        System.out.println("\n1.  Shaad Chinigura Aromatic Rice\nPer Kg: 130 BDT\n");
        System.out.println("\n2.  Khusboo Premium Kalijira Rice\nPer Kg: 135 BDT\n");
        System.out.println("\n3.  Chinigura Rice\nPer kg: 99 BDT\n");
        System.out.println("\n4.  Rupchanda Chinigura Premium Aromatic Rice \nPer Kg: 135 BDT\n");
        System.out.println("\n5.  Green Grocery Tulshimala Polau Rice\nPer Kg: 125 BDT\n");
        System.out.println("\n6.  Chinigura Polau Rice\nPer Kg: 130 BDT\n");
        System.out.println("\n7.  Premium Atash Chal\nPer Kg: 60 BDT\n");
        System.out.println("\n8.  Katari Jirashail Rice\nPer Kg: 66 BDT\n");
        System.out.println("\n9.  Supreme Basmati Rice\nPer Kg: 250 BDT\n");
        System.out.println("\n10. Ispahani Parbon Jirashail Rice\nPer Kg: 80 BDT\n");
        System.out.println("\n11. Premium Miniket Rice\nPer Kg: 65 BDT\n");
        System.out.println("\n12. Pran Chinigura Rice\nPer Kg: 125 BDT\n\n");
    }
    public void dalList(){
        System.out.println("\n1.  Chola Boot Dal\nPer Kg: 70 BDT\n");
        System.out.println("\n2.  Moshur Dal (Deshi)\nPer Kg: 109 BDT\n");
        System.out.println("\n3.  Moshur Dal (Imported)\nPer Kg: 89 BDT\n");
        System.out.println("\n4.  Mug Dal\nPer Kg: 175 BDT\n");
        System.out.println("\n5.  Boot Dal\nPer Kg: 80 BDT\n");
        System.out.println("\n6.  Dubli Boot Dal\nPer Kg: 70 BDT\n");
        System.out.println("\n7.  Mixed Dal\nPer Kg: 130 BDT\n");
        System.out.println("\n8.  Anchor Boot Dal\nPer Kg: 80 BDT\n");
        System.out.println("\n9.  Garbanzo Peeled (Khosha Charano Chola Boot)\nPer Kg: 140 BDT\n");
        System.out.println("\n10. Mashkolai Dal Peeled\nPer Kg: 200 BDT\n");
        System.out.println("\n11. Kheshari Dal\nPer Kg: 100 BDT\n");
        System.out.println("\n12. Motor Dal\nPer Kg: 180 BDT\n\n");
    }
    public void saltList(){
        System.out.println("\n1. ACI Pure Salt\nPer Kg: 35 BDT\n");
        System.out.println("\n2. Fresh Super Premium (Vacuum) Salt\nPer Kg: 32 BDT\n");
        System.out.println("\n3. Rongdhanu Salt\nPer Kg: 25 BDT\n");
        System.out.println("\n4. Muskan Salt\nPer Kg: 35 BDT\n");
        System.out.println("\n5. Pran Salt\nPer Kg: 38 BDT\n");
        System.out.println("\n6. Molla Super Salt\nPer Kg: 32 BDT\n");
        System.out.println("\n7. Sena Salt\nPer Kg: 32 BDT\n\n");
    }
    public void flourList(){
        System.out.println("\n1.  Teer Atta\nPer Kg: 42 BDT\n");
        System.out.println("\n2.  Teer Maida Flour\nPer Kg: 50 BDT\n");
        System.out.println("\n3.  Bashundhara Atta\nPer Kg: 45 BDT\n");
        System.out.println("\n4.  Ifad Atta\nPer Kg: 40 BDT\n");
        System.out.println("\n5.  Fresh Atta\nPer Kg: 40 BDT\n");
        System.out.println("\n6.  Teer Whole Wheat Atta\nPer Kg: 44 BDT\n");
        System.out.println("\n7.  Ifad Brown Atta\nPer Kg: 45 BDT\n");
        System.out.println("\n8.  Rice Flour\nPer Kg: 80 BDT\n");
        System.out.println("\n9.  Bashundhara Brown Atta\nPer Kg: 45 BDT\n");
        System.out.println("\n10. Fresh Maida\nPer Kg: 50 BDT\n");
        System.out.println("\n11. Ifad Maida\nPer Kg: 50 BDT\n");
        System.out.println("\n12. ACI Pure Maida\nPer Kg: 48 BDT\n");
        System.out.println("\n13. ACI Pure Brown Atta\nPer Kg: 45 BDT\n");
        System.out.println("\n14. Shaad Atta\nPer Kg: 42 BDT\n");
        System.out.println("\n15. Shaad Maida\nPer Kg: 50 BDT\n");
        System.out.println("\n16. Pusti Atta\nPer Kg: 40 BDT\n");
        System.out.println("\n17. Shaad Brown Atta\nPer Kg: 45 BDT\n");
        System.out.println("\n18. Pusti Maida\nPer Kg: 49 BDT\n");
        System.out.println("\n19. BPM Red Rice Flour\nPer Kg: 100 BDT\n");
        System.out.println("\n20. Fresh Whole Wheat Atta\nPer Kg: 44 BDT\n\n");
    }
    public void masalaList(){
        System.out.println("\n1.  Cumin Seed (Jira)\nPer Kg: 390  BDT\n");
        System.out.println("\n2.  Cinnamon (Daruchini)\nPer Kg: 790  BDT\n");
        System.out.println("\n3.  Cardamom (Elachi)\nPer Kg: 2980 BDT\n");
        System.out.println("\n4.  Radhuni Turmeric Powder (Holud)\nPer Kg: 475  BDT\n");
        System.out.println("\n5.  Radhuni Chilli (Morich) Powder\nPer Kg: 500  BDT\n");
        System.out.println("\n6.  Dried Chillies (Shukna Morich)\nPer Kg: 290  BDT\n");
        System.out.println("\n7.  Bay Leaves (Tejpata)\nPer Kg: 190  BDT\n");
        System.out.println("\n8.  Radhuni Cumin (Jeera) Powder\nPer Kg: 800  BDT\n");
        System.out.println("\n9.  Cloves (Lobongo)\nPer Kg: 2580 BDT\n");
        System.out.println("\n10. Radhuni Coriander (Dhoniya) Powder\nPer Kg: 345  BDT\n");
        System.out.println("\n11. Black Cumin (Kalo Jira)\nPer Kg: 490  BDT\n");
        System.out.println("\n12. Radhuni Garam Masala\nPer Kg: 1475 BDT\n");
        System.out.println("\n13. Fenugreek Seed (Methi)\nPer Kg: 190  BDT\n");
        System.out.println("\n14. Radhuni Roast Masala\nPer Kg: 1400 BDT\n");
        System.out.println("\n15. Mix Spice (Pach Foron)\nPer Kg: 290  BDT\n\n");
    }
    public void sujiList() {
        System.out.println("\n1. Ifad Suji\nPer Kg: 64 BDT\n");
        System.out.println("\n2. Teer Semolina Suji\nPer Kg: 64 BDT\n");
        System.out.println("\n3. Bashundhara Suji\nPer Kg: 66 BDT\n");
        System.out.println("\n4. Fresh Suji\nPer Kg: 64 BDT\n");
        System.out.println("\n5. ACI Pure Suji\nPer Kg: 64 BDT\n");
        System.out.println("\n6. Muskaan Suji\nPer Kg: 64 BDT\n");
        System.out.println("\n7. Shaad Suji\nPer Kg: 64 BDT\n");
        System.out.println("\n8. Pusti Suji\nPer Kg: 64 BDT\n\n");
    }
    public void eggList() {
        System.out.println("\n1. Chicken Eggs (Layer)\nPer 4 pcs: 36 BDT\n");
        System.out.println("\n2. Quail Eggs\nPer 4 pcs: 17 BDT\n");
        System.out.println("\n3. Duck Eggs (Deshi)\nPer 4 pcs: 60 BDT\n");
        System.out.println("\n4. Organic Chicken Eggs (Deshi)\nPer 4 pcs: 50 BDT\n\n");
    }
    public void peaFlourList() {
        System.out.println("\n1. Booter Beshon\nPer Kg: 98  BDT\n");
        System.out.println("\n2. Fit Food Beshon\nPer Kg: 516 BDT\n");
        System.out.println("\n3. BPM Mashkalai Bason\nPer Kg: 220 BDT\n\n");
    }
    public void edibleOilList() {
        System.out.println("\n1.  Saffola Active Plus Edible Oil\nPer litre: 254  BDT\n");
        System.out.println("\n2.  King's Sunflower Oil\nPer litre: 270  BDT\n");
        System.out.println("\n3.  Rupchanda Soyabean Oil\nPer litre: 152  BDT\n");
        System.out.println("\n4.  Pusti Soyabean Oil\nPer litre: 150  BDT\n");
        System.out.println("\n5.  Olitalia Sunflower Oil\nPer litre: 325  BDT\n");
        System.out.println("\n6.  Pran Mustard Oil\nPer litre: 270  BDT\n");
        System.out.println("\n7.  Dhakaiya Black Seed Oil\nPer litre: 1850 BDT\n");
        System.out.println("\n8.  Shera Bangla Pure Mustard Oil\nPer litre: 225  BDT\n");
        System.out.println("\n9. Fresh Mustard Oil\nPer litre: 270  BDT\n");
        System.out.println("\n10. Sajeeb Mustard Oil\nPer litre: 270  BDT\n");
        System.out.println("\n11. Shaad Mustard Oil\nPer litre: 260  BDT\n");
        System.out.println("\n12. Fortune Rice Bran Oil\nPer litre: 195  BDT\n");
        System.out.println("\n13. Teer Soyabean Oil\nPer litre: 145  BDT\n");
        System.out.println("\n14. Radhuni Pure Mustard Oil\nPer litre: 270  BDT\n\n");
    }
    public void VinegarList() {
        System.out.println("\n1. BD Vinegar \nPer litre: 85  BDT\n");
        System.out.println("\n2. Bragg Apple Cider Vinegar\nPer litre: 560 BDT\n");
        System.out.println("\n3. Calypso Apple Vinegar\nPer litre: 510 BDT\n");
        System.out.println("\n4. Heinz Apple Cider Vinegar\nPer litre: 425 BDT\n");
        System.out.println("\n5. Saporito Red Grape Vinegar\nPer litre: 660 BDT\n");
        System.out.println("\n6. Ahmed White Vinegar\nPer litre: 130 BDT\n");
        System.out.println("\n7. Heinz White Vinegar\nPer litre: 420 BDT\n");
        System.out.println("\n8. Borges Apple Cider Vinegar\nPer litre: 555 BDT\n\n");
    }
    public void teaList() {
        System.out.println("\n1. Brooke Bond Taaza Black Tea\nPer Kg: 500 BDT\n");
        System.out.println("\n2. Ispahani Mirzapore Best Leaf Tea\nPer Kg: 475 BDT\n");
        System.out.println("\n3. Nestea Iced Tea Lemon\nPer Kg: 600 BDT\n");
        System.out.println("\n4. Finlay Premium Tea\nPer Kg: 520 BDT\n");
        System.out.println("\n5. Muskan BOP Tea\nPer Kg: 360 BDT\n");
        System.out.println("\n6. Ispahani Zareen Premium Tea\nPer Kg: 600 BDT\n\n");
    }
    public void teaBagList() {
        System.out.println("\n1. Ispahani Mirzapore Tea Bag\nPer 50 pcs: 85  BDT\n");
        System.out.println("\n2. Kazi & Kazi Green Tea\nPer 50 pcs: 210 BDT\n");
        System.out.println("\n3. Tetley Premium Tea Bags\nPer 50 pcs: 75  BDT\n");
        System.out.println("\n4. Finlays Pure Green Tea\nPer 50 pcs: 110 BDT\n\n");
    }
    public void vermicelliList() {
        System.out.println("\n1. Cock Vermicelli\nPer Kg: 175 BDT\n");
        System.out.println("\n2. Dekko Vermicelli Shemai\nPer Kg: 145 BDT\n");
        System.out.println("\n3. ACI Pure Vermicelli\nPer Kg: 145 BDT\n");
        System.out.println("\n4. Pran Vermicelli Shemai\nPer Kg: 175 BDT\n");
        System.out.println("\n5. BD Vermicelli\nPer Kg: 175 BDT\n");
        System.out.println("\n6. Bashundhara Vermicelli Shemai\nPer Kg: 165 BDT\n");
        System.out.println("\n7. Banoful Vermicelli Shemai\nPer Kg: 175 BDT\n");
        System.out.println("\n8. Arku Vermicelli\nPer Kg: 160 BDT\n\n");
    }
    public void peanutList() {
        System.out.println("\n1. Kaju Badam (Cashew Nut)\nPer Kg: 1090 BDT\n");
        System.out.println("\n2. Almonds (Kath Badam)\nPer Kg: 990  BDT\n");
        System.out.println("\n3. Peanut Raw (Kacha Cheena Badam)\nPer Kg: 290  BDT\n");
        System.out.println("\n4. Peanut Peeled (Vaja Cheena Badam)\nPer Kg: 390  BDT\n");
        System.out.println("\n5. Pistachios (Pesta Badam)\nPer Kg: 2190 BDT\n\n");
    }
    public void biscuitList() {
        System.out.println("\n1.  Olympic Premium Energy Plus Biscuit\nPer 500 gm: 85  BDT\n");
        System.out.println("\n2.  Belleame Cremo Vanilla Biscuit\nPer 500 gm: 165 BDT\n");
        System.out.println("\n3.  Haque Milk Chocolate Digestive Biscuit\nPer 500 gm: 120 BDT\n");
        System.out.println("\n4.  Cocola Champion Chocolate Cream Biscuit\nPer 500 gm: 100 BDT\n");
        System.out.println("\n5.  Olympic Pineapple Cream Biscuit\nPer 500 gm: 90  BDT\n");
        System.out.println("\n6.  Pran Potata Spicy Biscuit\nPer 500 gm: 125 BDT\n");
        System.out.println("\n7.  Olympic Malai Cream Energy Plus Biscuit\nPer 500 gm: 88  BDT\n");
        System.out.println("\n8.  Olympic Nutty Real Peanut Biscuit\nPer 500 gm: 95  BDT\n");
        System.out.println("\n9.  Fit Crakers Masala Biscuit\nPer 500 gm: 95  BDT\n");
        System.out.println("\n10. Danish Doreo Black Chocolate Sandwich Biscuit\nPer 500 gm: 180 BDT\n");
        System.out.println("\n11. Ifad Choco Delight Biscuit\nPer 500 gm: 100 BDT\n");
        System.out.println("\n12. Cocola Lexus Vegetable Biscuit\nPer 500 gm: 115 BDT\n");
        System.out.println("\n13. Olympic Milk Plus Biscuit\nPer 500 gm: 75  BDT\n");
        System.out.println("\n14. Olympic Tip Biscuit\nPer 500 gm: 100 BDT\n");
        System.out.println("\n15. Cadbury Oreo Original Cream Biscuit\nPer 500 gm: 230 BDT\n\n");
    }
    public void noodlesList() {
        System.out.println("\n1.  Cocola Egg Noodles\nPer pack: 18 BDT\n");
        System.out.println("\n2.  Nestle Maggi 2-Minute Masala Instant Noodles\nPer pack: 16 BDT\n");
        System.out.println("\n3.  Nestle Maggi 2-Minute Masala Blast Noodles\nPer pack: 18 BDT\n");
        System.out.println("\n4.  Doodles Stick Noodles\nPer pack: 18 BDT\n");
        System.out.println("\n5.  Doodles Masala Noodles\nPer pack: 16 BDT\n");
        System.out.println("\n6.  Mr.Noodles Chicken Cup Noodles\nPer pack: 30 BDT\n");
        System.out.println("\n7.  Cocola Chicken Masala Noodles\nPer pack: 20 BDT\n");
        System.out.println("\n8.  Ifad Eggy Instant Masala Noodles\nPer pack: 22 BDT\n");
        System.out.println("\n9.  Cocola Hot & Spicy Cup Noodles\nPer pack: 30 BDT\n");
        System.out.println("\n10. Mama Noodles Chicken Flavor\nPer pack: 16 BDT\n");
        System.out.println("\n11. Mama Hot & Spicy Cup Noodles\nPer pack: 60 BDT\n");
        System.out.println("\n12. Sajeeb Tandoori Chicken Noodles\nPer pack: 20 BDT\n");
        System.out.println("\n13. Mr.Noodles Magic Masala\nPer pack: 16 BDT\n\n");
    }
    public void powderMilkList() {
        System.out.println("\n1. Diploma Full Cream Milk Powder\nPer Kg: 690 BDT\n");
        System.out.println("\n2. Goalini Full Cream Milk Powder\nPer Kg: 540 BDT\n");
        System.out.println("\n3. Arla Dano Daily Pusti Milk Powder\nPer Kg: 475 BDT\n");
        System.out.println("\n4. Danish Full Cream Milk Powder\nPer Kg: 609 BDT\n");
        System.out.println("\n5. Marks Milk Powder (Poly)\nPer Kg: 700 BDT\n");
        System.out.println("\n6. Nestle Nido Fortigrow Full Cream Milk Powder\nPer Kg: 800 BDT\n");
        System.out.println("\n7. Starship Full Cream Milk Powder\nPer Kg: 520 BDT\n");
        System.out.println("\n8. Aarong Dairy Instant Low Fat Milk Powder\nPer Kg: 620 BDT\n");
        System.out.println("\n9. Pran Full Cream Milk Powder\nPer Kg: 680 BDT\n\n");
    }
    public void softDrinksList() {
        System.out.println("\n1. Coca-Cola \nPer litre: 50 BDT\n");
        System.out.println("\n2. 7up\nPer litre: 50 BDT\n");
        System.out.println("\n3. Sprite\nPer litre: 50 BDT\n");
        System.out.println("\n4. Mountain Dew\nPer litre: 50 BDT\n");
        System.out.println("\n5. Pran Up\nPer litre: 45 BDT\n");
        System.out.println("\n6. Clemon\nPer litre: 45 BDT\n");
        System.out.println("\n7. Miranda Orange\nPer litre: 50 BDT\n\n");
    }
    /*public static void main(String[] args){

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
    }*/

    public void BackGroMain(){
        System.out.println("Press '1' for Back else Main Menu: ");
        int n;
        n = input.nextInt();
        if (n == 1) {
            GroMain();
        }
    }

}
