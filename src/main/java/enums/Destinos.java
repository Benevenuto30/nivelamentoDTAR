package enums;

public enum Destinos {
    OSASCO("Osasco"),
    MARINGA("Maringa"),
    RECIFE("Recife"),
    MANAUS("Manaus");

    private String cidade;

    Destinos(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return this.cidade;
    }
}
