package com.example.whichisthebigger;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class level1 extends AppCompatActivity {
    private int count= 0;
    private int num1,num2;
   /* private CountDownTimer countDownTimer;
    TextView textView;*/ //süre 9 dan birden 0 a iniyor kendimden olan bir hata gibi gelmediği iiçin yorum satırına aldım, belki bakarsınız.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        buildRandomNum();
       // textView=(TextView)findViewById(R.id.timer);
    }

    public void buildRandomNum(){
        if(count==5){
            count=0;
            Toast.makeText(this,"LEVEL COMPLETED", Toast.LENGTH_SHORT).show();
            Intent intent= new Intent(level1.this, level2.class);
            startActivity(intent);
        }
        else {
            Random rand = new Random();
            num1 = rand.nextInt(10);
            while (true) {
                num2 = rand.nextInt(10);
                if (num1 != num2) break;
            }
        }
        Button b=(Button)findViewById(R.id.buttonLeft);
        b.setText(Integer.toString(num1));
        Button b2=(Button)findViewById(R.id.buttonRight);
        b2.setText(Integer.toString(num2));
 /*       countDownTimer=new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText(String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                Intent intent=new Intent(level1.this, failedScreen.class);
                startActivity(intent);
            }
        }.start();*/
    }

    public void onClickLeft(View view) {
        if(num1>num2)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level1.this, failedScreen.class);
            startActivity(intent);
        }

        TextView txt=(TextView) findViewById(R.id.score1);
        txt.setText("Score: "+count);
        buildRandomNum();

    }

    public void onClickRight(View view) {
        if(num1<num2)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level1.this, failedScreen.class);
            startActivity(intent);
        }
        TextView txt=(TextView) findViewById(R.id.score1);
        txt.setText("Score: "+count);
        buildRandomNum();
    }

}
