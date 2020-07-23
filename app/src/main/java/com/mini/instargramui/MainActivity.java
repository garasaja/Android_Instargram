package com.mini.instargramui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvInstargram, rvProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProfile = findViewById(R.id.rv_profile);

        ProfileAdapter padapter = new ProfileAdapter();
        padapter.addItem(new Profile(R.drawable.propic1));
        padapter.addItem(new Profile(R.drawable.propic2));
        padapter.addItem(new Profile(R.drawable.propic3));
        padapter.addItem(new Profile(R.drawable.propic4));
        padapter.addItem(new Profile(R.drawable.propic5));
        padapter.addItem(new Profile(R.drawable.propic1));
        padapter.addItem(new Profile(R.drawable.propic2));
        padapter.addItem(new Profile(R.drawable.propic3));
        padapter.addItem(new Profile(R.drawable.propic4));
        padapter.addItem(new Profile(R.drawable.propic5));


        rvProfile.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        rvProfile.setAdapter(padapter);

        rvInstargram = findViewById(R.id.rv_instargram);

        InstargramAdapter adapter = new InstargramAdapter();
        adapter.addItem(new Instargram(R.drawable.postpic1,R.drawable.postpic2,R.drawable.postpic3,R.drawable.postpic4));
        adapter.addItem(new Instargram(R.drawable.postpic5,R.drawable.postpic1,R.drawable.postpic2,R.drawable.postpic3));
        adapter.addItem(new Instargram(R.drawable.postpic4,R.drawable.postpic5,R.drawable.postpic1,R.drawable.postpic2));
        adapter.addItem(new Instargram(R.drawable.postpic3,R.drawable.postpic4,R.drawable.postpic5,R.drawable.postpic1));
        adapter.addItem(new Instargram(R.drawable.postpic2,R.drawable.postpic3,R.drawable.postpic4,R.drawable.postpic5));

        rvInstargram.setLayoutManager(new LinearLayoutManager(this));
        rvInstargram.setAdapter(adapter);
    }
}
