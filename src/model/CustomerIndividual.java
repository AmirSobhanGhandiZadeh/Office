package model;

public class CustomerIndividual extends Person {
    private String number;

    public CustomerIndividual(String firstName, String lastName, String nationId, String address,String number) {
        super(firstName, lastName, nationId, address);
        this.number = number;
    }
    @Override
    public void save() {
        super.save();
        System.out.println("شماره: " + number);
    }
    public String getNumber() {
        return number;
    }
}
