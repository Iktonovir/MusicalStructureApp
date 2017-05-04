package com.example.user.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_songs.xml layout file
        setContentView(R.layout.activity_songs);

        // Find the View that shows the About category
        TextView about = (TextView) findViewById(R.id.about);

        // Set a click listener on that View
        about.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the About category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link About}
                Intent albumsIntent = new Intent(Songs.this, About.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the Albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Albums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Albums}
                Intent albumsIntent = new Intent(Songs.this, Albums.class);

                // Start the new activity
                startActivity(albumsIntent);
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
                Intent storeIntent = new Intent(Songs.this, Store.class);

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
                Intent mainIntent = new Intent(Songs.this, MainActivity.class);

                // Start the new activity
                startActivity(mainIntent);
            }
        });
    }
}