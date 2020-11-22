package entity;




public class CPU {
    public class Ram{
        public int memory;
        public String manufacturer;

        public Ram(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public double getClockSpeed()
        {
            return 5.5;
        }

        @Override
        public String toString() {
            return "Ram{" +
                    "memory=" + memory +
                    ", manufacturer='" + manufacturer + '\'' +
                    '}';
        }
    }
    public class Processor
    {
        private int coreAmount;
        private String manufacturer;
        public double getCache()
        {
            return 4.3;
        }

        public Processor(int coreAmount, String manufacturer) {
            this.coreAmount = coreAmount;
            this.manufacturer = manufacturer;
        }

        public int getCoreAmount() {
            return coreAmount;
        }

        public void setCoreAmount(int coreAmount) {
            this.coreAmount = coreAmount;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        @Override
        public String toString() {
            return "Processor{" +
                    "coreAmount=" + coreAmount +
                    ", manufacturer='" + manufacturer + '\'' +
                    '}';
        }
    }
    private double price;
    public CPU(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "price=" + price +
                '}';
    }
}
