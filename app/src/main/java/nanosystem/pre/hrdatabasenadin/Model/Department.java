package nanosystem.pre.hrdatabasenadin.Model;

public class Department {

    private Integer _id ;
    private  String department_name;
    private  String location;
    private  Integer number_of_employee;

    public Department(Integer _id, String department_name, String location, Integer number_of_employee) {
        this._id = _id;
        this.department_name = department_name;
        this.location = location;
        this.number_of_employee = number_of_employee;
    }

    public Department(String department_name, String location, Integer number_of_employee) {
        this.department_name = department_name;
        this.location = location;
        this.number_of_employee = number_of_employee;
    }




    public Department() {
    }

    public Integer get_id() {
        return _id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public String getLocation() {
        return location;
    }

    public Integer getNumber_of_employee() {
        return number_of_employee;
    }
}



