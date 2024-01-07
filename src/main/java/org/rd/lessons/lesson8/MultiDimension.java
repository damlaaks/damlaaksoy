package org.rd.lessons.lesson8;

public class MultiDimension {

    public static void main(String[] args) {
        int[][] matris = new int[3][3];

        matris[0][0] = 1;
        matris[0][1] = 3;
        int matris_degiskeni = matris[2][2];

        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                System.out.print("Matrisin " + (satir + 1) + ". satir " + ". sutununda yer alan değer: " + matris[satir][sutun] + " ");
            }
            System.out.println();
        }
    }
}