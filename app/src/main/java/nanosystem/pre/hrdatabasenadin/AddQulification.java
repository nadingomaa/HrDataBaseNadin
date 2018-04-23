package nanosystem.pre.hrdatabasenadin;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import nanosystem.pre.hrdatabasenadin.databinding.ActivityAddQulificationBinding;

public class AddQulification extends AppCompatActivity {

    ActivityAddQulificationBinding binding;

    String fName, lName, code, type, email, address, job, department, location, nameCompany;
    double sal;
    int phone, noYears;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_add_qulification);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_qulification);
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


    }

    public void goBack(View view) {
        onBackPressed();
    }

    public void next(View view) {
        Intent next4 = new Intent(this, AddDependent.class);
        next4.putExtra("degree", binding.degree.getText().toString());
        next4.putExtra("in", binding.in.getText().toString());
        next4.putExtra("company", nameCompany);
        next4.putExtra("years", noYears);
        next4.putExtra("job title", job);
        next4.putExtra("departmant", department);
        next4.putExtra("location", location);
        next4.putExtra("first name", fName);
        next4.putExtra("last name", lName);
        next4.putExtra("code", code);
        next4.putExtra("type", type);
        next4.putExtra("email", email);
        next4.putExtra("phone", phone);
        next4.putExtra("address", address);
        next4.putExtra("salary", sal);
        startActivity(next4);


    }
}