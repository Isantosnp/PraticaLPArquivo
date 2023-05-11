package ExercicioArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Manipula {

    public  void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = " ";
        while (true){
            if (linha!= null){

                String[] linhaItem = linha.split(",");

                for (int i = 0; i< linhaItem.length; i++){
                    System.out.println(linhaItem[0]);
                }
            }
            else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
}
