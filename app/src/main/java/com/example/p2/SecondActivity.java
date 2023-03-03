package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_constraint);
        Button button;
        button = (Button)findViewById(R.id.Button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackToMain();
            }
        });
    }
    protected void BackToMain() {
        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("aid").toString();
        Toast toast = Toast.makeText(getApplicationContext(), name + " выехал", Toast.LENGTH_LONG);
        toast.show();
        Intent intent = new Intent(this, com.example.p2.MainActivity.class);
        startActivity(intent);
    }

}