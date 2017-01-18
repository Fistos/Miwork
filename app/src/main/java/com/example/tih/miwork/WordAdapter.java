package com.example.tih.miwork;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TIH on 11/23/2016.
 */

public class WordAdapter extends ArrayAdapter<word> {

    public WordAdapter(Activity context, ArrayList<word> words){

        super(context, 0, words);
    }

    public WordAdapter(Colors colors, ArrayList<word> words, int category_colors) {
        super(colors, category_colors, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
    //checking for redundancy
        View ListItemView = convertView;
        if(ListItemView == null){
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item,parent, false);
        }
        //gets the position of the object
        word currentWord = getItem(position);

        //finds the textview in the listitem
        TextView miworkTextView = (TextView) ListItemView.findViewById(R.id.miwork_text_view);
        miworkTextView.setText(currentWord.getmMiworkTranslation());
        //finds the textview in the listitem and get the default item
        TextView defaultTextView = (TextView) ListItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());
        //find the image view in the list_item layout with the ID image
        ImageView imgaeView = (ImageView) ListItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            //set the image view
            imgaeView.setImageResource(currentWord.getImageResourceId());

            //make sure the image is visible
            imgaeView.setVisibility(View.VISIBLE);
        }
        else{

            imgaeView.setVisibility(View.GONE);
        }

        //returns listView  and the whole list item layout
        return ListItemView;

    }

}
