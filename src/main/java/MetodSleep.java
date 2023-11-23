import static java.lang.Thread.sleep;

public class MetodSleep implements Cloneable {//Обозначает что метод может быть клонирован

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println("Программа начала выполнение");
            sleep(5000);
            System.out.println("Прошло 5 секунд");
            break;
        }
        System.out.println("Программа закончила выполнение");
    }

    @Override
    public MetodSleep clone() {
        try {
            return (MetodSleep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
