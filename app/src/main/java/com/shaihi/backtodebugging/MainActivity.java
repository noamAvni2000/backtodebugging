package com.shaihi.backtodebugging;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
// import android.widget.Toast; // TODO: Fix missing import

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textview;
    private Button button;
    private string text = "Hello Debugging!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.my_textview);
        button = findViewById(R.id.my_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage();
            }
        });
    }

    private void showToastMessage() {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}