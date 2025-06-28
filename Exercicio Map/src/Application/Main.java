package Application;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        Map<String, Integer> winner = new LinkedHashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] strings = line.split(",");
                String name = strings[0];
                int vote = Integer.parseInt(strings[1]);

                if(winner.containsKey(name)){
                    int votesSoFar = winner.get(name);
                    winner.put(name, vote + votesSoFar);
                }
                else{
                    winner.put(name, vote);
                }

                line = br.readLine();
            }

            for(String key : winner.keySet()){
                System.out.println(key + ": " + winner.get(key));
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        sc.close();

    }
}