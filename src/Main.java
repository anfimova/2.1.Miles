public class Main {
    public static void main(String[] args) {
        float price = 150;
        int every20 = 20;
        int bonus = (int) (price / every20);
        System.out.print("Бонусов начислено: " + bonus);
    }
}