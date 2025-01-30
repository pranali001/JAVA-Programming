//Create a BankAccount class with private attributes accountNumber and balance. Add getter and setter methods for these attributes. Write a program to test the class.
class BankAccount {
    private int accountNumber;
    private int balance;
      // Setter
  public void setacno(int accountNumber) {
    this.accountNumber = accountNumber;
}
//Getter
  public int getacno() {
    return accountNumber;
  }
   public void setbal(int balance) {
    this.balance = balance;
}
//Getter
  public int getbal() {
    return balance;
  }
}
class Main {
    public static void main(String[] args) {
          BankAccount myAccount = new BankAccount();
  myAccount.setacno(101);
        myAccount.setbal(1000);

        // Getting and displaying values
        System.out.println("Account Number: " + myAccount.getacno());
        System.out.println("Balance: " + myAccount.getbal());
        System.out.println("-------------");
          BankAccount myAccount1 = new BankAccount();
          myAccount1.setacno(102);
        myAccount1.setbal(2000);

        // Getting and displaying values
        System.out.println("Account Number: " + myAccount1.getacno());
        System.out.println("Balance: " + myAccount1.getbal());
    }
}