package com.example.giftideas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FilterActivity extends AppCompatActivity {
    private TextView priceTextView;
    private SeekBar priceSeekBar;
    private Spinner genderSpinner;
    private Spinner ageSpinner;
    private Spinner interestsSpinner;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        priceTextView = findViewById(R.id.priceTextView);
        priceSeekBar = findViewById(R.id.priceSeekBar);
        genderSpinner = findViewById(R.id.genderSpinner);
        ageSpinner = findViewById(R.id.ageSpinner);
        interestsSpinner = findViewById(R.id.interestsSpinner);
        searchButton = findViewById(R.id.searchButton);

        // Настройка значений для Spinner
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this,
                R.array.gender_options, android.R.layout.simple_spinner_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        ArrayAdapter<CharSequence> ageAdapter = ArrayAdapter.createFromResource(this,
                R.array.age_options, android.R.layout.simple_spinner_item);
        ageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ageSpinner.setAdapter(ageAdapter);

        ArrayAdapter<CharSequence> interestsAdapter = ArrayAdapter.createFromResource(this,
                R.array.interests_options, android.R.layout.simple_spinner_item);
        interestsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        interestsSpinner.setAdapter(interestsAdapter);

        // Обновление текста при изменении SeekBar
        priceSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                priceTextView.setText(String.format("Допустимая цена: %d ₽", progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FilterActivity.this, GiftListActivity.class); // GiftListActivity - это экран, где отображается список подарков
                intent.putExtra("gender", genderSpinner.getSelectedItem().toString());
                intent.putExtra("age", ageSpinner.getSelectedItem().toString());
                intent.putExtra("interests", interestsSpinner.getSelectedItem().toString());
                intent.putExtra("budget", priceSeekBar.getProgress());
                startActivity(intent);
            }
        });

    }
}