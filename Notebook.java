import java.util.HashMap;
import java.util.Map;

public class Notebook {
    private String brand;
    private int ram;
    private int storage;
    private String operatingSystem;
    private String color;

    public Notebook(String brand, int ram, int storage, String operatingSystem, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ноутбук{" +
                "бренд='" + brand + '\'' +
                ", ОЗУ=" + ram +
                ", HDD=" + storage +
                ", ОС='" + operatingSystem + '\'' +
                ", цвет='" + color + '\'' +
                '}';
    }
}
