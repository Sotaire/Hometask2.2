package com.company;

public class Samsung extends Smartphone {

    private int memory;

    public Samsung(String operating_system, int memory) {
        super(operating_system);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String print() {
        return super.print() + "; " + "Memory: " + memory + "\n";
    }
}
