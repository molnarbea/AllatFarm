package teljes_oop;

public class Program {
    public static void main(String[] args) {
       
        Egyenlet egyenlet;
        egyenlet = new Egyenlet(3.5,0.5,4.0/3,100);
		
       BruteForceMegoldo megoldo = new BruteForceMegoldo(egyenlet);
        megoldo.megoldas();
        
        for (Megoldas megoldas : megoldo.getMegoldasok()) {
            System.out.println(megoldas.allapot());
        }
    }
}
