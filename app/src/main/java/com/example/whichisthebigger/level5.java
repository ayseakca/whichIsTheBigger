package com.example.whichisthebigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class level5 extends AppCompatActivity {
    private int num1,num2,num3,num4;
    private int count= 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);
        buildRandomNum();
    }
    public void buildRandomNum() {
        if (count == 25) {
            count = 20;
            Toast.makeText(this, "LEVEL COMPLETED", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(level5.this, level6.class);
            startActivity(intent);
        }
        else {
            Random rand = new Random();
            num1 = rand.nextInt(40+1+10)-40;
            while (true) {
                num2 = rand.nextInt(40+1+10)-40;
                if (num1 != num2) {
                    num3 = rand.nextInt(40+1+10)-40;
                    if (num1 != num3 && num2 != num3) {
                        num4 = rand.nextInt(40+1+10)-40;
                        if (num1 != num4 && num2 != num4 && num3 != num4) break;
                    }
                }

            }
            Button b1 = (Button) findViewById(R.id.button1);
            b1.setText(Integer.toString(num1));
            Button b2 = (Button) findViewById(R.id.button2);
            b2.setText(Integer.toString(num2));
            Button b3 = (Button) findViewById(R.id.button3);
            b3.setText(Integer.toString(num3));
            Button b4=(Button) findViewById(R.id.button4);
            b4.setText(Integer.toString(num4));
        }
    }

    public void onClickButton1(View view) {
        if(num1>num2&&num1>num3&&num1>num4)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level5.this, failedScreen.class);
            startActivity(intent);
        }

        TextView txt=(TextView) findViewById(R.id.score);
        txt.setText("Score: "+count);
        buildRandomNum();
    }

    public void onClickButton2(View view) {
        if(num2>num1&&num2>num3&&num2>num4)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level5.this, failedScreen.class);
            startActivity(intent);
        }

        TextView txt=(TextView) findViewById(R.id.score);
        txt.setText("Score: "+count);
        buildRandomNum();
    }

    public void onClickButton3(View view) {
        if(num3>num1&&num3>num2&&num3>num4)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level5.this, failedScreen.class);
            startActivity(intent);
        }

        TextView txt=(TextView) findViewById(R.id.score);
        txt.setText("Score: "+count);
        buildRandomNum();
    }

    public void onClickButton4(View view) {
        if(num4>num2&&num4>num3&&num4>num1)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level5.this, failedScreen.class);
            startActivity(intent);
        }

        TextView txt=(TextView) findViewById(R.id.score);
        txt.setText("Score: "+count);
        buildRandomNum();
    }
}
