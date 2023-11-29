import java.math.BigDecimal;

    public class VagaCoberta {

        private final Integer numero;
        private Veiculo veiculo;



        public VagaCoberta(Integer numero, Veiculo veiculo) {
            this.numero = numero;
            this.veiculo = veiculo;
        }

        public Integer getNumero() {
            return numero;
        }

        public Veiculo getVeiculo() {
            return veiculo;
        }

        public void ocupar(Veiculo veiculo){
            if (this.veiculo != null){
                System.out.println("Já existe um veículo na vaga" + this.numero);
                throw new IllegalStateException("Não é possível ocupar essa vaga");
            }

            this.veiculo = veiculo;
        }

        public void desocupar() {this.veiculo = null; }


//        @Override
//        public BigDecimal precoBaseCoberto() {
//            return BigDecimal.valueOf(30.00);
//        }

    }
