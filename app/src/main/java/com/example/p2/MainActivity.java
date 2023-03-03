package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);
    }

    public void onClick(View view) {
        Log.i(TAG,"Переход к второй Activity");
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("aid", "Галоперидол");
        startActivity(intent);
    }

}
