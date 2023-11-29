

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

        estacionamento.vagasOcupadas()
                .forEach(vaga -> estacionamento.calcularPreco(vaga, vaga.getVeiculo(), 10));

        }
}