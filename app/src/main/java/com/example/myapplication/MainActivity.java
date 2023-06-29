package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person p = new Person("juan");

        Toast.makeText(this, "hola "+ p.name +"" + check()+" .", Toast.LENGTH_SHORT).show();

    }

    private int check(){
        if(5>3){
        return 100;
        }else {
            return 10;
        }
    }

    public class Person{
        String name;

        public Person(String name){
            this.name=name;
        }

    }


}