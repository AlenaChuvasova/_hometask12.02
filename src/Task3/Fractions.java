package Task3;

import java.util.Objects;

public class Fractions implements Comparable<Fractions> {
    //num - числитель
    //den - знаменатель

    private int num;
    private int den;

    public Fractions(int num, int den) {
        if (den == 0 || den < 0) {
            System.out.println("Error!");
        }
        this.num = num;
        this.den = den;
    }

    public Fractions(int num) {

        this(num, 1);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        if (den == 0 || den < 0) {
            System.out.println("Error!");
        }
        this.den = den;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fractions fractions = (Fractions) o;
        return num == fractions.num &&
                den == fractions.den;
    }

    @Override
    public int hashCode() {

        return Objects.hash(num, den);
    }

    @Override
    public String toString() {

        return num + "/" + den;
    }

    public Fractions add(Fractions fr1) {
        Fractions sum = new Fractions((fr1.num * fr1.den) + (fr1.num * fr1.den), (fr1.den * fr1.den));
        return sum;
    }

    public Fractions multiply(Fractions fr1) {
        Fractions multi = new Fractions((fr1.num * fr1.num), (fr1.den * fr1.den));
        return multi;
    }

    public Fractions reduction(Fractions fr1) {
        int min = Math.min(num, den);
        for (int i = 2; i <= min; i++) {
            if (num % i == 0 && den % i == 0) {
                num /= i;
                den /= i;
            }
        }
        return this;

    }

    @Override
    public int compareTo(Fractions fr1) {
        int f = this.getNum() * fr1.getDen();
        int g = fr1.getNum() * this.getDen();
        int res=0;
        if (f > g) {
            res = 1;
        } else if (g < f) {
            res = -1;
        } else {}
        return res;
    }
}
