import java.util.*;
import java.io.*;

/**Utilizando o array associativo do exercı́cio anterior, construa um programa que converta
um texto representando um número, para o respectivo valor numérico. Por exemplo:

$ echo "eight million two hundred thousand five hundred twenty-four" | java -ea b1_4
eight million two hundred thousand five hundred twenty-four -> 8200524

• Os números são sempre descritos partindo das maiores ordens de grandeza para as
mais pequenas (million, thousand, . . . );

• Sempre que descrições consecutivas de números se fazem por ordem crescente (eight
million, ou two hundred thousand ), o valor respectivo vai sendo acumulado por mul-
tiplicações sucessivas (8 ∗ 1000000, e 2 ∗ 100 ∗ 1000);

• Caso contrário, o valor acumulado é somado ao total.*/

public class ex5 {

    static HashMap<String, Integer> conversao = new HashMap<>();
    public static void main(String[] args) throws Exception {

        File f = new File("bloco1/numbers.txt");
        Scanner sf = new Scanner(f);

        while (sf.hasNextLine()) {
            String[] line = sf.nextLine().split(" - ");
            int num = Integer.parseInt(line[0]);
            conversao.put(line[1], num);
        }

        sf.close();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(expressao(sc.nextLine()));
        }
        
    }

    public static String expressao(String linha) throws Exception {

        String str = linha + " -> ";
        Stack<Integer> numeros = new Stack<>();

        String[] simbolos = linha.split(" ");
        for (String s : simbolos) {
            if (!conversao.containsKey(s)) 
                throw new Exception("Number text \"" + s + "\" does not exist in table!");
            else
                numeros.add(conversao.get(s));
        }

        str += valor(numeros);
        return str;

    }

    public static int valor(Stack<Integer> numeros) {

        int valor1, valor2;

        while (numeros.size() > 1) {

            valor1 = numeros.pop();
            valor2 = numeros.pop();

            if ((valor1/10) > (valor2/10)) {
                numeros.push(valor1 * valor2);
            } else {
                numeros.push(valor1 + valor2);
            }
            
        }

        return numeros.pop();

    }

}


