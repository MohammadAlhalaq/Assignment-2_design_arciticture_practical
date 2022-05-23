public class Course {
    String name;
    String id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumOfHours(Integer numOfHours) {
        this.numOfHours = numOfHours;
    }

    Integer numOfHours;
    public void printCourse() {
        System.out.println("The course name is: "+ name+ ".\nid :"+ id+ "\nNumber of hour: "+ numOfHours);
    }
}
