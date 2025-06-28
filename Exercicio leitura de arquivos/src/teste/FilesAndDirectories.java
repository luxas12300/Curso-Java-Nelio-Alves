package teste;

import java.io.File;
import java.util.Scanner;

public class FilesAndDirectories {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter with a folder path:");
        String strPath = sc.nextLine();

        File filePath = new File(strPath);

        File[] folders = filePath.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for(File folder: folders){
            System.out.println(folder);
        }

        File[] files = filePath.listFiles(File::isFile);
        System.out.println("Files: ");
        for(File file: files){
            System.out.println(file);
        }
        sc.close();
    }
}
