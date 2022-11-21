
import java.util.Scanner;

public class Cadenas {

  public static void main(String[] args) {
    // TODO code application logic here
    var usuario = "Jaun";
    var titulo = "Ingeniero";
    var union = titulo + " " + usuario;

    System.out.println("union = " + union);

    // Santo de línea con \n, tabulador con \t, retroceso con \b, comilla simple con \'
    var nombre = "Karla";
    System.out.println("Nueva línea: \n" + nombre);
    System.out.println("Tabulador: \t" + nombre + "\t" + nombre + "\t" + nombre);
    System.out.println("Retroceso: \b\b\b" + nombre);
    System.out.println("La palabra \'texto\' está entre comilla simple");
    System.out.println("La palabra \"texto\" está entre comilla doble");

    // Uso de la clase Scanner
    System.out.println("Escribe tu nombre: ");
    Scanner consola = new Scanner(System.in);
    usuario = consola.nextLine();
    System.out.println("usuario = " + usuario);
  }

}
