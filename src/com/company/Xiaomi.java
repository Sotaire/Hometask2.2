package com.company;

public class Xiaomi extends Smartphone {

    private double mp;

    public Xiaomi(String operating_system, double mp) {
        super(operating_system);
        this.mp = mp;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    @Override
    public String print() {
        return super.print() + "; " +  "Mp: " + mp + "\n";
    }

}
