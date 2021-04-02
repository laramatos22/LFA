import java.util.*;
import java.io.*;

/**Pretende-se fazer um programa que num texto dado, substitua cada ocorrência
de uma palavra conhecida pela sua “tradução”. Por exemplo, usando a tabela acima, o
texto: “as armas e os barões assinalados” seria traduzido em “the guns and the barons
assinalados”.

Comece por escolher uma estrutura de dados adequada para armazenar a tabela de
correspondências e crie uma função que preencha essa estrutura com as correspondências
lidas de um ficheiro. Detalhes:
• A tabela de correspondências é um ficheiro com uma correspondência por linha.
• A primeira palavra da linha é a versão original e o resto é a tradução respectiva,
composta por uma palavra ou mais.
• Considera-se “palavra” qualquer sequência de caracteres delimitada por espaços.

Complete o programa para fazer o pretendido, tendo em consideração que:
• Cada palavra deve ser substituı́da pela sua correspondência, quando exista tradução;
ou mantida igual à original, no caso contrário.
• O programa recebe o ficheiro de correspondências como primeiro argumento, sendo
os restantes argumentos os ficheiros de entrada. A tradução de todos esses ficheiros
deve ser escrita no dispositivo de saı́da.
• Cada linha dos textos de entrada deve produzir uma linha à saı́da.*/

public class ex6 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> dicionario = new HashMap<>();
        String traducao = "";

        try {
            File f = new File("bloco1/dic1.txt");
            Scanner sf = new Scanner(f);

            while (sf.hasNextLine()) {
                String str = sf.nextLine();
                String[] line = str.split(" ");
                dicionario.put(line[0], line[1]);
            }
            System.out.println(dicionario.toString());

        } catch (FileNotFoundException e) {
            System.out.print("Ficheiro não encontrado!!");
        }

        while (true) {
            String string = dicionario.get(sc.next());
            if (traducao != null) {
                traducao = string;
            }
            System.out.print(traducao + " ");
        }

    }

}



