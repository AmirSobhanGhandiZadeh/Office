package model;

public class EmployeeAdministrative extends Person {
    private String department;

    public EmployeeAdministrative(String firstName, String lastName, String nationalId, String address, String department) {
        super(firstName, lastName, nationalId, address);
        this.department = department;
    }

    @Override
    public void save() {
        super.save();
        System.out.println("دپارتمان: " + department);
    }
}
