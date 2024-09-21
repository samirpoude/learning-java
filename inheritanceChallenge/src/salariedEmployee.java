public class salariedEmployee extends Employee{
     double annunalSalary;
     boolean isRetired;

    public salariedEmployee(String name, String birthDate, String hireDate, double annunalSalary) {
        super(name, birthDate, hireDate);
        this.annunalSalary = annunalSalary;
    }
    @Override
    public double collectPay(){

        double paycheck = annunalSalary /26;
        double adjustedPay = (isRetired)? 0.9 *paycheck : paycheck;
        return (int) adjustedPay;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }
}
