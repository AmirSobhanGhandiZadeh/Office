package model;

public class EmployeeOfficial extends Person {
    private String accessLevel;

    public EmployeeOfficial(String firstName, String lastName, String nationalId, String address, String accessLevel) {
        super(firstName, lastName, nationalId, address);
        this.accessLevel = accessLevel;
    }

    @Override
    public void save() {
        super.save();
        System.out.println("سطح دسترسی: " + accessLevel);
    }
}
