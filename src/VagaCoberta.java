import java.math.BigDecimal;

    public class VagaCoberta extends Vaga {


        public VagaCoberta(Integer numero, Veiculo veiculo) {
            super(numero, veiculo);
        }

        @Override
        public BigDecimal precoBase() {
            return new BigDecimal(30.00);
        }
    }
