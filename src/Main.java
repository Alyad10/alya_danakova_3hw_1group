public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);
        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                try{
                    bankAccount.withDraw(e.getRemainingAmount());
                } catch (LimitException ex) {
                }
                System.out.println("�� ����� ������� " + e.getRemainingAmount());
                System.out.println("��� ������� ���� = "
                + bankAccount.getAmount());
                break;
            }
        }








    }
}
