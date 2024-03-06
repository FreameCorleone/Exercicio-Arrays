package arrays.src3;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        RegraNegocioFuncionario func_1 = new RegraNegocioFuncionario();
        func_1.cadastrarFuncionario("12345678901", "João", "1234567", "99999999");
        
        RegraNegocioFuncionario func_2 = new RegraNegocioFuncionario();
        func_2.cadastrarFuncionario("98883455", "Antonio Nunes", "999999999", "999999999");

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(func_1.getFuncionario());
        funcionarios.add(func_2.getFuncionario());

        RegraNegocioEmpresa empre = new RegraNegocioEmpresa();
        empre.cadastrarEmpresa("123456789", "Macelo.LMTD", "999999999", funcionarios);

        empre.listarEmpresa();
        func_1.listarFuncionario();
    }
}
