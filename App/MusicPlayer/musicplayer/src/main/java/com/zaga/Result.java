package com.zaga;

import java.util.*;

public class Result {
    
     private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("album01","Models");
        album.addSong("v-model", 4.50);
        album.addSong("waterFall", 3.50);
        album.addSong("jira", 5.30);
        album.addSong("Agile", 3.20);
        albums.add(album);
              
        album = new Album("album02","Naveen Developer");
        album.addSong("GitHub", 60.11);
        album.addSong("Maven", 59.50);
        album.addSong("java", 4.50);
        album.addSong("Spring-Boot", 60.20);
        albums.add(album);

       LinkedList<Song> playlist_01 = new LinkedList<>();
        albums.get(0).addToPlaylist("Agile", playlist_01);
        albums.get(0).addToPlaylist("v-model", playlist_01);

        albums.get(1).addToPlaylist("GitHub", playlist_01);
        albums.get(1).addToPlaylist("java", playlist_01);
       
        play(playlist_01);



    }
    private static void play(LinkedList<Song> playList){

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator <Song> listIterator = playList.listIterator();
      
        if(playList.size() == 0){
            System.out.println("The playList have no Song");  
        }
        else {
            System.out.println("Now playing "+ listIterator.next().toString());
            printMenu();
        }
       
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){

                case 0 :
                System.out.println("playlist complete");
                quit = true;
                break;


                case 1 :
                   if (forward){
                   if(listIterator.hasNext()) {
                    listIterator.next();
                   }
                    forward = true;
                   }
                   if(listIterator.hasNext()) {
                    System.out.println("Now playing"+ listIterator.next().toString());
                   }
                   else {
                    System.out.println("no song available , reached to the end of the list");
                    forward = false;
                   }
                   break;


                   case 2 :
                   if (forward) {
                    if(listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                   }
                   if(listIterator.hasPrevious()) {
                    System.out.println("Now playing"+ listIterator.previous().toString());
                   }
                   else{
                    System.out.println("we are the first song");
                    forward = false;
                   }
                   break;

                   case 3 :
                if (forward) {
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing"+ listIterator.previous().toString());
                        forward = false;
                   }
                   else
                   {
                    System.out.println("we are the start of the list");
                    
                   }
                }
                   else {
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing"+ listIterator.next().toString());
                        forward = true;
                   }
                   else{
                       System.out.println("we have reached to the end of the list");
                       forward = false;
                   }
                   }
                   break;


                   case 4:
                   printList(playList);
                   break;

                   case 5:
                   printMenu();
                   break;

                   case 6:
                     if(playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                          System.out.println("now playing "+ listIterator.next().toString());  
                          forward = true;
                        }
                        else {
                            if (listIterator.hasPrevious()) {
                                System.out.println("now playing "+  listIterator.previous().toString());
                                
                            }
                        }
                     }

                   
            }
        }

        scanner.close();
    }

        private static void printMenu (){
            System.out.println("Available options \n press");
            System.out.println("0 - to quit \n"+
            "1 - to play next song \n"+
            "2 - to play previous song \n"+
            "3 - to replay the current song \n"+
            "4 - List of all songs \n"+
            "5 - print all available options\n"+
            "6 - delete current song \n");
        }
private static void printList(LinkedList<Song> playList){
  
      Iterator<Song> iterator = playList.iterator();
      System.out.println("=============================");


      while (iterator.hasNext()) {
        System.out.println(iterator.next());
      }
      System.out.println("=============================");
}





}
