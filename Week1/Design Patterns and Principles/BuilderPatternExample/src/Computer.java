import java.util.Locale;

public class Computer {
    String CPU;
    String RAM;
    String Storage;
    double Wifi;
    public Computer(Builder builder)
    {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.Wifi = builder.Wifi;
    }
    public String toString() {
        return "Computer(" +
                "CPU='" + CPU +
                ", RAM=" + RAM +
                ", storage=" + Storage +
                ", hasWiFi=" + Wifi +
                ')';
    }
    public static class Builder {
        String CPU;
        String RAM;
        String Storage;
        double Wifi;
        public Builder setCPU(String CPU)
        {
            this.CPU = CPU;
            return this;
        }
        public Builder setRAM(String RAM)
        {
            this.RAM = RAM;
            return this;
        }
        public Builder setStorage(String CPU)
        {
            this.CPU = CPU;
            return this;
        }
        public Builder setWifi(double Wifi)
        {
            this.Wifi = Wifi;
            return this;
        }
        public Computer build()
        {
            return new Computer(this);
        }
    }
}
