package com.zaga;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

  private  String name;
  private  String artist;
  private ArrayList<Song> songs;

  public Album(String name, String artist ) {
    this.name = name;
    this.artist = artist;
    this.songs = new ArrayList<Song>();
  }

  public Album(){

  }

  public Song findSong(String title){
    for(Song checkedSong : songs)
    {
        if(checkedSong.getTitle().equals(title))
        {
            return checkedSong;
        }
       
    }
    return null;
  }


// checking the exist song in list 
 public boolean addSong(String title, double duration){
    if (findSong(title) == null) {
        songs.add(new Song(title,duration));
 //       System.out.println(title + "successfully added to the list");
        return true;
    }
    else {
// System.out.println("song with name"+ title + "already exist in the list");
        return false;

    }
    }

// the add song already present in the album to the playlist 

public boolean addToPlaylist(int trackNumber, LinkedList<Song> PlayList){
int index = trackNumber -1 ;
if(index >= 0 && index <=this.songs.size()){
    PlayList.add(this.songs.get(index));
    return true;
}
// System.out.println("this album does not have song with trackNumber"+ trackNumber);
return false;
}

// the add song already present in the playlist to the album 
public boolean addToPlaylist(String title , LinkedList<Song> playList){
    for(Song checkedSong : songs)
    {
        if(checkedSong.getTitle().equals(title))
        {
            playList.add(checkedSong);
            return true;
        }
       
    }
// System.out.println(title+"there is no such song in album");
return false;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getArtist() {
    return artist;
}

public void setArtist(String artist) {
    this.artist = artist;
}

public ArrayList<Song> getSongs() {
    return songs;
}

public void setSongs(ArrayList<Song> songs) {
    this.songs = songs;
}





}