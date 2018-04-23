package nanosystem.pre.hrdatabasenadin.Model;

public class Qualification {
    private  Integer employee_id;
    private String qualifications_dgree;
    private String in;

    public Qualification(String degree, String in) {
    }

    public Qualification(Integer employee_id, String qualifications_dgree, String in) {
        this.employee_id = employee_id;
        this.qualifications_dgree = qualifications_dgree;
        this.in = in;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public String getQualifications_dgree() {
        return qualifications_dgree;
    }

    public String getIn() {
        return in;
    }
}
