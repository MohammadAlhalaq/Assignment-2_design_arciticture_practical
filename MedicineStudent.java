import java.util.HashMap;

public class MedicineStudent extends Student{
    final int pricePerHour = 100;

    public MedicineStudent(String name, int id, double balance) {
        super(name, id, balance);
        courses = new HashMap<>();
    }

    @Override
    public void enrollCourse(Course s, double grade) {
        courses.put(s, grade);
    }

    @Override
    public void printInfo() {
        System.out.println("\nMedicine Student: \n***********************\n" +
                " - pricePerHour: " + pricePerHour +
                ", name: " + name +
                ", id:" + id +
                ", numOfHours: " + numOfHours +
                ", balance: " + balance +
                ", gpa: " + super.getGpa() +
                ", courses: " + courses.values()
        );
    }


}
