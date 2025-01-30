interface Payable {
    default void paySalary() {
        System.out.println("Salary Paid!!!"); // Common message
    }
}

class Employee implements Payable {
    @Override
    public void paySalary() {
        Payable.super.paySalary(); // Call the common message from the interface
        System.out.println("Employee-specific logic here."); // Additional Employee logic
    }
}

class Freelancer implements Payable {
    @Override
    public void paySalary() {
        Payable.super.paySalary(); // Call the common message from the interface
        System.out.println("Freelancer-specific logic here."); // Additional Freelancer logic
    }
}

class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Freelancer f = new Freelancer();

        e.paySalary(); // Output: Common message + Employee logic
        f.paySalary(); // Output: Common message + Freelancer logic
    }
}
