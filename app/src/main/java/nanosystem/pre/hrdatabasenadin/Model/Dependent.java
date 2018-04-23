package nanosystem.pre.hrdatabasenadin.Model;

public class Dependent {


    private Integer _id ;
    private  String first_name;
    private  String last_name;
    private String relationship;
    private  Integer employee_id;

    public Dependent(Integer _id, String first_name, String last_name, String relationship, Integer employee_id) {
        this._id = _id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.relationship = relationship;
        this.employee_id = employee_id;
    }

    public Dependent(String first_name, String last_name, String relationship, Integer employee_id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.relationship = relationship;
        this.employee_id = employee_id;
    }

    public Dependent(String first_name, String last_name, String relationship) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.relationship = relationship;

    }

    public Dependent(){}

    public Integer get_id() {
        return _id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getRelationship() {
        return relationship;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }
}
