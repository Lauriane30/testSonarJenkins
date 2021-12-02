
package com.calculatricesonar.calculatricesonar;

public class CalculatriceJenkins {

    private int x;
    private int y;
    public CalculatriceJenkins(int a, int b) {
        x = a;
        y = b;
    }
    public int ajouter() {
        x += y;
        return x;
    }
    
    public int soustraire() {
        x -= y;
        return x;
    }
    
    public int multiplier() {
        x *= y;
        return x;
    }
    
    public int diviser() {
        x /= y;
        return x;
    }
    
    @Override
    public String toString() {
        return "x = " + x + "; y = " + y;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
