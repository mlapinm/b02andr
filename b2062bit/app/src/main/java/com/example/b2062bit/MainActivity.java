package com.example.b2062bit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int num = 0;
    TextView textView;
    TextView textView2;
    ArrayList<Integer> buttonIds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);


        buttonIds = new ArrayList<>();
        buttonIds.add(R.id.button);
        buttonIds.add(R.id.button2);
        buttonIds.add(R.id.button3);
        buttonIds.add(R.id.button4);
        buttonIds.add(R.id.button5);
        buttonIds.add(R.id.button6);
        buttonIds.add(R.id.button7);
        buttonIds.add(R.id.button8);

    }

    public void onClickButton(View view) {
        int id, index;
        id = view.getId();
        Button button = findViewById(id);
        String buttonValue;
        buttonValue = button.getText().toString();
        index = buttonIds.indexOf(id);
        if(buttonValue.equals("0")){
            button.setText("1");
            num += Math.pow(2, index);
        }else{
            button.setText("0");
            num -= Math.pow(2, index);
        }
        textView.setText("" + num);
//        textView2.setText("" + index);
    }
}