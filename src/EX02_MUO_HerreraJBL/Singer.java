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
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(){
        name = "Rick Astley";
        noOfPerformances = 123;
        earnings = 100000000;
        favoriteSong = new Song();
    }
    
    public Singer(String nm,int nop,double e,Song nS){
        name = nm;
        noOfPerformances = nop;
        earnings = e;
        favoriteSong = nS;
    }
    
    public void performForAudience(int people){
        noOfPerformances+= 1;
        earnings += people*100;
    }
    
    public void changeFavSong(Song change){
        favoriteSong = change;
    }
}
