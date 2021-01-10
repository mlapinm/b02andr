package com.example.b2082piano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    ArrayList<Integer> buttonNone1Ids, buttonNone2Ids, button1Ids, button2Ids;
    ArrayList<Button> buttons1, buttons2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtons();
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);



    }

    public void onClickButton(View view) {
        int id, index;
        id = view.getId();
        Button button = findViewById(id);
        index = buttons1.indexOf(button);
        if(index == -1){
            index = buttons2.indexOf(button);
            if(index == -1){
                return;
            }
            index += 10;
        }
        String text;
        text = "" + (index + 1);
        textView1.setText(text);


    }



    private void setButtons() {
        buttonNone1Ids = new ArrayList<>();
        buttonNone1Ids.add(R.id.button41);
        buttonNone1Ids.add(R.id.button42);
        buttonNone1Ids.add(R.id.button43);
        buttonNone1Ids.add(R.id.button44);
        buttonNone1Ids.add(R.id.button45);

        buttonNone2Ids = new ArrayList<>();
        buttonNone2Ids.add(R.id.button46);
        buttonNone2Ids.add(R.id.button47);
        buttonNone2Ids.add(R.id.button48);

        button1Ids = new ArrayList<>();
        button1Ids.add(R.id.button11);
        button1Ids.add(R.id.button12);
        button1Ids.add(R.id.button13);
        button1Ids.add(R.id.button14);
        button1Ids.add(R.id.button15);
        button1Ids.add(R.id.button16);
        button1Ids.add(R.id.button17);

        button2Ids = new ArrayList<>();
        button2Ids.add(R.id.button21);
        button2Ids.add(R.id.button22);
        button2Ids.add(R.id.button24);
        button2Ids.add(R.id.button25);
        button2Ids.add(R.id.button26);

        for (int i : buttonNone1Ids){
            Button button;
            button = findViewById(i);
            button.setBackgroundColor(android.R.attr.colorButtonNormal);
        }
        for (int i : buttonNone2Ids){
            Button button;
            button = findViewById(i);
            button.setBackgroundColor(android.R.attr.colorButtonNormal);
        }
        buttons1 = new ArrayList<>();
        for (int i : button1Ids){
            Button button;
            button = findViewById(i);
            buttons1.add(button);
        }
        buttons2 = new ArrayList<>();
        for (int i : button2Ids){
            Button button;
            button = findViewById(i);
            buttons2.add(button);
        }

        for (Button button : buttons1){
            button.setBackgroundColor(android.R.attr.colorButtonNormal);
        }

    }

}