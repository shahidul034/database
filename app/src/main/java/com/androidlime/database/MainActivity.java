package com.androidlime.database;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.name);
        e2=(EditText)  findViewById(R.id.bday);
        b1=(Button) findViewById(R.id.save);
        b2=(Button) findViewById(R.id.show);
        final mydbfun md=new mydbfun(getApplicationContext());
        b1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                String _name=e1.getText().toString();
                String _bday=e2.getText().toString();
                DataTemp dt=new DataTemp(_name,_bday);
                md.addingDataToTable(dt);
                Toast.makeText(getApplicationContext(),"Data added sucessfully!", Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(),BirthdayofFriends.class));
            }
        });

    }


}
