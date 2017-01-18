package com.example.tih.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Where are you going?","minto wukss"));
        words.add(new word("What is your name","tinnә oyaase'nә"));
        words.add(new word("My name is...","oyaaset..."));
        words.add(new word("How are you feeling?","michәksәs"));
        words.add(new word("I'm feeling good","kuchi achit"));
        words.add(new word("Are you coming?","әәnes' aa?"));
        words.add(new word("Yes, I'm coming","hәә ' әәnәm"));
        words.add(new word("I'm coming","әәnem"));
        words.add(new word("Let's go","yoowutis"));
        words.add(new word("Come here","әnni' nem "));


        // LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.activity_root_view);

        listView.setAdapter(adapter);
    }
}
