import java.math.BigDecimal;

public class VagaSimples extends Vaga{
    public VagaSimples(Integer numero, Veiculo veiculo) {
        super(numero, veiculo);
    }

    @Override
    public BigDecimal precoBase() {
        return new BigDecimal(15.00);
    }
}
