package com.seattleclouds.modules.nativetetris;

import android.graphics.Point;
import com.seattleclouds.modules.nativetetris.BlockObject.BlockState;
import com.seattleclouds.modules.nativetetris.BlockObject.RotateDirection;

/* renamed from: com.seattleclouds.modules.nativetetris.a */
public class C5900a extends BlockObject {
    public C5900a() {
        m28958d();
    }

    /* renamed from: d */
    private void m28958d() {
        this.f20858b[0] = new Point(0, 0);
        this.f20858b[1] = new Point(0, 1);
        this.f20858b[2] = new Point(0, 2);
        this.f20858b[3] = new Point(0, 3);
        this.f20859c = BlockState.STATE_0;
    }

    /* renamed from: e */
    private void m28959e() {
        this.f20858b[0] = new Point(0, 3);
        this.f20858b[1] = new Point(1, 3);
        this.f20858b[2] = new Point(2, 3);
        this.f20858b[3] = new Point(3, 3);
        this.f20859c = BlockState.STATE_90;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo18658a() {
        switch (this.f20859c) {
            case STATE_0:
                return 1;
            case STATE_90:
                return 4;
            default:
                return 1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18661a(RotateDirection rotateDirection) {
        switch (this.f20859c) {
            case STATE_0:
                m28959e();
                return;
            default:
                m28958d();
                return;
        }
    }
}
