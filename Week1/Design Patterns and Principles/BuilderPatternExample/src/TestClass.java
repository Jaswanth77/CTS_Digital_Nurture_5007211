public class TestClass {
    public static void main(String[] args){
        Computer comp1 = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("512 SSD")
                .setWifi(6.2)
                .build();

        Computer comp2 = new Computer.Builder()
                .setCPU("Ryzen5")
                .setRAM("8GB")
                .setStorage("256 SSD")
                .setWifi(7)
                .build();

        Computer comp3 = new Computer.Builder()
                .setCPU("Intel Pentium")
                .setRAM("2GB")
                .setStorage("256 HDD")
                .setWifi(4.1)
                .build();

        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println(comp3);
    }
}