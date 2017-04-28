package com.example.android.myplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AudioBooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiobooks);

        TextView audioBookTitle = (TextView) findViewById(R.id.audioBookTitle);
        audioBookTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudioBooksActivity.this, NowPlaying.class);
                startActivity(intent);
            }
        });
    }
}
