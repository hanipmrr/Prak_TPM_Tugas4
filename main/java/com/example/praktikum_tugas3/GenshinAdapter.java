package com.example.praktikum_tugas3;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.praktikum_tugas3.R;
import com.example.praktikum_tugas3.GenshinModel;
import com.example.praktikum_tugas3.DetailActivity;

import java.time.Instant;
import java.util.ArrayList;

public class GenshinAdapter extends RecyclerView.Adapter<GenshinAdapter.GenshinViewHolder> {
    private ArrayList<GenshinModel> listGenshin;
    private Context context;

    public GenshinAdapter(ArrayList<GenshinModel> dataList, Context context) {
        this.listGenshin = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public GenshinViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_item, parent, false);
        return new GenshinViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GenshinViewHolder holder, int position) {
        String image    = listGenshin.get(position).getImage();
        String name     = listGenshin.get(position).getName();
        String vision     = listGenshin.get(position).getVision();
        String summary  = listGenshin.get(position).getSummary();

        Glide.with(holder.itemView.getContext())
                .load(listGenshin.get(position).getImage())
                .into(holder.image);

        holder.name.setText(name);
        holder.vision.setText(vision);
        holder.summary.setText(summary);

        try {

            holder.btnPreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openDetailActivity(image, name, vision, summary);
                }
            });

            holder.btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareGenshin(name, summary);
                }
            });
        }catch (Exception e) {
            Log.d("DetailActivity", "MyErr : " + e);
        }
    }

    @Override
    public int getItemCount() {
        return (listGenshin != null) ? listGenshin.size() : 0;
    }


    public static class GenshinViewHolder extends RecyclerView.ViewHolder {

        private final ImageView image;
        private final TextView name, vision, summary;
        private final Button btnPreview, btnShare;

        public GenshinViewHolder(View itemView) {
            super(itemView);
            image      = (ImageView) itemView.findViewById(R.id.iv_img);
            name       = (TextView) itemView.findViewById(R.id.tv_name);
            vision     = (TextView) itemView.findViewById(R.id.tv_vision);
            summary    = (TextView) itemView.findViewById(R.id.tv_summary);
            btnPreview = (Button) itemView.findViewById(R.id.btnPreview);
            btnShare   = (Button) itemView.findViewById(R.id.btnShare);
        }
    }

    public void openDetailActivity(@NonNull String ...Genshin) {
        Intent i = new Intent(context, DetailActivity.class);
        i.putExtra("IMAGE_KEY", Genshin[0]);
        i.putExtra("NAME_KEY", Genshin[1]);
        i.putExtra("vision_KEY", Genshin[2]);
        i.putExtra("SUMMARY_KEY", Genshin[3]);
        context.startActivity(i);
    }

    public void shareGenshin(@NonNull String ...Genshin) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, Genshin[0] + "\n\n" + Genshin[1]);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        context.startActivity(shareIntent);
    }
}