public class Main {

    public static void main(String[] args) {
        for (int r : new Randoms(5, 10)) {
            System.out.println("Случайное число: " + r);
            if (r == 10) {
                System.out.println("Выпало число 10, давайте на этом закончим");
                break;
            }
        }
    }
}
