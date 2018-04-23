package nanosystem.pre.hrdatabasenadin;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import nanosystem.pre.hrdatabasenadin.DataBase.DBHelper;
import nanosystem.pre.hrdatabasenadin.DataBase.HrData;
import nanosystem.pre.hrdatabasenadin.Model.Department;
import nanosystem.pre.hrdatabasenadin.Model.Dependent;
import nanosystem.pre.hrdatabasenadin.Model.Employee;
import nanosystem.pre.hrdatabasenadin.Model.Experience;
import nanosystem.pre.hrdatabasenadin.Model.Job;
import nanosystem.pre.hrdatabasenadin.Model.Qualification;
import nanosystem.pre.hrdatabasenadin.databinding.ActivityAddDependentBinding;
import nanosystem.pre.hrdatabasenadin.databinding.ActivityAddQulificationBinding;

public class AddDependent extends AppCompatActivity {
    DBHelper dbHelper;
    SQLiteDatabase sqLiteDatabase;

    ActivityAddDependentBinding binding;

    String fName, lName, code, type, email, address, job, department, location, nameCompany,degree,in;
    double sal;
    int phone, noYears;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_add_dependent);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_dependent);
        dbHelper=new DBHelper(this);
        sqLiteDatabase=dbHelper.getWritableDatabase();

       Intent getIntent = getIntent();
        fName = getIntent.getStringExtra("first name");
        lName = getIntent.getStringExtra("last name");
        code = getIntent.getStringExtra("code");
        type = getIntent.getStringExtra("type");
        email = getIntent.getStringExtra("email");
        phone = getIntent.getIntExtra("phone", 0);
        address = getIntent.getStringExtra("address");
        sal = getIntent.getDoubleExtra("salary", 0.0);
        job = getIntent.getStringExtra("job title");
        department = getIntent.getStringExtra("department name");
        location = getIntent.getStringExtra("location");
        nameCompany = getIntent.getStringExtra("company");
        noYears = getIntent.getIntExtra("years", 0);
        degree=getIntent.getStringExtra("degree");
        in=getIntent.getStringExtra("in");

}

    public void goBack(View view) {
        onBackPressed();
    }

    public void next(View view) {



        Department depart=new Department(department,location,5);
        HrData.addDprt(depart,sqLiteDatabase);

        Job j =new Job(job,0,location);
        HrData.addJob(j,sqLiteDatabase);

        Employee employee =new Employee(fName,lName,code,type,email,phone,address,0,0,sal);
        HrData.addEmp(employee,sqLiteDatabase);

        Experience experience =new Experience(0,nameCompany,noYears);
        HrData.addExper(experience,sqLiteDatabase);

        Qualification qualification=new Qualification(0,degree,in);
        HrData.addQual(qualification,sqLiteDatabase);



        Dependent dependent= new Dependent(binding.firstDepentName.getText().toString(),binding.lastDepentName.getText().toString(),
                binding.relationship.getText().toString(),0);
        HrData.addDepent(dependent,sqLiteDatabase);








    }
}
