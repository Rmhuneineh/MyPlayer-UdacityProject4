package com.example.android.myplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rmhuneineh on 25/04/2017.
 */

public class CategoryAdapter extends ArrayAdapter<Category> {

    public CategoryAdapter(Activity context, ArrayList<Category> categoryList) {
        super(context, 0, categoryList);
    }

    /**
     * Provide a view for an AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, View counterView, ViewGroup parent){
        View listItemView = counterView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.main_list_item, parent, false);
        }

        Category currentCategory = getItem(position);

        TextView categoryTextView = (TextView) listItemView.findViewById(R.id.category);
        categoryTextView.setText(currentCategory.getCategoryName());

        return listItemView;
    }
}
