package desafios.contribuintesOOListas.entities;

public class TaxPayer { // Contribuinte
    private Double salaryIncome; // Renda com Salário
    private Double servicesIncome; // Renda com prestação de serviço
    private Double capitalIncome; // Renda com ganho de capital
    private Double healthSpending; // Gastos Medicos
    private Double educationSpending; // Gastos Educacionais

   public TaxPayer(){

    }

    public TaxPayer(Double salaryIncome,Double servicesIncome,Double capitalIncome, Double healthSpending, Double educationSpending){
       this.salaryIncome = salaryIncome;
       this.servicesIncome = servicesIncome;
       this.capitalIncome = capitalIncome;
       this.healthSpending = healthSpending;
       this.educationSpending = educationSpending;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setCapitalIncome(Double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public void setEducationSpending(Double educationSpending) {
        this.educationSpending = educationSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public void setSalaryIncome(Double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public void setServicesIncome(Double servicesIncome) {
        this.servicesIncome = servicesIncome;
    }

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public Double getServicesIncome() {
        return servicesIncome;
    }
}
