public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount =+ sum;
        System.out.println("Вы положили деньги в размере " + sum + " сом на счету. ");
    }
    public void  withDraw(int sum) throws LimitException {
        if (sum < amount) {
            throw  new LimitException("На вашем счету недостаточно средств для снятия данной суммы ", amount );
        }else {
            amount -= sum;
            System.out.println("Вы сняли в размере " + sum + " сом со счета");
        }

    }
}
