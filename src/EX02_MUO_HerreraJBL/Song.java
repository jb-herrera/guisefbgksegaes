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
public class Song {
    String songName;
    int spotifyStreams;
    int timeSec;
        
    public Song() {
        songName = "Never Gonna Give You Up";
        spotifyStreams = 726556609;
        timeSec = 214;
    }
    public Song(String sN, int sS, int tS) {
        songName = sN;
        spotifyStreams = sS;
        timeSec = tS;
    }
}
