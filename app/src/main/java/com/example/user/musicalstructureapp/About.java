package com.example.user.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_about.xml layout file
        setContentView(R.layout.activity_about);

        // Find the View that shows the Albums category
        TextView albums = (TextView) findViewById(R.id.albums);

            // Set a click listener on that View
            albums.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the Albums category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link Albums}
                    Intent albumsIntent = new Intent(About.this, Albums.class);

                    // Start the new activity
                    startActivity(albumsIntent);
                }
            });

        // Find the View that shows the Songs category
        TextView songs = (TextView) findViewById(R.id.songs);

            // Set a click listener on that View
            songs.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the Songs category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link Songs}
                    Intent songsIntent = new Intent(About.this, Songs.class);

                    // Start the new activity
                    startActivity(songsIntent);
                }
            });

        // Find the View that shows the Store category
        TextView store = (TextView) findViewById(R.id.store);

            // Set a click listener on that View
            store.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the phrases category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link Store}
                    Intent storeIntent = new Intent(About.this, Store.class);

                    // Start the new activity
                    startActivity(storeIntent);
                }
            });

        // Find the View that shows the Main category
        TextView main = (TextView) findViewById(R.id.back_to_main);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Main}
                Intent mainIntent = new Intent(About.this, MainActivity.class);

                // Start the new activity
                startActivity(mainIntent);
            }
        });
        }
}