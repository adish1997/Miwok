package com.example.android.miwok;

/**
 * Created by ADMIN on 01-05-2018.
 */

public class Word {


        private String mDefaultTranslation;
        private String mMiwokTranslation;
        private int mImageResourceId = NO_IMAGE_PROVIDED;
        private int mMediaResourceId;
        public static final int NO_IMAGE_PROVIDED = -1;

        public Word(String defaultTranslation , String miwokTranslation, int mediaId ){

            mDefaultTranslation = defaultTranslation;
            mMiwokTranslation = miwokTranslation;
            mMediaResourceId = mediaId;
        }

    /**
     +     * Create a new Word object.
     +     *
     +     * @param defaultTranslation is the word in a language that the user is already familiar with
     +     *                           (such as English)
     +     * @param miwokTranslation is the word in the Miwok language
     +     * @param imageResourceId is the drawable resource ID for the image associated with the word
     +     *
     +     */
        public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int mediaId) {
            mDefaultTranslation = defaultTranslation;
            mMiwokTranslation = miwokTranslation;
            mImageResourceId = imageResourceId;
            mMediaResourceId = mediaId;
            }

        public String getDefaultTranslation() {

            return mDefaultTranslation;
        }

        public String getMiwokTranslation() {

            return mMiwokTranslation;
        }

    public int getImageResourceId() {

        return mImageResourceId;
    }

    //returns id of the media file

    public int getMediaResourceId() {

        return mMediaResourceId;
    }

    /**
     +     * Returns whether or not there is an image for this word.
     +     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
