package com.example.whichisthebigger;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class failedScreen extends AppCompatActivity {

    Button replay;
    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failed_screen);
        replay=(Button)findViewById(R.id.againButton);
        exit=(Button)findViewById(R.id.exıtButton);
    }

    public void onClickReplay(View view) {
        Intent intent=new Intent(failedScreen.this, MainActivity.class);
        startActivity(intent);
    }


    public void onClickExit(View view) {
        ActivityCompat.finishAffinity(failedScreen.this);
    }
}
