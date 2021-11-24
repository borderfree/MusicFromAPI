package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ov */
public final class C3802ov extends Thread implements OnFrameAvailableListener, C3801ou {

    /* renamed from: a */
    private static final float[] f14576a = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private volatile boolean f14577A;

    /* renamed from: B */
    private volatile boolean f14578B;

    /* renamed from: b */
    private final C3799os f14579b;

    /* renamed from: c */
    private final float[] f14580c;

    /* renamed from: d */
    private final float[] f14581d;

    /* renamed from: e */
    private final float[] f14582e;

    /* renamed from: f */
    private final float[] f14583f;

    /* renamed from: g */
    private final float[] f14584g;

    /* renamed from: h */
    private final float[] f14585h;

    /* renamed from: i */
    private final float[] f14586i;

    /* renamed from: j */
    private float f14587j;

    /* renamed from: k */
    private float f14588k;

    /* renamed from: l */
    private float f14589l;

    /* renamed from: m */
    private int f14590m;

    /* renamed from: n */
    private int f14591n;

    /* renamed from: o */
    private SurfaceTexture f14592o;

    /* renamed from: p */
    private SurfaceTexture f14593p;

    /* renamed from: q */
    private int f14594q;

    /* renamed from: r */
    private int f14595r;

    /* renamed from: s */
    private int f14596s;

    /* renamed from: t */
    private FloatBuffer f14597t = ByteBuffer.allocateDirect(f14576a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: u */
    private final CountDownLatch f14598u;

    /* renamed from: v */
    private final Object f14599v;

    /* renamed from: w */
    private EGL10 f14600w;

    /* renamed from: x */
    private EGLDisplay f14601x;

    /* renamed from: y */
    private EGLContext f14602y;

    /* renamed from: z */
    private EGLSurface f14603z;

    public C3802ov(Context context) {
        super("SphericalVideoProcessor");
        this.f14597t.put(f14576a).position(0);
        this.f14580c = new float[9];
        this.f14581d = new float[9];
        this.f14582e = new float[9];
        this.f14583f = new float[9];
        this.f14584g = new float[9];
        this.f14585h = new float[9];
        this.f14586i = new float[9];
        this.f14587j = Float.NaN;
        this.f14579b = new C3799os(context);
        this.f14579b.mo13392a((C3801ou) this);
        this.f14598u = new CountDownLatch(1);
        this.f14599v = new Object();
    }

    /* renamed from: a */
    private static int m19328a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m19329a("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        m19329a("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        m19329a("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        m19329a("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        m19329a("deleteShader");
        return 0;
    }

    /* renamed from: a */
    private static void m19329a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    /* renamed from: a */
    private static void m19330a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: a */
    private static void m19331a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: b */
    private static void m19332b(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: d */
    private final boolean m19333d() {
        boolean z = false;
        if (!(this.f14603z == null || this.f14603z == EGL10.EGL_NO_SURFACE)) {
            z = this.f14600w.eglDestroySurface(this.f14601x, this.f14603z) | this.f14600w.eglMakeCurrent(this.f14601x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | false;
            this.f14603z = null;
        }
        if (this.f14602y != null) {
            z |= this.f14600w.eglDestroyContext(this.f14601x, this.f14602y);
            this.f14602y = null;
        }
        if (this.f14601x == null) {
            return z;
        }
        boolean eglTerminate = z | this.f14600w.eglTerminate(this.f14601x);
        this.f14601x = null;
        return eglTerminate;
    }

    /* renamed from: a */
    public final void mo13398a() {
        synchronized (this.f14599v) {
            this.f14599v.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo13399a(float f, float f2) {
        float f3;
        float f4;
        int i;
        if (this.f14591n > this.f14590m) {
            f3 = (f * 1.7453293f) / ((float) this.f14591n);
            f4 = f2 * 1.7453293f;
            i = this.f14591n;
        } else {
            f3 = (f * 1.7453293f) / ((float) this.f14590m);
            f4 = f2 * 1.7453293f;
            i = this.f14590m;
        }
        float f5 = f4 / ((float) i);
        this.f14588k -= f3;
        this.f14589l -= f5;
        if (this.f14589l < -1.5707964f) {
            this.f14589l = -1.5707964f;
        }
        if (this.f14589l > 1.5707964f) {
            this.f14589l = 1.5707964f;
        }
    }

    /* renamed from: a */
    public final void mo13400a(int i, int i2) {
        synchronized (this.f14599v) {
            this.f14591n = i;
            this.f14590m = i2;
            this.f14577A = true;
            this.f14599v.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo13401a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f14591n = i;
        this.f14590m = i2;
        this.f14593p = surfaceTexture;
    }

    /* renamed from: b */
    public final void mo13402b() {
        synchronized (this.f14599v) {
            this.f14578B = true;
            this.f14593p = null;
            this.f14599v.notifyAll();
        }
    }

    /* renamed from: c */
    public final SurfaceTexture mo13403c() {
        if (this.f14593p == null) {
            return null;
        }
        try {
            this.f14598u.await();
        } catch (InterruptedException unused) {
        }
        return this.f14592o;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f14596s++;
        synchronized (this.f14599v) {
            this.f14599v.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e5 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            android.graphics.SurfaceTexture r0 = r14.f14593p
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.internal.ads.C3643iy.m19174c(r0)
            java.util.concurrent.CountDownLatch r0 = r14.f14598u
            r0.countDown()
            return
        L_0x000f:
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r14.f14600w = r0
            javax.microedition.khronos.egl.EGL10 r0 = r14.f14600w
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r14.f14601x = r0
            javax.microedition.khronos.egl.EGLDisplay r0 = r14.f14601x
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L_0x002f
        L_0x002c:
            r0 = 0
            goto L_0x00a4
        L_0x002f:
            int[] r0 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r1 = r14.f14600w
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.f14601x
            boolean r0 = r1.eglInitialize(r7, r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x002c
        L_0x003c:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.f14600w
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.f14601x
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x005b
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x005b
            r0 = r1[r6]
            goto L_0x005c
        L_0x005b:
            r0 = r4
        L_0x005c:
            if (r0 != 0) goto L_0x005f
            goto L_0x002c
        L_0x005f:
            int[] r1 = new int[r2]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.f14600w
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.f14601x
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r14.f14602y = r1
            javax.microedition.khronos.egl.EGLContext r1 = r14.f14602y
            if (r1 == 0) goto L_0x002c
            javax.microedition.khronos.egl.EGLContext r1 = r14.f14602y
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L_0x007b
            goto L_0x002c
        L_0x007b:
            javax.microedition.khronos.egl.EGL10 r1 = r14.f14600w
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.f14601x
            android.graphics.SurfaceTexture r8 = r14.f14593p
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r14.f14603z = r0
            javax.microedition.khronos.egl.EGLSurface r0 = r14.f14603z
            if (r0 == 0) goto L_0x002c
            javax.microedition.khronos.egl.EGLSurface r0 = r14.f14603z
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x0092
            goto L_0x002c
        L_0x0092:
            javax.microedition.khronos.egl.EGL10 r0 = r14.f14600w
            javax.microedition.khronos.egl.EGLDisplay r1 = r14.f14601x
            javax.microedition.khronos.egl.EGLSurface r7 = r14.f14603z
            javax.microedition.khronos.egl.EGLSurface r8 = r14.f14603z
            javax.microedition.khronos.egl.EGLContext r9 = r14.f14602y
            boolean r0 = r0.eglMakeCurrent(r1, r7, r8, r9)
            if (r0 != 0) goto L_0x00a3
            goto L_0x002c
        L_0x00a3:
            r0 = 1
        L_0x00a4:
            r1 = 35633(0x8b31, float:4.9932E-41)
            com.google.android.gms.internal.ads.aqc<java.lang.String> r7 = com.google.android.gms.internal.ads.aqm.f12723bj
            com.google.android.gms.internal.ads.aqk r8 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r8 = r8.mo12297a(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.mo12289b()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00c8
            com.google.android.gms.internal.ads.aqk r8 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r7 = r8.mo12297a(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00ca
        L_0x00c8:
            java.lang.String r7 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00ca:
            int r1 = m19328a(r1, r7)
            if (r1 != 0) goto L_0x00d3
        L_0x00d0:
            r8 = 0
            goto L_0x0155
        L_0x00d3:
            r7 = 35632(0x8b30, float:4.9931E-41)
            com.google.android.gms.internal.ads.aqc<java.lang.String> r8 = com.google.android.gms.internal.ads.aqm.f12724bk
            com.google.android.gms.internal.ads.aqk r9 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r9 = r9.mo12297a(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.mo12289b()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00f7
            com.google.android.gms.internal.ads.aqk r9 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r8 = r9.mo12297a(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00f9
        L_0x00f7:
            java.lang.String r8 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00f9:
            int r7 = m19328a(r7, r8)
            if (r7 != 0) goto L_0x0100
            goto L_0x00d0
        L_0x0100:
            int r8 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r9 = "createProgram"
            m19329a(r9)
            if (r8 == 0) goto L_0x0155
            android.opengl.GLES20.glAttachShader(r8, r1)
            java.lang.String r1 = "attachShader"
            m19329a(r1)
            android.opengl.GLES20.glAttachShader(r8, r7)
            java.lang.String r1 = "attachShader"
            m19329a(r1)
            android.opengl.GLES20.glLinkProgram(r8)
            java.lang.String r1 = "linkProgram"
            m19329a(r1)
            int[] r1 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6)
            java.lang.String r7 = "getProgramiv"
            m19329a(r7)
            r1 = r1[r6]
            if (r1 == r5) goto L_0x014d
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r1, r7)
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = android.opengl.GLES20.glGetProgramInfoLog(r8)
            android.util.Log.e(r1, r7)
            android.opengl.GLES20.glDeleteProgram(r8)
            java.lang.String r1 = "deleteProgram"
            m19329a(r1)
            goto L_0x00d0
        L_0x014d:
            android.opengl.GLES20.glValidateProgram(r8)
            java.lang.String r1 = "validateProgram"
            m19329a(r1)
        L_0x0155:
            r14.f14594q = r8
            int r1 = r14.f14594q
            android.opengl.GLES20.glUseProgram(r1)
            java.lang.String r1 = "useProgram"
            m19329a(r1)
            int r1 = r14.f14594q
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r14.f14597t
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            m19329a(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            m19329a(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            m19329a(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            m19329a(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m19329a(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m19329a(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m19329a(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            m19329a(r7)
            int r7 = r14.f14594q
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r14.f14595r = r7
            r7 = 9
            float[] r7 = new float[r7]
            r7 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            int r8 = r14.f14595r
            android.opengl.GLES20.glUniformMatrix3fv(r8, r5, r6, r7, r6)
            int r7 = r14.f14594q
            if (r7 == 0) goto L_0x01e2
            r7 = 1
            goto L_0x01e3
        L_0x01e2:
            r7 = 0
        L_0x01e3:
            if (r0 == 0) goto L_0x039f
            if (r7 != 0) goto L_0x01e9
            goto L_0x039f
        L_0x01e9:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r14.f14592o = r0
            android.graphics.SurfaceTexture r0 = r14.f14592o
            r0.setOnFrameAvailableListener(r14)
            java.util.concurrent.CountDownLatch r0 = r14.f14598u
            r0.countDown()
            com.google.android.gms.internal.ads.os r0 = r14.f14579b
            r0.mo13391a()
            r14.f14577A = r5     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        L_0x0201:
            boolean r0 = r14.f14578B     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            if (r0 != 0) goto L_0x0349
        L_0x0205:
            int r0 = r14.f14596s     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            if (r0 <= 0) goto L_0x0214
            android.graphics.SurfaceTexture r0 = r14.f14592o     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            int r0 = r14.f14596s     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            int r0 = r0 - r5
            r14.f14596s = r0     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            goto L_0x0205
        L_0x0214:
            com.google.android.gms.internal.ads.os r0 = r14.f14579b     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r1 = r14.f14580c     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            boolean r0 = r0.mo13393a(r1)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r1 = 5
            r7 = 4
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            if (r0 == 0) goto L_0x0294
            float r0 = r14.f14587j     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            if (r0 == 0) goto L_0x0289
            float[] r0 = r14.f14580c     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r9 = new float[r2]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r9 = {0, 1065353216, 0} // fill-array     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r10 = new float[r2]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r11 = r0[r6]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r11 = r11 * r12
            r12 = r0[r5]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r3]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r11 = r0[r2]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r11 = r11 * r12
            r12 = r0[r7]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r1]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r5] = r11     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r9 = r9[r3]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r3] = r11     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r0 = r10[r5]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r0 = r0 - r8
            float r0 = -r0
            r14.f14587j = r0     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        L_0x0289:
            float[] r0 = r14.f14585h     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r9 = r14.f14587j     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r10 = r14.f14588k     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r9 = r9 + r10
            m19332b(r0, r9)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            goto L_0x02a3
        L_0x0294:
            float[] r0 = r14.f14580c     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r9 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            m19330a(r0, r9)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r0 = r14.f14585h     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r9 = r14.f14588k     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            m19332b(r0, r9)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        L_0x02a3:
            float[] r0 = r14.f14581d     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            m19330a(r0, r8)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r0 = r14.f14582e     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r8 = r14.f14585h     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r9 = r14.f14581d     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            m19331a(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r0 = r14.f14583f     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r8 = r14.f14580c     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r9 = r14.f14582e     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            m19331a(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r0 = r14.f14584g     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r8 = r14.f14589l     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            m19330a(r0, r8)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r0 = r14.f14586i     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r8 = r14.f14584g     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r9 = r14.f14583f     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            m19331a(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            int r0 = r14.f14595r     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float[] r8 = r14.f14586i     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            android.opengl.GLES20.glDrawArrays(r1, r6, r7)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            java.lang.String r0 = "drawArrays"
            m19329a(r0)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            javax.microedition.khronos.egl.EGL10 r0 = r14.f14600w     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            javax.microedition.khronos.egl.EGLDisplay r1 = r14.f14601x     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            javax.microedition.khronos.egl.EGLSurface r7 = r14.f14603z     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r0.eglSwapBuffers(r1, r7)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            boolean r0 = r14.f14577A     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            if (r0 == 0) goto L_0x032f
            int r0 = r14.f14591n     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            int r1 = r14.f14590m     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            java.lang.String r0 = "viewport"
            m19329a(r0)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            int r0 = r14.f14594q     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            int r1 = r14.f14594q     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            int r7 = r14.f14591n     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            int r8 = r14.f14590m     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L_0x031e
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            int r0 = r14.f14590m     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r0 = r0 * r9
            int r7 = r14.f14591n     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r0 = r0 / r7
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            goto L_0x032d
        L_0x031e:
            int r7 = r14.f14591n     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r7 = r7 * r9
            int r8 = r14.f14590m     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        L_0x032d:
            r14.f14577A = r6     // Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        L_0x032f:
            java.lang.Object r0 = r14.f14599v     // Catch:{ InterruptedException -> 0x0201 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0201 }
            boolean r1 = r14.f14578B     // Catch:{ all -> 0x0346 }
            if (r1 != 0) goto L_0x0343
            boolean r1 = r14.f14577A     // Catch:{ all -> 0x0346 }
            if (r1 != 0) goto L_0x0343
            int r1 = r14.f14596s     // Catch:{ all -> 0x0346 }
            if (r1 != 0) goto L_0x0343
            java.lang.Object r1 = r14.f14599v     // Catch:{ all -> 0x0346 }
            r1.wait()     // Catch:{ all -> 0x0346 }
        L_0x0343:
            monitor-exit(r0)     // Catch:{ all -> 0x0346 }
            goto L_0x0201
        L_0x0346:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0346 }
            throw r1     // Catch:{ InterruptedException -> 0x0201 }
        L_0x0349:
            com.google.android.gms.internal.ads.os r0 = r14.f14579b
            r0.mo13394b()
            android.graphics.SurfaceTexture r0 = r14.f14592o
            r0.setOnFrameAvailableListener(r4)
            r14.f14592o = r4
            r14.m19333d()
            return
        L_0x0359:
            r0 = move-exception
            goto L_0x038f
        L_0x035b:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.internal.ads.C3643iy.m19173b(r1, r0)     // Catch:{ all -> 0x0359 }
            com.google.android.gms.internal.ads.ii r1 = com.google.android.gms.ads.internal.zzbv.zzeo()     // Catch:{ all -> 0x0359 }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.mo13047a(r0, r2)     // Catch:{ all -> 0x0359 }
            com.google.android.gms.internal.ads.os r0 = r14.f14579b
            r0.mo13394b()
            android.graphics.SurfaceTexture r0 = r14.f14592o
            r0.setOnFrameAvailableListener(r4)
            r14.f14592o = r4
            r14.m19333d()
            return
        L_0x037a:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)     // Catch:{ all -> 0x0359 }
            com.google.android.gms.internal.ads.os r0 = r14.f14579b
            r0.mo13394b()
            android.graphics.SurfaceTexture r0 = r14.f14592o
            r0.setOnFrameAvailableListener(r4)
            r14.f14592o = r4
            r14.m19333d()
            return
        L_0x038f:
            com.google.android.gms.internal.ads.os r1 = r14.f14579b
            r1.mo13394b()
            android.graphics.SurfaceTexture r1 = r14.f14592o
            r1.setOnFrameAvailableListener(r4)
            r14.f14592o = r4
            r14.m19333d()
            throw r0
        L_0x039f:
            javax.microedition.khronos.egl.EGL10 r0 = r14.f14600w
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r1 = "EGL initialization failed: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03ba
            java.lang.String r0 = r1.concat(r0)
            goto L_0x03bf
        L_0x03ba:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x03bf:
            com.google.android.gms.internal.ads.C3643iy.m19174c(r0)
            com.google.android.gms.internal.ads.ii r1 = com.google.android.gms.ads.internal.zzbv.zzeo()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.mo13047a(r2, r0)
            r14.m19333d()
            java.util.concurrent.CountDownLatch r0 = r14.f14598u
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3802ov.run():void");
    }
}
