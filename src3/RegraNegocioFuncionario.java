package src3;

public class RegraNegocioFuncionario {
    private Funcionario funcionario = new Funcionario();

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void cadastrarFuncionario(String cpf, String nome, String rg, String telefone) {
        funcionario.setCpf(cpf);
        funcionario.setNome(nome);
        funcionario.setRg(rg);
        funcionario.setTelefone(telefone);
    }

    public void listarFuncionario(){
        System.out.println("Informações do Funcionário:");
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("RG: " + funcionario.getRg());
        System.out.println("Telefone: " + funcionario.getTelefone());
    }
}
