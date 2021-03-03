
import java.util.Scanner;

/**
 *
 * @author Martinez
 */
public class RuletaRusa {

    public static int menu() {

        Scanner key = new Scanner(System.in);

        System.out.println("Introduzca el numero de la opción que desea "
                + "seleccionar: "
                + "\n\t1-Seleccionar Pistola."
                + "\n\t2-Mirar Posiciones."
                + "\n\t3-Girar Cilindro."
                + "\n\t4-Aplicar Disparo."
                + "\n\t0-Salir.");

        int option = key.nextInt();
        return option;

    }

    public static int menu1() {
        Scanner key = new Scanner(System.in);
        System.out.println("Introduzca el numero de la pistola a seleccinar: "
                + "\n\t1-Magnum."
                + "\n\t2-Colt."
                + "\n\t3-Salir");
        int option = key.nextInt();
        return option;

    }

    public static void main(String[] args) {

        boolean proceed;
        int option = -1;
        boolean live = true;

        Revolver r1 = new Revolver();
        Revolver r2 = new Revolver();
        Revolver rActive = null;

        JugadorRuso j1 = new JugadorRuso("Boris", 1);
        JugadorRuso j2 = new JugadorRuso("Yuri", 2);
        JugadorRuso j3 = new JugadorRuso("Lenin", 3);
        JugadorRuso j4 = new JugadorRuso("Vania", 4);
        JugadorRuso j5 = new JugadorRuso("Nadia", 5);
        JugadorRuso j6 = new JugadorRuso("Tania", 6);
        JugadorRuso jActive = null;

        JugadorRuso jugadores[] = {j1, j2, j3, j4, j5, j6};
        int i = 0;
        int j = 1;

        System.out.println("Bienvendios a 7Machos. Un juego para 6 jugadores "
                + "donde os jugais algo mas que el almuerzo.\n");

        while (live) {
            proceed = true;
            if (j == 5) {
                j = 0;
            } else {
                j++;
                System.out.println("El jugador activo es: " + jugadores[j].getNombre());
            }
            if (i == 5) {
                i = 0;
            } else {
                jActive = jugadores[i];
                System.out.println("\nEsta apuntando a: " + jActive.getNombre() + "\n");
                i++;
            }
            while (proceed) {

                option = menu();
                switch (option) {
                    case 1:
                        int option1 = menu1();
                        if (option1 == 1) {
                            rActive = r1;
                        } else if (option1 == 2) {
                            rActive = r2;
                        } else {
                            System.out.println("\nOpción incorrecta.\n");
                        }
                        break;
                    case 2:
                        if (rActive == null) {
                            System.out.println("Debe elegir una pistola.");
                        } else {
                            rActive.mirarPosiciones();
                        }

                        break;
                    case 3:
                        if (rActive == null) {
                            System.out.println("Debe elegir una pistola.");
                        } else {
                            rActive.girarCilindro();
                            proceed = false;
                        }
                        break;
                    case 4:
                        if (rActive == null) {
                            System.out.println("Primero debe elegir una pistola.");
                        } else {
                            live = jActive.seDispara(rActive);
                            proceed = false;
                        }
                        break;
                    case 0:
                        proceed = false;
                        live = false;
                        break;
                    default:
                        System.out.println("Opcion incorrecta vuelva a intentarlo.\n");

                }
            }

        }
        System.out.println("Gracias por jugar a 7Machos.");

    }
}
