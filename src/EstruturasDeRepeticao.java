import java.util.Scanner;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite um número positivo: ");
        int n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("Digite um número positivo!");
        } else {

            // 1. FOR Contagem crescente
            System.out.println("\nContagem crescente:");

            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }

            // 2. WHILE Contagem decrescente
            System.out.println("\nContagem decrescente:");

            int contador = n;

            while (contador >= 0) {
                System.out.println(contador);
                contador--;
            }

            // 3. DO-WHILE Exibição do nome
            System.out.println("\nExibindo o nome:");

            int quantidade;

            if (nome.length() > 6) {
                quantidade = n;
            } else {
                quantidade = 1;
            }

            int repeticao = 0;

            do {
                System.out.println(nome);
                repeticao++;
            } while (repeticao < quantidade);
        }

        entrada.close();
    }
}
