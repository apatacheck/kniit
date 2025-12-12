package org.kniit.lab9.task16;

public enum Rank {
    ДВА("2"),
    ТРИ("3"),
    ЧЕТЫРЕ("4"),
    ПЯТЬ("5"),
    ШЕСТЬ("6"),
    СЕМЬ("7"),
    ВОСЕМЬ("8"),
    ДЕВЯТЬ("9"),
    ДЕСЯТЬ("10"),
    ВАЛЕТ,
    ДАМА,
    КОРОЛЬ,
    ТУЗ;

    private final String numericValue;

    Rank() {
        this.numericValue = null;
    }

    Rank(String numericValue) {
        this.numericValue = numericValue;
    }

    @Override
    public String toString() {
        return numericValue != null ? numericValue : name();
    }
}