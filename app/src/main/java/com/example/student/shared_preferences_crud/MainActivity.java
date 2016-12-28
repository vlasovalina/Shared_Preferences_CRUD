package com.example.student.shared_preferences_crud;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.student.shared_preferences_crud.database.CRUDSharedPreferences;
import com.example.student.shared_preferences_crud.model.Person;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private EditText etid;
    private EditText etname;
    private Button create;
    private CRUDSharedPreferences crudSharedPreferences;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etid =(EditText) findViewById(R.id.edit_text_id);
        etname = (EditText) findViewById(R.id.edit_text_name);
        create = (Button) findViewById(R.id.bnt_create);
        create.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        crudSharedPreferences = new CRUDSharedPreferences();
        switch (view.getId()){
            case R.id.bnt_create:
                Person personModel = new Person(Integer.valueOf(etid.getText().toString()),etname.getText().toString());
                crudSharedPreferences.addPerson(this, personModel);
                break;
            default:
                break;
        }
    }

    private void followToListActivity(){
        //Intent callIntend = new Intent(Intent.ACTION_CALL, Person.getNumber().ToString());
        Intent intend = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intend);
    }
    private void ClearText(){
        etid.setText("");
        etname.setText("");
    }
}



