package arrays.src3;


import java.util.List;

public class Empresa {
    private String cnpj;
    private String nome;
    private String telefone;
    private List<Funcionario> funcionario;
    
    public List<Funcionario> getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
