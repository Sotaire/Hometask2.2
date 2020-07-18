package com.company;

public class Smartphone implements Printable {

    private String operating_system;

    public Smartphone(String operating_system) {
        this.operating_system = operating_system;
    }

    public String getOperating_system() {
        return operating_system;
    }

    @Override
    public String print() {
        return "Operating system : " + operating_system;
    }

}
