/**
 * Created by dnastri on 9/1/16.
 */

package com.example.android.musicplaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);

        // Find the View that shows the songDetail category
        TextView musicLibrary = (TextView) findViewById(R.id.musicLibrary);
        // Set a click listener on that View
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongDetailActivity}
                Intent numbersIntent = new Intent(SongDetailActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the equalizer category
        TextView equalizer = (TextView) findViewById(R.id.equalizer);
        // Set a click listener on that View
        equalizer.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EqualizerActivity}
                Intent numbersIntent = new Intent(SongDetailActivity.this, EqualizerActivity.class);
                // Start the new activity
                startActivity(numbersIntent);
            }
        });

    }
}