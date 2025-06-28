package atividade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args){

        Scanner sc = null;
        String path = "C:\\Users\\lu-co\\Documents\\Curso Java\\Nelio Alves\\Exercicio leitura de arquivos\\src\\atividade\\Produtos.txt";
        //ArrayList<String[]> linhas = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line;

            while((line = br.readLine()) != null){
                String[] palavra = line.split(",");
                //linhas.add(palavra);
                String name = palavra[0];
                double price = Double.valueOf(palavra[1]);
                int quantity = Integer.valueOf(palavra[2]);
                Produto product = new Produto(name, price, quantity);
                product.totalValue();

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
