import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;
    private String endereco;
    private String email;
    private String telefone;
    private String cpf;
    private String profissao;
    private String estadoCivil;

    // Getters e Setters omitidos para brevidade

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean validarCPF(String cpf) {
        // Implementação da lógica de validação de CPF
        // Retorne true se o CPF for válido, false caso contrário
        // Você pode utilizar bibliotecas ou implementar a validação manualmente
        return true; // Exemplo simplificado
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return dataNascimento.until(hoje).getYears();
    }

    public String formatarDataNascimento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatter);
    }

    public boolean verificarMaioridade() {
        LocalDate hoje = LocalDate.now();
        LocalDate dataMaioridade = hoje.minusYears(18);
        return dataNascimento.isBefore(dataMaioridade);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", profissao='" + profissao + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }

    public void imprimirDetalhesCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Data de Nascimento: " + formatarDataNascimento());
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
        System.out.println("Profissão: " + profissao);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}

