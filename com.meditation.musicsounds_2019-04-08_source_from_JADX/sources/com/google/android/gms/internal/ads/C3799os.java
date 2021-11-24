package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.os */
final class C3799os implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f14568a;

    /* renamed from: b */
    private final Object f14569b = new Object();

    /* renamed from: c */
    private final Display f14570c;

    /* renamed from: d */
    private final float[] f14571d = new float[9];

    /* renamed from: e */
    private final float[] f14572e = new float[9];
    @GuardedBy("mSensorThreadLock")

    /* renamed from: f */
    private float[] f14573f;

    /* renamed from: g */
    private Handler f14574g;

    /* renamed from: h */
    private C3801ou f14575h;

    C3799os(Context context) {
        this.f14568a = (SensorManager) context.getSystemService("sensor");
        this.f14570c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* renamed from: a */
    private final void m19322a(int i, int i2) {
        float f = this.f14572e[i];
        this.f14572e[i] = this.f14572e[i2];
        this.f14572e[i2] = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13391a() {
        if (this.f14574g == null) {
            Sensor defaultSensor = this.f14568a.getDefaultSensor(11);
            if (defaultSensor == null) {
                C3643iy.m19174c("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.f14574g = new Handler(handlerThread.getLooper());
            if (!this.f14568a.registerListener(this, defaultSensor, 0, this.f14574g)) {
                C3643iy.m19174c("SensorManager.registerListener failed.");
                mo13394b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13392a(C3801ou ouVar) {
        this.f14575h = ouVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo13393a(float[] fArr) {
        synchronized (this.f14569b) {
            if (this.f14573f == null) {
                return false;
            }
            System.arraycopy(this.f14573f, 0, fArr, 0, this.f14573f.length);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo13394b() {
        if (this.f14574g != null) {
            this.f14568a.unregisterListener(this);
            this.f14574g.post(new C3800ot(this));
            this.f14574g = null;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f14569b) {
                if (this.f14573f == null) {
                    this.f14573f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f14571d, fArr);
            switch (this.f14570c.getRotation()) {
                case 1:
                    SensorManager.remapCoordinateSystem(this.f14571d, 2, 129, this.f14572e);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.f14571d, 129, 130, this.f14572e);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.f14571d, 130, 1, this.f14572e);
                    break;
                default:
                    System.arraycopy(this.f14571d, 0, this.f14572e, 0, 9);
                    break;
            }
            m19322a(1, 3);
            m19322a(2, 6);
            m19322a(5, 7);
            synchronized (this.f14569b) {
                System.arraycopy(this.f14572e, 0, this.f14573f, 0, 9);
            }
            if (this.f14575h != null) {
                this.f14575h.mo13398a();
            }
        }
    }
}
