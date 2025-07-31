package model;

public class EmployeeExpert extends Person {
    private int degree;

    public EmployeeExpert(String firstName, String lastName, String nationalId, String address, int degree) {
        super(firstName, lastName, nationalId, address);
        this.degree = degree;
    }

    @Override
    public void save() {
        super.save();
        System.out.println("درجه: " + degree);
    }
}

