package com.shaihi.backtodebugging;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
// import android.widget.Toast; // TODO: Fix missing import

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private string text = "Hello Debugging!";
    private TextView textview = findViewById(R.id.my_textview);
    private Button button = findViewById(R.id.my_button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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