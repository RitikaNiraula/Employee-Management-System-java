public class FullTimeEmployee extends Employee{

    protected double monthly_salary;
    protected double bonus;

    public FullTimeEmployee(){
        monthly_salary=10000;
        bonus=20000;
    }

    public FullTimeEmployee(double m_s,double b){
        monthly_salary=m_s;
        bonus=b;
    }

    public FullTimeEmployee(double m_s,double b,String name,int id,String address){
        monthly_salary=m_s;
        bonus=b;
        this.name=name;
        this.id=id;
        this.address=address;
    }
    public double getMonthly_salary() {
        return monthly_salary;
    }

    public void setMonthly_salary(double monthly_salary) {
        this.monthly_salary = monthly_salary;
    }



    @Override
    public double calculateSalary() {
        return monthly_salary+bonus;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+"\nID: "+getId()+"\nAddress: "+getAddress()+"Salary: "+calculateSalary();
    }
}


