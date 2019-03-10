package com.example.whichisthebigger;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class level2 extends AppCompatActivity {
    private int num1,num2,num3;
    private int count= 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
        buildRandomNum();
    }
    public void buildRandomNum() {
        if (count == 10) {
            count = 5;
            Toast.makeText(this, "LEVEL COMPLETED", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(level2.this, level3.class);
            startActivity(intent);
        }
        else {
            Random rand = new Random();
            num1 = rand.nextInt(20);
            while (true) {
                num2 = rand.nextInt(20);
                if (num1 != num2) {
                    num3 = rand.nextInt(20);
                    if (num1 != num3 && num2 != num3) break;
                }

            }
            Button b1 = (Button) findViewById(R.id.button1);
            b1.setText(Integer.toString(num1));
            Button b2 = (Button) findViewById(R.id.button2);
            b2.setText(Integer.toString(num2));
            Button b3 = (Button) findViewById(R.id.button3);
            b3.setText(Integer.toString(num3));
        }
    }

    public void onClickButton1(View view) {
        if(num1>num2&&num1>num3)
            count++;
        else {
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(level2.this, failedScreen.class);
            startActivity(intent);
        }
        TextView txt=(TextView) findViewById(R.id.score);
        txt.setText("Score: "+count);
        buildRandomNum();
    }


    public void onClickButton2(View view) {
        if(num2>num1&&num2>num3)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level2.this, failedScreen.class);
            startActivity(intent);
        }
        TextView txt=(TextView) findViewById(R.id.score);
        txt.setText("Score: "+count);
        buildRandomNum();
    }

    public void onClickButton3(View view) {
        if(num3>num1&&num3>num2)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level2.this, failedScreen.class);
            startActivity(intent);
        }
        TextView txt=(TextView) findViewById(R.id.score);
        txt.setText("Score: "+count);
        buildRandomNum();
    }
}
