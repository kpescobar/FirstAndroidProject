package edu.cnm.bootcamp.kelly.firstandroidproject.api;

import edu.cnm.bootcamp.kelly.firstandroidproject.objects.GalleryResponse;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Single;

/**
 * Created by kelly on 7/14/17.
 */

public class API {
    private static ImgurService mService;

    public static void init() {
      OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
      httpClient.readTimeout(60, TimeUnit.SECONDS);
      httpClient.connectTimeout(60, TimeUnit.SECONDS);

      Retrofit retrofit = new Retrofit.Builder()
          .baseUrl("https://api.imgur.com/3/")
          .addConverterFactory(GsonConverterFactory.create())
          .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
          .client(httpClient.build())
          .build();

      mService = retrofit.create(ImgurService.class);
    }

    public static Single<GalleryResponse> subredditGallery(String subreddit) {
      return mService.subredditGallery(subreddit, "time", "week", 0);
    }
}
































