package model;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String nationalId;
    protected String address;

    public Person(String firstName, String lastName, String nationId, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationId;
        this.address = address;
    }

    public void save() {
        System.out.println("نام: " + firstName + " " + lastName);
        System.out.println("کد ملی: " + nationalId);
        System.out.println("آدرس: " + address);
    }
}
