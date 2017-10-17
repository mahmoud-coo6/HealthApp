package com.example2.acer.healthapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Spinner spinn=(Spinner) findViewById(R.id.spiner);
        ArrayList<String> Student=new ArrayList<>();
        Student.add("Ali");
        Student.add("Sami");
        Student.add("Omer");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Student);
//        spinn.setAdapter(arrayAdapter);


//        spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                String select=(String) adapterView.getItemAtPosition(i);
//                Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i)+"", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });

//        final Button btn=(Button) findViewById(R.id.qustuin2);
//        btn.setText(R.string.app_name);
//        btn.setText("Ali");
 //       btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "bottom", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        Toast.makeText(this, "OnCreat", Toast.LENGTH_SHORT).show();
//        if (savedInstanceState == null){
//            Toast.makeText(this, "No value", Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(this, savedInstanceState.getString(Constant.Key_Remember), Toast.LENGTH_SHORT).show();
//        }
//
//        final TextView textView=(TextView) findViewById(R.id.textview);
//        SeekBar seekBar=(SeekBar) findViewById(R.id.seekbar);
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//                textView.setTextSize(i);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });

//        RadioGroup group=(RadioGroup) findViewById(R.id.group);
//        group.OnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
//
//            }
//        });



                //on rating bar change listener
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // it is better to save data here
    }


    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(Constant.Key_Remember,"Islamic Univerity");
    }

    @Override
    public void onClick(View view) {

    }

    /*
        @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
     */


}
