public class Computer {

    // Declares private string variables
    // Are required
    private String RAM;
    private String HDD;
    private String CPU;

    // Declares private boolean variables
    // Are optional
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    // Constructor with 1 argument declaring local variables
    private Computer(Builder builder) {
        this.HDD = builder.HDD;
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    // Get functions
    public String getRAM() {
        return RAM;
    }
    public String getHDD() {
        return HDD;
    }
    public String getCPU() {
        return CPU;
    }
    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    // Display method which outputs component variables
    public void display(){
        System.out.println(HDD + " " + CPU + " " + RAM + " BT:" + isBluetoothEnabled + " GFX:" + isGraphicsCardEnabled);
    }

    // Static class that builds the data by declaring,
    // initializing it locally and setting values
    public static class Builder{
        // Declares private string variables
        // Are required
        private String RAM;
        private String HDD;
        private String CPU;

        // Declares private boolean variables
        // Are optional
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        // Class constructor with 3 arguments declaring local variables
        public Builder(String ram, String hdd, String cpu) {
            this.RAM = ram;
            this.HDD = hdd;
            this.CPU = cpu;
        }

        // Enabler function
        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        // Enabler function
        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        // Returns computer build
        public Computer build() {
            return new Computer(this);
        }
    }

}
