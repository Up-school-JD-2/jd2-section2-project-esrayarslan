public class Phone {

    private String brand;
    private String model;
    private String serialNumber;
    private int memorySpace;
    private String operatingSystem;

    public Phone(String brand, String model, String serialNumber, int memorySpace, String operatingSystem) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.memorySpace = memorySpace;
        this.operatingSystem = operatingSystem;
    }
    public void showPhoneInformation() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Serial Number : " + serialNumber);
        System.out.println("Memory Space : " + memorySpace + " GB");
        System.out.println("Operating System : " + operatingSystem);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getMemorySpace() {
        return memorySpace;
    }

    public void setMemorySpace(int memorySpace) {
        this.memorySpace = memorySpace;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
