package com.zaga;

public class Song {
    String title;
    double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    
    public Song(){
  // empty constructor is used for flexibility when creating the object
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song [title=" + title + ", duration=" + duration + "]";
    }
    
    

    




}
