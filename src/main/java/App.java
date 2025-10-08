package main.java;
import java.util.Scanner;

public class App {
        //Comentário

    public static void main(String[] args) throws Exception{
        //Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in); 

        System.out.println("=== VALORES INICIAIS ===");
        System.out.println("Digite a massa inicial (kg):");
        double massa = ler.nextDouble();

        System.out.println("Digite o volume inicial (m³):");
        double volume = ler.nextDouble();

        System.out.println("Digite a densidade inicial (kg/m³):");
        double densidade = ler.nextDouble();

        System.out.println("Digite a altura inicial (m):");
        double altura = ler.nextDouble();

        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);

        // c1.setVolume(0.07);
        // c1.massa = 2; // = Massa é uma classe privada da CorpoHumano, o que ocasionou o erro.
        
        System.out.println("=== VALORES INICIAIS ===");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Volume: " + c1.getVolume() + " m³");
        System.out.println("Densidade: " + c1.getDensidade() + " m³");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.printf("IMC: %.15f%n" , c1.calcularIMC());

        System.out.println("\n Digite uma nova massa (kg):");
        double novaMassa = ler.nextDouble();
        c1.setMassa(novaMassa);
        
        System.out.println("Digite uma nova altura (m):");
        double novaAltura = ler.nextDouble();
        c1.setAltura(novaAltura);

        System.out.println("\n === NOVOS VALORES ===");
        System.out.println("Nova Massa: " + c1.getMassa() + " kg");
        System.out.println("Nova Altura:" + c1.getAltura() + " m");
        System.out.printf("Novo IMC: %.15f%n" , c1.calcularIMC());

        ler.close();
    }
}

// Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1.
    // Qual foi a ocorrência?
    // Resposta: Massa é uma classe privada da CorpoHumano, o que ocasionou o erro.

    // Qual a conclusão sobre o que aconteceu?
    // Resposta: A variavéis instanciadas como "Private" não podem ser acessadas fora da classe.

// Na classe Corpo_Humano altere a linha private float Massa para public float Massa;
    // Qual foi a ocorrência?
    // Resposta: Funcionou, por trocar para "Public", que permite acessar fora da classe.

    // Qual a conclusão sobre o que aconteceu?
    // Resposta: As classes instanciadas como "Public" podem ser acessadas fora das suas classes de origem.

// Na classe Corpo_Humano altere a linha public setVolume(float volume) para private setVolume(float volume)
    // Qual foi a ocorrência?
    // Resposta: O método setVolume(double) não se torna visivel/acessável

    // Qual a conclusão sobre o que aconteceu?
    // Resposta: As classes instanciadas como "Private" limitam o acesso, permitindo acessá-las somente em suas classes de origem.