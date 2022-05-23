import java.util.Map;

public abstract class Student {

    String name;
    int id;
    Integer numOfHours;
    double balance;
    double gpa;
    Map<Course, Double> courses;

    public Student(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;

    }

    double sum = 0;
    int counter = 0;
    public double getGpa() {
        for (Map.Entry<Course, Double> entry : courses.entrySet()) {
            sum += entry.getValue();
            counter ++;
        }
        return Math.round(sum/counter);
    }
    public abstract void enrollCourse(Course s , double grade);
    public abstract void printInfo();

}
