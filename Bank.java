package Objectclass;

interface Account {
    void acc();

    int amount();
}

class SavingAccount implements Account {
     public void acc(){
         System.out.println("#90211245");
     }

     public int amount(){
         return 4000;
     }
}

class FdAccount implements Account {
    public void acc(){
        System.out.println("#01886410");
    }

    public int amount(){
        return 900;
    }
}


public class Bank {

    public static void main(String[] args){
        SavingAccount savings = new SavingAccount();
        FdAccount fixedDeposit = new FdAccount();

        savings.acc();
        fixedDeposit.acc();

        int result = savings.amount();
        int result2 = fixedDeposit.amount();
        System.out.println("The amount in Saving account is " + result);
        System.out.println("The amount in Fixed Deposit is " + result2);

    }


}
