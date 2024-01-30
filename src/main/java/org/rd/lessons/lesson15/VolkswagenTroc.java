package org.rd.lessons.lesson15;

class VolkswagenTroc {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public CarsBuilderTasarım getCar() {
        return carBuilder.getCar();
    }

    public void constructCar() {
        carBuilder.buildMarka();
        carBuilder.buildModel();
        carBuilder.buildTip();
        carBuilder.buildVites();
        carBuilder.buildRenk();
    }
}
