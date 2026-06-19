import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Ninja naruto = new Ninja();
//
//        naruto.nome = "Naruto";
//        naruto.idade = 16;
//        naruto.missao = "Salvar a aldeia";
//        naruto.dificuldadeMissao = "Difícil";
//        naruto.statusMissao = "Em progresso";
//
//        naruto.mostrarInformacoes();
//
//        System.out.println("-------------------");
//
//        Uchiha sasuke = new Uchiha();
//
//        sasuke.nome = "Sasuke";
//        sasuke.idade = 16;
//        sasuke.missao = "Se vingar";
//        sasuke.dificuldadeMissao = "Mediano";
//        sasuke.statusMissao = "Em progresso";
//        sasuke.habilidadeEspecial = "Chidori";
//
//        sasuke.mostrarInformacoes();

        System.out.println("Quantos ninjas você quer criar?");
        int qntNinjas = sc.nextInt();

        for (int i = 0; i < qntNinjas; i++){
            System.out.println("Qual vai ser o nome do seu ninja?");
            String nomeNinja = sc.nextLine();

            Ninja ninja = new Ninja();

            System.out.println("Qual vai ser a idade do seu ninja?");
            int idadeNinja = sc.nextInt();



            System.out.println("Qual vai ser a missao do seu ninja?");
            String missaoNinja = sc.nextLine();



            System.out.println("Qual vai ser a dificuldade da missão do seu ninja?");
            String dificuldadeMissaoNinja = sc.nextLine();



            System.out.println("Qual vai ser o nome do seu ninja?");
            String statusMissaoNinja = sc.nextLine();



        }

    }
}