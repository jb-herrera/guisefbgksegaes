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
public class Song {
    private String songName;
    private int spotifyStreams;
    private int timeSec;
        
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
    
    public String getSongName() {
        return songName;
    }
    
    public int getSpotifyStreams() {
        return spotifyStreams;
    }
    
    public int getLength() {
        return timeSec;
    }
    
    public void setSongName(String songNameSet){
        songName = songNameSet;
    }
    
    public void setSpotifyStreams(int spotifyStreamsSet){
        spotifyStreams = spotifyStreamsSet;
    }
    
    public void setLength(int timeSecSet){
        timeSec = timeSecSet;
    }
}
