import java.util.Scanner;

public class Exercício1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
            System.out.print("Digite o nome do produto:");
            String nome = new Scanner(System.in).nextLine();

            System.out.print("Digite o modelo do produto:");
            String modelo = new Scanner(System.in).nextLine();

            System.out.print("Digite o tamanho em cm do produto:");
            float tamanho = new Scanner(System.in).nextFloat();

            System.out.print("Digite o preço em reais do produto:");
            double preço = new Scanner(System.in).nextDouble();

            System.out.print("Digite a quantidade do produto:");
            int quantidade= new Scanner(System.in).nextInt();

            System.out.println("Os dados dos produtos. " + 
            " Nome do produto: " + nome + ";" + 
            " Modelo do produto: " + modelo + ";" + 
            " Tamanho do produto: " + tamanho + " cm;" + 
            " Preço do produto: " + preço + ";" + 
            " Quantidade do produto: " + quantidade + "." );
    }
        
}

