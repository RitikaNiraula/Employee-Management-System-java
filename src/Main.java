import java.util.Scanner;


public class Main implements Payable{

    protected Employee[] employees;
    protected int capacity;
    public static int counter=0;

    public Main(int capacity){
        this.capacity=capacity;
        employees=new Employee[capacity];
        //creates empty array of type geometricObject

    }


    public void getEmployeeDetails(Employee employee){
        if(counter<capacity){
            employees[counter]=employee;
            counter++;

        }
        else System.out.println("no capacity");
    }

    public void printEmployeeDetails(){
        for(int i=0;i<counter;i++){
            System.out.println("Name: "+employees[i].getName()+
                    ",\nID: "+employees[i].getId()+
                    ",\nAddress: "+employees[i].getAddress()+
                    "\nSalary: "+employees[i].calculateSalary()
            );
        }

    }


    public boolean runMenu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Employee Management System: ");
        System.out.println("1.Employee Details");
        System.out.println("2.Print Employee Details");
        System.out.println("3.Exit.");
        System.out.println("Please choose your options.");

        int choice=sc.nextInt();
        switch (choice){
            case 1:addEmployeeDetails();
                break;
            case 2:printEmployeeDetails();
                break;
            case 3:return  true;

            default:
                System.out.println("Invalid option. Try again.");



        }


        return false;
    }


    public void addEmployeeDetails(){
        Scanner scan=new Scanner(System.in);

        if(counter<capacity){
            System.out.println("Please choose an option.");
            System.out.println("1.Full Time Employee");
            System.out.println("2.Part Time Employee");


            int employeechoice=scan.nextInt();
            scan.nextLine();//to consume newline entered by user

            System.out.println("Please enter the name: ");
            String name=scan.nextLine();
            System.out.println("Please enter Id: ");
            int Id=scan.nextInt();
            System.out.println("Please enter the address: ");
            String address=scan.next();

            switch (employeechoice){
                case 1://Full Time Employee
                    System.out.println("Please enter the monthly salary and bonus");
                    double monthly_salary=scan.nextDouble();
                    double bonus=scan.nextDouble();
                    getEmployeeDetails(new FullTimeEmployee(monthly_salary,bonus,name,Id,address));
                    break;
                case 2://square
                    System.out.println("Please enter the hourly rate and hours worked: ");
                    double hourly_rate=scan.nextDouble();
                    double hours_worked=scan.nextDouble();
                    getEmployeeDetails(new PartTimeEmployee(hourly_rate,hours_worked,name,Id,address));
                    break;

                default:
                    System.out.println("Invalid shape type.");

            }



        }else
            System.out.println("is Full");
    }
    public static void main(String[] args) {

        boolean exit =false;
        Payable sys=new Main(3);
        while (!exit){
            exit= sys.runMenu();
        }
    }
}




