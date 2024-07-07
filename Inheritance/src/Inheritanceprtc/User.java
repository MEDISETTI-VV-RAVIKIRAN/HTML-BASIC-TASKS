package Inheritanceprtc;

public class User {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.read();
        Employee E = new Employee();
        E.read();
        E.write();
        Management M = new Management();
        M.read();
        M.write();
        M.modifying();
    }

}
