import model.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new CustomerIndividual("Ali", "Rezaei", "1234567890", "Tehran");
        Person p2 = new CustomerBusiness("Sara", "mousavi", "4567891230", "Mashhad");
        Person p3 = new EmployeeEngineer("Zahra", "Karimi", "1111111111", "Esf","softi");
        Person p4 = new EmployeeExpert("امیر", "احمدی", "2222222222", "تبریز", 4);
        Person p5 = new EmployeeAdministrative("مینا", "صادقی", "3333333333", "شیراز", "مالی");
        Person p6 = new EmployeeOrdinary("محمد", "جعفری", "4444444444", "قم");

        p1.save();
        System.out.println("--------");
        p2.save();
        System.out.println("--------");
        p3.save();
        System.out.println("--------");
        p4.save();
        System.out.println("--------");
        p5.save();
        System.out.println("--------");
        p6.save();
    }
}