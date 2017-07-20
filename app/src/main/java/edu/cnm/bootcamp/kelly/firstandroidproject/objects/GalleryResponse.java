package edu.cnm.bootcamp.kelly.firstandroidproject.objects;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kelly on 7/20/17.
 */

public class GalleryResponse {
    @SerializedName("success")
    boolean success;

    @SerializedName("status")
    int status;

    @SerializedName("data")
    List<Image> data;

    public boolean getSuccess() {
      return success;
    }

    public boolean isSuccess() {
      return success;
    }

    public int getStatus() {
      return status;
    }

    public List<Image> getData() {
      return data;
    }
}























