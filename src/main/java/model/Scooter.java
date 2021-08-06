package model;

import maker.Maker;

public abstract class Scooter {

    private final Maker maker;

    public Scooter(Maker maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Scooter{" + super.getClass().getSimpleName() +
                "," + maker.getClass().getSimpleName() +
                '}';
    }
}
