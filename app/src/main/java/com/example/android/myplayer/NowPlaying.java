package com.example.android.myplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    private boolean playing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        final ImageView play = (ImageView) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playing){
                    play.setImageResource(R.drawable.ic_play);
                    playing = false;
                } else {
                    play.setImageResource(R.drawable.ic_pause);
                    playing = true;
                }
            }
        });

        final ImageView next = (ImageView) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: play next song
            }
        });

        final ImageView previous = (ImageView) findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: play previous song
            }
        });

        TextView songName = (TextView) findViewById(R.id.song_name);
        //TODO: set the text view as the song name provided as data from intent

        SeekBar volume = (SeekBar) findViewById(R.id.volume);
        volume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //TODO: set the volume proportional to the seek bar progress
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
