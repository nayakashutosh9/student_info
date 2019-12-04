package com.example.interactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void clickFunction(View view){
        EditText nameEditText2= (EditText)findViewById(R.id.nameEditText2);
        EditText nameEditText3= (EditText)findViewById(R.id.nameEditText3);
        EditText nameEditText4= (EditText)findViewById(R.id.nameEditText4);
        Log.i( "Info", "It Worked!!");
        Log.i("Email",nameEditText2.getText().toString());
        Log.i("Password", nameEditText3.getText().toString());
        Log.i("Name",nameEditText4.getText().toString());
        Toast.makeText(this,"Hello "+nameEditText4.getText().toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
