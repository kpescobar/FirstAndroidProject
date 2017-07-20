package edu.cnm.bootcamp.kelly.firstandroidproject;

import android.app.Application;
import edu.cnm.bootcamp.kelly.firstandroidproject.api.API;
import edu.cnm.bootcamp.kelly.firstandroidproject.objects.GalleryResponse;
import edu.cnm.bootcamp.kelly.firstandroidproject.objects.Image;
import java.util.List;
import rx.SingleSubscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

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





















