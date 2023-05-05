package com.ojun.ojun;

import android.widget.ImageView;

public class ItemPhotocopy {

    String namaPhotoCopy, deskripsiPhotoCopy, diskonPhotoCopy;
    int img;

    public ItemPhotocopy(String namaPhotoCopy, String deskripsiPhotoCopy, String diskonPhotoCopy, int img) {
        this.namaPhotoCopy = namaPhotoCopy;
        this.deskripsiPhotoCopy = deskripsiPhotoCopy;
        this.diskonPhotoCopy = diskonPhotoCopy;
        this.img = img;
    }

    public String getNamaPhotoCopy() {
        return namaPhotoCopy;
    }

    public void setNamaPhotoCopy(String namaPhotoCopy) {
        this.namaPhotoCopy = namaPhotoCopy;
    }

    public String getDeskripsiPhotoCopy() {
        return deskripsiPhotoCopy;
    }

    public void setDeskripsiPhotoCopy(String deskripsiPhotoCopy) {
        this.deskripsiPhotoCopy = deskripsiPhotoCopy;
    }

    public String getDiskonPhotoCopy() {
        return diskonPhotoCopy;
    }

    public void setDiskonPhotoCopy(String diskonPhotoCopy) {
        this.diskonPhotoCopy = diskonPhotoCopy;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

}
