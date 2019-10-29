package models;

public class Departments{
    private String dpt_name;
    private String dpt_description;
    private int dpt_empNo;
    private int id;

    public Departments(String dpt_name, String dpt_description, int dpt_empNo) {
        this.dpt_name = dpt_name;
        this.dpt_description = dpt_description;
        this.dpt_empNo = dpt_empNo;
    }

    public String getDpt_name() {
        return dpt_name;
    }

    public void setDpt_name(String dpt_name) {
        this.dpt_name = dpt_name;
    }

    public String getDpt_description() {
        return dpt_description;
    }

    public void setDpt_description(String dpt_description) {
        this.dpt_description = dpt_description;
    }

    public int getDpt_empNo() {
        return dpt_empNo;
    }

    public void setDpt_empNo(int dpt_empNo) {
        this.dpt_empNo = dpt_empNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
