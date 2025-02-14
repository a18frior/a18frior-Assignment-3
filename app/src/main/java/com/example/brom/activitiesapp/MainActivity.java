package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private String[] mountainLocations = {"Alps","Alps","Alaska"};
    private int[] mountainHeights ={4478,4808,6190};
    Mountain m = new Mountain("Matterhorn", "Alps", 4478);
    Mountain m2 = new Mountain("Mont Blanc", "Alps", 4808);
    Mountain m3 = new Mountain("Denali", "Alaska", 6190);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> berg = new ArrayList<String>(Arrays.asList(mountainNames));

        final ArrayList<Mountain> berg2=new ArrayList<>();



            berg2.add(m);
            berg2.add(m2);
            berg2.add(m3);

            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.list_item_textview, R.id.fridasItem, berg);
            ListView lista= findViewById(R.id.fridaslist);
            lista.setAdapter(adapter1);

            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent appInfo = new Intent(MainActivity.this, MountainDetailsActivity.class);

                            appInfo.putExtra("berget", berg2.get(position).info());





                    startActivity(appInfo);
                }
            });


        // 1. Create a ListView as in previous assignment
        // 2. Create a new activity named "MountainDetailsActivity
        // 3. Create a new Layout file for the MountainDetailsActivity called
        //    "activity_mountaindetails". MountainDetailsActivity must have MainActivity as its
        //    ´parent activity.
        // 4. The layout file created in step 3 must have a LinearLayout
        // 5. The layout file created in step 3 must be able to display
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 6. When tapping on a list item: create an Intent that includes
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 7. Display the MountainDetailsActivity with the data from the Intent created in step
        //    6
        // 8. From the MountainDetailsActivity you should have an option to "go back" using an
        //    left arro button. This is done by letting the MainActivity be the parent activity to
        //    MountainDetailsActivity.
    }
}
