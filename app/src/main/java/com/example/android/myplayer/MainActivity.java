package com.example.android.myplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Category> categoryList = new ArrayList<Category>();
        categoryList.add(new Category(getString(R.string.albums)));
        categoryList.add(new Category(getString(R.string.audioBooks)));
        categoryList.add(new Category(getString(R.string.songs)));
        categoryList.add(new Category(getString(R.string.playLists)));

        CategoryAdapter adapter = new CategoryAdapter(this, categoryList);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }


}
