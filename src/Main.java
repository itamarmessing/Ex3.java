//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    BankAccount first = new BankAccount("itamar", 1000);
    BankAccount second = new BankAccount("asi", 800);

    System.out.println(first.getAccountId());
    System.out.println(second.getAccountId());

    System.out.println(first.deposit(500));
    System.out.println(second.withdraw(200));

    System.out.println(first.transferTo(second, 300));

    double before = first.getBalance();
    System.out.println(first.withdraw(10000));
    System.out.println("balance unchanged: " + (first.getBalance() == before));

    System.out.println(first.getAccountInfo());
    System.out.println(second.getAccountInfo());

    System.out.println(BankAccount.getTotalAccounts());

    int nextId = BankAccount.getNextAccountId();
    System.out.println("next ID: " + nextId);
    BankAccount third = new BankAccount("amit");
    System.out.println("third account ID: " + third.getAccountId());
    System.out.println("ID matches: " + (third.getAccountId() == nextId));

    System.out.println(first.deposit(-50));
    System.out.println(first.transferTo(first, 100));
    System.out.println("balance unchanged: " + (first.getBalance() == before));

    Bank bank = new Bank("kings bank", 123);
    bank.setAccounts(first, second);
    System.out.println(bank.getBankInfo());
    System.out.println("total balance: " + bank.getTotalBalance());
}

   


