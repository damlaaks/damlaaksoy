package org.rd.lessons.lesson10;

public class GunesSistemi {

    public enum Gezegenler {
        MERKUR(1, 57.9, 2.439, 88),
        VENUS(2, 108.2, 6.052, 225),
        DUNYA(3, 149.6, 6.371, 365),
        MARS(4, 227.9, 3.389, 687),
        JUPITER(5, 778.5, 69.911, 4333),
        SATURN(6, 1433.4, 58.232, 10759),
        URANUS(7, 2872.5, 25.362, 30687),
        NEPTUN(8, 4495.1, 24.622, 60190);

        private final int siraNumarasi;
        private final double uzaklik; // milyon kilometre cinsinden
        private final double yaricap; // kilometre cinsinden
        private final int donmeSuresi; // gün cinsinden

        Gezegenler(int siraNumarasi, double uzaklik, double yaricap, int donmeSuresi) {
            this.siraNumarasi = siraNumarasi;
            this.uzaklik = uzaklik;
            this.yaricap = yaricap;
            this.donmeSuresi = donmeSuresi;
        }

        public int getSiraNumarasi() {
            return siraNumarasi;
        }

        public double getUzaklik() {
            return uzaklik;
        }

        public double getYaricap() {
            return yaricap;
        }

        public int getDonmeSuresi() {
            return donmeSuresi;
        }
    }

    public static void main(String[] args) {
        for (Gezegenler gezegen : Gezegenler.values()) {
            System.out.println(gezegen.name() + ": "
                    + "Sıra Numarası: " + gezegen.getSiraNumarasi()
                    + ", Uzaklık: " + gezegen.getUzaklik()
                    + ", Yarıçap: " + gezegen.getYaricap()
                    + ", Dönme Süresi: " + gezegen.getDonmeSuresi());
        }
    }
}