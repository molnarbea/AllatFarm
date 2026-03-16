package teljes_oop;

public class Egyenlet {
    private double s, k, j;
    public int db;

    public Egyenlet(double s, double k, double j, int db) {
        this.s = s;
        this.k = k;
        this.j = j;
        this.db = db;
    }

    public double getS(){ 
        return s; 
    }
    public double getK(){ 
        return k; 
    }
    public double getJ(){ 
        return j; 
    }
    public int getDb(){ 
        return db; 
    }
    
    public boolean feltetelEgy(int x, int y, int z){
        return s*x + k*y + j*z == db;
    }
    public boolean feltetelKetto(int x, int y, int z){
        return x+y+z == db;
    }
}

