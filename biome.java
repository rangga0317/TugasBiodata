package com.example.ranggabiodata;

import android.os.Parcel;
import android.os.Parcelable;

public class biome implements Parcelable {

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    private String nim;
    private String nama;
    private String kelas;
    private String tanggal;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nim);
        dest.writeString(this.nama);
        dest.writeString(this.kelas);
        dest.writeString(this.tanggal);
    }

    public biome() {
    }

    protected biome(Parcel in) {
        this.nim = in.readString();
        this.nama = in.readString();
        this.kelas = in.readString();
        this.tanggal = in.readString();
    }

    public static final Parcelable.Creator<biome> CREATOR = new Parcelable.Creator<biome>() {
        @Override
        public biome createFromParcel(Parcel source) {
            return new biome(source);
        }

        @Override
        public biome[] newArray(int size) {
            return new biome[size];
        }
    };
}
