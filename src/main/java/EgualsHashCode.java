public class EgualsHashCode {
    private int n;

    public EgualsHashCode(int n) {
        this.n = n;
    }

    @Override // переопределяем метод хашкод
    public int hashCode() { //создание хешкода для объекта
        final int prime = 31;
        int result = 1;
        result = prime * result + n;
        return result;
    }

    public static void main(String[] args) {
        EgualsHashCode n = new EgualsHashCode(1);
        EgualsHashCode n2 = new EgualsHashCode(1);

        if(n.hashCode() == n2.hashCode() || n.equals(n2)) {
            System.out.println("Объекты  равны");
        } else {
            System.out.println("Объекты не равны");
        }
    }

}
