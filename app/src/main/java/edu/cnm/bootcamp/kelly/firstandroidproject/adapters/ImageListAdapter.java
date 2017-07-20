package edu.cnm.bootcamp.kelly.firstandroidproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import edu.cnm.bootcamp.kelly.firstandroidproject.R;
import edu.cnm.bootcamp.kelly.firstandroidproject.objects.Image;
import java.util.List;

/**
 * Created by kelly on 7/20/17.
 */

public class ImageListAdapter extends BaseAdapter {
  private List<Image> mImages;
  private Context mContext;

  public ImageListAdapter(Context context, List<Image> images) {
    mContext = context;
    mImages = images;
  }

  @Override
  public int getCount() {
    return (mImages != null) ? mImages.size() : 0;
  }

  @Override
  public Object getItem(int position) {
    return (mImages != null && position < mImages.size())
        ? mImages.get(position)
        : null;
  }

  @Override
  public long getItemId(int position) {
    return 0;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    if (convertView == null) {
      convertView = LayoutInflater.from(mContext)
          .inflate(R.layout.image_list_item, parent, false);
    }

    Image image = (Image)getItem(position);
    TextView txtImageTitle =(TextView)convertView.findViewById(R.id.txtImageTitle);
    if (image != null && txtImageTitle != null) {
        txtImageTitle.setText(image.getTitle());
    }

    return convertView;
  }
}




























