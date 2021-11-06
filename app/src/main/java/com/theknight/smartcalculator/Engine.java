package com.theknight.smartcalculator;
import org.mariuszgromada.math.mxparser.*;
import android.graphics.Color;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Engine {


    public static void setText(TextView textView,String text ){
        holdNum(textView,25);

        textView.setText(String.format("%s%s", textView.getText(),text));


    }

    public static void onTouchButton(Button button,int before_release,int after_release){
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP){
                    button.setBackgroundColor(after_release);
                }
                else if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    button.setBackgroundColor(before_release);

                }

                else if(motionEvent.getAction() == MotionEvent.ACTION_BUTTON_RELEASE) {
                    button.setBackgroundColor(after_release);
                }
                return false;
            }
        });
    }

    public static void holdNum(TextView textView,float font){
        if (textView.getText().toString().length() > 8){
            textView.setTextSize(font);
        }
        if (textView.getText().toString().length() > 20){
            textView.setTextSize(font-5);


        }
    }
    public static void resetSize(TextView textView,float size){
        textView.setTextSize(70);



    }



    public static void calculate(TextView textView){
        /**
         *
         */
        String text = textView.getText().toString();
        Expression exp = new Expression(text);
        String result =  String.valueOf(exp.calculate());
        if (result.length() > 8){
            holdNum(textView,25);
        }
        textView.setTextSize(30);

        textView.setText(result);

    }

    public static void setCopyRight(TextView textView){
        String text = textView.getText().toString();
        if (text.equals("++++")){
            textView.setTextSize(14);
            textView.setText("Copyright (c) TheKnight(Kapil)");
        }
    }


}
