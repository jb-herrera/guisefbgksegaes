/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX02_MUO_HerreraJBL;

/**
 *
 * @author MUON
 */
public class Human {
    String nameHuman;
    int age;
    float money;
        
    public Human() {
        nameHuman = "JB";
        age = 15;
        money = 1000f;
    }
        
    public Human(String nH, int a, float mmm) {
        nameHuman = nH;
        age = a;
        money = mmm;
    }
}
