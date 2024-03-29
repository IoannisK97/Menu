package com.example.jandroid.menu;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jandroid.menu.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView textView1=(TextView) findViewById(R.id.menu_item_1);
        String menuItem1=textView1.getText().toString();
        Log.v("MainActivity",menuItem1);
        // Find second menu item TextView and print the text to the logs
        TextView textView2=(TextView) findViewById(R.id.menu_item_2);
        String menuItem2 =textView2.getText().toString();
        Log.v("MainActivity",menuItem2);
        // Find third menu item TextView and print the text to the logs
        TextView textView3=(TextView) findViewById(R.id.menu_item_3);
        String menuItem3=textView3.getText().toString();
        Log.v("MainActivity",menuItem3);

    }
}