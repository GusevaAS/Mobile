public class Main {
    public static void main(String[] args) {
        int account = 100;
        int deposit = 1500;
        int bonus;

        if (deposit >= 1001) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }

        //int bonus = deposit >= 1001 ? deposit / 100 : 0;

        int result = account + deposit + bonus;

        System.out.println(result);
    }
}