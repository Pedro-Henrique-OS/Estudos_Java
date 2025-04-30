package desafios.contribuintesOOListas.entities;

public class TaxPayer { // Contribuinte
    private Double salaryIncome; // Renda com Salário, anual
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


    // Cálculo do imposto sobre salário
    public double salaryTax(){
       double monthlySalary = salaryIncome / 12;
       if(monthlySalary < 3000){
           return  0;
       }
       else if (monthlySalary > 3000 && monthlySalary < 5000) {
           return salaryIncome * 0.10;
       }
       else {
           return salaryIncome * 0.20;
       }
    }

    // Cálculo do imposto sobre serviços
    public double servicesTax(){ //serviços impostos
       return salaryIncome * 0.15;
    }

    // Cálculo do imposto sobre ganho de capital
    public double capitalTax(){
       return salaryIncome * 0.20;
    }

    // Cálculo do imposto bruto
    public double grossTax(){
       return salaryTax() + servicesTax() + capitalTax();
    }


    // Cálculo do abatimento
    public double taxRebate(){
       double maxDeductible = grossTax() * 0.30;
       double totalSpending = healthSpending + educationSpending;
       return Math.min(totalSpending,maxDeductible);

    }

    // Cálculo do imposto final
    public double netTax(){
       return grossTax() - taxRebate();
    }
}
