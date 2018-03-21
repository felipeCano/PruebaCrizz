package com.pruebacrizz.pruebacrizz.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.pruebacrizz.pruebacrizz.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by luis- on 21/03/2018.
 */

public class PhotoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

    @BindView(R.id.item_photo_container)
    public View mViewContainer;

    @BindView(R.id.photo_item)
    public ImageView mphoto_item;


    private Context mContext;


    public PhotoViewHolder(View itemView, Context mContext) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        this.mContext = mContext;
        mViewContainer.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

    }
}
