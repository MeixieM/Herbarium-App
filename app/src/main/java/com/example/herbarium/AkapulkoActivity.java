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

import com.example.herbarium.databinding.ActivityAkapulkoBinding;

import java.util.ArrayList;
import java.util.List;

public class AkapulkoActivity extends AppCompatActivity {
    TextView linkTextView;
    private ActivityAkapulkoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityAkapulkoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());


        linkTextView = findViewById(R.id.txtMore);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());


        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.m_a1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m_a2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m_a3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m_a4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m_a5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m_a6, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m_a7, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m_a8, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
    }
}