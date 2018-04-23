package nanosystem.pre.hrdatabasenadin.Model;

public class Experience {


    private Integer employee_id;
    private String company_name;
    private Integer no_of_years;

    public Experience(Integer employee_id, String company_name, Integer no_of_years) {
        this.employee_id = employee_id;
        this.company_name = company_name;
        this.no_of_years = no_of_years;
    }

    public Experience(String nameCompany, int noYears) {

    }



    public String getCompany_name() {
        return company_name;
    }

    public Integer getNo_of_years() {
        return no_of_years;
    }


    public Integer getEmployee_id() {
        return employee_id;
    }
}
