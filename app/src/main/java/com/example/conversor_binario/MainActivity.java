package com.example.conversor_binario;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8;
    EditText txtDec;

    boolean binario1 = false;
    boolean binario2 = false;
    boolean binario3 = false;
    boolean binario4 = false;
    boolean binario5 = false;
    boolean binario6 = false;
    boolean binario7 = false;
    boolean binario8 = false;

    int a, b, c, d, e, f, g, h;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDec=(EditText) findViewById(R.id.txtDec);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                if (binario1 == false) {
                    b1.setText("1");
                    b1.setBackgroundColor(Color.BLUE);
                    a = 128;
                    binario1 = true;
                } else if (binario1 == true) {
                    b1.setText("0");
                    b1.setBackgroundColor(Color.RED);
                    a = 0;
                    binario1 = false;

                }
                break;
            case R.id.btn2:
                if (binario2 == false) {
                    b2.setText("1");
                    b2.setBackgroundColor(Color.BLUE);
                    b = 64;
                    binario2 = true;
                } else if (binario2 == true) {
                    b2.setText("0");
                    b2.setBackgroundColor(Color.RED);
                    b = 0;
                    binario2 = false;

                }
                break;
            case R.id.btn3:
                if (binario3 == false) {
                    b3.setText("1");
                    b3.setBackgroundColor(Color.BLUE);
                    c = 32;
                    binario3 = true;
                } else if (binario3 == true) {
                    b3.setText("0");
                    b3.setBackgroundColor(Color.RED);
                    c = 0;
                    binario3 = false;

                }
                break;
            case R.id.btn4:
                if (binario4 == false) {
                    b4.setText("1");
                    b4.setBackgroundColor(Color.BLUE);
                    d = 16;
                    binario4 = true;
                } else if (binario2 == true) {
                    b4.setText("0");
                    b4.setBackgroundColor(Color.RED);
                    d = 0;
                    binario4 = false;

                }
                break;
            case R.id.btn5:
                if (binario5 == false) {
                    b5.setText("1");
                    b5.setBackgroundColor(Color.BLUE);
                    e = 8;
                    binario5 = true;
                } else if (binario5 == true) {
                    b5.setText("0");
                    b5.setBackgroundColor(Color.RED);
                    e = 0;
                    binario5 = false;

                }
                break;
            case R.id.btn6:
                if (binario6 == false) {
                    b6.setText("1");
                    b6.setBackgroundColor(Color.BLUE);
                    f = 4;
                    binario6 = true;
                } else if (binario5 == true) {
                    b6.setText("0");
                    b6.setBackgroundColor(Color.RED);
                    f = 0;
                    binario6 = false;

                }
                break;
            case R.id.btn7:
                if (binario7 == false) {
                    b7.setText("1");
                    b7.setBackgroundColor(Color.BLUE);
                    g = 2;
                    binario7 = true;
                } else if (binario7 == true) {
                    b7.setText("0");
                    b7.setBackgroundColor(Color.RED);
                    g = 0;
                    binario7 = false;

                }
                break;
            case R.id.btn8:
                if (binario8 == false) {
                    b8.setText("1");
                    b8.setBackgroundColor(Color.BLUE);
                    h = 1;
                    binario8 = true;
                } else if (binario7 == true) {
                    b8.setText("0");
                    b8.setBackgroundColor(Color.RED);
                    h = 0;
                    binario8 = false;

                }
                break;

        }

        int z = a + b + c + d + e + f + g + h;
        txtDec.setText("" + z);

    }

}
















