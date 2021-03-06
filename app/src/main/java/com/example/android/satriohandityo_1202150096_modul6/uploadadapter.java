package com.example.android.satriohandityo_1202150096_modul6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tyo on 01/04/18.
 */

public class UploadAdapter extends RecyclerView.Adapter<UploadAdapter.ImageViewHolder> {

    private List<UploadModel> mUpload;
    private Context mContext;
    private UploadModel mCurrentUpload;

    UploadAdapter(Context context, List<UploadModel> upload){
        mUpload = upload;
        mContext = context;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list_profile, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        mCurrentUpload = mUpload.get(position);

        holder.mTitle.setText(mCurrentUpload.getmTitle());
        holder.mCaption.setText(mCurrentUpload.getmCaption());
        holder.mEmail.setText(mCurrentUpload.getmEmail());
        Picasso.get()
                .load(mCurrentUpload.getmUrl())
                .fit()
                .centerCrop()
                .into(holder.mImage);

    }

    @Override
    public int getItemCount() {
        return mUpload.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{

        public TextView mEmail;
        private TextView mTitle;
        private TextView mCaption;
        private ImageView mImage;

        public ImageViewHolder(View itemView) {
            super(itemView);

            mEmail = itemView.findViewById(R.id.email);
            mTitle = itemView.findViewById(R.id.titlePost);
            mCaption = itemView.findViewById(R.id.captionPost);
            mImage = itemView.findViewById(R.id.imageViewUploaded);
        }
    }
}
