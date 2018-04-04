package com.example.admin.fragmentproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppModel.adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, AppModel.cars);
    }

    public void occClicked(View view)
    {
        Button btn = ((Button)view);
        if (btn.getText().toString().equals("Open Car Creator"))
        {
            getSupportFragmentManager().beginTransaction().add(R.id.addCarFrame, new AddCarFragment(), "CREATOR").commit();
            btn.setText("Close Car Creator");
        }
        else
        {
            getSupportFragmentManager().beginTransaction().remove(getSupportFragmentManager().findFragmentByTag("CREATOR")).commit();
            btn.setText("Open Car Creator");
        }

    }

    public void ocvClicked(View view)
    {
        Button btn = ((Button)view);
        if (btn.getText().toString().equals("Open Cars Viewer"))
        {
            getSupportFragmentManager().beginTransaction().add(R.id.viewCarsFrame, new CarsFragment(), "VIEWER").commit();
            btn.setText("Close Cars Viewer");
        }
        else
        {
            getSupportFragmentManager().beginTransaction().remove(getSupportFragmentManager().findFragmentByTag("VIEWER")).commit();
            btn.setText("Open Cars Viewer");
        }
    }
}
