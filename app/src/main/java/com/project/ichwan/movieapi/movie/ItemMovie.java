package com.project.ichwan.movieapi.movie;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemMovie implements Parcelable {
    private String imgMovie;
    private String titleMovie;
    private String overMovie;
    private String langMovie;
    private String releaseMovie;
    private Double popularMovie;
    private String vcMovie;

    protected ItemMovie(Parcel in) {
        imgMovie = in.readString();
        titleMovie = in.readString();
        overMovie = in.readString();
        langMovie = in.readString();
        releaseMovie = in.readString();
        vcMovie = in.readString();
        popularMovie = (Double) in.readValue(Double.class.getClassLoader());
    }

    public static final Creator<ItemMovie> CREATOR = new Creator<ItemMovie>() {
        @Override
        public ItemMovie createFromParcel(Parcel in) {
            return new ItemMovie(in);
        }

        @Override
        public ItemMovie[] newArray(int size) {
            return new ItemMovie[size];
        }
    };

    public String getImgMovie() {
        return imgMovie;
    }

    public void setImgMovie(String imgMovie) {
        this.imgMovie = imgMovie;
    }

    public String getTitleMovie() {
        return titleMovie;
    }

    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public String getOverMovie() {
        return overMovie;
    }

    public void setOverMovie(String overMovie) {
        this.overMovie = overMovie;
    }

    public String getLangMovie() {
        return langMovie;
    }

    public void setLangMovie(String langMovie) {
        this.langMovie = langMovie;
    }

    public String getReleaseMovie() {
        return releaseMovie;
    }

    public void setReleaseMovie(String releaseMovie) {
        this.releaseMovie = releaseMovie;
    }

    public Double getPopularMovie() {
        return popularMovie;
    }

    public void setPopularMovie(Double popularMovie) {
        this.popularMovie = popularMovie;
    }

    public String getVcMovie() {
        return vcMovie;
    }

    public void setVcMovie(String vcMovie) {
        this.vcMovie = vcMovie;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(imgMovie);
        dest.writeString(titleMovie);
        dest.writeString(overMovie);
        dest.writeString(langMovie);
        dest.writeString(releaseMovie);
        dest.writeString(vcMovie);
        dest.writeValue(popularMovie);
    }

}
