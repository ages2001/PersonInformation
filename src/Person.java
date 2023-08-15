public class Person {
    private String name;
    private ContactInfo contactInformation;

    public String getName() {
        return new String(name);
    }

    public ContactInfo getContactInformation() {
        return new ContactInfo((contactInformation));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInformation(ContactInfo contactInformation) {
        this.contactInformation = contactInformation;
    }

    public Person() {
        setName(null);
        setContactInformation(null);
    }

    public Person(String name, ContactInfo contactInformation) {
        setName(new String(name));
        setContactInformation(new ContactInfo(contactInformation));
    }

    public Person(Person copyPerson) {
        setName(new String(copyPerson.getName()));
        setContactInformation(new ContactInfo(copyPerson.getContactInformation()));
    }

    @Override
    public String toString() {
        String output = "Person name-surname: " + this.getName()
                + "\n\nPerson contact Information: \n***************************\n"
                + this.getContactInformation();
        return output;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        else if (this.getClass() != obj.getClass())
            return false;

        else {
            Person person = (Person) obj;

            boolean result = (getName().equals(person.getName()))
                    && (getContactInformation().equals(person.getContactInformation()));

            return result;
        }
    }
}
