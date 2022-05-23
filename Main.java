public class Main {

    public static void main(String[] args) {
        Course c = new Course();
        c.setName("Java Programming");
        c.setId("CSIC1403");
        c.setNumOfHours(3);

        Course c2 = new Course();
        c2.setName("Java2 Programming");
        c2.setId("CSIC3103");
        c2.setNumOfHours(3);

        Course c3 = new Course();
        c3.setName("Java3 Programming");
        c3.setId("CSIC1203");
        c3.setNumOfHours(2);

        Course c4 = new Course();
        c4.setName("CalculasA");
        c4.setId("Math3302");
        c4.setNumOfHours(3);

        Course c5 = new Course();
        c5.setName("Anatomy");
        c5.setId("Qura3203");
        c5.setNumOfHours(1);

        StudentFactory factory = new StudentFactory();

        Student ItSt = factory.getStudent("Engineer","Ahmad", 120190075, 50.9);
        Student MedSt = factory.getStudent("Medicine","Husain", 120160833, 201.0);

        ItSt.enrollCourse(c,77.1);
        ItSt.enrollCourse(c2,95.5);
        ItSt.enrollCourse(c4,80.2);
        ItSt.enrollCourse(c3,65.7);

        MedSt.enrollCourse(c,89.0);
        MedSt.enrollCourse(c5,67.3);
        MedSt.enrollCourse(c4,99.9);
        ItSt.printInfo();

        MedSt.printInfo();

    }
}
