import java.util.HashMap;

public class ITStudent extends Student{
    final int pricePerHour = 25;

    public ITStudent(String name, int id, double balance) {
        super(name, id, balance);
        courses = new HashMap<>();
    }

    @Override
    public void enrollCourse(Course s, double grade) {
        courses.put(s, grade);
    }

    @Override
    public void printInfo() {
        System.out.println("\nIT Student \n***********************\n" +
                " - pricePerHour: " + pricePerHour +
                ", name: " + name +
                ", id:" + id +
                ", numOfHours: " + numOfHours +
                ", balance: " + balance +
                ", gpa: " + super.getGpa() +
                ", courses: " + courses.values());
    }
}
