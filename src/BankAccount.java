public class BankAccount {
    private int accountId;
    private String ownerName;
    private double balance;
    private boolean isActive;
    private static int nextId=1000;
    private static int totalAccounts = 0;
    public BankAccount(String ownerName)
    {
        this.ownerName=ownerName;
        this.balance=0;
    }

    public BankAccount(String ownerName, double balance) {
        accountId = nextId;
        nextId++;
        totalAccounts++;
        this.ownerName = "Unknown";
        setOwnerName(ownerName);
        this.balance = 0;
        if (balance >= 0) {
            this.balance = balance;
        }
        isActive = true;
    }
    public boolean deposit(double amount)
    {
        if(!isActive || !isValidAmount(amount))
            return false;
       balance+=amount;
        return true;
    }

    public boolean withdraw(double amount)
    {
        if (!isActive || !isValidAmount(amount) || amount > balance)
            return false;
        balance -= amount;
        return true;
    }

    public boolean transferTo(BankAccount destination, double amount)
    {
        if(destination==null||destination.accountId==accountId)
            return false;
        if (!isActive ||!destination.isActive|| !isValidAmount(amount) || amount > balance)
            return false;
        balance -= amount;
        destination.balance+=amount;
        return true;
    }
    public boolean closeAccount()
    {
        if (!isActive || balance != 0)
            return false;
        isActive = false;
        return true;
    }
    public String getAccountInfo()
    {
        return "Account: " + accountId + ", owner: " + ownerName + ", balance: " + balance + ", active: " + isActive;
    }


    public void setOwnerName(String ownerName)
    {
        if (ownerName != null && !ownerName.equals(""))
        {
            this.ownerName = ownerName;
        }
    }
    public int getAccountId() { return accountId;}
    public String getOwnerName() { return ownerName;}
    public double getBalance() { return balance;}
    public boolean isActive() { return isActive;}


    public static int getTotalAccounts()
    {
        return totalAccounts;
    }
    public static boolean isValidAmount(double amount)
    {
        return amount > 0;
    }
    public static int getNextAccountId()
    {
        return nextId;
    }










}
