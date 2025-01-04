import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Instanciando a classe Falcao (subclasse de Ave)
        Falcao f = new Falcao();

        // Definir atributos de Falcao
        System.out.println("\n=-=-=- Criação de um Falcão -=-=-=");
        System.out.print("Digite o peso do Falcão (Caso decimal, use vírgula): ");
        float peso = scanner.nextFloat();
        f.setPeso(peso);

        System.out.print("Digite a idade do Falcão: ");
        int idade = scanner.nextInt();
        f.setIdade(idade);

        System.out.print("Digite o número de membros do Falcão: ");
        int membros = scanner.nextInt();
        f.setMembro(membros);

        scanner.nextLine();
        System.out.print("Digite a cor da pena do Falcão: ");
        String corPena = scanner.nextLine();
        f.setCorPena(corPena);

        // Exibindo atributos de Falcão
        System.out.println("\n=-=-=- Atributos do Falcão criado -=-=-=");
        System.out.println("Peso: " + f.getPeso());
        System.out.println("Idade: " + f.getIdade());
        System.out.println("Membros: " + f.getMembro());
        System.out.println("Cor da Pena: " + f.getCorPena());

        // Exibindo métodos de Falcão
        System.out.println("\n=-=-=- Métodos do Falcão criado -=-=-=");
        System.out.println("Locomover: " + f.locomover());
        System.out.println("Alimentar: " + f.alimentar());
        System.out.println("Som: " + f.emitirSom());
        System.out.println("Especial: " + f.caçar());

        scanner.close();
    }
}
