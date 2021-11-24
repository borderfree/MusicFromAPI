package com.seattleclouds.modules.nativetetris;

import android.graphics.Point;
import com.seattleclouds.modules.nativetetris.BlockObject.BlockState;

/* renamed from: com.seattleclouds.modules.nativetetris.b */
public class C5902b extends BlockObject {
    public C5902b() {
        this.f20857a.y--;
        m28962d();
    }

    /* renamed from: d */
    private void m28962d() {
        this.f20858b[0] = new Point(0, 3);
        this.f20858b[1] = new Point(1, 1);
        this.f20858b[2] = new Point(1, 2);
        this.f20858b[3] = new Point(1, 3);
        this.f20859c = BlockState.STATE_0;
    }

    /* renamed from: e */
    private void m28963e() {
        this.f20858b[0] = new Point(0, 2);
        this.f20858b[1] = new Point(0, 3);
        this.f20858b[2] = new Point(1, 3);
        this.f20858b[3] = new Point(2, 3);
        this.f20859c = BlockState.STATE_90;
    }

    /* renamed from: f */
    private void m28964f() {
        this.f20858b[0] = new Point(0, 1);
        this.f20858b[1] = new Point(0, 2);
        this.f20858b[2] = new Point(0, 3);
        this.f20858b[3] = new Point(1, 1);
        this.f20859c = BlockState.STATE_180;
    }

    /* renamed from: g */
    private void m28965g() {
        this.f20858b[0] = new Point(0, 2);
        this.f20858b[1] = new Point(1, 2);
        this.f20858b[2] = new Point(2, 2);
        this.f20858b[3] = new Point(2, 3);
        this.f20859c = BlockState.STATE_270;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo18658a() {
        switch (this.f20859c) {
            case STATE_0:
                return 2;
            case STATE_90:
                return 3;
            case STATE_180:
                return 2;
            case STATE_270:
                return 3;
            default:
                return 2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        m28963e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        m28962d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        m28965g();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18661a(com.seattleclouds.modules.nativetetris.BlockObject.RotateDirection r2) {
        /*
            r1 = this;
            com.seattleclouds.modules.nativetetris.BlockObject$RotateDirection r0 = com.seattleclouds.modules.nativetetris.BlockObject.RotateDirection.CLOCKWISE
            if (r2 != r0) goto L_0x0012
            int[] r2 = com.seattleclouds.modules.nativetetris.C5902b.C59031.f20893a
            com.seattleclouds.modules.nativetetris.BlockObject$BlockState r0 = r1.f20859c
            int r0 = r0.ordinal()
            r2 = r2[r0]
            switch(r2) {
                case 1: goto L_0x0024;
                case 2: goto L_0x0020;
                case 3: goto L_0x002c;
                case 4: goto L_0x0028;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x002f
        L_0x0012:
            int[] r2 = com.seattleclouds.modules.nativetetris.C5902b.C59031.f20893a
            com.seattleclouds.modules.nativetetris.BlockObject$BlockState r0 = r1.f20859c
            int r0 = r0.ordinal()
            r2 = r2[r0]
            switch(r2) {
                case 1: goto L_0x002c;
                case 2: goto L_0x0028;
                case 3: goto L_0x0024;
                case 4: goto L_0x0020;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x002f
        L_0x0020:
            r1.m28964f()
            goto L_0x002f
        L_0x0024:
            r1.m28963e()
            goto L_0x002f
        L_0x0028:
            r1.m28962d()
            goto L_0x002f
        L_0x002c:
            r1.m28965g()
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.nativetetris.C5902b.mo18661a(com.seattleclouds.modules.nativetetris.BlockObject$RotateDirection):void");
    }
}
