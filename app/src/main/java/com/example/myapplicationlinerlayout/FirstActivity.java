package com.example.myapplicationlinerlayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    Button calculator_btn;
    Button share_btn;
    TextView textView;

    static final String DATA_KEY = "data";


    static final int MAIN_CODE = 42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        calculator_btn = findViewById(R.id.af_calculator_btn);
        share_btn = findViewById(R.id.af_share_btn);
        textView = findViewById(R.id.af_text_view);


    }

    public void onCalculator(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, MAIN_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == MAIN_CODE && resultCode == RESULT_OK) {
            String str = data.getStringExtra(MainActivity.SAVED_INT_KEY);
            textView.setText(str);
        } else {
            textView.setText("cancelled");
        }
    }

    public void onShareIntent(View v) {
        String text = textView.getText().toString();
        Intent shareIntant = new Intent();

        shareIntant.setAction(Intent.ACTION_SEND);
        shareIntant.putExtra(Intent.EXTRA_TEXT, text);
        shareIntant.setType("text/plain");
        if (shareIntant.resolveActivity(getPackageManager()) != null) {
            startActivity(shareIntant);
        }
    }
}
