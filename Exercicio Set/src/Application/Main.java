package Application;

import Entities.Entities;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Entities> set = new HashSet<>();
        System.out.println("How many students for course A?");
        int sizeA = sc.nextInt();
        for (int i = 0;i< sizeA; i++){
            int code = sc.nextInt();
            Entities entity = new Entities(code);
            set.add(entity);
        }
        System.out.println("How many students for course B?");
        int sizeB = sc.nextInt();
        for (int i = 0;i< sizeB; i++){
            int code = sc.nextInt();
            Entities entity = new Entities(code);
            set.add(entity);
        }
        System.out.println("How many students for course C?");
        int sizeC = sc.nextInt();
        for (int i = 0;i< sizeC; i++){
            int code = sc.nextInt();
            Entities entity = new Entities(code);
            set.add(entity);
        }

        System.out.println("Total students: "+ set.size());

        for (Entities entities: set){
            System.out.println(entities.getCode());
        }
        sc.close();
    }
}