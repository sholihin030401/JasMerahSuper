package com.project.ichwan.movieapi.tv;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemTvshow implements Parcelable {
    private String imgTvshow;
    private String titleTvshow;
    private String overTvshow;
    private String langTvshow;
    private String releaseTvshow;
    private Double popularTvshow;
    private String vcTvshow;

    protected ItemTvshow(Parcel in) {
        imgTvshow = in.readString();
        titleTvshow = in.readString();
        overTvshow = in.readString();
        langTvshow = in.readString();
        releaseTvshow = in.readString();
        popularTvshow = (Double) in.readValue(Double.class.getClassLoader());
        vcTvshow = in.readString();
    }

    public static final Creator<ItemTvshow> CREATOR = new Creator<ItemTvshow>() {
        @Override
        public ItemTvshow createFromParcel(Parcel in) {
            return new ItemTvshow(in);
        }

        @Override
        public ItemTvshow[] newArray(int size) {
            return new ItemTvshow[size];
        }
    };

    public String getImgTvshow() {
        return imgTvshow;
    }

    public void setImgTvshow(String imgTvshow) {
        this.imgTvshow = imgTvshow;
    }

    public String getTitleTvshow() {
        return titleTvshow;
    }

    public void setTitleTvshow(String titleTvshow) {
        this.titleTvshow = titleTvshow;
    }

    public String getOverTvshow() {
        return overTvshow;
    }

    public void setOverTvshow(String overTvshow) {
        this.overTvshow = overTvshow;
    }

    public String getLangTvshow() {
        return langTvshow;
    }

    public void setLangTvshow(String langTvshow) {
        this.langTvshow = langTvshow;
    }

    public String getReleaseTvshow() {
        return releaseTvshow;
    }

    public void setReleaseTvshow(String releaseTvshow) {
        this.releaseTvshow = releaseTvshow;
    }

    public Double getPopularTvshow() {
        return popularTvshow;
    }

    public void setPopularTvshow(Double popularTvshow) {
        this.popularTvshow = popularTvshow;
    }

    public String getVcTvshow() {
        return vcTvshow;
    }

    public void setVcTvshow(String vcTvshow) {
        this.vcTvshow = vcTvshow;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(imgTvshow);
        dest.writeString(titleTvshow);
        dest.writeString(overTvshow);
        dest.writeString(langTvshow);
        dest.writeString(releaseTvshow);
        dest.writeString(vcTvshow);
        dest.writeValue(popularTvshow);
    }
}
