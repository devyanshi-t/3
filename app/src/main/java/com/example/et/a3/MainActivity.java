package com.example.et.a3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView t;
    String str;
    Spinner s;Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      s=(Spinner)findViewById(R.id.s);
       ArrayAdapter <CharSequence> a=ArrayAdapter.createFromResource(this,R.array.subject,android.R.layout.simple_spinner_item);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(a);
        s.setOnItemSelectedListener(this);
        Listerner();


    }
   public void Listerner()
   { b=(Button)findViewById(R.id.b);
       b.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               if(str.equals("Subjects"))
               { Toast.makeText(MainActivity.this,"PLEASE SELECT A SUBJECT",Toast.LENGTH_LONG).show();}
               else {t.setText(str);}


           }


       });

   }

    @Override
    public void onItemSelected(AdapterView<?> a, View view, int i, long l) {
        t=(TextView)findViewById(R.id.t);
        str = a.getItemAtPosition(i).toString();


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(MainActivity.this,"SELECT SOMETHING",Toast.LENGTH_LONG).show();

    }
}
