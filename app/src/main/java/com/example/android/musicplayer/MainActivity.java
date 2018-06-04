package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a list of tracks
        ArrayList<Playlist> myTrackList = new ArrayList<Playlist>();
        myTrackList.add(new Playlist("Superorganism", "Night Time", R.drawable.image));
        myTrackList.add(new Playlist("Superorganism", "It's All Good", R.drawable.image));
        myTrackList.add(new Playlist("Superorganism", "Everybody Wants To Be Famous", R.drawable.image));
        myTrackList.add(new Playlist("Superorganism", "Nobody Cares", R.drawable.image));
        myTrackList.add(new Playlist("Superorganism", "Night Time", R.drawable.image));
        myTrackList.add(new Playlist("Superorganism", "Reflection On The Screen", R.drawable.image));
        myTrackList.add(new Playlist("Superorganism", "Something for your M.I.N.D.", R.drawable.image));
        myTrackList.add(new Playlist("Superorganism", "Reflection On The Screen", R.drawable.image));
        myTrackList.add(new Playlist("Superorganism", "Relax", R.drawable.image));

       //Create adapter for myTrackList
        Adapter playlistAdapter = new Adapter(this, myTrackList);

        // Connecting this adapter to a ListView
        final ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(playlistAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //setting intent for now playing music
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object listItem = listView.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(intent);
                TextView artist = findViewById(R.id.current_song_name);
                artist.setText(Playlist.get(position).getTrackName());
                TextView song = findViewById(R.id.current_song_artist );
                song.setText(Playlist.get(position).getArtistName());
            }
        });




    }

}