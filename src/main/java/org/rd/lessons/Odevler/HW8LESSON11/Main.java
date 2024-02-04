package org.rd.lessons.Odevler.HW8LESSON11;

public class Main {
    public static void main (String[] args){
        // Team lead ve personel oluşturma
        Personel teamLead = new Kadin("Damla", "Aksoy", "26/02/1995");
        Personel personel1 = new Erkek("Berk", "Aksoy", "02/04/1995");
        Personel personel2 = new Kadin("Damla", "Aksoy", "26/02/1995");

        // Departman oluşturma
        Departman departman = new Departman(teamLead);

        // Personel ekleme
        departman.addPersonel(personel1);
        departman.addPersonel(personel2);

        // Görev ekleme
        departman.addAssignment("Test otomasyon ödevini tamamla");
        departman.addAssignment("Ödevi teslim et");

        // Görevi tamamlandı olarak işaretleme
        departman.markAssignmentCompleted("Test otomasyon ödevini tamamla");

        // Personel çıkarma
        departman.removePersonel(personel2);

        // Yeni bir team lead atama
        Personel newTeamLead = new Erkek("DML", "AKS", "03/03/1995");
        departman.changeTeamLead(newTeamLead);
    }
}
