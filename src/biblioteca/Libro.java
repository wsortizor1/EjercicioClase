package biblioteca;

public class Libro {

    String titulo;// atributos
    String autor;// atributos
    int numeroDePaginas;// atributos
    int amoDePublicacion;// atributos

    public Libro(String titulo, String autor, int numeroDePaginas, int amoDePublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.amoDePublicacion = amoDePublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getAmoDePublicacion() {
        return amoDePublicacion;
    }

    public void setAmoDePublicacion(int amoDePublicacion) {
        this.amoDePublicacion = amoDePublicacion;


    }

    public void mostrarDatosLibro (){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("NumeroDePaginas: " + numeroDePaginas);
        System.out.println("AmoDePublicacion: " + amoDePublicacion);

    }

}

