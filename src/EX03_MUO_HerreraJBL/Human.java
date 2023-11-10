/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX03_MUO_HerreraJBL;

/**
 *
 * @author MUON
 */
public class Human {
    private String nameHuman;
    private int age;
    private float money;
        
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
    
    public String getName() {
        return nameHuman;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getMoney() {
        return money;
    }
    
    public void setName(String nameSet){
        nameHuman = nameSet;
    }
    
    public void setAge(int ageSet){
        age = ageSet;
    }
    
    public void setMoney(float moneySet){
        money = moneySet;
    }
}
