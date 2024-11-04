package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    private String titulo;
    private String cantor;
    private String genero;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String album) {
        this.titulo = titulo;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 2000) {
            return 10;
        }else {
            return 7;
        }
    }
}
