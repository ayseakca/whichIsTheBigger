package com.example.whichisthebigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class level10 extends AppCompatActivity {
    private int num1, num2, num3, num4, num5, num6,num7,num8;
    private int count = 45;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level10);
        buildRandomNum();
    }
    public void buildRandomNum() {
        if (count == 50) {
            count = 45;
            Toast.makeText(this, "LEVEL COMPLETED", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(level10.this, finish.class);
            startActivity(intent);
        } else {
            Random rand = new Random();
            num1 = rand.nextInt(100 + 1 + 10) - 100;
            while (true) {
                num2 = rand.nextInt(100 + 1 + 10) - 100;
                if (num1 != num2) {
                    num3 = rand.nextInt(100 + 1 + 10) - 100;
                    if (num1 != num3 && num2 != num3) {
                        num4 = rand.nextInt(100 + 1 + 10) - 100;
                        if (num1 != num4 && num2 != num4 && num3 != num4) {
                            num5 = rand.nextInt(100 + 1 + 10) - 100;
                            if (num1 != num5 && num2 != num5 && num3 != num5 && num4 != num5){
                                num6 = rand.nextInt(100 + 1 + 10) - 100;
                                if (num1 != num6 && num2 != num6 && num3 != num6 && num4 != num6 && num5 != num6) {
                                    num7 = rand.nextInt(100 + 1 + 10) - 100;
                                    if (num1 != num7 && num2 != num7 && num3 != num7 && num4 != num7 && num5 != num7 && num6 != num7){
                                        num8 = rand.nextInt(100 + 1 + 10) - 100;
                                        if (num1 != num8 && num2 != num8 && num3 != num8 && num4 != num8 && num5 != num8 && num6 != num8 && num7 != num8) break;
                                    }
                                }
                            }
                        }
                    }
                }

            }
            Button b1 = (Button) findViewById(R.id.button1);
            b1.setText(Integer.toString(num1));
            Button b2 = (Button) findViewById(R.id.button2);
            b2.setText(Integer.toString(num2));
            Button b3 = (Button) findViewById(R.id.button3);
            b3.setText(Integer.toString(num3));
            Button b4 = (Button) findViewById(R.id.button4);
            b4.setText(Integer.toString(num4));
            Button b5 = (Button) findViewById(R.id.button5);
            b5.setText(Integer.toString(num5));
            Button b6 = (Button) findViewById(R.id.button6);
            b6.setText(Integer.toString(num6));
            Button b7 = (Button) findViewById(R.id.button7);
            b7.setText(Integer.toString(num7));
            Button b8 = (Button) findViewById(R.id.button8);
            b8.setText(Integer.toString(num8));
        }
    }

    public void onClickButton1(View view) {
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 && num1 > num6 && num1 > num7 && num1 > num8)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level10.this, failedScreen.class);
            startActivity(intent);
        }

        TextView txt = (TextView) findViewById(R.id.score);
        txt.setText("Score: " + count);
        buildRandomNum();
    }

    public void onClickButton2(View view) {
        if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 && num2 > num6 && num2 > num7 && num2 > num8)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level10.this, failedScreen.class);
            startActivity(intent);
        }


        TextView txt = (TextView) findViewById(R.id.score);
        txt.setText("Score: " + count);
        buildRandomNum();
    }

    public void onClickButton3(View view) {
        if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 && num3 > num6 && num3 > num7 && num3 > num8)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level10.this, failedScreen.class);
            startActivity(intent);
        }
        TextView txt = (TextView) findViewById(R.id.score);
        txt.setText("Score: " + count);
        buildRandomNum();
    }

    public void onClickButton4(View view) {
        if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num4 > num6 && num4 > num7 && num4 > num8)
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level10.this, failedScreen.class);
            startActivity(intent);
        }

        TextView txt = (TextView) findViewById(R.id.score);
        txt.setText("Score: " + count);
        buildRandomNum();
    }

    public void onClickButton5(View view) {
        if (num5 > num2 && num5 > num3 && num5 > num1 && num5 > num4 && num5 > num6 && num5 > num7 && num5 > num8 )
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level10.this, failedScreen.class);
            startActivity(intent);
        }

        TextView txt = (TextView) findViewById(R.id.score);
        txt.setText("Score: " + count);
        buildRandomNum();
    }

    public void onClickButton6(View view) {
        if (num6 > num2 && num6 > num3 && num6 > num1 && num6 > num4 && num6 > num5 && num6 > num7 && num6 > num8 )
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level10.this, failedScreen.class);
            startActivity(intent);
        }

        TextView txt = (TextView) findViewById(R.id.score);
        txt.setText("Score: " + count);
        buildRandomNum();
    }
    public void onClickButton7(View view) {
        if (num7 > num1 && num7 > num2 && num7 > num3 && num7 > num4 && num7 > num5 && num7 > num6 && num7 > num8 )
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level10.this, failedScreen.class);
            startActivity(intent);
        }

        TextView txt = (TextView) findViewById(R.id.score);
        txt.setText("Score: " + count);
        buildRandomNum();
    }

    public void onClickButton8(View view) {
        if (num8 > num1 && num8 > num2 && num8 > num3 && num8 > num4 && num8 > num5 && num8 > num6 && num8 > num7 )
            count++;
        else{
            Toast.makeText(getApplicationContext(), "POINT:"+count, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(level10.this, failedScreen.class);
            startActivity(intent);
        }

        TextView txt = (TextView) findViewById(R.id.score);
        txt.setText("Score: " + count);
        buildRandomNum();
    }
}
