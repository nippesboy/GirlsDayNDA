package com.example.girlsdaynda;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.girlsdaynda.R;
import com.example.girlsdaynda.ui.gallery.GalleryFragment;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(GalleryFragment.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.text_slideshow);
        textView.setText(message);
    }
}
