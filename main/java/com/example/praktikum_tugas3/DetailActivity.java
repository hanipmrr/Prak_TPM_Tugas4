package com.example.praktikum_tugas3;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.example.praktikum_tugas3.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ImageView img       = findViewById(R.id.iv_img);
        TextView nameTxt    = findViewById(R.id.tv_name);
        TextView visionTxt   = findViewById(R.id.tv_vision);
        TextView summaryTxt = findViewById(R.id.tv_summary);

        Bundle extras = getIntent().getExtras();

        String images  = extras.getString("IMAGE_KEY");
        String name    = extras.getString("NAME_KEY");
        String vision  = extras.getString("VISION_KEY");
        String summary = extras.getString("SUMMARY_KEY");

        setTitle("Detail "+ name);

        img.setImageURI(Uri.parse(images));
        Glide.with(this)
                .load(images)
                .into(img);

        nameTxt.setText(name);
        visionTxt.setText(vision);
        summaryTxt.setText(summary);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}