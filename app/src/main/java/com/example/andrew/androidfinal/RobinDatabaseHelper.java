package com.example.andrew.androidfinal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Robin on 3/7/2018.
 */

public class RobinDatabaseHelper extends SQLiteOpenHelper {
//    public static final String DATABASE_NAME = "Messages.db";
//
//    public static final int VERSION_NUM = 4;
//
//    public static final String TABLE_NAME = "myTable";
//
//    public static final String KEY_ID = "id";
//
//    public static final String KEY_QUIZ = "quiz";


    static final String DATABASE_NAME = "QUIZ_DATA";
    private static int VERSION_NUM = 1;
    static final String ID_COLUMN = " _id";
    static final String QUESTION_TYPE = "QUESTION_TYPE";
    static final String ANSWER = "USER_ANSWER";
    static final String RIGHT_ANSWER = "RIGHT_ANSWER";
//    public static String databaseName;

    RobinDatabaseHelper(Context ctx) {

        super(ctx, DATABASE_NAME, null, VERSION_NUM);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE "+ DATABASE_NAME + " ("
                + ID_COLUMN + " INTEGER PRIMARY KEY autoincrement, "+
                QUESTION_TYPE + " TEXT, " +
                ANSWER + " TEXT," +
                RIGHT_ANSWER + " TEXT);" );

        Log.i("QuizResultsData", "Calling onCreate");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_NAME + ";");
        onCreate(db);

        Log.i("QuizResultsData", "Calling onUpgrade, oldVersion=" + oldVersion + " newVersion=" + newVersion);

    }

}