package academy.javapro;

public class Student {
    private String name;
    private double gpa;
    private String collegeYear; // Freshman, Sophomore, Junior, Senior

    public Student(String name, double gpa, String collegeYear) {
        this.name = name;
        this.gpa = gpa;
        this.collegeYear = collegeYear;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getCollegeYear() {
        return collegeYear;
    }

    @Override
    public String toString() {
        return name + " (" + collegeYear + ") - GPA: " + gpa;
    }
}
