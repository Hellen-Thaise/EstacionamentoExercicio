import java.util.Arrays;
import java.util.List;

public class BancoDados {

    public static List<Vaga> VAGAS = Arrays.asList(
            new VagaSimples(1, null),
            new VagaSimples(2, null),
            new VagaSimples(3, null),
            new VagaSimples(4, null),
            new VagaCoberta(5, null),
            new VagaCoberta(6, null)

    );
}
