package com.pruebacrizz.pruebacrizz.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pruebacrizz.pruebacrizz.R;
import com.pruebacrizz.pruebacrizz.holder.PhotoViewHolder;
import com.pruebacrizz.pruebacrizz.model.PhotoItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis- on 21/03/2018.
 */

public class PhotoAdapter extends RecyclerView.Adapter<PhotoViewHolder> {
    private List<PhotoItem> mListItems;

    private Context mContext;


    public PhotoAdapter(Context context) {
        this.mContext = context;
        mListItems = new ArrayList<>();

    }


    private static final String PERMISSION = "publish_actions";

    @Override
    public PhotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_photo_adapter,
                parent, false);


        return new PhotoViewHolder(itemView, mContext);

    }

    @Override
    public void onBindViewHolder(PhotoViewHolder holder, int position) {

        PhotoItem photoItem = mListItems.get(position);

        try {

            Picasso.with(mContext)
                    .load("file://" + photoItem.getImagen()).config(Bitmap.Config.RGB_565).into(holder.mphoto_item);

        } catch (Exception e) {
            Log.d("este", e.getMessage());
        }



    }


    @Override
    public int getItemCount() {
        return mListItems.size();
    }

    public void add(List<PhotoItem> list) {
        this.mListItems.clear();
        this.mListItems.addAll(list);
        this.notifyDataSetChanged();
    }



    public void add(PhotoItem item) {
        this.mListItems.add(item);
        this.notifyDataSetChanged();
    }



    public PhotoItem getItem(int position) {
        return mListItems.get(position);
    }

}
