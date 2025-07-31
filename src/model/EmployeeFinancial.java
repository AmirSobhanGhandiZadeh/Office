package model;

public class EmployeeFinancial extends Person {
    private int degree;

    public EmployeeFinancial(String firstName, String lastName, String nationalId, String address, int degree) {
        super(firstName, lastName, nationalId, address);
        this.degree = degree;
    }

    @Override
    public void save() {
        super.save();
        System.out.println("درجه: " + degree);
    }
}

