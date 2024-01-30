package org.rd.lessons.lesson15;

public class Singleton {
    private static Singleton instance;

    //Singleton tasarım deseninde private method olusturuyoruz.
    private Singleton() {
        // Constructor
    }

    // Static metot ile Singleton örneğine erişim
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Singleton tasarım kullanıldıgına dair mesaj ciktisi.
    public void showMessage() {
        System.out.println("Singleton tasarımı kullanıldı.");
    }
}
