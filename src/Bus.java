public class Bus extends Vehicle {
    private int capacity;
    private int ageOfBus;

    public Bus() {
        super(null, null, null);
        // setCapacity(null);
        // setAgeOfBus(null);
    }

    public Bus(String brand, String licencePlate, Person owner, int capacity, int ageOfBus) {
        super(brand, licencePlate, owner);
        setCapacity(capacity);
        setAgeOfBus(ageOfBus);
    }

    public Bus(Bus copyBus) {
        super(copyBus.getBrand(), copyBus.getLicencePlate(), copyBus.getOwner());
        setCapacity(copyBus.getCapacity());
        setAgeOfBus(copyBus.getAgeOfBus());
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAgeOfBus() {
        return ageOfBus;
    }

    public void setAgeOfBus(int ageOfBus) {
        this.ageOfBus = ageOfBus;
    }

    @Override
    public int calculateTax() {
        if (getAgeOfBus() < 0) {
            System.out.println("Invalid age of bus! ");
            return 0;
        }

        int taxAmount;

        if (getAgeOfBus() < 5)
            taxAmount = 4000;

        else if (5 <= getAgeOfBus() && getAgeOfBus() <= 10)
            taxAmount = 3000;

        else
            taxAmount = 2000;

        return taxAmount;
    }

    @Override
    public String toString() {
        String output = "Bus brand: " + super.getBrand()
                + "\nBus licence plate: " + super.getLicencePlate()
                + "\n\nBus owner: \n**********\n" + super.getOwner()
                + "\nBus Capacity: " + this.getCapacity()
                + "\nBus age: " + this.getAgeOfBus();
        return output;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;

        else if (this.getClass() != obj.getClass())
            return false;

        else {

            Bus bus = (Bus) obj;

            boolean result = (super.getBrand().equals(bus.getBrand()))
                    && (super.getLicencePlate().equals(bus.getLicencePlate()))
                    && (super.getOwner().equals(bus.getOwner()))
                    && (this.getCapacity() == bus.getCapacity())
                    && (this.getAgeOfBus() == bus.getAgeOfBus());

            return result;
        }
    }
}
