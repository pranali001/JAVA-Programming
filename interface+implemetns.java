//Create an interface Payable with a method paySalary(). Implement the interface in classes Employee and Freelancer. Write a program to test the implementation.
interface Payable{
    void paySalary();
}
class Employee implements Payable{
    public void paySalary(){
        System.out.println(" Employee Paid!!!");
    }
}
class Freelancer implements Payable{
    public void paySalary(){
        System.out.println(" Freelancer Paid!!");
    }
}
class Main {
    public static void main(String[] args) {
     Employee e=new Employee();
     Freelancer f= new Freelancer();
     e.paySalary();
     f.paySalary();
    }
}