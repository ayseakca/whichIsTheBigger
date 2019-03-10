package com.example.whichisthebigger;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button start_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_button=(Button)findViewById(R.id.start_button);

    }

    public void onClickStart(View view) {
        Intent intent=new Intent(MainActivity.this, level1.class);
        startActivity(intent);

    }




}
