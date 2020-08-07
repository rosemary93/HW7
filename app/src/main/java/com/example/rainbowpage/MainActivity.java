package com.example.rainbowpage;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private TextView redTextView;
    private TextView orangeTextView;
    private TextView yellowTextView;
    private TextView greenTextView;
    private TextView blueTextView;
    private TextView indigoTextView;
    private TextView violetTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setTextViewsListener();

    }
    

    private void setTextViewsListener() {
        redTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redTextView.setVisibility(View.GONE);
                setDelayOnTextsColor(getString(R.string.red_text));
            }
        });
        orangeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orangeTextView.setVisibility(View.GONE);
                setDelayOnTextsColor(getString(R.string.orange_text));
            }
        });
        yellowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellowTextView.setVisibility(View.GONE);
                setDelayOnTextsColor(getString(R.string.yellow_text));

            }
        });
        greenTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                greenTextView.setVisibility(View.GONE);
                setDelayOnTextsColor(getString(R.string.green_text));

            }
        });
        blueTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blueTextView.setVisibility(View.GONE);
                setDelayOnTextsColor(getString(R.string.blue_text));

            }
        });
        indigoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                indigoTextView.setVisibility(View.GONE);
                setDelayOnTextsColor(getString(R.string.indigo_text));

            }
        });
        violetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                violetTextView.setVisibility(View.GONE);
                setDelayOnTextsColor(getString(R.string.violet_text));

            }
        });
    }

    private void setDelayOnTextsColor(String color) {
        setTextsColor(color);
        new Timer().schedule(
                new TimerTask(){

                    @Override
                    public void run(){
                        setDefaultColors();
                        //when the delay expires
                    }

                }, 5000);
    }

    private void setDefaultColors() {
        redTextView.setText(R.string.red_text);
        orangeTextView.setText(R.string.orange_text);
        yellowTextView.setText(R.string.yellow_text);
        greenTextView.setText(R.string.green_text);
        blueTextView.setText(R.string.blue_text);
        indigoTextView.setText(R.string.indigo_text);
        violetTextView.setText(R.string.violet_text);
    }

    private void setTextsColor(String color) {
        redTextView.setText(color);
        orangeTextView.setText(color);
        yellowTextView.setText(color);
        greenTextView.setText(color);
        blueTextView.setText(color);
        indigoTextView.setText(color);
        violetTextView.setText(color);
    }



    private void findViews() {
        redTextView=findViewById(R.id.redTextView);
        orangeTextView=findViewById(R.id.orangeTextView);
        yellowTextView=findViewById(R.id.yellowTextView);
        greenTextView=findViewById(R.id.greenTextView);
        blueTextView=findViewById(R.id.blueTextView);
        indigoTextView=findViewById(R.id.indigoTextView);
        violetTextView=findViewById(R.id.violetTextView);
    }

}