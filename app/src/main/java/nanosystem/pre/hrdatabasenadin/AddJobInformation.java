package nanosystem.pre.hrdatabasenadin;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import nanosystem.pre.hrdatabasenadin.databinding.ActivityAddJobInformationBinding;

public class AddJobInformation extends AppCompatActivity {

    ActivityAddJobInformationBinding binding;
    String fName,lName,code,type,email,address;
    double sal;
    int phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_add_job_information);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_add_job_information);
        Intent getIntent=getIntent();
        fName=getIntent.getStringExtra("first name");
        lName=getIntent.getStringExtra("last name");
        code=getIntent.getStringExtra("code");
        type=getIntent.getStringExtra("type");
        email=getIntent.getStringExtra("email");
        phone=getIntent.getIntExtra("phone",0);
        address=getIntent.getStringExtra("address");
        sal=getIntent.getDoubleExtra("salary",0.0);


    }

    public void next(View view) {


            Intent next2=new Intent(this,AddExperiences.class);
            next2.putExtra("job title",binding.jobTitle.getText().toString());
            next2.putExtra("departmant name",binding.deptName.getText().toString());
            next2.putExtra("location",binding.location.getText().toString());
            next2.putExtra("first name",fName);
            next2.putExtra("last name",lName);
            next2.putExtra("code",code);
            next2.putExtra("type",type);
            next2.putExtra("email",email);
            next2.putExtra("phone",phone);
            next2.putExtra("address",address);
            next2.putExtra("salary",sal);
            startActivity(next2);
    }

    public void goBack(View view) {
        onBackPressed();
    }
}
