//import java.util.Stack;
import java.util.*;

/*Construa uma calculadora com as quatro operações aritméticas básicas que funcione com
a notação pós-fixa (Reverse Polish Notation 1 ). Esta notação dispensa a utilização de
parêntesis e tem um implementação muito simples assente na utilização de uma pilha de
números reais. Sempre que aparece um operando (número) ele é carregado para a pilha.
Sempre que aparece um operador (binário), são retirados os dois últimos números da pilha
(se não existirem temos um erro sintáctico na expressão) e o resultado da operação é
colocada na PILHA.*/

public class ex3 {
    public static void main(String[] args) {

        String[] tokens;
        Stack<Double> stack;
        double result;
        double op1, op2;

        while (true) {
            Scanner sc = new Scanner(System.in);
            tokens = sc.nextLine().split(" ");

            /**
             * Should wait for input but throws "No line found" insteads
             */

            stack = new Stack<>();

            for (int i = 0; i < tokens.length; i++) {
                double val = value(tokens[i]);
                if (val != -1.0) {
                    stack.push(val);
                } else {
                    try {
                        op1 = stack.pop();
                        op2 = stack.pop();
                    } catch (EmptyStackException e) {
                        System.err.println("Number of operands not enough");
                        break;
                    }

                    switch (tokens[i]) {
                        case "+":
                                result = op1 + op2;
                                stack.push(result);
                                break;
                        case "-":   
                                result = op1 - op2;
                                stack.push(result);
                                break;
                        case "/":
                                result = op1 / op2;
                                stack.push(result);
                                break;
                        case "*":
                                result = op1 * op2;
                                stack.push(result);
                                break;
                        default:
                                System.err.println("Invalid operation");
                    }
                }
                
                int size = 0;
                System.out.print("Stack: [");
                for (double num : stack) {
                    if (size == stack.size() - 1) break;
                    System.out.print(num + ", ");
                    size++;
                }
                
                System.out.println(stack.peek() + "]");
            }

            //sc.close();
        }
    }

    static double value(String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}