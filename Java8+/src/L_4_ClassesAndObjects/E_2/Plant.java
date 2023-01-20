package L_4_ClassesAndObjects.E_2;

public class Plant {
    private String name;
    private String description;
    private double waterConsumption;

    public Plant(String name, String description, double waterConsumption) {
        this.name = name;
        this.description = description;
        this.waterConsumption = waterConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWaterConsumption() {
        return waterConsumption;
    }

    public void setWaterConsumption(double waterConsumption) {
        this.waterConsumption = waterConsumption;
    }
}
