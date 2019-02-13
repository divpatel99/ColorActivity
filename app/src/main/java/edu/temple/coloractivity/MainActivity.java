package edu.temple.coloractivity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;
import android.graphics.Color;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] colors = {
                "WHITE",
                "BLUE",
                "LIGHTGRAY",
                "Gray",
                "DARKGRAY",
                "GREEN",
                "RED",
                "YELLOW",
                "MAGENTA",
                "CYAN"

        };


       Spinner spinner = (Spinner) findViewById(R.id.spinner);

        final RelativeLayout relative = (RelativeLayout) findViewById(R.id.activity_main);

        ColorAdapter spinnerAdapter = new ColorAdapter(this, colors);
        spinner.setAdapter(spinnerAdapter);




        Toast.makeText(MainActivity.this, "Select a color from drop-down menu", Toast.LENGTH_LONG).show();
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

           public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l){


                relative.setBackgroundColor(Color.parseColor((String)colors[position]));


           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

            relative.setBackgroundColor(Color.WHITE);

           }
       });

    }
}

