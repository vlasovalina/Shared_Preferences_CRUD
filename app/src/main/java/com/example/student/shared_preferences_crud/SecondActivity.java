package com.example.student.shared_preferences_crud;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.student.shared_preferences_crud.database.CRUDSharedPreferences;
import com.example.student.shared_preferences_crud.model.Person;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private ListView lvPerson;
    private ArrayList<Person> persons;
    private CRUDSharedPreferences crudSharedPreferences;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        lvPerson = (ListView) findViewById(R.id.list_view_person);
        persons = new ArrayList<>();
        crudSharedPreferences = new CRUDSharedPreferences();
        persons = crudSharedPreferences.getPersons(this);

        ArrayAdapter<Person> adapter = new ArrayAdapter<Person>(this, android.R.layout.simple_list_item_1, persons);

        lvPerson.setAdapter(adapter);
    }
}
