import Models.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo:");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            List<Funcionario> funcionarios = new ArrayList<>();

            while(line != null){
                String[] linha = line.split(",");

                String name = linha[0];
                String email = linha[1];
                Double salario = Double.parseDouble(linha[2]);

                funcionarios.add(new Funcionario(name,email,salario));

                line = br.readLine();
            }


            System.out.println("Digite o valor de salário para comparação");
            Double parametro = sc.nextDouble();

            List<String> listaFuncionarios = funcionarios.stream()
                    .filter(f -> f.getSalario() > parametro)
                    .map(Funcionario::getEmail).sorted().collect(Collectors.toList());

            Double listaSalario = funcionarios.stream().filter(f -> f.getNome().startsWith("M"))
                    .map(Funcionario::getSalario)
                    .reduce(0.0,Double::sum);

            System.out.println("Email of people whose salary is more than 2000.00");
            listaFuncionarios.forEach(System.out::println);

            System.out.println("Sum of salary of people whose name starts with 'M': "+ String.format("%.2f",listaSalario));

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Erro ao ler arquivo");
        }



    }
}