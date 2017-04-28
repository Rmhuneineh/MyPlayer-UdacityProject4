package com.example.android.myplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rmhuneineh on 28/04/2017.
 */

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(Activity context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_list_item,
                    parent, false);
        }

        Album currentAlbum = getItem(position);

        TextView albumName = (TextView) listItemView.findViewById(R.id.albumName);
        albumName.setText(currentAlbum.getAlbumName());

        TextView artistName = (TextView) listItemView.findViewById(R.id.artistName);
        artistName.setText(currentAlbum.getArtistName());

        return listItemView;
    }
}
