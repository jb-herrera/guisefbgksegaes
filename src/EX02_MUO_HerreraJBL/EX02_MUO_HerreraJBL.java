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
public class EX02_MUO_HerreraJBL {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int audience = 12;
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        
        System.out.println(human1.nameHuman);
        System.out.println(human2.nameHuman);
        System.out.println(human3.nameHuman);
        
        Song song1 = new Song("Shake it Off",1000000000,346);
        Song song2 = new Song("Love Story",1000000000,354);
        Singer singer1 = new Singer("Taylor Swift",100,1000000000,song1);
        
        System.out.println(song1.songName);
        System.out.println(singer1.name);
        
        singer1.performForAudience(audience);
        singer1.changeFavSong(song2);
        
        System.out.println(singer1.name + " performed to " + audience + " audiences");
        System.out.println(singer1.name + "'s fave song is changed to " + song2.songName);
    }
}
