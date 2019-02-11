package Task3;

public class Main {
    public static void main(String[] args) {
        Fractions fr1 = new Fractions(5, 6);
        Fractions fr2 = new Fractions(6);

        System.out.println(fr2.compareTo(fr1));
        System.out.println("The result of add function is: "+fr1.add(fr1).reduction(fr1));
        System.out.println("The result of multiply function is "+fr1.multiply(fr1).reduction(fr1));

    }
}
