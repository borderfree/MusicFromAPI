package com.seattleclouds.modules.nativetetris;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.seattleclouds.modules.nativetetris.BlockObject.RotateDirection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.nativetetris.i */
public class C5915i {

    /* renamed from: a */
    public static final String f20903a = "i";

    /* renamed from: b */
    static int f20904b;

    /* renamed from: c */
    private BlockObject f20905c = null;

    /* renamed from: d */
    private BlockObject f20906d = null;

    /* renamed from: e */
    private ArrayList<C5916a> f20907e = new ArrayList<>(220);

    /* renamed from: f */
    private int f20908f;

    /* renamed from: g */
    private int f20909g;

    /* renamed from: h */
    private int f20910h;

    /* renamed from: i */
    private int f20911i;

    /* renamed from: j */
    private int f20912j = 22;

    /* renamed from: com.seattleclouds.modules.nativetetris.i$a */
    private class C5916a {

        /* renamed from: b */
        private boolean f20914b = true;

        /* renamed from: c */
        private String f20915c = "empty";

        public C5916a() {
        }

        /* renamed from: a */
        public void mo18710a(String str) {
            this.f20915c = str;
        }

        /* renamed from: a */
        public void mo18711a(boolean z) {
            this.f20914b = z;
        }

        /* renamed from: a */
        public boolean mo18712a() {
            return this.f20914b;
        }

        /* renamed from: b */
        public String mo18713b() {
            return this.f20915c;
        }
    }

    public C5915i() {
        for (int i = 0; i < 220; i++) {
            this.f20907e.add(new C5916a());
        }
        m28996b(3);
    }

    /* renamed from: b */
    private void m28996b(int i) {
        switch (i) {
            case 0:
                m29001l();
                return;
            case 1:
                m29002m();
                return;
            case 2:
                m29003n();
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m28997b(int i, int i2) {
        this.f20905c.mo18659a(this.f20905c.mo18662b().x + i, this.f20905c.mo18662b().y + i2);
    }

    /* renamed from: c */
    private void m28998c(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            ((C5916a) this.f20907e.get((i * 10) + i2)).mo18711a(true);
        }
    }

    /* renamed from: d */
    private void m28999d(int i) {
        int i2 = 1;
        if (this.f20912j >= 1) {
            i2 = this.f20912j;
        }
        this.f20912j = i2;
        while (true) {
            if (i >= this.f20912j) {
                for (int i3 = 0; i3 < 10; i3++) {
                    C5916a aVar = (C5916a) this.f20907e.get((i * 10) + i3);
                    C5916a aVar2 = (C5916a) this.f20907e.get(((i - 1) * 10) + i3);
                    aVar.mo18711a(aVar2.mo18712a());
                    aVar.mo18710a(aVar2.mo18713b());
                }
                i--;
            } else {
                m28998c(0);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29000e(int r3) {
        /*
            r2 = this;
            switch(r3) {
                case 1: goto L_0x0013;
                case 2: goto L_0x000e;
                case 3: goto L_0x0009;
                case 4: goto L_0x0004;
                default: goto L_0x0003;
            }
        L_0x0003:
            goto L_0x0019
        L_0x0004:
            int r3 = r2.f20909g
            int r3 = r3 + 55
            goto L_0x0017
        L_0x0009:
            int r3 = r2.f20909g
            int r3 = r3 + 40
            goto L_0x0017
        L_0x000e:
            int r3 = r2.f20909g
            int r3 = r3 + 25
            goto L_0x0017
        L_0x0013:
            int r3 = r2.f20909g
            int r3 = r3 + 10
        L_0x0017:
            r2.f20909g = r3
        L_0x0019:
            int r3 = r2.f20909g
            int r0 = r2.f20908f
            r1 = 100
            int r0 = r0 * 100
            int r3 = r3 - r0
            if (r3 < r1) goto L_0x002a
            int r3 = r2.f20908f
            int r3 = r3 + 1
            r2.f20908f = r3
        L_0x002a:
            int r3 = r2.f20909g
            int r0 = r2.f20910h
            if (r3 <= r0) goto L_0x0034
            int r3 = r2.f20909g
            r2.f20910h = r3
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.nativetetris.C5915i.m29000e(int):void");
    }

    /* renamed from: l */
    private void m29001l() {
        C5916a aVar;
        String str;
        for (int i = 0; i < 22; i++) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (i == 21) {
                    aVar = (C5916a) this.f20907e.get((i * 10) + i2);
                    aVar.mo18711a(false);
                    str = "red";
                } else {
                    if (i == 20 || i == 19 || (i == 18 && i2 != 8)) {
                        aVar = (C5916a) this.f20907e.get((i * 10) + i2);
                        aVar.mo18711a(false);
                        str = "blue";
                    }
                }
                aVar.mo18710a(str);
            }
        }
    }

    /* renamed from: m */
    private void m29002m() {
        for (int i = 0; i < 22; i++) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (i == 21 && i2 % 2 == 0) {
                    ((C5916a) this.f20907e.get((i * 10) + i2)).mo18711a(false);
                }
            }
        }
    }

    /* renamed from: n */
    private void m29003n() {
        for (int i = 0; i < 22; i++) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (i == 21 && i2 != 5) {
                    ((C5916a) this.f20907e.get((i * 10) + i2)).mo18711a(false);
                }
            }
        }
    }

    /* renamed from: o */
    private boolean m29004o() {
        if (this.f20905c == null) {
            return false;
        }
        return this.f20905c.f20857a.x < 0 || this.f20905c.f20857a.x + this.f20905c.mo18658a() > 10 || this.f20905c.f20857a.y + 4 > 22;
    }

    /* renamed from: p */
    private boolean m29005p() {
        boolean z = true;
        if (this.f20905c == null || m29004o()) {
            return true;
        }
        C5916a aVar = (C5916a) this.f20907e.get(((this.f20905c.f20857a.y + this.f20905c.f20858b[1].y) * 10) + this.f20905c.f20857a.x + this.f20905c.f20858b[1].x);
        C5916a aVar2 = (C5916a) this.f20907e.get(((this.f20905c.f20857a.y + this.f20905c.f20858b[2].y) * 10) + this.f20905c.f20857a.x + this.f20905c.f20858b[2].x);
        C5916a aVar3 = (C5916a) this.f20907e.get(((this.f20905c.f20857a.y + this.f20905c.f20858b[3].y) * 10) + this.f20905c.f20857a.x + this.f20905c.f20858b[3].x);
        if (((C5916a) this.f20907e.get(((this.f20905c.f20857a.y + this.f20905c.f20858b[0].y) * 10) + this.f20905c.f20857a.x + this.f20905c.f20858b[0].x)).mo18712a() && aVar.mo18712a() && aVar2.mo18712a() && aVar3.mo18712a()) {
            z = false;
        }
        return z;
    }

    /* renamed from: q */
    private boolean m29006q() {
        m28997b(0, 1);
        boolean p = true ^ m29005p();
        m28997b(0, -1);
        return p;
    }

    /* renamed from: r */
    private boolean m29007r() {
        m28997b(-1, 0);
        boolean z = !m29005p();
        m28997b(1, 0);
        return z;
    }

    /* renamed from: s */
    private boolean m29008s() {
        m28997b(1, 0);
        boolean p = true ^ m29005p();
        m28997b(-1, 0);
        return p;
    }

    /* renamed from: t */
    private boolean m29009t() {
        if (this.f20911i == 1 || this.f20911i == 2) {
            return false;
        }
        this.f20905c.mo18661a(RotateDirection.CLOCKWISE);
        boolean z = !m29005p();
        this.f20905c.mo18661a(RotateDirection.COUNTER_CLOCKWISE);
        return z;
    }

    /* renamed from: u */
    private void m29010u() {
        C5916a aVar = (C5916a) this.f20907e.get(((this.f20905c.f20857a.y + this.f20905c.f20858b[0].y) * 10) + this.f20905c.f20857a.x + this.f20905c.f20858b[0].x);
        C5916a aVar2 = (C5916a) this.f20907e.get(((this.f20905c.f20857a.y + this.f20905c.f20858b[1].y) * 10) + this.f20905c.f20857a.x + this.f20905c.f20858b[1].x);
        C5916a aVar3 = (C5916a) this.f20907e.get(((this.f20905c.f20857a.y + this.f20905c.f20858b[2].y) * 10) + this.f20905c.f20857a.x + this.f20905c.f20858b[2].x);
        C5916a aVar4 = (C5916a) this.f20907e.get(((this.f20905c.f20857a.y + this.f20905c.f20858b[3].y) * 10) + this.f20905c.f20857a.x + this.f20905c.f20858b[3].x);
        if (this.f20912j > this.f20905c.f20857a.x) {
            this.f20912j = this.f20905c.f20857a.x;
        }
        aVar.mo18711a(false);
        aVar.mo18710a(this.f20905c.f20860d);
        aVar2.mo18711a(false);
        aVar2.mo18710a(this.f20905c.f20860d);
        aVar3.mo18711a(false);
        aVar3.mo18710a(this.f20905c.f20860d);
        aVar4.mo18711a(false);
        aVar4.mo18710a(this.f20905c.f20860d);
    }

    /* renamed from: v */
    private ArrayList<Integer> m29011v() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 21; i >= 0; i--) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= 10) {
                    z = true;
                    break;
                } else if (((C5916a) this.f20907e.get((i * 10) + i2)).mo18712a()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    private void m29012w() {
        ArrayList v = m29011v();
        int size = v.size();
        m29000e(size);
        for (int i = 0; i < size; i++) {
            m28998c(((Integer) v.get(i)).intValue());
        }
        for (int i2 = 0; i2 < size; i2++) {
            m28999d(((Integer) v.get(i2)).intValue() + i2);
        }
    }

    /* renamed from: a */
    public void mo18694a() {
        this.f20909g = 0;
        this.f20908f = 0;
    }

    /* renamed from: a */
    public void mo18695a(int i) {
        this.f20911i = i;
    }

    /* renamed from: a */
    public void mo18696a(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("GAME_SCORE", this.f20909g);
            jSONObject.put("GAME_BEST_SCORE", this.f20910h);
            jSONObject.put("GAME_LEVEL", this.f20908f);
            jSONObject.put("GAME_STATE", this.f20911i);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f20907e.iterator();
            while (it.hasNext()) {
                C5916a aVar = (C5916a) it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("IS_CELL_EMPTY", aVar.mo18712a());
                jSONObject2.put("CELL_IMG_RES", aVar.mo18713b());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("GAME_BOARD", jSONArray);
            if (context != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("GAME_STATEnativeTetris");
                sb.append(str);
                Editor edit = context.getSharedPreferences(sb.toString(), 0).edit();
                edit.putString("GAME_STATE", jSONObject.toString());
                edit.commit();
            }
        } catch (JSONException e) {
            String str2 = f20903a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ERROR:");
            sb2.append(e.getLocalizedMessage());
            Log.e(str2, sb2.toString(), e);
        }
    }

    /* renamed from: a */
    public void mo18697a(Canvas canvas, int i, int i2, HashMap<String, Drawable> hashMap) {
        int i3 = i2 + 0;
        int i4 = i3 + i;
        int i5 = i + 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < 22) {
            int i8 = i3;
            int i9 = i4;
            int i10 = 0;
            while (i10 < 10) {
                C5916a aVar = (C5916a) this.f20907e.get((i6 * 10) + i10);
                if (!aVar.mo18712a()) {
                    Drawable drawable = (Drawable) hashMap.get(aVar.mo18713b());
                    if (drawable != null) {
                        drawable.setBounds(i8, i7, i9, i5);
                        drawable.draw(canvas);
                    }
                }
                i10++;
                int i11 = i9;
                i9 += i;
                i8 = i11;
            }
            i6++;
            i7 = i5;
            i5 += i;
        }
    }

    /* renamed from: a */
    public boolean mo18698a(int i, int i2) {
        boolean z;
        if (this.f20911i == 1 || this.f20911i == 2 || this.f20905c == null) {
            return false;
        }
        boolean s = i > 0 ? m29008s() & true : true;
        if (i < 0) {
            s &= m29007r();
        }
        if (i2 > 0) {
            z = m29006q() & true;
            s &= z;
        } else {
            z = true;
        }
        if (s) {
            m28997b(i, i2);
        } else if (!z) {
            m29010u();
            m29012w();
            mo18699b();
            if (m29005p()) {
                this.f20911i = 2;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063 A[Catch:{ CloneNotSupportedException -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a A[Catch:{ CloneNotSupportedException -> 0x0085 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18699b() {
        /*
            r4 = this;
            java.util.Random r0 = new java.util.Random
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r1 = r1.getTime()
            r0.<init>(r1)
            r1 = 7
            int r2 = r0.nextInt(r1)
            switch(r2) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0036;
                case 2: goto L_0x0030;
                case 3: goto L_0x002a;
                case 4: goto L_0x0024;
                case 5: goto L_0x001e;
                case 6: goto L_0x0018;
                default: goto L_0x0016;
            }
        L_0x0016:
            r2 = 0
            goto L_0x0041
        L_0x0018:
            com.seattleclouds.modules.nativetetris.a r2 = new com.seattleclouds.modules.nativetetris.a
            r2.<init>()
            goto L_0x0041
        L_0x001e:
            com.seattleclouds.modules.nativetetris.g r2 = new com.seattleclouds.modules.nativetetris.g
            r2.<init>()
            goto L_0x0041
        L_0x0024:
            com.seattleclouds.modules.nativetetris.f r2 = new com.seattleclouds.modules.nativetetris.f
            r2.<init>()
            goto L_0x0041
        L_0x002a:
            com.seattleclouds.modules.nativetetris.e r2 = new com.seattleclouds.modules.nativetetris.e
            r2.<init>()
            goto L_0x0041
        L_0x0030:
            com.seattleclouds.modules.nativetetris.d r2 = new com.seattleclouds.modules.nativetetris.d
            r2.<init>()
            goto L_0x0041
        L_0x0036:
            com.seattleclouds.modules.nativetetris.b r2 = new com.seattleclouds.modules.nativetetris.b
            r2.<init>()
            goto L_0x0041
        L_0x003c:
            com.seattleclouds.modules.nativetetris.c r2 = new com.seattleclouds.modules.nativetetris.c
            r2.<init>()
        L_0x0041:
            int r0 = r0.nextInt(r1)
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0058;
                case 2: goto L_0x0055;
                case 3: goto L_0x0052;
                case 4: goto L_0x004f;
                case 5: goto L_0x004c;
                case 6: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x005f
        L_0x0049:
            java.lang.String r0 = "yellow"
            goto L_0x005d
        L_0x004c:
            java.lang.String r0 = "red"
            goto L_0x005d
        L_0x004f:
            java.lang.String r0 = "orange"
            goto L_0x005d
        L_0x0052:
            java.lang.String r0 = "magenta"
            goto L_0x005d
        L_0x0055:
            java.lang.String r0 = "green"
            goto L_0x005d
        L_0x0058:
            java.lang.String r0 = "cyan"
            goto L_0x005d
        L_0x005b:
            java.lang.String r0 = "blue"
        L_0x005d:
            r2.f20860d = r0
        L_0x005f:
            com.seattleclouds.modules.nativetetris.BlockObject r0 = r4.f20906d     // Catch:{ CloneNotSupportedException -> 0x0085 }
            if (r0 != 0) goto L_0x007a
            com.seattleclouds.modules.nativetetris.BlockObject r0 = r2.clone()     // Catch:{ CloneNotSupportedException -> 0x0085 }
            r4.f20906d = r0     // Catch:{ CloneNotSupportedException -> 0x0085 }
            com.seattleclouds.modules.nativetetris.BlockObject r0 = r4.f20906d     // Catch:{ CloneNotSupportedException -> 0x0085 }
            android.graphics.Point r0 = r0.f20857a     // Catch:{ CloneNotSupportedException -> 0x0085 }
            r1 = 0
            r0.x = r1     // Catch:{ CloneNotSupportedException -> 0x0085 }
            com.seattleclouds.modules.nativetetris.BlockObject r0 = r4.f20906d     // Catch:{ CloneNotSupportedException -> 0x0085 }
            android.graphics.Point r0 = r0.f20857a     // Catch:{ CloneNotSupportedException -> 0x0085 }
            r0.y = r1     // Catch:{ CloneNotSupportedException -> 0x0085 }
            r4.mo18699b()     // Catch:{ CloneNotSupportedException -> 0x0085 }
            goto L_0x00a0
        L_0x007a:
            com.seattleclouds.modules.nativetetris.BlockObject r0 = r4.f20906d     // Catch:{ CloneNotSupportedException -> 0x0085 }
            com.seattleclouds.modules.nativetetris.BlockObject r0 = r0.clone()     // Catch:{ CloneNotSupportedException -> 0x0085 }
            r4.f20905c = r0     // Catch:{ CloneNotSupportedException -> 0x0085 }
            r4.f20906d = r2     // Catch:{ CloneNotSupportedException -> 0x0085 }
            goto L_0x00a0
        L_0x0085:
            r0 = move-exception
            java.lang.String r1 = f20903a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error:"
            r2.append(r3)
            java.lang.String r3 = r0.getLocalizedMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2, r0)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.nativetetris.C5915i.mo18699b():void");
    }

    /* renamed from: b */
    public void mo18700b(Context context, String str) {
        if (context != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("GAME_STATEnativeTetris");
            sb.append(str);
            String string = context.getSharedPreferences(sb.toString(), 0).getString("GAME_STATE", "");
            if (string.length() == 0) {
                this.f20909g = 0;
                this.f20910h = 0;
                this.f20908f = 0;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    this.f20909g = jSONObject.getInt("GAME_SCORE");
                    this.f20910h = jSONObject.getInt("GAME_BEST_SCORE");
                    this.f20908f = jSONObject.getInt("GAME_LEVEL");
                    this.f20911i = jSONObject.getInt("GAME_STATE");
                    JSONArray jSONArray = jSONObject.getJSONArray("GAME_BOARD");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                        C5916a aVar = (C5916a) this.f20907e.get(i);
                        aVar.mo18711a(jSONObject2.getBoolean("IS_CELL_EMPTY"));
                        aVar.mo18710a(jSONObject2.getString("CELL_IMG_RES"));
                    }
                } catch (JSONException e) {
                    this.f20909g = 0;
                    this.f20910h = 0;
                    this.f20908f = 0;
                    String str2 = f20903a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ERROR:");
                    sb2.append(e.getLocalizedMessage());
                    Log.e(str2, sb2.toString(), e);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo18701c() {
        if (this.f20905c != null && m29009t()) {
            this.f20905c.mo18661a(RotateDirection.CLOCKWISE);
        }
    }

    /* renamed from: d */
    public BlockObject mo18702d() {
        return this.f20905c;
    }

    /* renamed from: e */
    public BlockObject mo18703e() {
        return this.f20906d;
    }

    /* renamed from: f */
    public int mo18704f() {
        return this.f20911i;
    }

    /* renamed from: g */
    public int mo18705g() {
        return 2050 - (this.f20908f * 2);
    }

    /* renamed from: h */
    public int mo18706h() {
        return this.f20908f;
    }

    /* renamed from: i */
    public int mo18707i() {
        return this.f20909g;
    }

    /* renamed from: j */
    public int mo18708j() {
        return this.f20910h;
    }

    /* renamed from: k */
    public void mo18709k() {
        for (int i = 0; i < 220; i++) {
            C5916a aVar = (C5916a) this.f20907e.get(i);
            aVar.mo18711a(true);
            aVar.mo18710a("empty");
        }
        this.f20908f = 0;
        this.f20909g = 0;
        this.f20911i = 1;
    }
}
