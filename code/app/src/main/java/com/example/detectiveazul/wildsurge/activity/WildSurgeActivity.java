package com.example.detectiveazul.wildsurge.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.detectiveazul.wildsurge.R;
import com.example.detectiveazul.wildsurge.model.Randomizer;

public class WildSurgeActivity extends AppCompatActivity {
    private TextView wildSurgeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild_surge);

        this.wildSurgeTextView = findViewById(R.id.wildSurgeTextViewID);
    }

    public void onRollButtonClicked(View view) {
        wildSurgeTextView.setText(Randomizer.wildSurge());
    }


}

