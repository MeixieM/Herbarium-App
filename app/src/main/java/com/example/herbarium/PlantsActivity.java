package com.example.herbarium;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class PlantsActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageView ampalaya, akapulko, balbas_pusa, bayabas, lagundi, malunggay, niyog_niyogan, oregano, sambong, tsaang_gubat, ulasimang_bato, yerba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.plants);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.plants:
                        return true;
                    case R.id.camera:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.more:
                        startActivity(new Intent(getApplicationContext(),MoreActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return true;
            }
        });

        akapulko = (ImageView) findViewById(R.id.akapulko);
        ampalaya = (ImageView) findViewById(R.id.ampalaya);
        balbas_pusa = (ImageView) findViewById(R.id.balbas_pusa);
        bayabas = (ImageView) findViewById(R.id.bayabas);
        lagundi = (ImageView) findViewById(R.id.lagundi);
        malunggay = (ImageView) findViewById(R.id.malunggay);
        niyog_niyogan = (ImageView) findViewById(R.id.niyog_niyogan);
        oregano = (ImageView) findViewById(R.id.oregano);
        sambong = (ImageView) findViewById(R.id.sambong);
        tsaang_gubat = (ImageView) findViewById(R.id.tsaang_gubat);
        ulasimang_bato = (ImageView) findViewById(R.id.ulasimang_bato);
        yerba = (ImageView) findViewById(R.id.yerba);

        akapulko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, AkapulkoActivity.class);
                startActivity(intent);
            }
        });

        ampalaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, AmpalayaActivity.class);
                startActivity(intent);
            }
        });

        balbas_pusa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, BalbasPusaActivity.class);
                startActivity(intent);
            }
        });

        bayabas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, BayabasActivity.class);
                startActivity(intent);
            }
        });

        lagundi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, LagundiActivity.class);
                startActivity(intent);
            }
        });

        malunggay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, MalunggayActivity.class);
                startActivity(intent);
            }
        });

        niyog_niyogan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, NiyogNiyoganActivity.class);
                startActivity(intent);
            }
        });

        oregano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, OreganoActivity.class);
                startActivity(intent);
            }
        });

        sambong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, SambongActivity.class);
                startActivity(intent);
            }
        });

        tsaang_gubat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, TsaangGubatActivity.class);
                startActivity(intent);
            }
        });

        ulasimang_bato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, UlasimangBatoActivity.class);
                startActivity(intent);
            }
        });

        yerba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantsActivity.this, YerbaActivity.class);
                startActivity(intent);
            }
        });


    }
}