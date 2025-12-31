public  abstract class Employee {
    //fields
    protected String name;
    protected  int id;
    protected String address;

    public Employee(){
        name="Ritika";
        id=01;
        address="Biratnagar";
    }

    public Employee(String name,int id,String address){
        this.name=name;
        this.id=id;
        this.address=address;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public abstract double calculateSalary();


    @Override
    public String toString() {
        return "Name: "+getName()+"\nId: "+getId()+"\n Address: "+getAddress();
    }
}
