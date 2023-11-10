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
public class EX03_MUO_HerreraJBL {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int audience1 = 12;
        int audience2 = 100;
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        
        System.out.println(human1.getName());
        System.out.println(human2.getName());
        System.out.println(human3.getName());
        
        Song song1 = new Song("Shake it Off",1000000000,346);
        Song song2 = new Song("Love Story",1000000000,354);
        Singer singer1 = new Singer("Taylor Swift",0,10000,song1);
        Singer singer2 = new Singer();
         
        System.out.println(song1.getSongName());
        System.out.println(singer1.getName());
        
        System.out.println("Total Performances: " + singer1.totalPerformances);
        
        singer1.performForAudience(audience1);
        singer1.changeFavSong(song2);
        
        System.out.println(singer1.getName() + " performed to " + audience1 + " audiences; Earnings: " + singer1.getEarnings());
        System.out.println(singer1.getName() + "'s fave song is changed to " + song2.getSongName());
        
        System.out.println("Total Performances: " + singer2.totalPerformances);
        
        singer1.performForAudience(audience2,singer2);
        
        System.out.println(singer1.getName() + " and " + singer2.getName() + " performed to " + audience2 + " audiences");
        System.out.println("Earnings (Singer 1): " + singer1.getEarnings() + "; " + "Earnings (Singer 2): " + singer2.getEarnings());
        
        System.out.println("Total Performances: " + singer2.totalPerformances);
    }
}
