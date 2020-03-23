package com.example.travelblog.database;

import androidx.room.*;

import com.example.travelblog.http.*;

@Database(entities = {Blog.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BlogDAO blogDao();
}
