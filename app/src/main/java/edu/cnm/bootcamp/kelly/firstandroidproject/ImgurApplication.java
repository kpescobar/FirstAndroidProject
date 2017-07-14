package edu.cnm.bootcamp.kelly.firstandroidproject;

import android.app.Application;
import edu.cnm.bootcamp.kelly.firstandroidproject.api.API;

/**
 * Created by kelly on 7/14/17.
 */

public class ImgurApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    API.init();
  }
}
