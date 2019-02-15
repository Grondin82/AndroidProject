package com.bge.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView testView;
    GridView gridView;

    String[] values = {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NumberGen numberGen = new NumberGen();
        numberGen.gener(this, values);
        gridView = (GridView) findViewById(R.id.gridview);



        final GridAdapter gridAdapter = new GridAdapter(this, values);

        gridView.setAdapter(gridAdapter);

        testView = (TextView) findViewById(R.id.testview);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
                //testView.setText("" + position); // caste en String obligatoire
                int posi = (int) position;
                values[posi] = "Meuh";
                gridView.setAdapter(gridAdapter);
            }
        });


    }
}
