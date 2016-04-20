package com.example.andrew.lab3add;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class Add extends AppCompatActivity {

    Add AddActivity;

    private Button addClick;
    private EditText edit1, edit2;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        addClick = (Button) findViewById(R.id.addbutton);
        edit1 = (EditText) findViewById(R.id.num1);
        edit2 = (EditText) findViewById(R.id.num2);
        text = (TextView) findViewById(R.id.sum);
        addClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String str1, str2;
                str1 = edit1.getText().toString();
                str2 = edit2.getText().toString();
                if( str1 == "" || str2 == "")
                    text.setText("gg son");
                else {
                    int numb1 = Integer.parseInt(str1);
                    int numb2 = Integer.parseInt(str2);
                    int number = numb1+numb2;
                    text.setText("" + number);
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public int sum(int a, int b) {
        //returns the sum of received parameters
        return a-b;
    }
}
