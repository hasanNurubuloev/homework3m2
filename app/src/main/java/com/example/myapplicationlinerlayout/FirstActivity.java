package com.example.myapplicationlinerlayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {
    FAAdapter adapter;
    RecyclerView recyclerView;

    TextView vh_textView;
    Button calculator_btn;





    static final int MAIN_CODE = 42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        vh_textView = findViewById(R.id.vh_text_view);
        calculator_btn = findViewById(R.id.af_calculator_btn);
        recyclerView=findViewById(R.id.af_recycler_view);
        adapter=new FAAdapter();
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
    }

    public void onCalculator(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, MAIN_CODE);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == MAIN_CODE && resultCode == RESULT_OK&& data!=null) {
            String result=data.getStringExtra("key32");
            adapter.addText(result);

        }
    }
    public void onShareIntent(View v) {
            Intent shareIntant = new Intent();
            shareIntant.setAction(Intent.ACTION_SEND);
            shareIntant.putExtra(Intent.EXTRA_TEXT, adapter.data.toString());
            shareIntant.setType("text/plain");
            if (shareIntant.resolveActivity(getPackageManager()) != null) {
                startActivity(shareIntant);
            }

    }
}