package atividades.music;
import java.util.ArrayList;
import java.util.Collections;

public class Player{
    private ArrayList<Playlist> listaReproducao;
    private String currentTrack;
    private boolean playing;
    private int index;

    public Player() {
        listaReproducao = new ArrayList<>();
        currentTrack = null;
        playing = false;
        index = 0;
    }

    public void addPlaylist(Playlist playlist) {
        listaReproducao.add(playlist);
    }

    public String getQueuePlaylist() {
        return listaReproducao.toString();
    }

    public void play() {
        currentTrack = listaReproducao.get(index).getTitulo();
        playing = true;
    }

    public void stop() {
        playing = false;
    }

    public void next() {
        if(index++ <= listaReproducao.size()){
            index++;
            playing = true;
        }
        else {
            playing = false;
        }
        currentTrack = listaReproducao.get(index).getTitulo();
    }

    public void previous() {
        if((index - 1) >=0){
            index--;
        }
        else {
            playing = false;
        }

        currentTrack = listaReproducao.get(index).getTitulo();
    }

    public void shuffle() {
        Collections.shuffle(listaReproducao);
    }

    public boolean isPlaying() {
        return playing;
    }

    public String getCurrenTrack(){
        return currentTrack;
    }
}
