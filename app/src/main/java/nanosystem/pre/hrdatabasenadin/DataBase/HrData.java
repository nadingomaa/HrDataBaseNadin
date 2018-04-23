package nanosystem.pre.hrdatabasenadin.DataBase;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import android.util.Log;

import nanosystem.pre.hrdatabasenadin.Model.Department;
import nanosystem.pre.hrdatabasenadin.Model.Dependent;
import nanosystem.pre.hrdatabasenadin.Model.Employee;
import nanosystem.pre.hrdatabasenadin.Model.Experience;
import nanosystem.pre.hrdatabasenadin.Model.Job;
import nanosystem.pre.hrdatabasenadin.Model.Qualification;

import static android.content.ContentValues.TAG;

public class HrData {


    class Employees implements BaseColumns {

        public static final String TABLE = "employees";
        public static final String FIRST_NAME = "first_name";
        public static final String LAST_NAME = "last_name";
        public static final String CODE = "code";
        public static final String EMAIL = "email";
        public static final String PHONE= "phone";
        public static final String ADDRESS= "address";
        public static final String TYPE = "type";
        public static final String JOB_ID = "job_id";
        public static final String DEPARTMENT_ID = "department_id";
        public static final String SALARY = "salary";
        public static final int MALE = 0;
        public static final int FAMALE = 1;
        public static final String CREATE_TABLE = "CREATE TABLE " +
                TABLE + "( " + _ID + " INTEGER PRIMERY KEY AUTOINCREMENT," +
                CODE + " TEXT UNIQUE NOT NULL," +
                FIRST_NAME + " TEXT NOT NULL," +
                LAST_NAME + " TEXT NOT NULL," +
                TYPE + " TEXT NOT NULL," +
                PHONE + " INTEGER," +
                EMAIL + " TEXT," +
                ADDRESS + " TEXT NOT NULL," +
                JOB_ID + " INTEGER NOT NULL," +
                DEPARTMENT_ID + " INTEGER NOT NULL," +
                SALARY + " DOUBLE DEFULT 5000.00 );";


        public static final String Drop_TABLE = "DROP TABLE IF EXISTS " + TABLE;

    }

    public  static  void  addEmp (Employee employee, SQLiteDatabase db) {
        ContentValues values = new ContentValues();
        values.put(Employees.CODE, employee.getCode());
        values.put(Employees.FIRST_NAME, employee.getFirst_name());
        values.put(Employees.LAST_NAME, employee.getSecond_name());
        values.put(Employees.PHONE, employee.getPhone());
        values.put(Employees.EMAIL, employee.getEmail());

        values.put(Employees.ADDRESS, employee.getAddress());
        values.put(Employees.SALARY, employee.getSalary());
        values.put(Employees.TYPE, employee.getType());


        long rowId = db.insert(Employees.TABLE, null, values);
        Log.i(TAG, "addEmp: " + rowId);


    }




    class Departments implements BaseColumns {
        public static final String TABLE = "Departments";
        public static final String DEPARTMENT_NAME = "department_name";
        public static final String LOCATION = "location";
        public static final String NUMBER_OF_EMPLOYEE = "number_of_employee";

        public static final String CREATE_TABLE = "CREATE TABLE " + TABLE + "( " +
                _ID + " INTEGER PRIMERY KEY AUTOINCREMENT," +
                DEPARTMENT_NAME + " TEXT NOT NULL," +
                LOCATION + " TEXT,"+
                NUMBER_OF_EMPLOYEE + " INTEGER NOT NULL );";

        public static final String Drop_TABLE = "DROP TABLE IF EXISTS " + TABLE;


    }
    public  static  void  addDprt(Department department, SQLiteDatabase db) {
        ContentValues values = new ContentValues();
        values.put(Departments.DEPARTMENT_NAME, department.getDepartment_name());
        values.put(Departments.LOCATION, department.getLocation());
        values.put(Departments.NUMBER_OF_EMPLOYEE, department.getNumber_of_employee());


        long rowId = db.insert(Departments.TABLE, null, values);
        Log.i(TAG, "addDprt: " + rowId);


    }





    class Jobs implements BaseColumns {
        public static final String TABLE = "jobs";
        public static final String JOB_TITLE = "job_title";
        public static final String DEPARTMENT_ID = "department_id";
        public static final String LOCATION = "location";

        public static final String CREATE_TABLE = "CREATE TABLE " + TABLE + "( " +
                _ID + " INTEGER PRIMERY KEY AUTOINCREMENT," +
                JOB_TITLE + " TEXT NOT NULL," +
                DEPARTMENT_ID + " INTEGER NOT NULL," +
                LOCATION + " TEXT );" ;

        public static final String Drop_TABLE = "DROP TABLE IF EXISTS " + TABLE;


    }

    public  static  void  addJob(Job job, SQLiteDatabase db) {
        ContentValues values = new ContentValues();
        values.put(Jobs.JOB_TITLE, job.getJob_title());
        values.put(Jobs.LOCATION, job.getLocation());



        long rowId = db.insert(Jobs.TABLE, null, values);
        Log.i(TAG, "addJob: " + rowId);


    }


    class Dependents implements BaseColumns {

        public static final String TABLE = "dependents";

        public static final String FIRST_NAME= "first_name";
        public static final String LAST_NAME= "last_name";
        public static final String RELATIONSHIP="relationship";
        public static final String Employee_ID = "employee_id";

        public static final String CREATE_TABLE = "CREATE TABLE " +
                TABLE + "( " + _ID + " INTEGER PRIMERY KEY AUTOINCREMENT," +
                FIRST_NAME + " TEXT NOT NULL," +
                LAST_NAME  + " TEXT NOT NULL," +
                RELATIONSHIP + " TEXT NOT NULL," +
                Employee_ID + " INTEGER NOT NULL );";

        public static final String Drop_TABLE = "DROP TABLE IF EXISTS " + TABLE;

    }

    public  static  void  addDepent(Dependent dependent, SQLiteDatabase db) {
        ContentValues values = new ContentValues();
        values.put(Dependents.FIRST_NAME,dependent.getFirst_name());
        values.put(Dependents.LAST_NAME, dependent.getLast_name());
        values.put(Dependents.RELATIONSHIP, dependent.getRelationship());


        long rowId = db.insert(Dependents.TABLE, null, values);
        Log.i(TAG, "addDepent: " + rowId);


    }



    class Experiences implements BaseColumns {

        public static final String TABLE = "experiences";
        public static final String Employee_ID = "employee_id";
        public static final String COMPANY_NAME="company_name";
        public static final String NO_OF_YEARS = "no_of_years";
        public static final String CREATE_TABLE = "CREATE TABLE " +
                TABLE + "( "  + Employee_ID + " INTEGER NOT NULL," +
                NO_OF_YEARS + " INTEGER DEFULT 0," +
                COMPANY_NAME+ " TEXT );";

        public static final String Drop_TABLE = "DROP TABLE IF EXISTS " + TABLE;

    }

    public  static  void  addExper(Experience experience, SQLiteDatabase db) {
        ContentValues values = new ContentValues();
        values.put(Experiences.NO_OF_YEARS,experience.getNo_of_years());
        values.put(Experiences.COMPANY_NAME, experience.getCompany_name());



        long rowId = db.insert(Experiences.TABLE, null, values);
        Log.i(TAG, "addExper: " + rowId);


    }


    class Qualifications implements BaseColumns {
        public static final String TABLE = "qualifications";
        public static final String Employee_ID = "employee_id";
        public static final String QUALIFICATION_DEGREE = "qualifications_dgree";
        public static final String In = "in";

        public static final String CREATE_TABLE = "CREATE TABLE " +
                TABLE + "( " + Employee_ID + " INTEGER NOT NULL," +
                QUALIFICATION_DEGREE + " TEXT NOT NULL," +
                In + " TEXT );" ;

        public static final String Drop_TABLE = "DROP TABLE IF EXISTS " + TABLE;

}
    public  static  void  addQual(Qualification qualification, SQLiteDatabase db) {
        ContentValues values = new ContentValues();
        values.put(Qualifications.In,qualification.getIn());
        values.put(Qualifications.QUALIFICATION_DEGREE, qualification.getQualifications_dgree());



        long rowId = db.insert(Qualifications.TABLE, null, values);
        Log.i(TAG, "addQual: " + rowId);


    }


}