import java.util.*;
import java.io.*;

/** O ficheiro numbers.txt contém uma lista de números com as suas representações numéricas
e as suas descrições por extenso.
Fazendo uso de um array associativo, escreva um programa que traduza, palavra a palavra,
todas as ocorrências por extenso de números pelo respectivo valor numérico (mantendo
todas as restantes palavras). Exemplo de utilização:

$ echo "A list of numbers: eight million two hundred thousand five hundred twenty-four" | java -ea b1_3
A list of numbers: 8 1000000 2 100 1000 5 100 20 4*/

public class ex4 {

    public static void main (String[] args) {
        
        Map<String, Integer> numeros = new HashMap<>();
        try {
            File f = new File("bloco1/numbers.txt");
            Scanner sf = new Scanner(f);

            while (sf.hasNextLine()) {
                String line = sf.nextLine();
                String[] lin = line.split(" - ");
                int num = Integer.parseInt(lin[0]);
                numeros.put(lin[1], num);
            }

            sf.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro nao encontrado!!");
            System.exit(1);
        }

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.trim().split(" -| ");
        System.out.println("A list of numbers: ");

        for (String x : s) {

            try {
                x = Integer.toString(numeros.get(x));
                System.out.print(x + " ");
            } catch (NullPointerException e) {
                System.out.println("Null Pointer Exception!!");
                System.exit(1);
            }
            
        }

        System.out.println();
        sc.close();

    }

}
