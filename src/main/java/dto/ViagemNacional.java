package dto;

import enums.Destinos;
import interfaces.CalculadoraDePrevisao;
import utils.ArquivosUtils;

import java.util.List;

public class ViagemNacional extends Viagem implements CalculadoraDePrevisao {
    private String cpf;

    public ViagemNacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {

        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.nacional.acompanhantes.limite"));

        if (acompanhantes.size() <= 3) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens nacionais nao podem ter mais do que " + limiteDeAcompanhantes + " acompanhantes");
        }
    }

    public int calcularPrevisaoDeDiasParaRetorno() {
        int quantidadeDeDias = 0;

        switch (this.getDestino()) {
            case OSASCO:
                quantidadeDeDias = 1;
                break;
            case RECIFE:
                quantidadeDeDias = 2;
                break;
            case MANAUS:
                quantidadeDeDias = 5;
                break;
            case MARINGA:
                quantidadeDeDias = 4;
                break;
        }
        return quantidadeDeDias;
    }
}
