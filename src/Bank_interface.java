public interface Bank_interface {
    double chekbalance();
    String addMoney(int amount);
    String withdrawMoney(int amount, String password);
    int claculateInterest(int years);
}
