public class UnaryOperator {
    public static void main(String[] args) {
        int i = 5;
        i = i++;
        System.out.println(i == 5);
        i = ++i;
        System.out.println(i == 6);
    }
}
