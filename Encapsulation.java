Encapsulation
Definition: Wrapping data and methods in a single class and protecting it from outside access using access modifiers (private, public, protected).
Real-life Example: ATM Machine → You can withdraw cash, but you can’t see its internal processes.

class BankAccount {
private:
    int balance = 5000;  // Encapsulated data

public:
    void showBalance() {
        cout << "Balance: " << balance << "\n";
    }
};

int main() {
    BankAccount account;
    account.showBalance();  // Only controlled access
    return 0;
}