package teste;

import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class WritterAndReader {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lu-co\\Documents\\Curso Java\\Nelio Alves\\Exercicio leitura de arquivos\\src\\teste\\in.txt");
        File file2 = new File("C:\\Users\\lu-co\\Documents\\Curso Java\\Nelio Alves\\Exercicio leitura de arquivos\\src\\teste\\out.txt");
        Scanner sc = null;
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();
            while(line !=null){
                System.out.println(line);
                line = br.readLine();
            }

        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        String[] strings = new String[]{"olá", "olá2", "olá3"};
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file2, true))){
            for(String string: strings){
             bw.write(string);
             bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        try(BufferedReader br = new BufferedReader(new FileReader(file2))){
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (Exception e){
           e.printStackTrace();
        }
    }
}