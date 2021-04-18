package app;

import dto.Viagem;

public class App {
    public static void main(String[] args){
        Viagem viagem = new Viagem("Maragogi");
        System.out.println(viagem.destino);
    }
}
