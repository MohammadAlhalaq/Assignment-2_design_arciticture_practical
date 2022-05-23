public class StudentFactory {
    public Student getStudent(String studentType, String studentName, int id, double balance) {
        if (studentType == "IT"){
            return new ITStudent(studentName, id, balance);
        } else if (studentType == "Engineer") {
            return new EngineerStudent(studentName, id, balance);
        } else if (studentType == "Medicine") {
            return new MedicineStudent(studentName, id, balance);
        } else {
            return null;
        }
    }
}
