public class StudentReport {

    public static void main ( String[] args){

        Teacher t = new Teacher();
         t.setStudentName(" Ravi" );
         t.setStudentMarks( 100);

        Teacher t1 = new Teacher();
        t1.setStudentName(" mani" );
        t1.setStudentMarks( 90);
        Teacher t2 = new Teacher();
        t2.setStudentName(" naguu" );
        t2.setStudentMarks( 90);

         System.out.println("the name of the student is :"+t.getStudentName());
        System.out.println("the marks  of this student is  :"+t.getStudentMarks());
        System.out.println("the name of the student is :"+t1.getStudentName());
        System.out.println("the marks  of this student is  :"+t1.getStudentMarks());

        System.out.println("the name of the student is :"+t2.getStudentName());
        System.out.println("the marks  of this student is  :"+t2.getStudentMarks());


    }
}
