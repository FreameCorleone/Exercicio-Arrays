package arrays.src3;


import java.util.List;

public class RegraNegocioEmpresa {
    private Empresa empresa = new Empresa();

    public void cadastrarEmpresa(String cnpj, String nome, String telefone, List<Funcionario> funcionarios) {
        empresa.setCnpj(cnpj);
        empresa.setNome(nome);
        empresa.setTelefone(telefone);
        empresa.setFuncionario(funcionarios);
    }

    public void listarEmpresa() {
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("Nome: " + empresa.getNome());
        System.out.println("Telefone: " + empresa.getTelefone());
        System.out.println("Funcionários:");

        List<Funcionario> funcionarios = empresa.getFuncionario();
        for (Funcionario funcionario : funcionarios) {
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("RG: " + funcionario.getRg());
            System.out.println("Telefone: " + funcionario.getTelefone());
            System.out.println();
        }
    }
}
