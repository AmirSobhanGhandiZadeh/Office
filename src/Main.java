import model.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new CustomerIndividual("Ali", "Rezaei", "1234567890", "Tehran","09121111111");
        Person p2 = new CustomerBusiness("Sara", "mousavi", "4567891230", "Mashhad","123456","09122223222");
        Person p3 = new EmployeeCashier("Zahra", "Karimi", "1111111111", "Esf","100$");
        Person p4 = new EmployeeFinancial("Amir", "Ahmadi", "2222222222", "Tabriz", 4);
        Person p5 = new EmployeeOfficial("Mina", "Sadeghi", "3333333333", "Shiraz", "Internal");
        Person p6 = new EmployeeOrdinary("Mmd", "Jfri", "4444444444", "Qom");

        p1.save();
        System.out.println("-------------");
        p2.save();
        System.out.println("-------------");
        p3.save();
        System.out.println("-------------");
        p4.save();
        System.out.println("-------------");
        p5.save();
        System.out.println("-------------");
        p6.save();
    }
}