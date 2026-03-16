package main;

public class AllatFarm {

    public static void main(String[] args) {
        double s = 3.5;
        double k = 0.5;
        double j = 4.0/3;
        
        int ar = 100;
        int db = 100;
        
        int ossz = 0;
        
        double max_s = (ar-k-j)/s;
        double max_k = (ar-s-j)/k;
        double max_j = (ar-k-s)/j;
        
        
        
        for (int x = 1; x <= max_s; x++) {
            for (int y = 1; y <= max_k; y++) {
                for (int z = 1; z <= max_j; z++) {
                    if (s*x+k*y+j*z == ar && x+y+z == db) {
                        System.out.printf("%d sertés, %d kecske, %d juh = %d db, %d aranyért\n",x,y,z,db,ar);
                    }
                    ossz++;
                }
    
            }
        }
        System.out.println(ossz);
    }

}
