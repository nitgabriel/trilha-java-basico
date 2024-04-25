package br.com.dio.app;

import br.com.dio.iphone.Iphone;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcao;
        do {
            System.out.println("""
                    Selecione uma opção no menu:
                    1: Efetuar ligação
                    2: Atender ligação
                    3: Iniciar correio de voz
                    4: Selecionar música
                    5: Tocar música
                    6: Pausar música
                    7: Exibir página no navegador
                    8: Abrir nova aba no navegador
                    9: Atualizar página no navegador
                    0: Desligar
                    """);

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número para efetuar a ligação: ");
                    String numero = entrada.nextLine();
                    iphone.ligar(numero);
                    Thread.sleep(1000);
                    break;
                case 2:
                    iphone.atender();
                    Thread.sleep(1000);
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    Thread.sleep(1000);
                    break;
                case 4:
                    System.out.println("Digite o nome da música: ");
                    String musica = entrada.nextLine();
                    iphone.selecionarMusica(musica);
                    Thread.sleep(1000);
                    break;
                case 5:
                    iphone.tocar();
                    Thread.sleep(1000);
                    break;
                case 6:
                    iphone.pausar();
                    Thread.sleep(1000);
                    break;
                case 7:
                    System.out.println("Digite a URL da página: ");
                    String url = entrada.nextLine();
                    iphone.exibirPagina(url);
                    Thread.sleep(1000);
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    Thread.sleep(1000);
                    break;
                case 9:
                    iphone.atualizarPagina();
                    Thread.sleep(1000);
                    break;
                case 0:
                    System.out.println("Desligando o aparelho");
                    Thread.sleep(900);
                    break;
                default:
                    System.out.println("Opção inválida. Insira um número de 0 a 9.");
                    Thread.sleep(1000);
            }
        } while (opcao != 0);
        entrada.close();
    }
}
