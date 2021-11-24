package net.sourceforge.zbar.android;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import java.lang.reflect.Method;

/* renamed from: net.sourceforge.zbar.android.a */
public class C6710a extends SurfaceView implements Callback {

    /* renamed from: a */
    private SurfaceHolder f23575a = getHolder();

    /* renamed from: b */
    private Camera f23576b;

    /* renamed from: c */
    private PreviewCallback f23577c;

    /* renamed from: d */
    private AutoFocusCallback f23578d;

    public C6710a(Context context, Camera camera, PreviewCallback previewCallback, AutoFocusCallback autoFocusCallback) {
        super(context);
        this.f23576b = camera;
        this.f23577c = previewCallback;
        this.f23578d = autoFocusCallback;
        this.f23575a.addCallback(this);
        this.f23575a.setType(3);
    }

    public void setDisplayOrientation(int i) {
        try {
            Method method = this.f23576b.getClass().getMethod("setDisplayOrientation", new Class[]{Integer.TYPE});
            if (method != null) {
                method.invoke(this.f23576b, new Object[]{Integer.valueOf(i)});
                return;
            }
        } catch (Exception unused) {
        }
        Parameters parameters = this.f23576b.getParameters();
        parameters.set("jpeg-quality", 100);
        parameters.setRotation(i);
        parameters.setPictureFormat(256);
        this.f23576b.setParameters(parameters);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            android.view.SurfaceHolder r1 = r0.f23575a
            android.view.Surface r1 = r1.getSurface()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            android.hardware.Camera r1 = r0.f23576b     // Catch:{ Exception -> 0x000e }
            r1.stopPreview()     // Catch:{ Exception -> 0x000e }
        L_0x000e:
            android.hardware.Camera r1 = r0.f23576b     // Catch:{ Exception -> 0x0029 }
            android.view.SurfaceHolder r2 = r0.f23575a     // Catch:{ Exception -> 0x0029 }
            r1.setPreviewDisplay(r2)     // Catch:{ Exception -> 0x0029 }
            android.hardware.Camera r1 = r0.f23576b     // Catch:{ Exception -> 0x0029 }
            android.hardware.Camera$PreviewCallback r2 = r0.f23577c     // Catch:{ Exception -> 0x0029 }
            r1.setPreviewCallback(r2)     // Catch:{ Exception -> 0x0029 }
            android.hardware.Camera r1 = r0.f23576b     // Catch:{ Exception -> 0x0029 }
            r1.startPreview()     // Catch:{ Exception -> 0x0029 }
            android.hardware.Camera r1 = r0.f23576b     // Catch:{ Exception -> 0x0029 }
            android.hardware.Camera$AutoFocusCallback r2 = r0.f23578d     // Catch:{ Exception -> 0x0029 }
            r1.autoFocus(r2)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0044
        L_0x0029:
            r1 = move-exception
            java.lang.String r2 = "DBG"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error starting camera preview: "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.d(r2, r1)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sourceforge.zbar.android.C6710a.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            this.f23576b.setPreviewDisplay(surfaceHolder);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error setting camera preview: ");
            sb.append(e.getMessage());
            Log.d("DBG", sb.toString());
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
