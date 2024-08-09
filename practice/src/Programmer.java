public class Programmer extends Employee {
    int bonus= 10000;
    public static void main ( String[] args){

        Programmer p = new Programmer();
        Employee e = new Employee();
        e.allowances();
        System.out.println(" the salary for programmer is " + p.salary);
        System.out.println(" the bonus for programmer is " + p.bonus);
        System.out.println(" Total  salary for programmer is " +( p.salary+p.bonus));

    }

}
