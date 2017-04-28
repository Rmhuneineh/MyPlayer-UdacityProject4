package com.example.android.myplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        final ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album(getString(R.string.sampleAlbumName), getString(R.string.sampleArtistName), 1));

        AlbumAdapter adapter = new AlbumAdapter(AlbumActivity.this, albums);

        final ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);
    }
}
