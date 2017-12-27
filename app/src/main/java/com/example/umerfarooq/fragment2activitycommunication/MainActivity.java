package com.example.umerfarooq.fragment2activitycommunication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SampleFragment.OnFragmentInteractionListener{
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.TextView);


    }

    @Override
    public void onFragmentInteraction(String Message) {
        t1.setText(Message);

    }
}
