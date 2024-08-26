package br.edu.ifpr.foz.ifprstore.repositories;
import br.edu.ifpr.foz.ifprstore.models.Department;
import org.junit.jupiter.api.Test;



import java.util.List;

public class DepartmentRepositoryTest {
    @Test
    public void InserirUmDepartamento() {
        DepartmentRepository repository = new DepartmentRepository();
        Department departmentFake = new Department();
        departmentFake.setName("Fake Department");
        repository.insert(departmentFake);
    }
    @Test
    public void DeletarUmDepartamentoPeloId() {
        DepartmentRepository repository = new DepartmentRepository();
        repository.delete(5);
    }
    @Test
    public void AtualizarONomeDepartamentoPeloId() {
        DepartmentRepository repository = new DepartmentRepository();
        String name = "testeBooks";
        repository.updateDepartment(6,name);
    }
    @Test
    public void ExibirUmaListaDeDepartments(){
        DepartmentRepository repository = new DepartmentRepository();
        List<Department> department = repository.getDepartments();
        for(Department d : department){
            System.out.println(d);
        }
    }
    @Test
    public void ExibirUmDepartamentoPeloId(){
        DepartmentRepository repository = new DepartmentRepository();
        Department department = repository.getDepartmentById(3);
        System.out.println(department);
    }
    @Test
    public void FiltrarDepartamentosPorUmaString(){
        DepartmentRepository repository = new DepartmentRepository();
        List<Department> department = repository.getFilter("computers");
        System.out.println(department);
    }
    @Test
    public void RetornarDepartamentosSemSellers(){
        DepartmentRepository repository = new DepartmentRepository();
        List<Department> department = repository.getNoSellers();
        System.out.println(department);
    }
}
