import java.util.Random;

public class BankAccount {
    private double amount;
    void deposit(Double sum){
        amount = amount +sum;
    }




    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("������������� ����� �� ������, ��������� ������� ����",
                    amount);
        }
        System.out.println("�� ����� �� �����: " + sum);
        amount = amount - sum;

        }
    public double getAmount() {
        return amount;

        }
        public void setAmount(){
        this.amount = amount;
        }
    }

