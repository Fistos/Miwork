package com.example.tih.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Create a list of words
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("red","wetetti",R.drawable.color_red));
        words.add(new word("mustard yellow","chiwiite",R.drawable.color_mustard_yellow));
        words.add(new word("dusty yellow","topiise",R.drawable.color_dusty_yellow));
        words.add(new word("green","chokokki",R.drawable.color_green));
        words.add(new word("brown","takaakki",R.drawable.color_brown));
        words.add(new word("grey","topoppi",R.drawable.color_gray));
        words.add(new word("black","kululli",R.drawable.color_black));
        words.add(new word("white","kelelli",R.drawable.color_white));

        //Adapter
        WordAdapter adapter = new WordAdapter(this, words , R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.activity_root_view);

        listView.setAdapter(adapter);

    }
}
