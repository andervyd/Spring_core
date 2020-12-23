package spring_aop.aop.after;


public class Student {

    private String name;
    private int course;
    private double avgGrade;

    public Student(String firstName, int course, double avgGrade) {
        this.name = firstName;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String toString() {
        return "Student info [ name: " + name +
               ", course: " + course +
               ", average grade: " + avgGrade + " ]";
    }

}
