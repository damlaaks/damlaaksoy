package org.rd.lessons.Odevler.HW8LESSON11;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private Personel teamLead;
    private List<Personel> personelList;
    private List<String> assignmentList;

    public Departman(Personel teamLead) {
        if (teamLead == null) {
            throw new IllegalArgumentException("Team lead cannot be null.");
        }
        this.teamLead = teamLead;
        this.personelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public void changeTeamLead(Personel newTeamLead) {
        if (newTeamLead != null) {
            this.teamLead = newTeamLead;
            System.out.println("Team lead changed to: " + newTeamLead.getAd() + " " + newTeamLead.getSoyad());
        } else {
            System.out.println("New team lead is not valid.");
        }
    }

    public void addPersonel(Personel personel) {
        this.personelList.add(personel);
        System.out.println("Personel added: " + personel.getAd() + " " + personel.getSoyad());
    }

    public void removePersonel(Personel personel) {
        this.personelList.remove(personel);
        System.out.println("Personel removed: " + personel.getAd() + " " + personel.getSoyad());
    }

    public void changePersonel(Personel oldPersonel, Personel newPersonel) {
        int index = this.personelList.indexOf(oldPersonel);
        if (index != -1) {
            this.personelList.set(index, newPersonel);
            System.out.println("Personel changed from: " + oldPersonel.getAd() + " " + oldPersonel.getSoyad() +
                    " to: " + newPersonel.getAd() + " " + newPersonel.getSoyad());
        } else {
            System.out.println("Person not found");
        }
    }

    public void addAssignment(String assignment) {
        this.assignmentList.add(assignment);
        System.out.println("Assignment added: " + assignment);
    }

    public void markAssignmentCompleted(String assignment) {
        if (assignmentList.contains(assignment)) {
            assignmentList.remove(assignment);
            System.out.println("Assignment marked as completed: " + assignment);
        } else {
            System.out.println("Assignment not found");
        }
    }
}