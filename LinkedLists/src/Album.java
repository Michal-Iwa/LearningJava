import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public boolean addSong(String title, double duration){
        Song song = findSong(title);
        if(song != null) return false;
        songs.add(new Song(title, duration));
        System.out.println("Truck named " + title + " successfully added to the album");
        return true;
    }
    private Song findSong(String title){
        for(Song song : songs)
            if(song.getTitle().equals(title)) return song;
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        if(trackNumber <= 0 || trackNumber > songs.size()) {
            System.out.println("Truck number " + trackNumber + " doesn't exist");
            return false;
        }
        playlist.add(songs.get(trackNumber-1));
        System.out.println("Truck number " + trackNumber + " successfully added to the playlist");
        return true;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        if(findSong(title) == null) {
            System.out.println("No truck named " + title);
            return false;
        }
        playlist.add(findSong(title));
        System.out.println("Truck named " + title + " successfully added to the playlist");
        return true;
    }
}

