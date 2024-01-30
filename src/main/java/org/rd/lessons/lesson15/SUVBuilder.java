package org.rd.lessons.lesson15;
class SUVBuilder implements CarBuilder {
    private CarsBuilderTasarım car;

    public SUVBuilder() {
        this.car = new CarsBuilderTasarım();
    }

    public void buildMarka() {
        car.setMarka("Volkswagen");
    }

    public void buildModel() {
        car.setModel("Troc");
    }

    public void buildVites() {
        car.setVites("Otomatik");
    }

    public void buildTip() {
        car.setTip("SUV");
    }

    public void buildRenk() {
        car.setRenk("Beyaz");
    }

    public CarsBuilderTasarım getCar() {
        return car;
    }
}


