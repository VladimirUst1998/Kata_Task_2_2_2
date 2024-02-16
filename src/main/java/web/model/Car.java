package web.model;

public class Car {
    private String brand;
    private String model;
    private int series;

    public Car() {};

    public Car(String brand, String model, int series) {
        this.brand = brand;
        this.model = model;
        this.series = series;
    }
    public void setBrand() {this.brand = brand;}
    public String getBrand(){ return brand; }
    public void setModel() {this.model = model;}
    public String getModel(){ return model; }
    public void setSeries() {this.series = series;}
    public int getSeries(){ return series; }
}
