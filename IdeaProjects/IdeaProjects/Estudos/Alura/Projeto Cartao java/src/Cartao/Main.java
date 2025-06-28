package Cartao;

import Cartao.Models.Cartao;
import Cartao.Models.Compra;
import Cartao.Models.Titulo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cartao cartao = new Cartao();
        boolean ligado = true;
        System.out.println("Digite o limite do cartão de crédito");
        cartao.setLimite(sc.nextInt());
        int fatura = 0;
        while(ligado) {
            List<Compra> listaCompra = new LinkedList<>();
            Compra novaCompra = new Compra();
            System.out.println("Digite a descrição da compra");
            novaCompra.setDescricao(sc.nextLine());
            System.out.println("Digite o valor da compra");
            novaCompra.setValorCompra(sc.nextInt());
            fatura += novaCompra.getValorCompra();
            System.out.println("Compra realizada!");
            System.out.println("Digite 0 para sair ou 1 para continuar");
            int continua = sc.nextInt();
            if(continua == 0){
                ligado = false;
            }if(continua == 1){
                continue;
            }else {
                break;
            }
        }
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(1);
        listaNumeros.add(5);
        listaNumeros.add(3);

        Collections.sort(listaNumeros);

        System.out.println(listaNumeros);

        Titulo titulo = new Titulo();
        titulo.setNome("Titulo 2");

        Titulo outroTitulo = new Titulo();
        outroTitulo.setNome("Titulo 1");

        List<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(titulo);
        listaTitulo.add(outroTitulo);
        System.out.println(listaTitulo.toString());

        Collections.sort(listaTitulo);
        System.out.println(listaTitulo.toString());

        List<Integer> listArray = new ArrayList<>();
        List<Integer> listLinked = new LinkedList<>();

        listArray.add(10);
        listArray.add(20);

        System.out.println(listArray);

        listLinked = listArray;
        System.out.println(listLinked);
    }
}