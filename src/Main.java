import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
    Estacionamento estacionamento = new Estacionamento(BancoDados.VAGAS, new CalculadoraDePreco());


        Veiculo punto = new Veiculo("Fiat Punto", " 123-4ABC ", Plano.MENSAL);
        estacionamento.ocuparVaga(punto);


        Veiculo kwid = new Veiculo("Renault Kwid", " ABC-8080 ", Plano.MENSAL);
        estacionamento.ocuparVaga(kwid);

        Veiculo prisma = new Veiculo("Chevrolet Prisma", " CDE-5355 ", Plano.DIARIO);
        estacionamento.ocuparVaga(prisma);

        Veiculo Onix = new Veiculo("Chevrolet Onix", " HEL-1607 ", Plano.DIARIO);
        estacionamento.ocuparVaga(Onix);

        Veiculo Ram = new Veiculo("Dodge Ram", " RAM-1607 ", Plano.MENSAL);
        estacionamento.ocuparVaga(Ram);

        Veiculo Tiggo = new Veiculo("Cherry Tiggo", " TIG-1607 ", Plano.MENSAL);
        estacionamento.ocuparVaga(Tiggo);

        estacionamento.vagasOcupadas()
                .forEach(vaga -> {
                   BigDecimal resultado = estacionamento.calcularPreco(vaga, vaga.getVeiculo(), 10);
                    System.out.println(resultado);

                        }


                );

        }
}