package model;

public class CustomerBusiness extends Person {
    private String number;
    private String checkNumber;
    public CustomerBusiness(String firstName, String lastName, String nationId, String address,String checkNumber,String number) {
        super(firstName, lastName, nationId, address);
        this.number = number;
        this.checkNumber = checkNumber;
    }
    @Override
    public void save() {
        super.save();
        System.out.println("شماره: " + number + "شماره چک: " + checkNumber);
    }

    }

