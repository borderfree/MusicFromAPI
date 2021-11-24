package com.seattleclouds.previewer.data;

import org.json.JSONObject;

/* renamed from: com.seattleclouds.previewer.data.b */
public class C6478b {

    /* renamed from: a */
    private String f23006a;

    /* renamed from: b */
    private String f23007b;

    public C6478b() {
        this.f23006a = "";
        this.f23007b = "Any";
    }

    public C6478b(JSONObject jSONObject) {
        this();
        this.f23006a = jSONObject.getString("languageKey");
        this.f23007b = jSONObject.getString("languageLabel");
    }

    /* renamed from: a */
    public String mo20159a() {
        return this.f23006a;
    }

    /* renamed from: b */
    public String mo20160b() {
        return this.f23007b;
    }
}
