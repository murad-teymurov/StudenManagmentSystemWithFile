package bean;

public class Student extends Person{

    private String schoolName;
    private double scholarship;

    public Student(String name,String surname,int age){
        super.setName(name);
        super.setSurname(surname);
        super.setAge(age);
    }
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }
}
