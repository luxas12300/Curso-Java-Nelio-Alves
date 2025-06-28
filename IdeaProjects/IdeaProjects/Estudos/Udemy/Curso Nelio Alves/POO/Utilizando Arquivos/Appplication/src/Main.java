import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\lu-co\\Documents\\Curso Java\\Nelio Alves\\IdeaProjects\\IdeaProjects\\Estudos\\Udemy\\Curso Nelio Alves\\POO\\Utilizando Arquivos\\test.txt.txt");
        Scanner sc = null ;
        try{


            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }finally{
            if(sc != null) {
                sc.close();
            }
        }
    }
}