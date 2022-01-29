package com.rodhian.wisatariau;

import android.os.Parcel;
import android.os.Parcelable;

public class Wisata implements Parcelable {
    private String names;
    private String detail;
    private int photo;

    public  Wisata(){

    }

    protected Wisata(Parcel in) {
        names = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Wisata> CREATOR = new Creator<Wisata>() {
        @Override
        public Wisata createFromParcel(Parcel in) {
            return new Wisata(in);
        }

        @Override
        public Wisata[] newArray(int size) {
            return new Wisata[size];
        }
    };

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(names);
        parcel.writeString(detail);
        parcel.writeInt(photo);
    }
}
