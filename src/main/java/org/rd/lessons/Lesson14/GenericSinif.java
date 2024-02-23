package org.rd.lessons.Lesson14;


public class GenericSinif<T> {

    private T alan;

    public GenericSinif(T alan) {
        this.alan = alan;
    }

    public T getAlan() {
        return alan;
    }

    public void setAlan(T alan) {
        this.alan = alan;
    }

    @Override
    public String toString() {
        return "GenericSinif{" +
                "alan=" + alan +
                '}';
    }

    public static void main(String[] args) {
        GenericSinif<String> strSinif = new GenericSinif<>("Generic Alan String");
        System.out.println(strSinif);

        GenericSinif<Integer> intSinif = new GenericSinif<>(100);
        System.out.println(intSinif);
    }
}