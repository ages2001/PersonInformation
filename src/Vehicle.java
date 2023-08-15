public abstract class Vehicle {
    private String brand;
    private String licencePlate;
    private Person owner;

    public Vehicle() {
        setBrand(null);
        setLicencePlate(null);
        setOwner(null);
    }

    public Vehicle(String brand, String licencePlate, Person owner) {
        setBrand(new String(brand));
        setLicencePlate(new String(licencePlate));
        setOwner(new Person(owner));
    }

    public Vehicle(Vehicle copyVehicle) {
        setBrand(new String(copyVehicle.getBrand()));
        setLicencePlate(new String(copyVehicle.getLicencePlate()));
        setOwner(new Person(copyVehicle.getOwner()));
    }

    public String getBrand() {
        return new String(brand);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicencePlate() {
        return new String(licencePlate);
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public Person getOwner() {
        return new Person(owner);
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String output = "Vehicle brand: " + this.getBrand()
                + "\nVehice licence plate: " + this.getLicencePlate()
                + "\nVehice owner: \n***********\n" + this.getOwner();
        return output;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;

        else if (this.getClass() != obj.getClass())
            return false;

        else {

            Vehicle vehicle = (Vehicle) obj;

            boolean result = (getBrand().equals(vehicle.getBrand()))
                    && (getLicencePlate().equals(vehicle.getLicencePlate()))
                    && (getOwner().equals(vehicle.getOwner()));

            return result;
        }
    }

    public abstract int calculateTax();
}
