package com.example.herbarium;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.example.herbarium.databinding.ActivityUlasimangBatoBinding;

import java.util.ArrayList;
import java.util.List;

public class UlasimangBatoActivity extends AppCompatActivity {
    TextView linkTextView;

    private ActivityUlasimangBatoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityUlasimangBatoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        linkTextView = findViewById(R.id.txtMore);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.ul_1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ul_2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ul_3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ul_4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ul_5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ul_6, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ul_7, ScaleTypes.FIT));


        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
    }
}