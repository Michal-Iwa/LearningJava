package com.PlaylistInner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        printOptions();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice:");
        int choice = scanner.nextInt();
        System.out.println();
        ListIterator<Song> playlistIterator = playList.listIterator();
        String currentSong ="";
        boolean goingForward = false;
        boolean end = false;
        boolean first = true;
        while (choice > 0 && choice < 7  && !end){
            switch(choice){
                case 1:
                    if(playlistIterator.hasNext()){
                        if(!goingForward && !playlistIterator.hasPrevious() && !first)
                            playlistIterator.next();
                        currentSong = playlistIterator.next().toString();
                        System.out.println("Currently playing " + currentSong);
                        goingForward = true;
                        first = false;
                    }
                    else {
                        System.out.println("That is the last song");
                        System.out.println("Currently playing " + currentSong);
                    }
                    break;
                case 2:
                    if(playlistIterator.hasPrevious() && !first) {
                        goPreviousSong(playlistIterator, goingForward);
                        currentSong = playlistIterator.previous().toString();
                        System.out.println("Currently playing " + currentSong);
                        goingForward = false;
                    }
                    else {
                        System.out.println("That is the first song");
                        System.out.println("Currently playing " + currentSong);
                    }

                    break;
                case 3:
                    removeCurrentFromPlaylist(playlistIterator);
                    if(playList.isEmpty())
                    {
                        System.out.println("You have deleted all songs, end of program!");
                        end = true;
                    }
                    else {
                        currentSong = playlistIterator.next().toString();
                        goingForward = true;
                        System.out.println("Currently playing " + currentSong);
                    }
                    break;
                case 4:
                    replaySong(playlistIterator,goingForward);
                    currentSong = playlistIterator.next().toString();
                    System.out.println("Replaing " + currentSong);
                    break;
                case 5:
                    printPlaylist(playList);
                    break;
                case 6:
                    printOptions();
                    break;
                default:
                    break;
            }
            if(!end) {
                System.out.print("Your choice:");
                choice = scanner.nextInt();
                System.out.println();
            }

        }

    }
    public static void printPlaylist(LinkedList<Song> playlist){
        ListIterator<Song> i = playlist.listIterator();
        while(i.hasNext()){
            System.out.println(i.next().toString());
        }
    }
    public static void goPreviousSong(ListIterator<Song> playlistIterator, boolean goingForward){
        if(playlistIterator.hasPrevious()) {
            if (goingForward) playlistIterator.previous();
        }
    }
    public static void removeCurrentFromPlaylist(ListIterator<Song> playlistIterator){
        if(!playlistIterator.hasNext()) {
            playlistIterator.previous();
            playlistIterator.remove();
            if(playlistIterator.hasPrevious()) playlistIterator.previous();
        }
        else playlistIterator.remove();
    }
    public static void replaySong(ListIterator<Song> playlistIterator, boolean goingForward){
        playlistIterator.previous();
    }
    public static void printOptions(){
        System.out.println("1. Skip song");
        System.out.println("2. Go back to previous song");
        System.out.println("3. Delete current song from playlist");
        System.out.println("4. Replay current song");
        System.out.println("5. Print playlist");
        System.out.println("6. Print options");
        System.out.println("7. Quit");
    }
}
