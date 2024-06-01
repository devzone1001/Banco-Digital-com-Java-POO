
# Aplicativo Banco

Este repositório contém um aplicativo de gerenciamento bancário em Java. O aplicativo permite criar clientes e contas bancárias, realizar depósitos, transferências e gerar extratos.

## Estrutura do Projeto

- **AplicativoBanco**: Classe principal que inicializa o aplicativo e executa as operações principais.
- **Banco**: Classe que gerencia os clientes do banco.
- **Cliente**: Classe que representa um cliente do banco.
- **Conta**: Classe abstrata que define uma conta bancária.
  - **ContaCorrente**: Subclasse de Conta que representa uma conta corrente.
  - **ContaPoupanca**: Subclasse de Conta que representa uma conta poupança.
- **IConta**: Interface que define as operações básicas de uma conta bancária.

## Como Executar

1. Clone este repositório:

   ```sh
   git clone https://github.com/seu-usuario/aplicativo-banco.git
   ```
2. Navegue até o diretório do projeto:

   ```sh
   cd aplicativo-banco
   ```
3. Compile as classes Java:

   ```sh
   javac *.java
   ```
4. Execute o aplicativo:

   ```sh
   java AplicativoBanco
   ```

## Funcionalidades

### Criação de Clientes e Contas

A classe `AplicativoBanco` demonstra a criação de clientes e suas respectivas contas correntes e poupanças. Exemplo:

```java
Cliente joao = new Cliente();
joao.setNome("João");
joao.setSexo("Masculino");
// ... (outros atributos)
banco.adicionarCliente(joao);

Conta ccJoao = new ContaCorrente(joao);
Conta poupancaJoao = new ContaPoupanca(joao);
ccJoao.depositar(100);
ccJoao.transferir(70, poupancaJoao);
```


### Depósitos e Transferências

As contas permitem operações de depósito e transferência de valores:

ccJoao.depositar(100);
ccJoao.transferir(70, poupancaJoao);


### Impressão de Extratos

As contas possuem métodos para imprimir extratos, mostrando informações sobre o saldo e operações realizadas:

ccJoao.imprimirExtrato();
poupancaJoao.imprimirExtrato();


### Validação de CPF e Cálculo de Idade

A classe `Cliente` inclui métodos para validação de CPF, cálculo de idade, formatação de data de nascimento e verificação de maioridade

System.out.println("CPF válido: " + joao.validarCPF(joao.getCpf()));
System.out.println("Idade: " + joao.calcularIdade());


## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](https://github.com/devzone1001/Banco-Digital-com-Java-e-Orienta-o-a-Objetos/blob/a018a87b070c11718d5c24347edd79a19cf2f3e4/LICENSE) para mais detalhes.
