package nanosystem.pre.hrdatabasenadin.Model;

public class Job {

    private Integer _id ;
    private String job_title;
    private Integer department_id;
    private Integer location;

    public Job(Integer _id, String job_title, Integer department_id, Integer location) {
        this._id = _id;
        this.job_title = job_title;
        this.department_id = department_id;
        this.location = location;
    }

    public Job(String job_title, Integer department_id, Integer location) {
        this.job_title = job_title;
        this.department_id = department_id;
        this.location = location;
    }

    public Job(String job_title, Integer location) {
        this.job_title = job_title;

        this.location = location;
    }

    public Job(String job, int department_id, String location) {
    }

    public Integer get_id() {
        return _id;
    }

    public String getJob_title() {
        return job_title;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public Integer getLocation() {
        return location;
    }
}
