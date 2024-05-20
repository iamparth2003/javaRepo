package employeeInfo;

public class employeeInfo {
    private String name;
    private String email;

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter method for email
    public String getEmail() {
        return email;
    }

    // Overriding the toString method to return employee details
    @Override
    public String toString() {
        return "Employee Details: \n" +
               "Name: " + name + "\n" +
               "Email: " + email;
    }

    // Main method to test the EmployeeInfo class
    public static void main(String[] args) {
        employeeInfo emp1 = new employeeInfo();

        // Setting the name and email of the employee
        emp1.setName("parth patel");
        emp1.setEmail("parth.patel@example.com");

        // Printing the employee details
        System.out.println(emp1.toString());
    }
}
