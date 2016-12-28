package com.example.student.shared_preferences_crud.model;

/**
 * Created by student on 26.12.2016.
 */
public class Person {
    private int id;
    private String mName;
    //private int Number;

    public Person() {super();
    }

    public Person(int id, String mName) {
        this.id = id;
        this.mName = mName;
        //this.Number = Number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    //public int getNumber(){return Number;}

    //public void setNumber(int Number) {this.Number = Number; }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", mName='" + mName +
                //", number" + Number +
                '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return mName.equals(person.mName);
        //return number.equals(person.number);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + mName.hashCode();
        return result;
    }


}
