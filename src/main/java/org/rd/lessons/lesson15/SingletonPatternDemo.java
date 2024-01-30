package org.rd.lessons.lesson15;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Singleton örneğine erişim
        Singleton singletonInstance = Singleton.getInstance();

        // // Singleton tasarım kullanıldıgına dair mesaj ciktisinin gösterilmesi.
        singletonInstance.showMessage();
    }
}
