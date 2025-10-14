class savingsAmount{
  public double balance;                                 // instanace feild or variable

public savingsAmount(double initialBalance){              // constructor which has same name as class
  balance = initialBalance;
}
  public void deposit(double amountToDeposit){            // calling an non static instance method
    double upbalance = balance + amountToDeposit;
    balance = upbalance;
  }
   public void credit(double amountTocredit){              // calling an non static instance method
    double upbalance = balance - amountTocredit;
    balance = upbalance;
  }
  public static void main(String[] args){                   //static main methiod
    savingsAmount amount = new savingsAmount(1000);
    System.out.println(amount.balance);
    amount.deposit(300);                                    // to print an non static ,method  we have to use an (.) operator
    System.out.println(amount.balance);
    amount.credit(400);
    System.out.println(amount.balance);
    
}
