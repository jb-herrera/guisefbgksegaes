/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX01_MUO_HerreraJBL;

/**
 *
 * @author MUON
 */
public class EX01_MUO_HerreraJBL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1 = "JB";
        String name2 = "Hans";
        String name3 = "Rui";
        int age1 = 15;
        int age2 = 15;
        int age3 = 14;
        float money1 = 1000f;
        float money2 = 10000f;
        float money3 = 5000f;
       
        
        System.out.println("Name: " + name1 + "\n");
        System.out.println("Age: " + age1 + "\n");
        System.out.println("Money: ₱" + money1 + "\n");
        
        System.out.println("Name: " + name2 + "\n");
        System.out.println("Age: " + age2 + "\n");
        System.out.println("Money: ₱" + money2 + "\n");

        
        System.out.println("Name: " + name3 + "\n");
        System.out.println("Age: " + age3 + "\n");
        System.out.println("Money: ₱" + money3 + "\n");
        
        System.out.println("Total money: ₱" + (money1 + money2 + money3) + "\n");
        System.out.println("Is Hans older than Rui?: " + ((age2 > age3) ? "True" : "False") + "\n");
        System.out.println("Is JB older than Rui?: " + ((age1 > age3) ? "True" : "False") + "\n");
    }
    
}
