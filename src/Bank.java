public class Bank
{
    private String bankName;
    private int bankCode;
    private BankAccount account1;
    private BankAccount account2;

    public Bank(String bankName, int bankCode)
    {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    public void setAccounts(BankAccount a, BankAccount b)
    {
        account1 = a;
        account2 = b;
    }

    public double getTotalBalance()
    {
        return account1.getBalance() + account2.getBalance();
    }

    public String getBankInfo()
    {
        return "Bank: " + bankName + ", code: " + bankCode + "\n" + account1.getAccountInfo() + "\n" + account2.getAccountInfo();
    }
    public String getBankName()
    {
        return bankName;
    }
}

















