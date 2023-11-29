# EstacionamentoExercicio
Os requisitos são:
- Deve ter as seguintes classes:
- Estacionamento
- Vaga
- Veículo
- CalculadoraDePreco

- A classe estacionamento deve possuir os seguintes atributos: 
- Lista de Vagas 
- Calculadora
- Métodos da classe estacionamento:
estacionar: recebe um veículo e preenche a vaga de qualquer vaga que não esteja ocupada
calcularPreco: recebe uma vaga, um veículo e uma quantidade de horas e invoca o método "calcular" da Calculadora p/ devolver quanto a pessoa pagará

Devem existir dois tipos de vaga: Vaga Normal e Vaga Coberta
- A classe Vaga deve possuir os seguintes atributos:
- veículo 
- Métodos da classe vaga:
ocupar: Recebe um parâmetro veículo e popula o atributo "veiculo" caso não esteja ocupado
desocupar: remove o veículo da vaga caso esteja ocupada
- precoBase: Devolve o preço base por hora daquela vaga. Caso seja uma vaga normal, o preço base é 15.00. Caso seja uma vaga coberta, o preço base é 30.00

- A classe Veículo deve possuir os seguintes atributos:
- nome
- placa
- plano

- A classe CalculadoraDePreco deve possuir o seguinte método:
- calcula: Recebe os parâmetros Vaga, Veiculo e Hora. Deve retornar quanto deve ser cobrado pela quantidade de horas estacionado na vaga. A regra é a seguinte:
- Caso o veículo tenha um plano Mensalista, nao deve ser cobrado nada
- Caso o veículo seja plano avulso (cliente nao é cadastrado), deve retornar vaga.precoBase() * horas
