package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Perro perros = new Perro("Max", "corggy");

        for (int i = 0; i <= 3; i++){

            perros.caminar(30);
        }

    }
}
