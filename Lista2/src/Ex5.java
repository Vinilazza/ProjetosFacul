import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        
        preencherMatriz(matriz);
        
        int[] maioresLinhas = encontrarMaioresLinhas(matriz);
        int[] menoresColunas = encontrarMenoresColunas(matriz);
        
        System.out.println("Matriz 7x7:");
        imprimirMatriz(matriz);
        
        System.out.println("Maiores elementos das linhas:");
        imprimirVetor(maioresLinhas);
        
        System.out.println("Menores elementos das colunas:");
        imprimirVetor(menoresColunas);
    }
    
    public static void preencherMatriz(int[][] matriz) {
        Random random = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100); // Números inteiros de 0 a 99
            }
        }
    }
    
    public static int[] encontrarMaioresLinhas(int[][] matriz) {
        int[] maioresLinhas = new int[matriz.length];
        
        for (int i = 0; i < matriz.length; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maioresLinhas[i] = maior;
        }
        
        return maioresLinhas;
    }
    
    public static int[] encontrarMenoresColunas(int[][] matriz) {
        int[] menoresColunas = new int[matriz[0].length];
        
        for (int j = 0; j < matriz[0].length; j++) {
            int menor = matriz[0][j];
            for (int i = 1; i < matriz.length; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menoresColunas[j] = menor;
        }
        
        return menoresColunas;
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
    
    public static void imprimirVetor(int[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
