package model;

public class EmployeeCashier extends Person {
    private String credit;


    public EmployeeCashier(String firstName, String lastName, String nationId, String address, String credit) {
        super(firstName, lastName, nationId, address);
        this.credit = credit;
    }
    @Override
    public void save(){
        super.save();
        System.out.println("اعتبار: " + credit);
    }
}
