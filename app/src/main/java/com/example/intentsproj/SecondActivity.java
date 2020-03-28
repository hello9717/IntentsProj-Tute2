package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";

    EditText n1;
    EditText n2;
    TextView ans;

    int z,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);
    }


    public void addition(View view) { ans.setText(String.valueOf(z+y));}

    public void sub(View view) { ans.setText(String.valueOf(z-y)); }

    public void mul(View view) { ans.setText(String.valueOf(z*y)); }

    public void div(View view) { ans.setText(String.valueOf(z/y)); }

}
