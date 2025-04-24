package tarefas.exercicio21listas.entities;

public class Funcionario {
    private Integer id;
    private String name;
    private Double salary;

    public Funcionario(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(Double percentage) {
        salary += salary * percentage/100.0;

    }

    @Override
    public String toString() {
        return String.format("ID: %d Nome: %s Salário: %.2f", id, name, salary);
    }
}
