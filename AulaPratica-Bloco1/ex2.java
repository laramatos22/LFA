import java.util.HashMap;
import java.util.*;

/** Modifique o exercı́cio anterior por forma a poder definir e utilizar variáveis numéricas.
 * Por exemplo: n=10
 *              4 * n
 *              n = n + 1
 *              n + 5
 * Utilize um array associativo para armazenar e aceder aos valores das variáveis (a bibli-
 * oteca Java tem a interface java.util.Map para esse fim, fornecendo uma possı́vel
 * implementação em java.util.HashMap).
**/

public class ex2 {

    static HashMap<String, Double> variaveis = new HashMap<String, Double>();

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                instrucao(sc.nextLine().split(" "));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        
        sc.close();
       
    }

    public static double valor (String s) throws Exception {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            try {
                return variaveis.get(s);
            } catch (Exception excep) {
                throw new Exception("Variavel não foi encontrada!!");
            }
        }
    }

    public static void instrucao(String[] simbolos) throws Exception {
        if (simbolos.length >= 3 && simbolos[1].equals("=")) {
            variaveis.put(simbolos[0], expressao(Arrays.copyOfRange(simbolos, 2, simbolos.length)));
        } else {
            System.out.println(expressao(simbolos));
        }
    }

    public static double expressao(String[] simbolos) throws Exception {
        if (simbolos.length == 1) {
            return valor(simbolos[0]);
        } else if (simbolos.length == 3) {
            double num1 = valor(simbolos[0]);
            double num2 = valor(simbolos[2]);

            switch (simbolos[1]) {
                case "+":
                    return num1 + num2;
                    //break;

                case "-":
                    return num1 - num2;
                    //break;

                case "*":
                    return num1 * num2;
                    //break;

                case "/":
                    return num1 / num2;
                    //break;
            
                default:
                    throw new Exception("Operação inválida!!");
                    //break;
            }

        } else {
            throw new Exception("Expressão inválida!!");
        }
    }

}