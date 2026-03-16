package teljes_oop;

public class BruteForceMegoldo {
    private Egyenlet egyenlet = new Egyenlet(3.5,0.5,4.0/3,100);
    private Megoldas[] megoldasok;
    
    public BruteForceMegoldo(Egyenlet egyenlet){
        this.egyenlet = egyenlet;
        this.megoldasok = new Megoldas[3];
    }
    
    public void megoldas(){
        int db = 0;
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    if (egyenlet.feltetelEgy(x, y, z) && egyenlet.feltetelKetto(x, y, z)) {
                        megoldasok[db++] = new Megoldas(x, y, z);
                    }
                }
    
            }
        }
    }
    
    public Megoldas[] getMegoldasok() {
        return megoldasok;
    }
}


