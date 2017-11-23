package layout.baitap.com.phuotthu.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KIMANH on 11/8/2017.
 */

public class Database extends SQLiteOpenHelper{

    private Context context;
    private static final String DATABASE_NAME = "night_fury";

    private String SQLQuery = "CREATE TABLE user(Id INTEGER PRIMARY KEY AUTOINCREMENT, UserName VARCHAR(100), PassWord VARCHAR(100))";
    private String SQLQueryDiaDiem = "CREATE TABLE diadiem(Id INTEGER PRIMARY KEY AUTOINCREMENT, dia_diem VARCHAR(100),chitiet VARCHAR(10000),hinhanh VARCHAR(100))";

    public Database(Context context) {
        super(context, DATABASE_NAME, null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLQuery);
        sqLiteDatabase.execSQL(SQLQueryDiaDiem);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addUser(User user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("UserName",user.getUserName());
        values.put("PassWord",user.getPassWord());
        db.insert("user",null,values);
        db.close();

    }
    public void addDiaDiem(DiaDiem diaDiem){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("dia_diem",diaDiem.getDiaDiem());
        values.put("chitiet",diaDiem.getChiTiet());
        values.put("hinhanh",diaDiem.getHinhAnh());
        db.insert("diadiem",null,values);
        db.close();
    }
    public List<User> getAllUser(){
        List<User> ListUser = new ArrayList<>();
        String selectQuery = "SELECT * FROM user";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        if(cursor.moveToFirst()){
            do{
                User user = new User();
                user.setId(cursor.getInt(0));
                user.setUserName(cursor.getString(1));
                user.setPassWord(cursor.getString(2));
                ListUser.add(user);
            }while (cursor.moveToNext());
        }
        db.close();
        return ListUser;

    }
    public List<DiaDiem> getAllDiaDiem(){
        List<DiaDiem> ListDiaDiem = new ArrayList<>();
        String selectQuery = "SELECT * FROM diadiem";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        if(cursor.moveToFirst()){
            do {
                DiaDiem diaDiem = new DiaDiem();
                diaDiem.setId(cursor.getInt(0));
                diaDiem.setDiaDiem(cursor.getString(1));
                diaDiem.setChiTiet(cursor.getString(2));
                diaDiem.setHinhAnh(cursor.getString(3));
                ListDiaDiem.add(diaDiem);
            }while(cursor.moveToNext());
        }
        db.close();
        return ListDiaDiem;
    }

}
