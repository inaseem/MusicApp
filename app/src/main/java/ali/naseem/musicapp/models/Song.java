package ali.naseem.musicapp.models;

public class Song {
    private String name, artist, length;
    private int thumbnail;

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getLength() {
        return length;
    }

    public int getThumbnail() {
        return thumbnail;
    }
}
