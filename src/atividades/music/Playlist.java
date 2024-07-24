package atividades.music;
import java.util.ArrayList;
import java.util.Collections;

public class Playlist{
    private ArrayList<Track> playlist;
    private String titulo;
    
    public ArrayList<Track> getPlaylist() {
        return playlist;
    }

    public String getTitulo() {
        return titulo;
    }

    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Playlist(String titulo) {
        this.playlist = new ArrayList<>();
        setTitulo(titulo);
    }

    public void addTrack(Track musica) {
        playlist.add(musica);
    }
    public void removeTrack(Track musica) {
        playlist.remove(musica);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(titulo + "\n");

        for(var track: playlist) {
            s.append(track)
             .append("\n");
        }
        return s.toString();
    }

    public void shuffle() {
        Collections.shuffle(playlist);
    }

}
