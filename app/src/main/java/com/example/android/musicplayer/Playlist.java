package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Playlist {

        //Name of Artist
        private String artistName;
        //Title of the song
        private String trackName;
        //Title of the album
        private String albumName;

        private int imageResource;

        public Playlist(String artistName, String trackName, int imageResourceId) {
            this.artistName = artistName;
            this.trackName = trackName;
            this.imageResource = imageResourceId;
        }

            public  String getArtistName(){
                return artistName;
        }

            public String getTrackName(){
                return trackName;
            }

            public int getImageResource(){
                return imageResource;
            }




    }//Music

