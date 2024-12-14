package com.example.giftideas;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class GiftListActivity extends AppCompatActivity {

    private ListView giftListView;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift_list);

        ListView giftListView = findViewById(R.id.giftListView);
        TextView emptyTextView = findViewById(R.id.emptyTextView);
        giftListView.setEmptyView(emptyTextView);

        Intent intent = getIntent();
        String gender = intent.getStringExtra("gender");
        String age = intent.getStringExtra("age");
        String interests = intent.getStringExtra("interests");
        int budget = intent.getIntExtra("budget", 0);

        DBHelper dbHelper = new DBHelper(this);
        List<String> gifts = dbHelper.getFilteredGifts(gender, age, interests, budget);

        if (gifts.isEmpty()) {
            // Показать сообщение "Ничего не найдено"
            emptyTextView.setVisibility(View.VISIBLE);
        } else {
            // Отобразить список подарков
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, gifts);
            giftListView.setAdapter(adapter);
        }
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbHelper.close();
    }
}