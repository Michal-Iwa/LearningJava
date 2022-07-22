package com.PlaylistInner;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    private class SongList{
        private ArrayList<Song> songArrayList;
        public SongList(){
            songArrayList = new ArrayList<Song>();
        }
        public boolean add(String title, double duration) {
            Song song = findSong(title);
            if (song != null) return false;
            songArrayList.add(new Song(title, duration));
            System.out.println("Truck named " + title + " successfully added to the album");
            return true;
        }

        public ArrayList<Song> getSongArrayList() {
            return songArrayList;
        }

        private Song findSong(String title){
            for(Song song : songArrayList)
                if(song.getTitle().equals(title)) return song;
            return null;
        }
    }
    public boolean addSong(String title, double duration){
        return songs.add(title,duration);
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        if(trackNumber <= 0 || trackNumber > songs.songArrayList.size()) {
            System.out.println("Truck number " + trackNumber + " doesn't exist");
            return false;
        }
        playlist.add(songs.songArrayList.get(trackNumber-1));
        System.out.println("Truck number " + trackNumber + " successfully added to the playlist");
        return true;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        if(songs.findSong(title) == null) {
            System.out.println("No truck named " + title);
            return false;
        }
        playlist.add(songs.findSong(title));
        System.out.println("Truck named " + title + " successfully added to the playlist");
        return true;
    }
}