package com.example.interactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    public void clickFunction(View view){
        EditText nameEditText2= (EditText)findViewById(R.id.nameEditText2);
        EditText nameEditText3= (EditText)findViewById(R.id.nameEditText3);
        Log.i( "Info", "It Worked!!");
        Log.i("Email",nameEditText2.getText().toString());
        Log.i("Password", nameEditText3.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
