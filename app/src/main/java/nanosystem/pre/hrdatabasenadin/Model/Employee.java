package nanosystem.pre.hrdatabasenadin.Model;

public class Employee {

    private Integer _id ;
    private String first_name;
    private String second_name;
    private String code;
    private Integer type;
    private  Integer job_id;
    private Integer department_id;
    private String address;
    private String email;
    private Integer phone;

    private double salary;

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPhone() {
        return phone;
    }

    public Employee(Integer _id, String first_name, String second_name, String code, Integer type, String email, Integer phone, String address, Integer job_id, Integer department_id, double salary) {
        this._id = _id;
        this.first_name = first_name;
        this.second_name=second_name;
        this.code = code;
        this.type = type;
        this.email=email;
        this.phone=phone;

        this.address=address;

        this.job_id = job_id;
        this.department_id = department_id;

        this.salary = salary;
    }

    public Employee(String first_name,String second_name, String code, Integer type,String email,Integer phone,String address, Integer job_id, Integer department_id, double salary) {
        this.first_name = first_name;
        this.second_name=second_name;
        this.code = code;
        this.type = type;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.job_id = job_id;
        this.department_id = department_id;
        this.salary = salary;
    }
    public Employee(String first_name,String second_name, String code, Integer type,String email,Integer phone,String address, double salary) {
        this.first_name = first_name;
        this.second_name=second_name;
        this.code = code;
        this.type = type;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.salary = salary;
    }

    public Employee(String first_name, String name, String fName, String lName, String code, int phone, String type, int job_id, int department_id, double sal) {
    }

    public Integer get_id() {
        return _id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }



    public String getCode() {
        return code;
    }

    public Integer getType() {
        return type;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }



    public double getSalary() {
        return salary;
    }
}
