package ru.synergy.fragmentlivecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;

import ru.synergy.fragmentlivecycleexample.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    Button fragmentButton1, fragmentButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentButton1 = (Button) findViewById(R.id.buttonFragment1);
        fragmentButton2 = (Button) findViewById(R.id.buttonFragment2);

        //Fragment specific
        //get fragment manager to work with fragment's
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // add fragment to screen
        FirstFragment firstFragment = FirstFragment.newInstance("1", "2");
        fragmentTransaction.add(R.id.container, )
    }
}