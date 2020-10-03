package com.example.greeter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText editText;

    Context context;
    CharSequence textToast;
    int duration;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        editText = findViewById(R.id.editText);
        context = getApplicationContext();
        textToast = "Enter the correct name";
        duration = Toast.LENGTH_SHORT;

        toast = Toast.makeText(context, textToast, duration);
    }


    public void click(View view) {
        String checkOnEmpty = editText.getText().toString();
        if (checkOnEmpty.matches("")) {
            toast.show();
        } else {
            text.setText("Hello, " + editText.getText());
        }
    }
}