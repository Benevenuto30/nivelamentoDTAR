package app;

import dto.Acompanhante;
import dto.Viagem;
import dto.ViagemInternacional;
import dto.ViagemNacional;
import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem(Destinos.OSASCO);
        viagem.setDestino(Destinos.RECIFE);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Isabela");
        acompanhante1.setConfirmouCadastro(true);
        Acompanhante acompanhante2 = new Acompanhante();
        acompanhante2.setNome("Ana Marcia");
        acompanhante2.setConfirmouCadastro(true);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);

        try {
            viagem.setAcompanhantes(acompanhantes);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println(viagem.getDestino().getCidade());
        System.out.println(viagem.getAcompanhantes().size());
        System.out.println(viagem.getAcompanhantes().get(0).getNome());

        for (Acompanhante acompanhante : viagem.getAcompanhantes()) {
            System.out.println(acompanhante.getNome());
            System.out.println(acompanhante.isConfirmouCadastro());
        }

        ViagemNacional viagemNacional1 = new ViagemNacional(Destinos.OSASCO);

        try {
            viagemNacional1.setAcompanhantes(acompanhantes);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
            System.out.println(e.getMessage());
        }

        viagemNacional1.setCpf("0200000000000");
        ViagemInternacional viagemInternacional1 = new ViagemInternacional(Destinos.MIAMI);

        try {
            viagemInternacional1.setAcompanhantes(acompanhantes);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
            System.out.println(e.getMessage());
        }

        viagemInternacional1.setPassaporte("3848323849998399388");

        System.out.println(viagemNacional1.getDestino());
        System.out.println(viagemInternacional1.getDestino());
        System.out.println(viagemInternacional1.calcularPrevisaoDeDiasParaRetorno());
    }
}
