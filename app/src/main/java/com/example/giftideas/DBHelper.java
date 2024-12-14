package com.example.giftideas;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "gifts.db";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE gifts (id INTEGER PRIMARY KEY, name TEXT, gender TEXT, age TEXT, interests TEXT, price INTEGER)");

        // Примеры подарков для мужчин
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Наручные часы', 'Мужской', 'Взрослые', 'Технологии', 10000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Машинка на радиоуправлении', 'Мужской', 'Дети', 'Любой', 3000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Гантели', 'Мужской', 'Взрослые', 'Спорт', 4000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Электробритва', 'Мужской', 'Взрослые', 'Технологии', 5000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Кожаный ремень', 'Мужской', 'Взрослые', 'Любой', 3000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Игровая мышь', 'Мужской', 'Подростки', 'Технологии', 2500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Набор инструментов', 'Мужской', 'Взрослые', 'Любой', 5000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Футбольный мяч', 'Мужской', 'Дети', 'Спорт', 1500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Гоночный трек', 'Мужской', 'Дети', 'Любой', 4000)");

        // Примеры подарков для женщин
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Косметический набор', 'Женский', 'Взрослые', 'Любой', 2000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Плюшевая игрушка', 'Женский', 'Дети', 'Любой', 1200)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Фен', 'Женский', 'Взрослые', 'Технологии', 3500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Сумка', 'Женский', 'Подростки', 'Любой', 2500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Шелковый шарф', 'Женский', 'Взрослые', 'Любой', 3000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Палетка теней', 'Женский', 'Взрослые', 'Любой', 3500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Танцевальный коврик', 'Женский', 'Подростки', 'Спорт', 2500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Рюкзак', 'Женский', 'Подростки', 'Любой', 4000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Игровая кухня', 'Женский', 'Дети', 'Любой', 3000)");


        // Уникальные подарки для всех полов
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Книга', 'Любой', 'Подростки', 'Книги', 500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Беспроводные наушники', 'Любой', 'Взрослые', 'Технологии', 7000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Конструктор LEGO', 'Любой', 'Дети', 'Игры''Любой', 3500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Пазлы', 'Любой', 'Дети', 'Любой', 1000)");

        // Подарки для разных возрастов и интересов
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Спортивная бутылка', 'Любой', 'Взрослые', 'Спорт', 800)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Настольная игра', 'Любой', 'Подростки', 'Любой', 2500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Электросамокат', 'Любой', 'Подростки', 'Технологии', 15000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Смарт-часы', 'Любой', 'Взрослые', 'Технологии', 12000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Музыкальный инструмент', 'Любой', 'Дети', 'Любой', 3500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Настольный хоккей', 'Любой', 'Дети', 'Любой', 4000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Мягкий мяч', 'Любой', 'Дети', 'Спорт', 1200)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Книга с картинками', 'Любой', 'Дети', 'Книги', 800)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Игровая палатка', 'Любой', 'Дети', 'Любой', 3000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Электронная книга', 'Любой', 'Подростки', 'Книги', 7000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Роликовые коньки', 'Любой', 'Подростки', 'Спорт', 4500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Пауэрбанк', 'Любой', 'Подростки', 'Технологии', 2500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Гитара', 'Любой', 'Подростки', 'Музыка', 9000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Рюкзак для походов', 'Любой', 'Подростки', 'Спорт', 3500)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Кофемашина', 'Любой', 'Взрослые', 'Любой', 15000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Электрический гриль', 'Любой', 'Взрослые', 'Любой', 10000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Йога-коврик', 'Любой', 'Взрослые', 'Спорт', 2000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Дорожный чемодан', 'Любой', 'Взрослые', 'Любой', 8000)");
        db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('Набор для пикника', 'Любой', 'Взрослые', 'Любой', 5000)");

        for (int i = 1; i <= 40; i++) {
            String name = "Подарок №" + i;
            String gender = (i % 2 == 0) ? "Мужской" : "Женский";
            String age = (i % 3 == 0) ? "Дети" : (i % 2 == 0) ? "Взрослые" : "Подростки";
            String interests = (i % 5 == 0) ? "Игрушки" : (i % 3 == 0) ? "Технологии" : "Книги";
            int price = 500 + (i * 100);
            db.execSQL("INSERT INTO gifts (name, gender, age, interests, price) VALUES ('" + name + "', '" + gender + "', '" + age + "', '" + interests + "', " + price + ")");
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS gifts");
        onCreate(db);
    }

    // Method to get unique values for a specific column (e.g., gender, age, interests)
    public List<String> getUniqueValues(String column) {
        SQLiteDatabase db = this.getReadableDatabase();
        List<String> values = new ArrayList<>();
        Cursor cursor = db.rawQuery("SELECT DISTINCT " + column + " FROM gifts", null);
        if (cursor.moveToFirst()) {
            do {
                values.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        cursor.close();
        return values;
    }

    // Метод для нахождения подарков в базе
    public List<String> getFilteredGifts(String gender, String age, String interests, int budget) {
        List<String> gifts = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        String query = "SELECT name FROM gifts WHERE gender = ? AND age = ? AND interests LIKE ? AND price <= ?";
        Cursor cursor = db.rawQuery(query, new String[]{gender, age, "%" + interests + "%", String.valueOf(budget)});

        if (cursor.moveToFirst()) {
            do {
                gifts.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();

        return gifts;
    }
}
