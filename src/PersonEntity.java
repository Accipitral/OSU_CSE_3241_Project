
public class PersonEntity {

    public int User_ID;

    public String First_Name;

    public String Last_Name;

    public String Address;

    public String Phone_Number;

    public String Email;

    public PersonEntity(int id, String firstName, String lastName,
            String address, String phoneNumber, String email) {
        this.User_ID = id;
        this.First_Name = firstName;
        this.Last_Name = lastName;
        this.Address = address;
        this.Phone_Number = phoneNumber;
        this.Email = email;
    }

    @Override
    public String toString() {
        return "UserId: " + this.User_ID + "\nFirst_Name: " + this.First_Name
                + "\nLast_Name: " + this.Last_Name + "\nAddress: "
                + this.Address + "\nPhone_Number: " + this.Phone_Number
                + "\nEmail: " + this.Email;
    }

}
