public class Demo {
    public static void main(String[] args) {

        ContactInfo contactInfo = new ContactInfo("address", "0555 444 33 22", "email@example.com");
        Person person = new Person("Name Surname", contactInfo);
        Bus bus = new Bus("vehicle brand", "vehicle licence plate", person, 20, 7);

        System.out.println(bus);

        System.out.println("\nThe amount of motor tax to be paid for this vehicle is "
                + bus.calculateTax() + " TL.");

        Bus copyBus = new Bus(bus);

        if (copyBus.equals(bus))
            System.out.println("\nThese two buses are equal.");

        else
            System.out.println("\nThese two buses are not equal.");
    }
}
