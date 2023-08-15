public class ContactInfo {
    private String homeAddress;
    private String phoneNumber;
    private String eMail;

    public String getHomeAddress() {
        return this.homeAddress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEMail() {
        return this.eMail;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public ContactInfo() {
        setHomeAddress(null);
        setPhoneNumber(null);
        setEMail(null);
    }

    public ContactInfo(String homeAddress, String phoneNumber, String eMail) {
        setHomeAddress(homeAddress);
        setPhoneNumber(phoneNumber);
        setEMail(eMail);
    }

    public ContactInfo(ContactInfo copyObject) {
        setHomeAddress(copyObject.getHomeAddress());
        setPhoneNumber(copyObject.getPhoneNumber());
        setEMail(copyObject.getEMail());
    }

    @Override
    public String toString() {
        return "\nHome Address: " + getHomeAddress() + "\nPhone Number: " + getPhoneNumber() + "\nE-Mail: " + getEMail() + "\n\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        else if (this.getClass() != obj.getClass())
            return false;

        else {
            ContactInfo contactInfo = (ContactInfo) obj;

            boolean result = (getHomeAddress().equals(contactInfo.getHomeAddress()))
                    && (getPhoneNumber().equals(contactInfo.getPhoneNumber()))
                    && (getEMail().equals(contactInfo.getEMail()));

            return result;
        }
    }
}
