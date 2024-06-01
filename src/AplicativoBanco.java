import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class AplicativoBanco {
    public static void main(String[] args) {
        Banco banco = new Banco(); // Criando uma instância da classe Banco

        // Criando clientes e contas
        Cliente joao = new Cliente();
        joao.setNome("João");
        joao.setSexo("Masculino");
        joao.setDataNascimento(LocalDate.of(1990, 5, 15));
        joao.setEndereco("Rua A, 123");
        joao.setEmail("joao@example.com");
        joao.setTelefone("(11) 98765-4321");
        joao.setCpf("123.456.789-00");
        joao.setProfissao("Programador");
        joao.setEstadoCivil("Solteiro");

        banco.adicionarCliente(joao); // Adicionando cliente ao banco

        Conta ccJoao = new ContaCorrente(joao);
        Conta poupancaJoao = new ContaPoupanca(joao);
        ccJoao.depositar(100);
        ccJoao.transferir(70, poupancaJoao);

        ccJoao.imprimirExtrato();
        poupancaJoao.imprimirExtrato();

        System.out.println("\nDetalhes do Cliente João:");
        System.out.println("CPF válido: " + joao.validarCPF(joao.getCpf()));
        System.out.println("Idade: " + joao.calcularIdade());
        System.out.println("Data de Nascimento: " + joao.formatarDataNascimento());
        System.out.println("Maior de idade: " + joao.verificarMaioridade());
        joao.imprimirDetalhesCliente();

        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");
        pedro.setSexo("Masculino");
        pedro.setDataNascimento(LocalDate.of(1985, 10, 25));
        pedro.setEndereco("Av. B, 456");
        pedro.setEmail("pedro@example.com");
        pedro.setTelefone("(11) 99876-5432");
        pedro.setCpf("987.654.321-00");
        pedro.setProfissao("Engenheiro");
        pedro.setEstadoCivil("Casado");

        banco.adicionarCliente(pedro); // Adicionando cliente ao banco

        Conta ccPedro = new ContaCorrente(pedro);
        Conta poupancaPedro = new ContaPoupanca(pedro);
        ccPedro.depositar(200);
        ccPedro.transferir(100, poupancaPedro);

        ccPedro.imprimirExtrato();
        poupancaPedro.imprimirExtrato();

        System.out.println("\nDetalhes do Cliente Pedro:");
        System.out.println("CPF válido: " + pedro.validarCPF(pedro.getCpf()));
        System.out.println("Idade: " + pedro.calcularIdade());
        System.out.println("Data de Nascimento: " + pedro.formatarDataNascimento());
        System.out.println("Maior de idade: " + pedro.verificarMaioridade());
        pedro.imprimirDetalhesCliente();

        Cliente maria = new Cliente();
        maria.setNome("Maria");
        maria.setSexo("Feminino");
        maria.setDataNascimento(LocalDate.of(1995, 3, 8));
        maria.setEndereco("Rua C, 789");
        maria.setEmail("maria@example.com");
        maria.setTelefone("(11) 98765-1234");
        maria.setCpf("111.222.333-44");
        maria.setProfissao("Médica");
        maria.setEstadoCivil("Solteira");

        banco.adicionarCliente(maria); // Adicionando cliente ao banco

        Conta ccMaria = new ContaCorrente(maria);
        Conta poupancaMaria = new ContaPoupanca(maria);
        ccMaria.depositar(300);
        ccMaria.transferir(150, poupancaMaria);

        ccMaria.imprimirExtrato();
        poupancaMaria.imprimirExtrato();

        System.out.println("\nDetalhes da Cliente Maria:");
        System.out.println("CPF válido: " + maria.validarCPF(maria.getCpf()));
        System.out.println("Idade: " + maria.calcularIdade());
        System.out.println("Data de Nascimento: " + maria.formatarDataNascimento());
        System.out.println("Maior de idade: " + maria.verificarMaioridade());
        maria.imprimirDetalhesCliente();

        Cliente ana = new Cliente();
        ana.setNome("Ana");
        ana.setSexo("Feminino");
        ana.setDataNascimento(LocalDate.of(1980, 12, 20));
        ana.setEndereco("Av. D, 987");
        ana.setEmail("ana@example.com");
        ana.setTelefone("(11) 99876-9876");
        ana.setCpf("222.333.444-55");
        ana.setProfissao("Advogada");
        ana.setEstadoCivil("Casada");

        banco.adicionarCliente(ana); // Adicionando cliente ao banco

        Conta ccAna = new ContaCorrente(ana);
        Conta poupancaAna = new ContaPoupanca(ana);
        ccAna.depositar(400);
        ccAna.transferir(200, poupancaAna);

        ccAna.imprimirExtrato();
        poupancaAna.imprimirExtrato();

        System.out.println("\nDetalhes da Cliente Ana:");
        System.out.println("CPF válido: " + ana.validarCPF(ana.getCpf()));
        System.out.println("Idade: " + ana.calcularIdade());
        System.out.println("Data de Nascimento: " + ana.formatarDataNascimento());
        System.out.println("Maior de idade: " + ana.verificarMaioridade());
        ana.imprimirDetalhesCliente();

        Cliente jose = new Cliente();
        jose.setNome("José");
        jose.setSexo("Masculino");
        jose.setDataNascimento(LocalDate.of(1977, 1, 15));
        jose.setEndereco("Avenida Brasil, 987");
        jose.setEmail("jose@example.com");
        jose.setTelefone("(11) 99886-6816");
        jose.setCpf("225.353.744-56");
        jose.setProfissao("Chefe de Cozinha");
        jose.setEstadoCivil("Casado");

        banco.adicionarCliente(jose); // Adicionando cliente ao banco

        Conta ccJose = new ContaCorrente(jose);
        Conta poupancaJose = new ContaPoupanca(jose);
        ccJose.depositar(400);
        ccJose.transferir(200, poupancaJose);

        ccJose.imprimirExtrato();
        poupancaJose.imprimirExtrato();

        System.out.println("\nDetalhes do Cliente José:");
        System.out.println("CPF válido: " + jose.validarCPF(jose.getCpf()));
        System.out.println("Idade: " + jose.calcularIdade());
        System.out.println("Data de Nascimento: " + jose.formatarDataNascimento());
        System.out.println("Maior de idade: " + jose.verificarMaioridade());
        jose.imprimirDetalhesCliente();

        Cliente mariana = new Cliente();
        mariana.setNome("Mariana");
        mariana.setSexo("Feminino");
        mariana.setDataNascimento(LocalDate.of(1988, 7, 20));
        mariana.setEndereco("Rua E, 567");
        mariana.setEmail("mariana@example.com");
        mariana.setTelefone("(11) 98765-6789");
        mariana.setCpf("333.444.555-66");
        mariana.setProfissao("Psicóloga");
        mariana.setEstadoCivil("Solteira");

        banco.adicionarCliente(mariana); // Adicionando cliente ao banco

        Conta ccMariana = new ContaCorrente(mariana);
        Conta poupancaMariana = new ContaPoupanca(mariana);
        ccMariana.depositar(500);
        ccMariana.transferir(300, poupancaMariana);

        ccMariana.imprimirExtrato();
        poupancaMariana.imprimirExtrato();

        System.out.println("\nDetalhes da Cliente Mariana:");
        System.out.println("CPF válido: " + mariana.validarCPF(mariana.getCpf()));
        System.out.println("Idade: " + mariana.calcularIdade());
        System.out.println("Data de Nascimento: " + mariana.formatarDataNascimento());
        System.out.println("Maior de idade: " + mariana.verificarMaioridade());
        mariana.imprimirDetalhesCliente();



        // Obtendo a lista de clientes do banco
        List<Cliente> clientes = banco.getClientes();
        System.out.println("\nLista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}

