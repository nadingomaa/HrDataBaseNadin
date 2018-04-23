package nanosystem.pre.hrdatabasenadin;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.databinding.DataBindingUtil;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import nanosystem.pre.hrdatabasenadin.DataBase.DBHelper;
import nanosystem.pre.hrdatabasenadin.databinding.ActivityAddInfoBinding;

public class AddBasicInfo extends AppCompatActivity {


    ActivityAddInfoBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_add_info);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_add_info);



    }

    public void goBack(View view) {
        onBackPressed();
    }

    public void next(View view) {
        Intent next1=new Intent(this,AddJobInformation.class);
        next1.putExtra("first name",binding.firstName.getText().toString());
        next1.putExtra("last name",binding.lastName.getText().toString());
        next1.putExtra("code",binding.code.getText().toString());
        next1.putExtra("type",binding.type.getText().toString());
        next1.putExtra("email",binding.email.getText().toString());
        next1.putExtra("phone",Integer.valueOf(binding.phone.getText().toString()));
        next1.putExtra("address",binding.address.getText().toString());
        next1.putExtra("salary",Double.valueOf(binding.salary.getText().toString()));
        startActivity(next1);
    }
}
