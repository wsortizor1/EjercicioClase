package biblioteca;

public class Main {
    public static void main(String[] args) {

        Libro libroUno = new Libro("Odisea", "Homero", 448, 1837);
        Libro libroDos = new Libro("El Alquimista", "Paulo Coelho", 192, 1988);

        libroUno.mostrarDatosLibro();
        libroDos.mostrarDatosLibro();

        System.out.println();

        System.out.println("Cantidad actual de paginas: " + libroUno.getNumeroDePaginas());

        libroUno.setNumeroDePaginas(100);
        System.out.println("Numero paginas modificadas: " + libroUno.getNumeroDePaginas());


    }
}
