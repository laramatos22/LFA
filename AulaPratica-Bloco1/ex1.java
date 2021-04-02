import java.util.*;
//import java.io.*;

public class ex1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Operação: ");
        
        //double num1 = sc.nextDouble();
        if(!sc.hasNextDouble()){
            System.err.println("Operando inválido");
            System.exit(1);
        }
        double firstNum = sc.nextDouble();

        //String operador = sc.next();
        if(!sc.hasNext()){
            System.err.println("Operador inválido");
            System.exit(1);
        }
        String operador = sc.next();

        //double num2 = sc.nextDouble();
        if(!sc.hasNextDouble()){
            System.err.println("Operando inválido");
            System.exit(1);
        }
        double secondNum = sc.nextDouble();

        sc.close();

        double res = 0;

        if(operador.equals("+")){
            res = firstNum + secondNum;
        }
        else if(operador.equals("-")){
            res = firstNum - secondNum;
        }
        else if(operador.equals("*")){
            res = firstNum * secondNum;
        }
        else if(operador.equals("/")){
            if(secondNum == 0){
                System.err.println("Operação inválida");
                System.exit(1);
            }
            
            res = firstNum / secondNum;
        }
        else{
            System.err.println("Operador inválido");
            System.exit(1);
        }

        //Outra resolução: usar o switch em vez de if's!!!

        System.out.println();
        System.out.printf("%3.2f %1s %3.2f = %3.2f\n",firstNum, operador,secondNum, res);
    }
}