package com.theknight.smartcalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button clear,div,mul,del,seven,eight,nine,min,four,five,six,plus,one,two,three,equal,mod,zero,dec;
    private TextView editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);



//        get all the button with r
        clear = findViewById(R.id.clear);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        del = findViewById(R.id.del);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        eight = findViewById(R.id.eight);
        min = findViewById(R.id.min);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        plus = findViewById(R.id.plus);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        equal = findViewById(R.id.equal);
        dec = findViewById(R.id.decimal);
        mod = findViewById(R.id.modules);
        zero = findViewById(R.id.zero);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                Engine.onTouchButton(clear,Color.GREEN,Color.RED);
                Engine.resetSize(editText,60);
            }

        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,"/");
                Engine.onTouchButton(div,Color.GREEN,Color.RED);


            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.onTouchButton(mul,Color.GREEN,Color.RED);
                Engine.setText(editText,"*");

            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.onTouchButton(del,Color.GREEN,Color.RED);
                String s = editText.getText().toString();
                s = s.substring(0,s.length()-1);
                editText.setText(s);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                editText.setText(String.format("%s7", editText.getText()));
                Engine.setText(editText,"7");
                Engine.onTouchButton(seven,Color.CYAN,Color.BLUE);

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,"8");
                Engine.onTouchButton(eight,Color.CYAN,Color.BLUE);


            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Engine.setText(editText,"9");
                Engine.onTouchButton(nine,Color.CYAN,Color.BLUE);


            }
        });


        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,"-");
                Engine.onTouchButton(min,Color.GREEN,Color.RED);


            }
        });



        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,"4");
                Engine.onTouchButton(four,Color.CYAN,Color.BLUE);


            }
        });



        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,"5");
                Engine.onTouchButton(five,Color.CYAN,Color.BLUE);


            }
        });



        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,"6");
                Engine.onTouchButton(six,Color.CYAN,Color.BLUE);


            }
        });



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,"+");
                Engine.onTouchButton(plus,Color.GREEN,Color.RED);


            }
        });



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,"1");
                Engine.onTouchButton(one,Color.CYAN,Color.BLUE);


            }
        });



        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,"2");
                Engine.onTouchButton(two,Color.CYAN,Color.BLUE);


            }
        });



        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,"3");
                Engine.onTouchButton(three,Color.CYAN,Color.BLUE);


            }
        });



        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Engine.onTouchButton(equal,Color.GREEN,Color.RED);
                Engine.calculate(editText);


            }
        });


        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setCopyRight(editText);

                Engine.setText(editText,"%");
                Engine.onTouchButton(mod,Color.BLACK,Color.CYAN);


            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,"0");
                Engine.onTouchButton(zero,Color.BLACK,Color.CYAN);


            }
        });


        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Engine.setText(editText,".");
                Engine.onTouchButton(dec,Color.BLACK,Color.CYAN);


            }
        });








        // time to fire up

    }
}