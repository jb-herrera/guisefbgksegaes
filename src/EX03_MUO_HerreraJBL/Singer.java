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
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    public static int totalPerformances = 0;
    private float otherMoney;
    
    public Singer(){
        name = "Rick Astley";
        noOfPerformances = 0;
        earnings = 10000;
        favoriteSong = new Song();
    }
    
    public Singer(String nm,int nop,double e,Song nS){
        name = nm;
        noOfPerformances = nop;
        earnings = e;
        favoriteSong = nS;
    }
    
    public void performForAudience(int people){
        noOfPerformances += 1;
        earnings += people*100;
        totalPerformances += 1;
    }
    
    public void changeFavSong(Song change){
        favoriteSong = change;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNOP() {
        return noOfPerformances;
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public String getFavSong() {
        return favoriteSong.getSongName();
    }
    
    public void setName(String nameSet){
        name = nameSet;
    }
    
    public void setNOP(int NOPSet){
        noOfPerformances = NOPSet;
    }
    
    public void setEarnings(double earningsSet){
        earnings = earningsSet;
    }
    
    public void setFavsong(Song favSongSet){
        favoriteSong = favSongSet;
    }
    public void shareMoney(float kaching){
        earnings += kaching;
    }
    public void performForAudience(int people,Singer otherSinger){
        noOfPerformances += 1;
        earnings += (people*100)/2 ;
        otherMoney = (people*100)/2;
        otherSinger.shareMoney(otherMoney);
        totalPerformances += 1;
    }
}
