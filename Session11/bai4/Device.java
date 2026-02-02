package bai4;

public abstract class Device {
    protected int id;
    protected String name;

    public Device(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected abstract void turnOn();
    protected abstract void turnOff();
}