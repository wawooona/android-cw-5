package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class detailed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        TextView name = findViewById(R.id.name);
        TextView gen = findViewById(R.id.gen);
        TextView rate = findViewById(R.id.rato);
        ImageView imagView = findViewById(R.id.imagView);

        Bundle bun = getIntent().getExtras();
        Movie m = (Movie) bun.getSerializable("movie");
        name.setText(m.getName());
        gen.setText(m.getG()+"");
        rate.setText(m.getRate()+"");
        imagView.setImageResource(m.getImg());

    }
}






