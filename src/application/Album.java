package application;

import java.util.*;

public class Album {

    private String albumName;
    private List<Song>songlist;
    private String artistName;

    public Album(String albumName,String artistName){
        this.albumName=albumName;
        this.artistName=artistName;
        this.songlist=new ArrayList<>();
    }

    public Album(String albumName, List<Song> songlist, String artistName) {
        this.albumName = albumName;
        this.songlist = songlist;
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public List<Song> getSonglist() {
        return songlist;
    }

    public void setSonglist(List<Song> songlist) {
        this.songlist = songlist;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public boolean findsong(String title){
        for(Song song:songlist){
            if(song.getTitle().equals(title))
                return true;
        }
        return false;

    }
    public String addnewsongtoalbum(String name,double duration){
        if(findsong(name)){
            return "Song already present";
        }
        Song newsong=new Song(name,duration);
        songlist.add(newsong);
        return "new song of title"+name+"added in songlist";
    }

    public String addsongtoplaylist(int no,List<Song>playlist){
        int index=no-1;
        if(index>=0 && index<songlist.size()){
            Song song=songlist.get(index);
            playlist.add(song);
            return "song added in playlist";
        }
        else {
            return "invalis songno";
        }
    }

    public String addsongtoplaylist(String title,List<Song>playlist){
        for(Song song:songlist){
            if(song.getTitle().equals(title)){
                playlist.add(song);
                return "song added in playlist";
            }
        }
        return "song is not present in songlist";
    }
}
