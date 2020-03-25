package loose.oose.fis.lab.student.manager.model;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;

    public Student(String firstName, String lastName, int age, double meanGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.meanGrade = meanGrade;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + ", age: " + age + ", mean grade: " + meanGrade;
    }

    public boolean equals(Object o) {
        return (o instanceof Student) && ((Student)o).firstName == firstName && ((Student)o).lastNameName == lastName && ((Student)o).age == age && ((Student)o).meanGrade == meanGrade;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + meanGrade;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getMeanGrade() {
        return meanGrade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMeanGrade(double meanGrade) {
        this.meanGrade = meanGrade;
    }
}
}