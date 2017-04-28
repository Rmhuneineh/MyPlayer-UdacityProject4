package com.example.android.myplayer;

/**
 * Created by rmhuneineh on 28/04/2017.
 */

public class Album {
    private String mAlbumName;

    private String mArtistName;

    private int mAudioResourceId;

    /**
     * Constructor
     * @param albumName name of the album.
     * @param artistName name of the artist.
     * @param audioResourceId audio resource id.
     */
    public Album (String albumName, String artistName, int audioResourceId){
        mAlbumName = albumName;
        mArtistName = artistName;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Gets album name when called from another class.
     * @return mAlbumName
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Gets artist name when called from another class.
     * @return mArtistName
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Gets audio resource id when called from another class
     * @return mAudioResourceId
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Set album name to a String passed from another class.
     * @param album is the value of the parameter passed.
     */
    public void setAlbumName(String album) {
        mAlbumName = album;
    }

    /**
     * Set artist name to a String passed from another class.
     * @param artist is the value of the parameter passed.
     */
    public void setArtistName(String artist) {
        mArtistName = artist;
    }

    /**
     * Set audio resource id to an int passed from another class.
     * @param audio is the value of the parameter passed.
     */
    public void setAudioResourceId(int audio) {
        mAudioResourceId = audio;
    }
}
