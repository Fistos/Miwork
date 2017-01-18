package com.example.tih.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("father","әpә", R.drawable.family_father));
        words.add(new word("mother","әtә",  R.drawable.family_mother));
        words.add(new word("son","angsi",  R.drawable.family_son));
        words.add(new word("daughter","tune",  R.drawable.family_daughter));
        words.add(new word("older brother","taachi",  R.drawable.family_older_brother));
        words.add(new word("older sister","tete",  R.drawable.family_older_sister));
        words.add(new word("younger brother","chalitti",  R.drawable.family_younger_brother));
        words.add(new word("younger sister","kolliti",  R.drawable.family_younger_sister));
        words.add(new word("grandmother","ama",  R.drawable.family_grandmother));
        words.add(new word("grandfather","ama",  R.drawable.family_grandfather));


        // LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.activity_root_view);

        listView.setAdapter(adapter);
        // int index;

  /*      for(int index =0; index < words.size(); index++){

            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
        }

*/






    }
    }

