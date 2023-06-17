package com.app21efullpyramidfinal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDBHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "College";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_1 = "student";
    private static final String  KEY_ID = "id"  ;
    private static final String  KEY_NAME = "name"  ;
    private static final String  KEY_CONTACT = "contact" ;


    public MyDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//  CREATE TABLE TABLE_NAME (ID int primary key AUTOINCREMENT , name TEXT , contactNo TEXT)
        String query = "CREATE TABLE " + TABLE_1 + " (" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_NAME + " TEXT," + KEY_CONTACT+ " TEXT)";
        sqLiteDatabase.execSQL(query);

  }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_1);
        onCreate(db);
    }

    public void addData( String name , String contact)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, name);
        values.put(KEY_CONTACT,contact);
        database.insert(TABLE_1 , null, values );
        database.close();

    }

}
