import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas");
        int m = sc.nextInt();
        System.out.println("Digite o número de colunas");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i=0;i< mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if(mat[i][j] == x){
                    System.out.println("Posição: "+i+","+j);
                    if(i>0) {
                        System.out.println("Acima: " + mat[i - 1][j]);
                    }
                    if(j>0) {
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if(j< mat[i].length-1){
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if(i< mat.length-1) {
                        System.out.println(mat.length-1);
                        System.out.println("Abaixo: " + mat[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}