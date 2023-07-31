 
package agenda;
 
import java.util.Scanner;

public class Agenda {

     
     
    static int contador = 0;
    static contacto nuevoContactos[] = new contacto[15];

    public static void main(String[] args) {
        // Agenda Telefonica

        Scanner entrada = new Scanner(System.in);
        int op = 0;

        System.out.println("_____AGENDA TELEFONICA_____");
        System.out.println("___Biendonido__");

        do {
            System.out.println("    1. Guardar Contacto");
            System.out.println("    2. Ver Todos Los Contactos");
            System.out.println("    3. Buscar Un Contacto");
            System.out.println("    4. Actulizar Contacto");
            System.out.println("    5. Salir");
            System.out.println("Ingrese el Numero de Opcion");
            System.out.println("----------------------------------");

            op = entrada.nextInt();
            System.out.println("");
            switch (op) {
                case 1:
                    crearContacto();
                    break;

                case 2:
                    System.out.println("------------LOS_DATOS_SON----------------");
                    System.out.println("");
                    verTodo();
                    break;

                case 3:
                    Scanner salir = new Scanner(System.in);
                    System.out.println("------------BUSCAR_NUMERO----------------");
                    System.out.println("");
                    System.out.println("____Ingrese El Numero___");
                    String Telefono = salir.nextLine();
                    System.out.println(buscarContacto(Telefono));

                    break;
                case 4:
                    System.out.println("");
                    System.out.println("__Finalizado___");
                    System.out.println("");
                    break;
            }
        } while (op != 5);
    }

    static public void crearContacto() {
        if (contador >= 15) {
            System.out.println("La Memoria Esta Llena");
        } else {

            Scanner teclado = new Scanner(System.in);
            System.out.println("-------------NUEVO_NUMERO-------------");
            System.out.println("");
            System.out.println("___Ingrese El Numero de Telefono_____");
            System.out.println("----------------------");
            String Telefono = teclado.nextLine();
            System.out.println("----------------------");
            System.out.println("___Ingrese Nombre Del Contacto__");
            System.out.println("-----------------------");
            String Nombre = teclado.nextLine();
            System.out.println("-----------------------");
            System.out.println("___Ingrese El Domicilio__");
            System.out.println("------------------------");
            String Domicilio = teclado.nextLine();
            System.out.println("------------------------");
            nuevoContactos[contador] = new contacto(Telefono, Nombre, Domicilio);
            System.out.println("______Datos Almacenados____");
            contador++;
        }
    }

    static public void verTodo() {
        System.out.println("#############################################");
        for (int i = 0; i < contador; i++) {
            System.out.println("Telefono: " + nuevoContactos[i].verTelefono());
            System.out.println("Nombre: " + nuevoContactos[i].verNombre());
            System.out.println("Domicilio: " + nuevoContactos[i].verDomicilio());
            System.out.println("#############################################");
        }
    }

    static public String buscarContacto(String Telefono) {
        int posicion = -1;
        for (int i = 0; i < 15; i++) {
            if (nuevoContactos[i] != null) {

                if (nuevoContactos[i].verTelefono().equals(Telefono)) {
                    posicion = i;
                    break;
                }
            }
        }

        if (posicion != -1) {
            return "Nombre: " + nuevoContactos[posicion].verNombre() + "  Domicilio: " + nuevoContactos[posicion].verDomicilio();

        } else {
            return "Contacto No Encontrado";

        }
    }
}
    
    

