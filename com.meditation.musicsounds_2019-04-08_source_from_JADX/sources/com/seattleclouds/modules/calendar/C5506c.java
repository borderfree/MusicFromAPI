package com.seattleclouds.modules.calendar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.seattleclouds.util.C6614j;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.seattleclouds.modules.calendar.c */
public class C5506c extends SQLiteOpenHelper {
    public C5506c(Context context, String str) {
        super(context, str, null, 2);
        StringBuilder sb = new StringBuilder();
        sb.append("Using calendar database: ");
        sb.append(str);
        Log.v("DatabaseHelper", sb.toString());
    }

    /* renamed from: b */
    private ContentValues m27408b(String str, String str2, String str3, String str4, Date date, Date date2, boolean z, String str5, String str6, boolean z2, String str7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("recurring_event_id", str);
        contentValues.put("title", str2);
        contentValues.put("category", str3);
        contentValues.put("location", str4);
        contentValues.put("start_date", Long.valueOf(date.getTime()));
        contentValues.put("end_date", Long.valueOf(date2.getTime()));
        contentValues.put("is_all_day", Integer.valueOf(z ? 1 : 0));
        contentValues.put("case_number", str5);
        contentValues.put("reference", str6);
        contentValues.put("is_synced_event", Integer.valueOf(z2 ? 1 : 0));
        contentValues.put("description", str7);
        return contentValues;
    }

    /* renamed from: a */
    public int mo17841a(long j, String str, String str2, String str3, String str4, Date date, Date date2, boolean z, String str5, String str6) {
        return mo17842a(j, str, str2, str3, str4, date, date2, z, str5, str6, false, "");
    }

    /* renamed from: a */
    public int mo17842a(long j, String str, String str2, String str3, String str4, Date date, Date date2, boolean z, String str5, String str6, boolean z2, String str7) {
        ContentValues b = m27408b(str, str2, str3, str4, date, date2, z, str5, str6, z2, str7);
        StringBuilder sb = new StringBuilder();
        sb.append("_id=");
        long j2 = j;
        sb.append(j);
        return getWritableDatabase().update("events", b, sb.toString(), null);
    }

    /* renamed from: a */
    public long mo17843a(String str, String str2, String str3, String str4, Date date, Date date2, boolean z, String str5, String str6) {
        return mo17844a(str, str2, str3, str4, date, date2, z, str5, str6, false, "");
    }

    /* renamed from: a */
    public long mo17844a(String str, String str2, String str3, String str4, Date date, Date date2, boolean z, String str5, String str6, boolean z2, String str7) {
        return getWritableDatabase().insert("events", null, m27408b(str, str2, str3, str4, date, date2, z, str5, str6, z2, str7));
    }

    /* renamed from: a */
    public Cursor mo17845a(long j) {
        String[] strArr = {"_id", "recurring_event_id", "title", "category", "location", "start_date", "end_date", "is_all_day", "case_number", "reference", "is_synced_event", "description"};
        StringBuilder sb = new StringBuilder();
        sb.append("_id = ");
        sb.append(j);
        Cursor query = getReadableDatabase().query("events", strArr, sb.toString(), null, null, null, null);
        if (query != null) {
            query.moveToFirst();
        }
        return query;
    }

    /* renamed from: a */
    public Cursor mo17846a(Date date) {
        return getReadableDatabase().query("events", new String[]{"_id", "recurring_event_id", "title", "category", "location", "case_number", "reference", "start_date", "end_date", "is_all_day", "is_synced_event"}, "end_date >= ? AND start_date <= ?", new String[]{Long.toString(C6614j.m32003b(date).getTime().getTime()), Long.toString(C6614j.m32006c(date).getTime().getTime())}, null, null, "is_all_day DESC, start_date , end_date");
    }

    /* renamed from: a */
    public C5522h mo17847a(Cursor cursor) {
        C5522h hVar = new C5522h();
        hVar.mo17877a(cursor.getLong(cursor.getColumnIndex("_id")));
        hVar.mo17879a(cursor.getString(cursor.getColumnIndex("recurring_event_id")));
        hVar.mo17883b(cursor.getString(cursor.getColumnIndex("title")));
        hVar.mo17887c(cursor.getString(cursor.getColumnIndex("category")));
        hVar.mo17889d(cursor.getString(cursor.getColumnIndex("location")));
        hVar.mo17891e(cursor.getString(cursor.getColumnIndex("case_number")));
        hVar.mo17893f(cursor.getString(cursor.getColumnIndex("reference")));
        hVar.mo17880a(new Date(cursor.getLong(cursor.getColumnIndex("start_date"))));
        hVar.mo17884b(new Date(cursor.getLong(cursor.getColumnIndex("end_date"))));
        boolean z = false;
        hVar.mo17881a(cursor.getInt(cursor.getColumnIndex("is_all_day")) == 1);
        if (cursor.getInt(cursor.getColumnIndex("is_synced_event")) == 1) {
            z = true;
        }
        hVar.mo17885b(z);
        return hVar;
    }

    /* renamed from: a */
    public Set<Calendar> mo17848a(Date date, Date date2) {
        HashSet hashSet = new HashSet();
        Calendar b = C6614j.m32003b(date);
        Calendar c = C6614j.m32006c(date2);
        String[] strArr = {"start_date", "end_date"};
        StringBuilder sb = new StringBuilder();
        sb.append("end_date >= ");
        sb.append(b.getTimeInMillis());
        sb.append(" AND ");
        sb.append("start_date");
        sb.append(" <= ");
        sb.append(c.getTimeInMillis());
        Cursor query = getReadableDatabase().query("events", strArr, sb.toString(), null, null, null, null);
        if (query != null) {
            int columnIndex = query.getColumnIndex("start_date");
            int columnIndex2 = query.getColumnIndex("end_date");
            query.moveToFirst();
            while (!query.isAfterLast()) {
                Date date3 = new Date(query.getLong(columnIndex));
                Calendar a = C6614j.m31995a(query.getLong(columnIndex2));
                Calendar b2 = C6614j.m32003b(date3);
                while (b2.compareTo(a) <= 0) {
                    hashSet.add((Calendar) b2.clone());
                    b2.add(6, 1);
                }
                query.moveToNext();
            }
            query.close();
        }
        return hashSet;
    }

    /* renamed from: a */
    public boolean mo17849a() {
        return getWritableDatabase().delete("events", "is_synced_event='1'", null) > 0;
    }

    /* renamed from: a */
    public boolean mo17850a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("recurring_event_id='");
        sb.append(str);
        sb.append("'");
        return getWritableDatabase().delete("events", sb.toString(), null) > 0;
    }

    /* renamed from: b */
    public Cursor mo17851b(Date date, Date date2) {
        return getReadableDatabase().query("events", new String[]{"_id", "recurring_event_id", "title", "category", "location", "case_number", "reference", "start_date", "end_date", "is_all_day", "is_synced_event"}, "end_date >= ? AND start_date <= ?", new String[]{Long.toString(C6614j.m32003b(date).getTime().getTime()), Long.toString(C6614j.m32006c(date2).getTime().getTime())}, null, null, "start_date");
    }

    /* renamed from: b */
    public boolean mo17852b(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("_id=");
        sb.append(j);
        return getWritableDatabase().delete("events", sb.toString(), null) > 0;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT,recurring_event_id TEXT,title TEXT,category TEXT NOT NULL,location TEXT,start_date INTEGER NOT NULL,end_date INTEGER NOT NULL,is_all_day INTEGER NOT NULL DEFAULT 0,case_number TEXT,reference TEXT,is_synced_event INTEGER NOT NULL DEFAULT 0,description TEXT DEFAULT '',extra TEXT)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onUpgrade() from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.d("DatabaseHelper", sb.toString());
        if (i == 1) {
            sQLiteDatabase.execSQL("ALTER TABLE events ADD is_synced_event INTEGER NOT NULL DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE events ADD description TEXT DEFAULT ''");
        }
    }
}
