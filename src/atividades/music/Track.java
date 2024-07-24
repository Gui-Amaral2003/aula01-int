package atividades.music;

public class Track {
    private String titulo;
    private String artista;
    private String album;
    private int anoLancamento;
    private int duration;

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Track(String titulo, String artista, String album, int anoLancamento, int duration) {
        setAlbum(album);
        setAnoLancamento(anoLancamento);
        setArtista(artista);
        setTitulo(titulo);
        setDuration(duration);

    }

    public String toString() {
        return titulo + " " + album + " " + " " + artista + " " + anoLancamento + " " + duration;
    }


}
