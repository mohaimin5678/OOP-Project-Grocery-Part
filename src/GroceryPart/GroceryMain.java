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
                System.out.println("These are the list of different types of rice\n");
                RiceList shaadChiniguraAromaticRice = new RiceList("Shaad Chinigura Aromatic Rice",130);
                RiceList khusbooPremiumKalijiraRice = new RiceList("Khusboo Premium Kalijira Rice", 135);
                RiceList chiniguraRice = new RiceList("Chinigura Rice",99);
                RiceList rupchandaChiniguraPremiumAromaticRice = new RiceList("Rupchanda Chinigura Premium Aromatic Rice", 135);
                RiceList greenGroceryTulshimalaPolauRice = new RiceList("Green Grocery Tulshimala Polau Rice", 125);
                RiceList chiniguraPolauRice = new RiceList("Chinigura Polau Rice", 130);
                RiceList premiumAtashChal = new RiceList("Premium Atash Chal", 60);
                RiceList tariJirashailRice = new RiceList("tari Jirashail Rice", 66);
                RiceList supremeBasmatiRice = new RiceList("Supreme Basmati Rice", 250);
                RiceList ispahaniParbonJirashailRice = new RiceList("Ispahani Parbon Jirashail Rice", 80);
                RiceList premiumMiniketRice = new RiceList("Premium Miniket Rice", 65);
                RiceList pranChiniguraRice = new RiceList("Pran Chinigura Rice", 125);
                RiceList[] rice = new RiceList[]{shaadChiniguraAromaticRice, khusbooPremiumKalijiraRice,chiniguraRice,rupchandaChiniguraPremiumAromaticRice,greenGroceryTulshimalaPolauRice,chiniguraPolauRice,premiumAtashChal,tariJirashailRice,supremeBasmatiRice,ispahaniParbonJirashailRice,premiumMiniketRice,pranChiniguraRice};
                int j = 1;
                for (int i = 0; i < rice.length; i++){

                    System.out.println("No. "+j +" "+ rice[i].name + "\nPer kg: "+rice[i].price + " BDT\n");
                    j++;
                }
                System.out.println("\n");
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
                Flour flour = new ListOfFlour();
                flour.flourList();
                BackGroMain();
                break;
            case 5:
                Masala masala = new ListOfMasala();
                masala.intro();
                masala.masalaList();
                BackGroMain();
                break;
            case 6:
                System.out.println("These are the list of different types of Suji\n");
                Suji ifadSuji = new Suji("Ifad Suji");
                Suji teerSemolinaSuji = new Suji("Teer Semolina Suji");
                Suji bashundharaSuji = new Suji("Bashundhara Suji");
                Suji freshSuji = new Suji("Fresh Suji");
                Suji aciPureSuji = new Suji("ACI Pure Suji");
                Suji muskaanSuji = new Suji("Muskaan Suji");
                Suji shaadSuji = new Suji("Shaad Suji");
                Suji pustiSuji = new Suji("Pusti Suji");
                Suji suji[] = new Suji[]{ifadSuji,teerSemolinaSuji,bashundharaSuji,freshSuji,aciPureSuji,muskaanSuji,shaadSuji,pustiSuji};
                int s = 1;
                for (int i=0; i < suji.length; i++){
                    System.out.println("No. "+s+" "+suji[i].name+"\nPer kg: "+suji[i].price+" BDT\n");
                    s++;
                }
                System.out.println("\n");
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
                EdibleOil edibleOil = new ListOfEdibleOil();
                edibleOil.edibleOilList();
                BackGroMain();
                break;
            case 10:
                VinegarList();
                BackGroMain();
                break;
            case 11:
                System.out.println("These are the list of different types of Tea Bags\n");
                TeaList ispahaniMirzaporeTeaBag = new TeaList("Ispahani Mirzapore Tea Bag", 50, 85);
                TeaList kaziGreenTea = new TeaList("Kazi & Kazi Green Tea",50,210);
                TeaList tetleyPremiumTeaBags = new TeaList("Tetley Premium Tea Bags", 50, 75);
                TeaList finlaysPureGreenTea = new TeaList("Finlays Pure Green Tea", 50,110);

                TeaList tea[] = new TeaList[]{ispahaniMirzaporeTeaBag, kaziGreenTea, tetleyPremiumTeaBags, finlaysPureGreenTea};
                int t = 1;
                for (int i=0; i< tea.length; i++){
                    System.out.println("No. "+t+" "+tea[i].name+"\nPer "+tea[i].pieces+" pcs: "+tea[i].price+" BDT\n");
                    t++;
                }
                System.out.println("\n");
                BackGroMain();
                break;
            case 12:
                System.out.println("These are the list of different types of Tea Poly Bags\n");
                TeaList brookeBondTaazaBlackTea = new TeaList("Brooke Bond Taaza Black Tea", 500);
                TeaList ispahaniMirzaporeBestLeafTea = new TeaList("Ispahani Mirzapore Best Leaf Tea", 475);
                TeaList nesteaIcedTeaLemon = new TeaList("Nestea Iced Tea Lemon", 600);
                TeaList finlayPremiumTea = new TeaList("Finlay Premium Tea", 520);
                TeaList muskanBopTea = new TeaList("Muskan BOP Tea", 360);
                TeaList ispahaniZareenPremiumTea = new TeaList("Ispahani Zareen Premium Tea", 600);
                TeaList tea1[] = new TeaList[]{brookeBondTaazaBlackTea, ispahaniMirzaporeBestLeafTea, nesteaIcedTeaLemon, finlayPremiumTea, muskanBopTea,ispahaniZareenPremiumTea};
                int tb = 1;
                for (int i=0; i <tea1.length; i++){
                    System.out.println("No. "+tb+ " "+tea1[i].name + "\nPer kg: "+tea1[i].price+" BDT\n");
                    tb++;
                }
                System.out.println("\n");
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
                Biscuit biscuit = new ListOfBiscuit();
                biscuit.intro();
                biscuit.biscuitList();
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

    public void BackGroMain(){
        System.out.println("Press '1' for Back else Main Menu: ");
        int n;
        n = input.nextInt();
        if (n == 1) {
            GroMain();
        }

    }

}
