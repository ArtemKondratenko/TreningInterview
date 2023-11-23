public class GenerateObject {
    public static void main(String[] args) {
        MetodSleep original = new MetodSleep();
        MetodSleep clon = original.clone();
        System.out.println(original == clon); //Объекты различны значит клонировал успешно
        System.out.println(clon);
        System.out.println(original);
    }
}
