import java.math.BigDecimal;

public class CalculadoraDePreco {

    public BigDecimal calculadora(Vaga vaga, Veiculo veiculo, Integer horas) {
        if (veiculo.eMensalista()) {
            System.out.printf("\nVeículo %s é mensalista e não precisa efetuar pagamento!", veiculo.getIdentificacao());
            return BigDecimal.ZERO;
        }

        BigDecimal valor = vaga.precoBase().multiply(BigDecimal.valueOf(horas));
        System.out.printf("\nVeículo %s não é mensalista e precisa efetuar o pagamento de R$%s", veiculo.getIdentificacao(), valor, horas);
        return valor;
//
//        BigDecimal valor1 = vaga.precoBaseCoberto().multiply(BigDecimal.valueOf(horas));
//        System.out.printf("Veículo %s não é mensalista e precisa efetuar o pagamento de R$%s", veiculo.getIdentificacao(), valor1, horas);
//        return valor1;
    }
}




