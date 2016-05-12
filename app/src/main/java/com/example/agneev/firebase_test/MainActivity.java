package com.example.agneev.firebase_test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button b1,b2;
    Firebase mref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        textView = (TextView)findViewById(R.id.textView2);
        b1 = (Button)findViewById(R.id.sunny_but);
        b2 = (Button)findViewById(R.id.foggy_but);
        mref = new Firebase("https://flickering-heat-6171.firebaseio.com/");
        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                textView.setText(data);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
