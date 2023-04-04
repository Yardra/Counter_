package com.yardra.counter_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num = 0;
    String key = "";
    String number = Integer.toString(num);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView BigText = findViewById(R.id.textView2);
        BigText.setText(R.string.big_text);

        TextView Changed_Text = findViewById(R.id.textView3);
        Changed_Text.setText(number);

        Button button = findViewById(R.id.button);
        button.setText(R.string.button_name);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {num += 1;
                number = Integer.toString(num);
                Changed_Text.setText(number);}
                catch (Exception e) {}
            }
        });

    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(key, num);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        num = savedInstanceState.getInt(key);

    }
}