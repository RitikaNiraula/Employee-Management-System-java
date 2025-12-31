public class PartTimeEmployee extends Employee{
    protected double hourly_rate;
    protected double hours_worked;

    public PartTimeEmployee(){
        hourly_rate=1000;
        hours_worked=20;
    }

    public PartTimeEmployee(double h_r,double h_w){
        hourly_rate=h_r;
        hours_worked=h_w;
    }

    public PartTimeEmployee(double h_r,double h_w,String name,int id,String address){
        hourly_rate=h_r;
        hours_worked=h_w;
        this.name=name;
        this.id=id;
        this.address=address;
    }
    public double getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public double getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(double hours_worked) {
        this.hours_worked = hours_worked;
    }



    @Override
    public double calculateSalary() {
        return hours_worked*hourly_rate;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+"\nID: "+getId()+"\nAddress: "+getAddress()+"Salary: "+calculateSalary();
    }
}
