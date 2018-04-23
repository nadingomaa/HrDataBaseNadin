package nanosystem.pre.hrdatabasenadin;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import nanosystem.pre.hrdatabasenadin.databinding. ActivityAddExperiencesBinding;

public class AddExperiences extends AppCompatActivity {


    ActivityAddExperiencesBinding binding;

    String fName,lName,code,type,email,address,job,department,location;
    double sal;
    int phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_add_experiences);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_add_experiences);
        Intent getIntent=getIntent();
        fName=getIntent.getStringExtra("first name");
        lName=getIntent.getStringExtra("last name");
        code=getIntent.getStringExtra("code");
        type=getIntent.getStringExtra("type");
        email=getIntent.getStringExtra("email");
        phone=getIntent.getIntExtra("phone",0);
        address=getIntent.getStringExtra("address");
        sal=getIntent.getDoubleExtra("salary",0.0);
        job=getIntent.getStringExtra("job title");
        department=getIntent.getStringExtra("department name");
        location=getIntent.getStringExtra("location");







    }



    public void goBack(View view) {
        onBackPressed();
    }

    public void next(View view) {
        Intent next3=new Intent(this,AddQulification.class);
        next3.putExtra("company",binding.companyName.getText().toString());
        next3.putExtra("years",Integer.valueOf(binding.numberYears.getText().toString()));
        next3.putExtra("job title",job);
        next3.putExtra("departmant",department);
        next3.putExtra("location",location);
        next3.putExtra("first name",fName);
        next3.putExtra("last name",lName);
        next3.putExtra("code",code);
        next3.putExtra("type",type);
        next3.putExtra("email",email);
        next3.putExtra("phone",phone);
        next3.putExtra("address",address);
        next3.putExtra("salary",sal);
        startActivity(next3);






    }
}
