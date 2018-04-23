package nanosystem.pre.hrdatabasenadin.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE= "Hr.db";
    public static final int VERSION=5;

    public DBHelper(Context context) {
        super(context, DATABASE, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(HrData.Departments.CREATE_TABLE);
        db.execSQL(HrData.Jobs.CREATE_TABLE);
        db.execSQL(HrData.Employees.CREATE_TABLE);
        db.execSQL(HrData.Dependents.CREATE_TABLE);
        db.execSQL(HrData.Experiences.CREATE_TABLE);
        db.execSQL(HrData.Qualifications.CREATE_TABLE);




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(HrData.Employees.Drop_TABLE);
        db.execSQL(HrData.Jobs.Drop_TABLE);
        db.execSQL(HrData.Departments.Drop_TABLE);
        db.execSQL(HrData.Dependents.Drop_TABLE);
        db.execSQL(HrData.Experiences.Drop_TABLE);
        db.execSQL(HrData.Qualifications.Drop_TABLE);


    }
}
