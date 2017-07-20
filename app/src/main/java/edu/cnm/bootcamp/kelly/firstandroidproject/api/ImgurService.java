package edu.cnm.bootcamp.kelly.firstandroidproject.api;

import edu.cnm.bootcamp.kelly.firstandroidproject.objects.GalleryResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Single;

/**
 * Created by kelly on 7/14/17.
 */

public interface ImgurService {
  @GET("gallery/r/{subreddit}/{sort}/{window}/{page}")
  Single<GalleryResponse> subredditGallery(
      @Path("subreddit") String subreddit,
      @Path("sort") String sort,
      @Path("window") String window,
      @Path("page") int page
  );

}
