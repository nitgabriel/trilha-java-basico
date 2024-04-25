package br.com.dio.iphone;

import br.com.dio.interfaces.*;


public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Realizando ligação para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Entrando no modo Correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodução pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica + " + musica + " selecionada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando página " + url + " no navegador");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}