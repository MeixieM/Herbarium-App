package com.example.herbarium;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Button buttonhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.balbas_pusa,"\t Balbas-pusa \n\t Orthosiphon aristatus",ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.lagundi,"\t Lagundi \n\t Vitex negundo",ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.sambong,"\t Sambong \n\t Blumea balsamifera",ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.tsaang_gubat,"\t Tsaang Gubat \n\t Carmona retusa",ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.yerba,"\t Yerba \n\t Clinopodium douglasii",ScaleTypes.FIT));


        imageSlider.setImageList(slideModels,ScaleTypes.FIT);

        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.home);

        buttonhome = findViewById(R.id.buttonhome);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.camera:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.more:
                        startActivity(new Intent(getApplicationContext(),MoreActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return true;
            }
        });

        buttonhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TipsActivity.class);
                startActivity(intent);
            }
        });

    }
}