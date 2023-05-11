package ExercicioArquivo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

    public String nomeBanco;

    List<Conta> contas = new ArrayList<>();

    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = " ";
        while (true){
            if (linha!= null){
                System.out.println(linha);
            }
            else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
    public static void escritor (String path) throws IOException{
        BufferedWriter buffWrite = new BufferedWriter( new FileWriter( (path)));
        String linha  = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo :");
        linha = in.nextLine();
        buffWrite .append(linha + "\n");
        buffWrite.close();
    }
}
