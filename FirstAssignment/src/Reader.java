public class Reader {

    public String name;
    public String surname;
    public int phoneNumber;

    //constructor
    public Reader(String surname, String name, int phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName() {
        this.name = name;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return surname + ", " + name + ", " + phoneNumber;
    }
}
