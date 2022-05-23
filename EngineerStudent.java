import com.sun.tools.javac.Main;

import java.util.HashMap;
import java.util.Map;

public class EngineerStudent extends Student {
    final int pricePerHour = 30;

    public EngineerStudent(String name, int id, double balance) {
        super(name, id, balance);
        courses = new HashMap<>();
    }


    @Override
    public void enrollCourse(Course s, double grade) {
        courses.put(s, grade);
    }

    @Override
    public void printInfo() {
        System.out.println("\nEngineer Student \n***********************\n" +
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
