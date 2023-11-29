import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Estacionamento {

    private final List<Vaga> vagas;

    private CalculadoraDePreco calculadoraDePreco;


    public Estacionamento(List<Vaga> vagas, CalculadoraDePreco calculadoraDePreco) {
        this.vagas = vagas;
        this.calculadoraDePreco = calculadoraDePreco;
    }

    public BigDecimal calcularPreco(Vaga vaga, Veiculo veiculo, Integer horas){
          return this.calculadoraDePreco.calculadora(vaga, veiculo, horas);

    }

    public List<Vaga> vagasLiberadas(){
        return vagas.stream()
                .filter(vaga -> vaga.getVeiculo() == null)
                .collect(Collectors.toList());
    }

    public List<Vaga> vagasOcupadas(){
        return vagas.stream()
                .filter(vaga -> vaga.getVeiculo() != null)
                .collect(Collectors.toList());
    }

    public boolean ocuparVaga(Veiculo veiculo){
        Optional<Vaga> vagaLivre = vagasLiberadas()
                .stream()
                .findFirst();

        if(vagaLivre.isEmpty()){
            System.out.println("\nNão há vagas disponiveis no momento");
            return false;
        }

        vagaLivre.get().ocupar(veiculo);
        System.out.printf("\nVaga %s ocupada.", vagaLivre.get().getNumero(), this.vagasOcupadas());
        return true;
    }
}
