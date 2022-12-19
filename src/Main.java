public class Main {
    public static void main(String[] args) {
        int account = 100;
        int deposit = 1500;
        int bonus;
        if (deposit >= 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int result = account + deposit + bonus;

        System.out.println(result);
    }
}