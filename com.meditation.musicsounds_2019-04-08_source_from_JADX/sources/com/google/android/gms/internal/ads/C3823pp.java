package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.pp */
public final class C3823pp extends C3817pj {

    /* renamed from: b */
    private static final Set<String> f14666b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    private static final DecimalFormat f14667c = new DecimalFormat("#,###");

    /* renamed from: d */
    private File f14668d;

    /* renamed from: e */
    private boolean f14669e;

    public C3823pp(C3804ox oxVar) {
        super(oxVar);
        File cacheDir = this.f14648a.getCacheDir();
        if (cacheDir == null) {
            C3643iy.m19178e("Context.getCacheDir() returned null");
            return;
        }
        this.f14668d = new File(cacheDir, "admobVideoStreams");
        if (!this.f14668d.isDirectory() && !this.f14668d.mkdirs()) {
            String str = "Could not create preload cache directory at ";
            String valueOf = String.valueOf(this.f14668d.getAbsolutePath());
            C3643iy.m19178e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f14668d = null;
        } else if (!this.f14668d.setReadable(true, false) || !this.f14668d.setExecutable(true, false)) {
            String str2 = "Could not set cache file permissions at ";
            String valueOf2 = String.valueOf(this.f14668d.getAbsolutePath());
            C3643iy.m19178e(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
            this.f14668d = null;
        }
    }

    /* renamed from: a */
    private final File m19399a(File file) {
        return new File(this.f14668d, String.valueOf(file.getName()).concat(".done"));
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r25v0 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r25v2 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r25v3 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r25v4, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r25v5 */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r25v6 */
    /* JADX WARNING: type inference failed for: r25v7 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r25v8, types: [int] */
    /* JADX WARNING: type inference failed for: r25v9 */
    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: type inference failed for: r25v10 */
    /* JADX WARNING: type inference failed for: r25v11 */
    /* JADX WARNING: type inference failed for: r25v12 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r25v13 */
    /* JADX WARNING: type inference failed for: r25v14 */
    /* JADX WARNING: type inference failed for: r25v15 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r10v19 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r10v20 */
    /* JADX WARNING: type inference failed for: r25v16 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r25v17 */
    /* JADX WARNING: type inference failed for: r25v18 */
    /* JADX WARNING: type inference failed for: r25v19 */
    /* JADX WARNING: type inference failed for: r25v20 */
    /* JADX WARNING: type inference failed for: r25v21 */
    /* JADX WARNING: type inference failed for: r25v22 */
    /* JADX WARNING: type inference failed for: r25v23 */
    /* JADX WARNING: type inference failed for: r25v24 */
    /* JADX WARNING: type inference failed for: r25v25 */
    /* JADX WARNING: type inference failed for: r25v26 */
    /* JADX WARNING: type inference failed for: r25v27 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:211|212|213|214|215|216|217) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f3, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01fe, code lost:
        if (r1 < 400) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0200, code lost:
        r2 = "badUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0202, code lost:
        r0 = "HTTP request failed. Code: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r3 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0210, code lost:
        if (r3.length() == 0) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0212, code lost:
        r3 = r0.concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0218, code lost:
        r3 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r5.append("HTTP status code ");
        r5.append(r1);
        r5.append(" at ");
        r5.append(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0245, code lost:
        throw new java.io.IOException(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0246, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0247, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0249, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x024a, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r7 = r5.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0250, code lost:
        if (r7 >= 0) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0252, code lost:
        r0 = "Stream cache aborted, missing content-length header at ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x025c, code lost:
        if (r1.length() == 0) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x025e, code lost:
        r0 = r0.concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0263, code lost:
        r0 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0269, code lost:
        com.google.android.gms.internal.ads.C3643iy.m19178e(r0);
        mo13448a(r9, r12.getAbsolutePath(), "contentLengthMissing", null);
        f14666b.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x027a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r1 = f14667c.format((long) r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.ane.m16650f().mo12297a(com.google.android.gms.internal.ads.aqm.f12905o)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0292, code lost:
        if (r7 <= r3) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r9);
        com.google.android.gms.internal.ads.C3643iy.m19178e(r2.toString());
        r0 = "File too big for full file cache. Size: ";
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02cd, code lost:
        if (r1.length() == 0) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02cf, code lost:
        r0 = r0.concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d4, code lost:
        r0 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02da, code lost:
        mo13448a(r9, r12.getAbsolutePath(), "sizeExceeded", r0);
        f14666b.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e8, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r9);
        com.google.android.gms.internal.ads.C3643iy.m19172b(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.zzbv.zzer();
        r17 = r16.mo11326a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0342, code lost:
        r20 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0344, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r10 = new com.google.android.gms.internal.ads.C3708li(((java.lang.Long) com.google.android.gms.internal.ads.ane.m16650f().mo12297a(com.google.android.gms.internal.ads.aqm.f12908r)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.ane.m16650f().mo12297a(com.google.android.gms.internal.ads.aqm.f12907q)).longValue();
        r6 = 0;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x035e, code lost:
        r21 = r5.read(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0362, code lost:
        if (r21 < 0) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0364, code lost:
        r6 = r6 + r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0366, code lost:
        if (r6 <= r3) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0368, code lost:
        r1 = "sizeExceeded";
        r0 = "File too big for full file cache. Size: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0378, code lost:
        if (r2.length() == 0) goto L_0x0380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x037a, code lost:
        r10 = r0.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0385, code lost:
        r10 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x038d, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x038e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x038f, code lost:
        r15 = r1;
        r3 = r10;
        r1 = r20;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0396, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0397, code lost:
        r15 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x039a, code lost:
        r10 = r4;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x039f, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r1.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03a6, code lost:
        if (r2.write(r1) > 0) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a8, code lost:
        r1.clear();
        r25 = ((r16.mo11326a() - r17) > (1000 * r13) ? 1 : ((r16.mo11326a() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b9, code lost:
        if (r25 > 0) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03bd, code lost:
        if (r8.f14669e != false) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c3, code lost:
        if (r10.mo13219a() == false) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c5, code lost:
        r11 = r12.getAbsolutePath();
        r26 = r10;
        r10 = com.google.android.gms.internal.ads.C3719lt.f14416a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03cd, code lost:
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03cf, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03d1, code lost:
        r22 = r1;
        r1 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r4 = r11;
        r11 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03ec, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r1 = new com.google.android.gms.internal.ads.C3818pk(r30, r31, r4, r6, r7, false);
        r10.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03f4, code lost:
        r25 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03f8, code lost:
        r22 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r11 = r5;
        r19 = r6;
        r29 = r7;
        r26 = r10;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x040b, code lost:
        r5 = r11;
        r6 = r19;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r4 = r25;
        r10 = r26;
        r15 = r27;
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x041f, code lost:
        r25 = r4;
        r27 = r15;
        r15 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x042c, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x042d, code lost:
        r25 = r4;
        r27 = r15;
        r15 = "downloadTimeout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0433, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x045e, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x045f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0460, code lost:
        r3 = r2.toString();
        r1 = r20;
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0467, code lost:
        r0 = e;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x046a, code lost:
        r25 = r4;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0470, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0477, code lost:
        if (com.google.android.gms.internal.ads.C3643iy.m19171a(3) == false) goto L_0x04af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0479, code lost:
        r1 = f14667c.format((long) r6);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r9);
        com.google.android.gms.internal.ads.C3643iy.m19172b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04af, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04b8, code lost:
        if (r0.isFile() == false) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04ba, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r0.createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04c5, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        mo13447a(r9, r12.getAbsolutePath(), r6);
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ce, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        f14666b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04d4, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04d5, code lost:
        r0 = e;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04d7, code lost:
        r0 = e;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04d8, code lost:
        r1 = r20;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04da, code lost:
        r10 = r25;
        r15 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04df, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04e0, code lost:
        r25 = r4;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04e4, code lost:
        r1 = r20;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04e7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04e8, code lost:
        r25 = r4;
        r1 = r14;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04ed, code lost:
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04ef, code lost:
        r3 = null;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04f1, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04fb, code lost:
        throw new java.io.IOException("Invalid protocol.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04fc, code lost:
        r1 = r14;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0506, code lost:
        throw new java.io.IOException("Too many redirects (20)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0507, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0508, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x050b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x050c, code lost:
        r1 = r14;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x050f, code lost:
        r3 = null;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0513, code lost:
        if ((r0 instanceof java.lang.RuntimeException) != false) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0515, code lost:
        com.google.android.gms.ads.internal.zzbv.zzeo().mo13047a(r0, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0523, code lost:
        if (r8.f14669e == false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0525, code lost:
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 26);
        r2.append("Preload aborted for URL \"");
        r2.append(r9);
        r2.append("\"");
        com.google.android.gms.internal.ads.C3643iy.m19176d(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0549, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 25);
        r4.append("Preload failed for URL \"");
        r4.append(r9);
        r4.append("\"");
        com.google.android.gms.internal.ads.C3643iy.m19175c(r4.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0578, code lost:
        r0 = "Could not delete partial cache file at ";
        r2 = java.lang.String.valueOf(r12.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0586, code lost:
        if (r2.length() == 0) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0588, code lost:
        r0 = r0.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x058d, code lost:
        r0 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0593, code lost:
        com.google.android.gms.internal.ads.C3643iy.m19178e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0596, code lost:
        mo13448a(r9, r12.getAbsolutePath(), r15, r3);
        f14666b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05a3, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x040b, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0134, code lost:
        r15 = "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.google.android.gms.ads.internal.zzbv.zzew();
        r1 = ((java.lang.Integer) com.google.android.gms.internal.ads.ane.m16650f().mo12297a(com.google.android.gms.internal.ads.aqm.f12909s)).intValue();
        r3 = new java.net.URL(r9);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0150, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0153, code lost:
        if (r2 > 20) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0155, code lost:
        r5 = r3.openConnection();
        r5.setConnectTimeout(r1);
        r5.setReadTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0161, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0163, code lost:
        r5 = (java.net.HttpURLConnection) r5;
        r6 = new com.google.android.gms.internal.ads.C3723lx();
        r6.mo13240a(r5, (byte[]) null);
        r5.setInstanceFollowRedirects(false);
        r7 = r5.getResponseCode();
        r6.mo13239a(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x017a, code lost:
        if ((r7 / 100) != 3) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4 = r5.getHeaderField("Location");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0182, code lost:
        if (r4 == null) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0184, code lost:
        r6 = new java.net.URL(r3, r4);
        r3 = r6.getProtocol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018d, code lost:
        if (r3 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0195, code lost:
        if (r3.equals("http") != false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019d, code lost:
        if (r3.equals("https") != false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019f, code lost:
        r1 = "Unsupported scheme: ";
        r2 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ab, code lost:
        if (r2.length() == 0) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ad, code lost:
        r1 = r1.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b2, code lost:
        r1 = new java.lang.String(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bb, code lost:
        throw new java.io.IOException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bc, code lost:
        r3 = "Redirecting to ";
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c6, code lost:
        if (r4.length() == 0) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c8, code lost:
        r3 = r3.concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01cd, code lost:
        r3 = new java.lang.String(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d3, code lost:
        com.google.android.gms.internal.ads.C3643iy.m19172b(r3);
        r5.disconnect();
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e3, code lost:
        throw new java.io.IOException("Protocol is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01eb, code lost:
        throw new java.io.IOException("Missing Location header in redirect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ec, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ed, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ee, code lost:
        r1 = r14;
        r10 = r10;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:211:0x04c5 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r10v3
      assigns: []
      uses: []
      mth insns count: 558
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x058d  */
    /* JADX WARNING: Unknown variable types count: 17 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13449a(java.lang.String r31) {
        /*
            r30 = this;
            r8 = r30
            r9 = r31
            java.io.File r0 = r8.f14668d
            r10 = 0
            r11 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "noCacheDir"
        L_0x000c:
            r8.mo13448a(r9, r10, r0, r10)
            return r11
        L_0x0010:
            java.io.File r0 = r8.f14668d
            if (r0 != 0) goto L_0x0016
            r3 = 0
            goto L_0x0034
        L_0x0016:
            java.io.File r0 = r8.f14668d
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x001f:
            if (r2 >= r1) goto L_0x0034
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ".done"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L_0x0031
            int r3 = r3 + 1
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x0034:
            com.google.android.gms.internal.ads.aqc<java.lang.Integer> r0 = com.google.android.gms.internal.ads.aqm.f12904n
            com.google.android.gms.internal.ads.aqk r1 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r0 = r1.mo12297a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 <= r0) goto L_0x0098
            java.io.File r0 = r8.f14668d
            if (r0 != 0) goto L_0x004c
        L_0x004a:
            r0 = 0
            goto L_0x008d
        L_0x004c:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.io.File r2 = r8.f14668d
            java.io.File[] r2 = r2.listFiles()
            int r3 = r2.length
            r4 = r0
            r1 = r10
            r0 = 0
        L_0x005b:
            if (r0 >= r3) goto L_0x0078
            r6 = r2[r0]
            java.lang.String r7 = r6.getName()
            java.lang.String r12 = ".done"
            boolean r7 = r7.endsWith(r12)
            if (r7 != 0) goto L_0x0075
            long r12 = r6.lastModified()
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0075
            r1 = r6
            r4 = r12
        L_0x0075:
            int r0 = r0 + 1
            goto L_0x005b
        L_0x0078:
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.delete()
            java.io.File r1 = r8.m19399a(r1)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L_0x008d
            boolean r1 = r1.delete()
            r0 = r0 & r1
        L_0x008d:
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Unable to expire stream cache"
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)
            java.lang.String r0 = "expireFailed"
            goto L_0x000c
        L_0x0098:
            com.google.android.gms.internal.ads.ane.m16645a()
            java.lang.String r0 = com.google.android.gms.internal.ads.C3719lt.m19110a(r31)
            java.io.File r12 = new java.io.File
            java.io.File r1 = r8.f14668d
            r12.<init>(r1, r0)
            java.io.File r0 = r8.m19399a(r12)
            boolean r1 = r12.isFile()
            r13 = 1
            if (r1 == 0) goto L_0x00de
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L_0x00de
            long r0 = r12.length()
            int r0 = (int) r0
            java.lang.String r1 = "Stream cache hit at "
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00cd
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00d3
        L_0x00cd:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00d3:
            com.google.android.gms.internal.ads.C3643iy.m19172b(r1)
            java.lang.String r1 = r12.getAbsolutePath()
            r8.mo13447a(r9, r1, r0)
            return r13
        L_0x00de:
            java.io.File r1 = r8.f14668d
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00f8
            java.lang.String r1 = r1.concat(r2)
            r14 = r1
            goto L_0x00fe
        L_0x00f8:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r14 = r2
        L_0x00fe:
            java.util.Set<java.lang.String> r1 = f14666b
            monitor-enter(r1)
            java.util.Set<java.lang.String> r2 = f14666b     // Catch:{ all -> 0x05a4 }
            boolean r2 = r2.contains(r14)     // Catch:{ all -> 0x05a4 }
            if (r2 == 0) goto L_0x012e
            java.lang.String r0 = "Stream cache already in progress at "
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ all -> 0x05a4 }
            int r3 = r2.length()     // Catch:{ all -> 0x05a4 }
            if (r3 == 0) goto L_0x011a
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x05a4 }
            goto L_0x0120
        L_0x011a:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x05a4 }
            r2.<init>(r0)     // Catch:{ all -> 0x05a4 }
            r0 = r2
        L_0x0120:
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)     // Catch:{ all -> 0x05a4 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x05a4 }
            java.lang.String r2 = "inProgress"
            r8.mo13448a(r9, r0, r2, r10)     // Catch:{ all -> 0x05a4 }
            monitor-exit(r1)     // Catch:{ all -> 0x05a4 }
            return r11
        L_0x012e:
            java.util.Set<java.lang.String> r2 = f14666b     // Catch:{ all -> 0x05a4 }
            r2.add(r14)     // Catch:{ all -> 0x05a4 }
            monitor-exit(r1)     // Catch:{ all -> 0x05a4 }
            java.lang.String r15 = "error"
            com.google.android.gms.ads.internal.zzbv.zzew()     // Catch:{ IOException | RuntimeException -> 0x050b }
            com.google.android.gms.internal.ads.aqc<java.lang.Integer> r1 = com.google.android.gms.internal.ads.aqm.f12909s     // Catch:{ IOException | RuntimeException -> 0x050b }
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.lang.Object r1 = r2.mo12297a(r1)     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException | RuntimeException -> 0x050b }
            int r1 = r1.intValue()     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException | RuntimeException -> 0x050b }
            r2.<init>(r9)     // Catch:{ IOException | RuntimeException -> 0x050b }
            r3 = r2
            r2 = 0
        L_0x0150:
            int r2 = r2 + r13
            r4 = 20
            if (r2 > r4) goto L_0x04fc
            java.net.URLConnection r5 = r3.openConnection()     // Catch:{ IOException | RuntimeException -> 0x050b }
            r5.setConnectTimeout(r1)     // Catch:{ IOException | RuntimeException -> 0x050b }
            r5.setReadTimeout(r1)     // Catch:{ IOException | RuntimeException -> 0x050b }
            boolean r6 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException | RuntimeException -> 0x050b }
            if (r6 == 0) goto L_0x04f1
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException | RuntimeException -> 0x050b }
            com.google.android.gms.internal.ads.lx r6 = new com.google.android.gms.internal.ads.lx     // Catch:{ IOException | RuntimeException -> 0x050b }
            r6.<init>()     // Catch:{ IOException | RuntimeException -> 0x050b }
            r6.mo13240a(r5, r10)     // Catch:{ IOException | RuntimeException -> 0x050b }
            r5.setInstanceFollowRedirects(r11)     // Catch:{ IOException | RuntimeException -> 0x050b }
            int r7 = r5.getResponseCode()     // Catch:{ IOException | RuntimeException -> 0x050b }
            r6.mo13239a(r5, r7)     // Catch:{ IOException | RuntimeException -> 0x050b }
            int r7 = r7 / 100
            r6 = 3
            if (r7 != r6) goto L_0x01f1
            java.lang.String r4 = "Location"
            java.lang.String r4 = r5.getHeaderField(r4)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            if (r4 == 0) goto L_0x01e4
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r6.<init>(r3, r4)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.lang.String r3 = r6.getProtocol()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            if (r3 == 0) goto L_0x01dc
            java.lang.String r7 = "http"
            boolean r7 = r3.equals(r7)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            if (r7 != 0) goto L_0x01bc
            java.lang.String r7 = "https"
            boolean r7 = r3.equals(r7)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            if (r7 != 0) goto L_0x01bc
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.lang.String r1 = "Unsupported scheme: "
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            int r3 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            if (r3 == 0) goto L_0x01b2
            java.lang.String r1 = r1.concat(r2)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            goto L_0x01b8
        L_0x01b2:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r2.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r1 = r2
        L_0x01b8:
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x01ec }
        L_0x01bc:
            java.lang.String r3 = "Redirecting to "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            int r7 = r4.length()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            if (r7 == 0) goto L_0x01cd
            java.lang.String r3 = r3.concat(r4)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            goto L_0x01d3
        L_0x01cd:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r4.<init>(r3)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r3 = r4
        L_0x01d3:
            com.google.android.gms.internal.ads.C3643iy.m19172b(r3)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r5.disconnect()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r3 = r6
            goto L_0x0150
        L_0x01dc:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.lang.String r1 = "Protocol is null"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x01ec }
        L_0x01e4:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.lang.String r1 = "Missing Location header in redirect"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x01ec }
        L_0x01ec:
            r0 = move-exception
        L_0x01ed:
            r3 = r10
        L_0x01ee:
            r1 = r14
            goto L_0x0511
        L_0x01f1:
            boolean r1 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException | RuntimeException -> 0x050b }
            if (r1 == 0) goto L_0x024c
            r1 = r5
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException | RuntimeException -> 0x01ec }
            int r1 = r1.getResponseCode()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 < r2) goto L_0x024c
            java.lang.String r2 = "badUrl"
            java.lang.String r0 = "HTTP request failed. Code: "
            java.lang.String r3 = java.lang.Integer.toString(r1)     // Catch:{ IOException | RuntimeException -> 0x0249 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException | RuntimeException -> 0x0249 }
            int r4 = r3.length()     // Catch:{ IOException | RuntimeException -> 0x0249 }
            if (r4 == 0) goto L_0x0218
            java.lang.String r0 = r0.concat(r3)     // Catch:{ IOException | RuntimeException -> 0x0249 }
            r3 = r0
            goto L_0x021d
        L_0x0218:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x0249 }
            r3.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0249 }
        L_0x021d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0246 }
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x0246 }
            int r4 = r4.length()     // Catch:{ IOException | RuntimeException -> 0x0246 }
            int r4 = r4 + 32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x0246 }
            r5.<init>(r4)     // Catch:{ IOException | RuntimeException -> 0x0246 }
            java.lang.String r4 = "HTTP status code "
            r5.append(r4)     // Catch:{ IOException | RuntimeException -> 0x0246 }
            r5.append(r1)     // Catch:{ IOException | RuntimeException -> 0x0246 }
            java.lang.String r1 = " at "
            r5.append(r1)     // Catch:{ IOException | RuntimeException -> 0x0246 }
            r5.append(r9)     // Catch:{ IOException | RuntimeException -> 0x0246 }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException | RuntimeException -> 0x0246 }
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x0246 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0246 }
        L_0x0246:
            r0 = move-exception
            r15 = r2
            goto L_0x01ee
        L_0x0249:
            r0 = move-exception
            r15 = r2
            goto L_0x01ed
        L_0x024c:
            int r7 = r5.getContentLength()     // Catch:{ IOException | RuntimeException -> 0x050b }
            if (r7 >= 0) goto L_0x027b
            java.lang.String r0 = "Stream cache aborted, missing content-length header at "
            java.lang.String r1 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            int r2 = r1.length()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            if (r2 == 0) goto L_0x0263
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            goto L_0x0269
        L_0x0263:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r0 = r1
        L_0x0269:
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.lang.String r1 = "contentLengthMissing"
            r8.mo13448a(r9, r0, r1, r10)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.util.Set<java.lang.String> r0 = f14666b     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r0.remove(r14)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            return r11
        L_0x027b:
            java.text.DecimalFormat r1 = f14667c     // Catch:{ IOException | RuntimeException -> 0x050b }
            long r2 = (long) r7     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException | RuntimeException -> 0x050b }
            com.google.android.gms.internal.ads.aqc<java.lang.Integer> r2 = com.google.android.gms.internal.ads.aqm.f12905o     // Catch:{ IOException | RuntimeException -> 0x050b }
            com.google.android.gms.internal.ads.aqk r3 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.lang.Object r2 = r3.mo12297a(r2)     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException | RuntimeException -> 0x050b }
            int r3 = r2.intValue()     // Catch:{ IOException | RuntimeException -> 0x050b }
            if (r7 <= r3) goto L_0x02e9
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            int r0 = r0.length()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            int r0 = r0 + 33
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            int r2 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r2.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.lang.String r0 = "Content length "
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r2.append(r1)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.lang.String r0 = " exceeds limit at "
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r2.append(r9)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            int r2 = r1.length()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            if (r2 == 0) goto L_0x02d4
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            goto L_0x02da
        L_0x02d4:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r0 = r1
        L_0x02da:
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.lang.String r2 = "sizeExceeded"
            r8.mo13448a(r9, r1, r2, r0)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            java.util.Set<java.lang.String> r0 = f14666b     // Catch:{ IOException | RuntimeException -> 0x01ec }
            r0.remove(r14)     // Catch:{ IOException | RuntimeException -> 0x01ec }
            return r11
        L_0x02e9:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x050b }
            int r2 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x050b }
            int r2 = r2 + r4
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x050b }
            int r4 = r4.length()     // Catch:{ IOException | RuntimeException -> 0x050b }
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x050b }
            r4.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.lang.String r2 = "Caching "
            r4.append(r2)     // Catch:{ IOException | RuntimeException -> 0x050b }
            r4.append(r1)     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.lang.String r1 = " bytes from "
            r4.append(r1)     // Catch:{ IOException | RuntimeException -> 0x050b }
            r4.append(r9)     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException | RuntimeException -> 0x050b }
            com.google.android.gms.internal.ads.C3643iy.m19172b(r1)     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.nio.channels.ReadableByteChannel r5 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException | RuntimeException -> 0x050b }
            r4.<init>(r12)     // Catch:{ IOException | RuntimeException -> 0x050b }
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ IOException | RuntimeException -> 0x04e7 }
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ IOException | RuntimeException -> 0x04e7 }
            com.google.android.gms.common.util.e r16 = com.google.android.gms.ads.internal.zzbv.zzer()     // Catch:{ IOException | RuntimeException -> 0x04e7 }
            long r17 = r16.mo11326a()     // Catch:{ IOException | RuntimeException -> 0x04e7 }
            com.google.android.gms.internal.ads.aqc<java.lang.Long> r6 = com.google.android.gms.internal.ads.aqm.f12908r     // Catch:{ IOException | RuntimeException -> 0x04e7 }
            com.google.android.gms.internal.ads.aqk r10 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ IOException | RuntimeException -> 0x04e7 }
            java.lang.Object r6 = r10.mo12297a(r6)     // Catch:{ IOException | RuntimeException -> 0x04e7 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException | RuntimeException -> 0x04e7 }
            r20 = r14
            long r13 = r6.longValue()     // Catch:{ IOException | RuntimeException -> 0x04df }
            com.google.android.gms.internal.ads.li r10 = new com.google.android.gms.internal.ads.li     // Catch:{ IOException | RuntimeException -> 0x04df }
            r10.<init>(r13)     // Catch:{ IOException | RuntimeException -> 0x04df }
            com.google.android.gms.internal.ads.aqc<java.lang.Long> r6 = com.google.android.gms.internal.ads.aqm.f12907q     // Catch:{ IOException | RuntimeException -> 0x04df }
            com.google.android.gms.internal.ads.aqk r13 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ IOException | RuntimeException -> 0x04df }
            java.lang.Object r6 = r13.mo12297a(r6)     // Catch:{ IOException | RuntimeException -> 0x04df }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException | RuntimeException -> 0x04df }
            long r13 = r6.longValue()     // Catch:{ IOException | RuntimeException -> 0x04df }
            r6 = 0
        L_0x035e:
            int r21 = r5.read(r1)     // Catch:{ IOException | RuntimeException -> 0x04df }
            if (r21 < 0) goto L_0x046a
            int r6 = r6 + r21
            if (r6 <= r3) goto L_0x039f
            java.lang.String r1 = "sizeExceeded"
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r2 = java.lang.Integer.toString(r6)     // Catch:{ IOException | RuntimeException -> 0x0396 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException | RuntimeException -> 0x0396 }
            int r3 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x0396 }
            if (r3 == 0) goto L_0x0380
            java.lang.String r0 = r0.concat(r2)     // Catch:{ IOException | RuntimeException -> 0x0396 }
            r10 = r0
            goto L_0x0386
        L_0x0380:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x0396 }
            r2.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0396 }
            r10 = r2
        L_0x0386:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x038e }
            java.lang.String r2 = "stream cache file size limit exceeded"
            r0.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x038e }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x038e }
        L_0x038e:
            r0 = move-exception
            r15 = r1
            r3 = r10
            r1 = r20
            r10 = r4
            goto L_0x0511
        L_0x0396:
            r0 = move-exception
            r15 = r1
            goto L_0x039a
        L_0x0399:
            r0 = move-exception
        L_0x039a:
            r10 = r4
            r1 = r20
            goto L_0x04ef
        L_0x039f:
            r1.flip()     // Catch:{ IOException | RuntimeException -> 0x04df }
        L_0x03a2:
            int r21 = r2.write(r1)     // Catch:{ IOException | RuntimeException -> 0x04df }
            if (r21 > 0) goto L_0x03a2
            r1.clear()     // Catch:{ IOException | RuntimeException -> 0x04df }
            long r21 = r16.mo11326a()     // Catch:{ IOException | RuntimeException -> 0x04df }
            r23 = 0
            long r21 = r21 - r17
            r23 = 1000(0x3e8, double:4.94E-321)
            long r23 = r23 * r13
            int r25 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r25 > 0) goto L_0x042d
            boolean r11 = r8.f14669e     // Catch:{ IOException | RuntimeException -> 0x04df }
            if (r11 != 0) goto L_0x041f
            boolean r11 = r10.mo13219a()     // Catch:{ IOException | RuntimeException -> 0x04df }
            if (r11 == 0) goto L_0x03f8
            java.lang.String r11 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x04df }
            r26 = r10
            android.os.Handler r10 = com.google.android.gms.internal.ads.C3719lt.f14416a     // Catch:{ IOException | RuntimeException -> 0x04df }
            r27 = r15
            com.google.android.gms.internal.ads.pk r15 = new com.google.android.gms.internal.ads.pk     // Catch:{ IOException | RuntimeException -> 0x03f3 }
            r21 = 0
            r22 = r1
            r1 = r15
            r23 = r2
            r2 = r30
            r24 = r3
            r3 = r31
            r25 = r4
            r4 = r11
            r11 = r5
            r5 = r6
            r19 = r6
            r28 = 3
            r6 = r7
            r29 = r7
            r7 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            r10.post(r15)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            goto L_0x040b
        L_0x03f3:
            r0 = move-exception
            r25 = r4
            goto L_0x04d8
        L_0x03f8:
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r4
            r11 = r5
            r19 = r6
            r29 = r7
            r26 = r10
            r27 = r15
            r28 = 3
        L_0x040b:
            r5 = r11
            r6 = r19
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r10 = r26
            r15 = r27
            r7 = r29
            r11 = 0
            goto L_0x035e
        L_0x041f:
            r25 = r4
            r27 = r15
            java.lang.String r15 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0467 }
            java.lang.String r1 = "abort requested"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x0467 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0467 }
        L_0x042d:
            r25 = r4
            r27 = r15
            java.lang.String r15 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r13)     // Catch:{ IOException | RuntimeException -> 0x0467 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException | RuntimeException -> 0x0467 }
            int r1 = r1.length()     // Catch:{ IOException | RuntimeException -> 0x0467 }
            int r1 = r1 + 29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x0467 }
            r2.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x0467 }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r2.append(r1)     // Catch:{ IOException | RuntimeException -> 0x0467 }
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x0467 }
            java.lang.String r0 = " sec"
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x0467 }
            java.lang.String r10 = r2.toString()     // Catch:{ IOException | RuntimeException -> 0x0467 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x045f }
            java.lang.String r1 = "stream cache time limit exceeded"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x045f }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x045f }
        L_0x045f:
            r0 = move-exception
            r3 = r10
            r1 = r20
            r10 = r25
            goto L_0x0511
        L_0x0467:
            r0 = move-exception
            goto L_0x04e4
        L_0x046a:
            r25 = r4
            r27 = r15
            r28 = 3
            r25.close()     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            boolean r1 = com.google.android.gms.internal.ads.C3643iy.m19171a(r28)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            if (r1 == 0) goto L_0x04af
            java.text.DecimalFormat r1 = f14667c     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            long r2 = (long) r6     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            int r2 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            int r2 = r2 + 22
            java.lang.String r3 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            int r3 = r3.length()     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            r3.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            java.lang.String r2 = "Preloaded "
            r3.append(r2)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            r3.append(r1)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            java.lang.String r1 = " bytes from "
            r3.append(r1)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            r3.append(r9)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            com.google.android.gms.internal.ads.C3643iy.m19172b(r1)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
        L_0x04af:
            r1 = 0
            r2 = 1
            r12.setReadable(r2, r1)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            boolean r1 = r0.isFile()     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            if (r1 == 0) goto L_0x04c2
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            r0.setLastModified(r1)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            goto L_0x04c5
        L_0x04c2:
            r0.createNewFile()     // Catch:{ IOException -> 0x04c5 }
        L_0x04c5:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            r8.mo13447a(r9, r0, r6)     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            java.util.Set<java.lang.String> r0 = f14666b     // Catch:{ IOException | RuntimeException -> 0x04d7 }
            r1 = r20
            r0.remove(r1)     // Catch:{ IOException | RuntimeException -> 0x04d5 }
            r0 = 1
            return r0
        L_0x04d5:
            r0 = move-exception
            goto L_0x04da
        L_0x04d7:
            r0 = move-exception
        L_0x04d8:
            r1 = r20
        L_0x04da:
            r10 = r25
            r15 = r27
            goto L_0x04ef
        L_0x04df:
            r0 = move-exception
            r25 = r4
            r27 = r15
        L_0x04e4:
            r1 = r20
            goto L_0x04ed
        L_0x04e7:
            r0 = move-exception
            r25 = r4
            r1 = r14
            r27 = r15
        L_0x04ed:
            r10 = r25
        L_0x04ef:
            r3 = 0
            goto L_0x0511
        L_0x04f1:
            r1 = r14
            r27 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.lang.String r2 = "Invalid protocol."
            r0.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0507 }
        L_0x04fc:
            r1 = r14
            r27 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.lang.String r2 = "Too many redirects (20)"
            r0.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0507 }
        L_0x0507:
            r0 = move-exception
            r15 = r27
            goto L_0x050f
        L_0x050b:
            r0 = move-exception
            r1 = r14
            r27 = r15
        L_0x050f:
            r3 = 0
            r10 = 0
        L_0x0511:
            boolean r2 = r0 instanceof java.lang.RuntimeException
            if (r2 == 0) goto L_0x051e
            com.google.android.gms.internal.ads.ii r2 = com.google.android.gms.ads.internal.zzbv.zzeo()
            java.lang.String r4 = "VideoStreamFullFileCache.preload"
            r2.mo13047a(r0, r4)
        L_0x051e:
            r10.close()     // Catch:{ IOException | NullPointerException -> 0x0521 }
        L_0x0521:
            boolean r2 = r8.f14669e
            if (r2 == 0) goto L_0x0549
            java.lang.String r0 = java.lang.String.valueOf(r31)
            int r0 = r0.length()
            int r0 = r0 + 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "Preload aborted for URL \""
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = "\""
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.ads.C3643iy.m19176d(r0)
            goto L_0x056c
        L_0x0549:
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r2 = r2.length()
            int r2 = r2 + 25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.String r2 = "Preload failed for URL \""
            r4.append(r2)
            r4.append(r9)
            java.lang.String r2 = "\""
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.C3643iy.m19175c(r2, r0)
        L_0x056c:
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x0596
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x0596
            java.lang.String r0 = "Could not delete partial cache file at "
            java.lang.String r2 = r12.getAbsolutePath()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            if (r4 == 0) goto L_0x058d
            java.lang.String r0 = r0.concat(r2)
            goto L_0x0593
        L_0x058d:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            r0 = r2
        L_0x0593:
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)
        L_0x0596:
            java.lang.String r0 = r12.getAbsolutePath()
            r8.mo13448a(r9, r0, r15, r3)
            java.util.Set<java.lang.String> r0 = f14666b
            r0.remove(r1)
            r1 = 0
            return r1
        L_0x05a4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x05a4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3823pp.mo13449a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo13450b() {
        this.f14669e = true;
    }
}
