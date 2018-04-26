package de.gfn.oca.basics;

/**
 *
 * @author tlubowiecki
 */
public class Variablen {
    
    int x;
    static int y;
    String s = "INSTANZ"; // null

    public Variablen() {
        this(10.0);
        System.out.println("C: 1");
    }
    
    public Variablen(int i) {
        System.out.println("C: 2");
    }
    
    public Variablen(int i, int j) {
        this(i);
        System.out.println("C: 3");
    }
    
    public Variablen(double d) {
        this(d, 10);
        System.out.println("C: 4");
    }
    
    public Variablen(int i, double d) {
        this(i, i + 5);
        System.out.println("C: 5");
    }
    
    public Variablen(double d, int i) {
        this(i, d);
        System.out.println("C: 6");
    }
    
    public static void main(String[] args) {
     
        //Variablen v = new Variablen();
        
        ModiTest mt = new ModiTest();
        //mt.zahl = 100000;
        
    }
}

class ModiTest {
    
    private int zahl;
    
}
