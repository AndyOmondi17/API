package models;

public class Employees{
    String emp_Name;
    int id;
    String emp_Position;
    String emp_role;
    String emp_details;

    public Employees(String emp_Name, String emp_Position, String emp_role, String emp_details) {
        this.emp_Name = emp_Name;
        this.emp_Position = emp_Position;
        this.emp_role = emp_role;
        this.emp_details = emp_details;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmp_Position() {
        return emp_Position;
    }

    public void setEmp_Position(String emp_Position) {
        this.emp_Position = emp_Position;
    }

    public String getEmp_role() {
        return emp_role;
    }

    public void setEmp_role(String emp_role) {
        this.emp_role = emp_role;
    }

    public String getEmp_details() {
        return emp_details;
    }

    public void setEmp_details(String emp_details) {
        this.emp_details = emp_details;
    }
}
