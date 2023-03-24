public class Main {
    public static void main(String[] args) {
        int started = 200;
        int add = 1200;
        int bonus;

        if (add > 1000) {
            bonus =add / 100;
           // "суммарный бонус=bonus";
        } else {
           // "суммарный бонус=0";
            bonus=0;

        }
        int sum= started+add+bonus;
        System.out.println(bonus);
        System.out.println(sum);
    }
}