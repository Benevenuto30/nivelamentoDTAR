package app;

import dto.Acompanhante;
import dto.Viagem;
import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        Viagem viagem = new Viagem(Destinos.OSASCO);
        viagem.setDestino(Destinos.RECIFE);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Isabela");
        acompanhante1.setConfirmouCadastro(true);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante1);

        viagem.setAcompanhantes(acompanhantes);

        System.out.println(viagem.getDestino().getCidade());
        System.out.println(viagem.getAcompanhantes().size());
        System.out.println(viagem.getAcompanhantes().get(0).getNome());
    }
}
