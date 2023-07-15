package Worker;


public class Employee {

    private String name;
    private String surname;
    private String contactNumber;

    public Employee(String name, String surname, String contactNumber) {
        this.name = name;
        this.surname = surname;
        this.contactNumber = contactNumber;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }   }
