package Model;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ZIPPER on 7/19/2017.
 */

public class Database {

        SharedPreferences prefs;
        SharedPreferences.Editor editor;
        Context ctx;

        public Database(Context ctx) {
            this.ctx = ctx;
            prefs = ctx.getSharedPreferences("myapp", Context.MODE_PRIVATE);
            editor = prefs.edit();
        }

        public void setLoggedin(boolean logggedin) {
            editor.putBoolean("loggedInmode", logggedin);
            editor.commit();
        }

        public boolean loggedin() {
            return prefs.getBoolean("loggedInmode", false);
        }
    }
