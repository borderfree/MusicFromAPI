package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.C2189f;
import java.util.UUID;

/* renamed from: com.facebook.appevents.internal.g */
class C2166g {

    /* renamed from: a */
    private Long f7066a;

    /* renamed from: b */
    private Long f7067b;

    /* renamed from: c */
    private int f7068c;

    /* renamed from: d */
    private Long f7069d;

    /* renamed from: e */
    private C2168i f7070e;

    /* renamed from: f */
    private UUID f7071f;

    public C2166g(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    public C2166g(Long l, Long l2, UUID uuid) {
        this.f7066a = l;
        this.f7067b = l2;
        this.f7071f = uuid;
    }

    /* renamed from: a */
    public static C2166g m10029a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2189f.m10092f());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        C2166g gVar = new C2166g(Long.valueOf(j), Long.valueOf(j2));
        gVar.f7068c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        gVar.f7070e = C2168i.m10045a();
        gVar.f7069d = Long.valueOf(System.currentTimeMillis());
        gVar.f7071f = UUID.fromString(string);
        return gVar;
    }

    /* renamed from: b */
    public static void m10030b() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C2189f.m10092f()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        C2168i.m10046b();
    }

    /* renamed from: a */
    public void mo7722a(C2168i iVar) {
        this.f7070e = iVar;
    }

    /* renamed from: a */
    public void mo7723a(Long l) {
        this.f7067b = l;
    }

    /* renamed from: c */
    public Long mo7724c() {
        return this.f7067b;
    }

    /* renamed from: d */
    public int mo7725d() {
        return this.f7068c;
    }

    /* renamed from: e */
    public void mo7726e() {
        this.f7068c++;
    }

    /* renamed from: f */
    public long mo7727f() {
        if (this.f7069d == null) {
            return 0;
        }
        return this.f7069d.longValue();
    }

    /* renamed from: g */
    public UUID mo7728g() {
        return this.f7071f;
    }

    /* renamed from: h */
    public long mo7729h() {
        if (this.f7066a == null || this.f7067b == null) {
            return 0;
        }
        return this.f7067b.longValue() - this.f7066a.longValue();
    }

    /* renamed from: i */
    public C2168i mo7730i() {
        return this.f7070e;
    }

    /* renamed from: j */
    public void mo7731j() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C2189f.m10092f()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f7066a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f7067b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f7068c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f7071f.toString());
        edit.apply();
        if (this.f7070e != null) {
            this.f7070e.mo7732c();
        }
    }
}
