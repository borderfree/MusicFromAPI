package com.facebook.ads.internal.p077s.p078a;

import android.os.Build.VERSION;
import android.view.InputDevice;
import android.view.InputDevice.MotionRange;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.s.a.p */
public class C1806p {

    /* renamed from: a */
    private static final String f5879a = "p";

    /* renamed from: b */
    private boolean f5880b;

    /* renamed from: c */
    private int f5881c = -1;

    /* renamed from: d */
    private int f5882d = -1;

    /* renamed from: e */
    private int f5883e = -1;

    /* renamed from: f */
    private int f5884f = -1;

    /* renamed from: g */
    private long f5885g = -1;

    /* renamed from: h */
    private int f5886h = -1;

    /* renamed from: i */
    private long f5887i = -1;

    /* renamed from: j */
    private long f5888j = -1;

    /* renamed from: k */
    private int f5889k = -1;

    /* renamed from: l */
    private int f5890l = -1;

    /* renamed from: m */
    private int f5891m = -1;

    /* renamed from: n */
    private int f5892n = -1;

    /* renamed from: o */
    private float f5893o = -1.0f;

    /* renamed from: p */
    private float f5894p = -1.0f;

    /* renamed from: q */
    private float f5895q = -1.0f;

    /* renamed from: r */
    private View f5896r;

    /* renamed from: s */
    private View f5897s;

    /* renamed from: d */
    private C1799j m8922d() {
        if (this.f5896r == null || this.f5897s == null) {
            return C1799j.INTERNAL_NULL_VIEW;
        }
        if (this.f5896r != this.f5897s) {
            return C1799j.INTERNAL_NO_CLICK;
        }
        if (VERSION.SDK_INT < 4) {
            return C1799j.INTERNAL_API_TOO_LOW;
        }
        Object tag = this.f5896r.getTag(C1799j.f5864o);
        return tag == null ? C1799j.INTERNAL_NO_TAG : !(tag instanceof C1799j) ? C1799j.INTERNAL_WRONG_TAG_CLASS : (C1799j) tag;
    }

    /* renamed from: a */
    public void mo7068a() {
        this.f5885g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo7069a(MotionEvent motionEvent, View view, View view2) {
        if (!this.f5880b) {
            this.f5880b = true;
            InputDevice device = motionEvent.getDevice();
            if (device != null) {
                MotionRange motionRange = device.getMotionRange(0);
                MotionRange motionRange2 = device.getMotionRange(1);
                if (!(motionRange == null || motionRange2 == null)) {
                    this.f5895q = Math.min(motionRange.getRange(), motionRange2.getRange());
                }
            }
            if (this.f5895q <= 0.0f) {
                this.f5895q = (float) Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationInWindow(iArr2);
        switch (motionEvent.getAction()) {
            case 0:
                this.f5881c = (int) (((float) iArr[0]) / C1808r.f5899b);
                this.f5882d = (int) (((float) iArr[1]) / C1808r.f5899b);
                this.f5883e = (int) (((float) view.getWidth()) / C1808r.f5899b);
                this.f5884f = (int) (((float) view.getHeight()) / C1808r.f5899b);
                this.f5886h = 1;
                this.f5887i = System.currentTimeMillis();
                this.f5889k = (int) (((float) ((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0])) / C1808r.f5899b);
                this.f5890l = (int) (((float) ((((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1])) / C1808r.f5899b);
                this.f5893o = motionEvent.getPressure();
                this.f5894p = motionEvent.getSize();
                this.f5896r = view2;
                return;
            case 1:
            case 3:
                this.f5888j = System.currentTimeMillis();
                this.f5891m = (int) (((float) ((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0])) / C1808r.f5899b);
                this.f5892n = (int) (((float) ((((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1])) / C1808r.f5899b);
                this.f5897s = view2;
                return;
            case 2:
                this.f5893o -= this.f5893o / ((float) this.f5886h);
                this.f5893o += motionEvent.getPressure() / ((float) this.f5886h);
                this.f5894p -= this.f5894p / ((float) this.f5886h);
                this.f5894p += motionEvent.getSize() / ((float) this.f5886h);
                this.f5886h++;
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public boolean mo7070b() {
        return this.f5885g != -1;
    }

    /* renamed from: c */
    public Map<String, String> mo7071c() {
        if (!this.f5880b) {
            return null;
        }
        String valueOf = String.valueOf((this.f5894p * this.f5895q) / 2.0f);
        long j = (this.f5885g <= 0 || this.f5888j <= this.f5885g) ? -1 : this.f5888j - this.f5885g;
        HashMap hashMap = new HashMap();
        hashMap.put("adPositionX", String.valueOf(this.f5881c));
        hashMap.put("adPositionY", String.valueOf(this.f5882d));
        hashMap.put("width", String.valueOf(this.f5883e));
        hashMap.put("height", String.valueOf(this.f5884f));
        hashMap.put("clickDelayTime", String.valueOf(j));
        hashMap.put("startTime", String.valueOf(this.f5887i));
        hashMap.put("endTime", String.valueOf(this.f5888j));
        hashMap.put("startX", String.valueOf(this.f5889k));
        hashMap.put("startY", String.valueOf(this.f5890l));
        hashMap.put("clickX", String.valueOf(this.f5891m));
        hashMap.put("clickY", String.valueOf(this.f5892n));
        hashMap.put("endX", String.valueOf(this.f5891m));
        hashMap.put("endY", String.valueOf(this.f5892n));
        hashMap.put("force", String.valueOf(this.f5893o));
        hashMap.put("radiusX", valueOf);
        hashMap.put("radiusY", valueOf);
        hashMap.put("clickedViewTag", String.valueOf(m8922d().mo7065a()));
        return hashMap;
    }
}
