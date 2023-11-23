import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);) { // тогда после тогда когда мы использовали ресурс сканера он закроется автоматически и не нужно будет вызывать sc.close()
            int n = sc.nextInt();
            System.out.println(n);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
