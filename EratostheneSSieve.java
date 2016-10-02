/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthene.s.sieve;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class EratostheneSSieve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      prime(900000);
    }
    
    public static void prime(int limit) {
    ArrayList<Integer> arbNumbers = new ArrayList<Integer>();
    for (int i = 2; i < limit; i ++ ) {
    arbNumbers.add(i);
    }
    
    
    for (int divisor = 0; divisor < arbNumbers.size(); divisor ++) {
    for (int k = 0; k < arbNumbers.size(); k++) {
    if ((arbNumbers.get(k) % arbNumbers.get(divisor) == 0) && (arbNumbers.get(k) != arbNumbers.get(divisor))) {
    arbNumbers.remove(k);
    }
    }
    } 
    
     for (int j = 0; j < arbNumbers.size(); j ++ ) {
    System.out.println(arbNumbers.get(j));
    } 
    
    }
    
}
