package org.rd.lessons.lesson11;

public class VeriSaklayici {

    private int gizliSayi;

    public int getGizliSayi () {
        return gizliSayi;
    }

    public void setGizliSayi (int yeniDeger) {
        this.gizliSayi = yeniDeger;
    }
    private  int topla(int sayi){
        return sayi + gizliSayi;
    }
    public void Hesaplama(int x,int y) {
        setGizliSayi(y);
        System.out.println("Toplam:" + topla(x));
    }
}


