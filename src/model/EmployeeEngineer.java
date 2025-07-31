package model;

public class EmployeeEngineer extends Person {
    private String expertise;


    public EmployeeEngineer(String firstName, String lastName, String nationId, String address, String expertise) {
        super(firstName, lastName, nationId, address);
        this.expertise = expertise;
    }
    @Override
    public void save(){
        super.save();
        System.out.println("تخصص: " + expertise);
    }
}
