package com.example.amey.listit;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
FloatingActionButton fab;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab= (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FragmentManager manager=getFragmentManager();
           Create_list_dialog_fragment create_list_dialog_fragment=new Create_list_dialog_fragment();
            create_list_dialog_fragment.show(manager,"create_list_fragment_manager");

        }
    });
    }
}



