package com.androidlime.database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class BirthdayofFriends extends AppCompatActivity {

    ListView lv;
    String[] data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_birthdayof_friends);
        lv = (ListView) findViewById (R.id.myfriendbday);
        mydbfun mf = new mydbfun (getApplicationContext ());
        data = mf.my_data ();


        lv.setAdapter (new ArrayAdapter (getApplicationContext (), R.layout.lview, R.id.mytext, data));
        lv.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent (getApplicationContext (), SingleBday.class);
                i.putExtra ("mykey", position);
                startActivity (i);
            }
        });

    }
}
