package ud2.ejemplos.EjerciciosSwitch;

import java.util.Scanner;

/*
Harry Potter necesita ayuda para identificar qué significa cada casa.

Lea una cadena que represente una casa y genere lo siguiente:

- si es "gryffindor", escriba "valentía";

- si es "hufflepuff", genere "lealtad";

- si es "slytherin", escriba "astucia";

- si es "ravenclaw", genera "intelecto";

de lo contrario, generará "no es una casa válida".

 */

public class HarryPotter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String house = scanner.next();
        String represent = switch(house.toLowerCase()){
            case "gryffindor" -> "valentía";
            case "hufflepuff" -> "lealtad";
            case "slytherin" -> "astucia";
            case "ravenclaw" -> "intelecto";
            default -> "no es una casa válida";
        };
        System.out.println(represent);
    }
}
