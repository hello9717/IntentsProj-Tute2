package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openActivity2();
           }
       });
    }

       public void openActivity2() {
           Intent intent = new Intent(this, SecondActivity.class);
           startActivity(intent);
       }

       public void sendMessage(View view) {

           EditText editText1 = findViewById(R.id.editText1);
           String message1 = editText1.getText().toString();

           EditText editText2 = findViewById(R.id.editText2);
           String message2 = editText1.getText().toString();

           Intent intent1 = new Intent(this, SecondActivity.class);
           startActivity(intent1);
       }
}
