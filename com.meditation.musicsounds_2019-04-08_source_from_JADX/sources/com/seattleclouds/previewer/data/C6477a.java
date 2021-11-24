package com.seattleclouds.previewer.data;

import com.seattleclouds.api.C5268b;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.previewer.data.a */
public class C6477a {

    /* renamed from: a */
    private boolean f23002a;

    /* renamed from: b */
    private String f23003b;

    /* renamed from: c */
    private Date f23004c;

    /* renamed from: d */
    private JSONObject f23005d;

    public C6477a() {
        mo20153a("");
        mo20155a(false);
        mo20154a(new Date(0));
    }

    public C6477a(JSONObject jSONObject) {
        this();
        mo20155a(jSONObject.getBoolean("bigFile"));
        mo20153a(jSONObject.getString("relPath"));
        mo20154a(C5268b.m26276a(jSONObject.getString("modifiedDate")));
        this.f23005d = jSONObject;
    }

    /* renamed from: a */
    public String mo20152a() {
        return this.f23003b;
    }

    /* renamed from: a */
    public void mo20153a(String str) {
        this.f23003b = str;
    }

    /* renamed from: a */
    public void mo20154a(Date date) {
        this.f23004c = date;
    }

    /* renamed from: a */
    public void mo20155a(boolean z) {
        this.f23002a = z;
    }

    /* renamed from: b */
    public Date mo20156b() {
        return this.f23004c;
    }

    /* renamed from: c */
    public JSONObject mo20157c() {
        return this.f23005d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Path: ");
        sb.append(this.f23003b);
        sb.append(" Date: ");
        sb.append(this.f23004c);
        sb.append(" IsBig: ");
        sb.append(this.f23002a);
        return sb.toString();
    }
}
