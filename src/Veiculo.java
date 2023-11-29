public class Veiculo {

    private String nome;

    private String placa;

    private final Plano plano;

    public Veiculo(String nome, String placa, Plano plano) {
        this.nome = nome;
        this.placa = placa;
        this.plano = plano;

    }

    public String getIdentificacao() { return this.nome + this.placa;}

    public boolean eMensalista() {return this.plano == Plano.MENSAL;}




}
