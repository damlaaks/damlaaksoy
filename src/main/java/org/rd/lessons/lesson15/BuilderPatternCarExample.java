package org.rd.lessons.lesson15;

public class BuilderPatternCarExample {
    public static void main(String[] args) {
        VolkswagenTroc volkswagenTroc = new VolkswagenTroc();
        CarBuilder carBuilder = new SUVBuilder();

        volkswagenTroc.setCarBuilder(carBuilder);
        volkswagenTroc.constructCar();

        CarsBuilderTasarım car = volkswagenTroc.getCar();
        System.out.println("Oluşturulan Araç Özellikleri:");
        System.out.println("Marka: " + car.getMarka());
        System.out.println("Model: " + car.getModel());
        System.out.println("Vites: " + car.getVites());
        System.out.println("Tip: " + car.getTip());
        System.out.println("Renk: " + car.getRenk());
    }

}
