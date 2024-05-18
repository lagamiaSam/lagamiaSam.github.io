package JAVA;

public class AddressBookEntry {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public AddressBookEntry(){
    }

    public AddressBookEntry(String name, String address, String phoneNumber, String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmailAddress(){
        return emailAddress;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public static void main (String [] args){
        AddressBookEntry entry = new AddressBookEntry("Samuel Aecel Lagamia", "151 Mallorca St", "915-123-4567", "samuellagamia@mail.com");

        System.out.println("Atrributes/Properties     | Description");
        System.out.println("--------------------------|------------------------------------");
        System.out.println("Name:                     | " + entry.getName());
        System.out.println("Address:                  | " + entry.getAddress());
        System.out.println("Phone Number:             | " + entry.getPhoneNumber());
        System.out.println("Email Address:            |  "+ entry.getEmailAddress());

    }

}
 