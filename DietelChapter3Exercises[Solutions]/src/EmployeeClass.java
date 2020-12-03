public class EmployeeClass {
private String firstName;
private String lastName;
private double salary;

public EmployeeClass(String firstName, String lastName, double salary){
    this.firstName=firstName;
    this.lastName=lastName;
    this.salary=salary;
}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
    if(salary>0)
    {this.salary +=this.salary*(salary/100);}
    else{
        System.out.println("Salary cannot be less than 0");
    }
    }
}
