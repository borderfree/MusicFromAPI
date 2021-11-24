package com.seattleclouds.modules.nativetetris;

import android.graphics.Point;
import com.seattleclouds.modules.nativetetris.BlockObject.BlockState;
import com.seattleclouds.modules.nativetetris.BlockObject.RotateDirection;

/* renamed from: com.seattleclouds.modules.nativetetris.d */
public class C5906d extends BlockObject {
    public C5906d() {
        this.f20857a.y -= 2;
        m28974d();
    }

    /* renamed from: d */
    private void m28974d() {
        this.f20858b[0] = new Point(0, 2);
        this.f20858b[1] = new Point(0, 3);
        this.f20858b[2] = new Point(1, 2);
        this.f20858b[3] = new Point(1, 3);
        this.f20859c = BlockState.STATE_0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo18658a() {
        return 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18661a(RotateDirection rotateDirection) {
    }
}
