package com.seattleclouds.modules.nativetetris;

import android.graphics.Point;
import com.seattleclouds.modules.nativetetris.BlockObject.BlockState;
import com.seattleclouds.modules.nativetetris.BlockObject.RotateDirection;

/* renamed from: com.seattleclouds.modules.nativetetris.g */
public class C5911g extends BlockObject {
    public C5911g() {
        this.f20857a.y--;
        m28987d();
    }

    /* renamed from: d */
    private void m28987d() {
        this.f20858b[0] = new Point(0, 2);
        this.f20858b[1] = new Point(0, 3);
        this.f20858b[2] = new Point(1, 1);
        this.f20858b[3] = new Point(1, 2);
        this.f20859c = BlockState.STATE_0;
    }

    /* renamed from: e */
    private void m28988e() {
        this.f20858b[0] = new Point(0, 2);
        this.f20858b[1] = new Point(1, 2);
        this.f20858b[2] = new Point(1, 3);
        this.f20858b[3] = new Point(2, 3);
        this.f20859c = BlockState.STATE_90;
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
    /* renamed from: a */
    public void mo18661a(RotateDirection rotateDirection) {
        switch (this.f20859c) {
            case STATE_0:
                m28988e();
                return;
            default:
                m28987d();
                return;
        }
    }
}
