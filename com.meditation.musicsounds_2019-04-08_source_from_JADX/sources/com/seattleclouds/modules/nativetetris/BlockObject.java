package com.seattleclouds.modules.nativetetris;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;

public abstract class BlockObject implements Cloneable {

    /* renamed from: a */
    protected Point f20857a = new Point(4, 0);

    /* renamed from: b */
    protected Point[] f20858b = new Point[4];

    /* renamed from: c */
    protected BlockState f20859c = BlockState.STATE_0;

    /* renamed from: d */
    protected String f20860d = "green";

    public enum BlockState {
        STATE_0,
        STATE_90,
        STATE_180,
        STATE_270
    }

    public enum RotateDirection {
        CLOCKWISE,
        COUNTER_CLOCKWISE
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract int mo18658a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18659a(int i, int i2) {
        this.f20857a.x = i;
        this.f20857a.y = i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18660a(Canvas canvas, Drawable drawable, int i, int i2) {
        int i3 = ((this.f20857a.x + this.f20858b[0].x) * i) + i2;
        int i4 = (this.f20857a.y + this.f20858b[0].y) * i;
        drawable.setBounds(i3, i4, i3 + i, i4 + i);
        drawable.draw(canvas);
        int i5 = ((this.f20857a.x + this.f20858b[1].x) * i) + i2;
        int i6 = (this.f20857a.y + this.f20858b[1].y) * i;
        drawable.setBounds(i5, i6, i5 + i, i6 + i);
        drawable.draw(canvas);
        int i7 = ((this.f20857a.x + this.f20858b[2].x) * i) + i2;
        int i8 = (this.f20857a.y + this.f20858b[2].y) * i;
        drawable.setBounds(i7, i8, i7 + i, i8 + i);
        drawable.draw(canvas);
        int i9 = ((this.f20857a.x + this.f20858b[3].x) * i) + i2;
        int i10 = (this.f20857a.y + this.f20858b[3].y) * i;
        drawable.setBounds(i9, i10, i9 + i, i + i10);
        drawable.draw(canvas);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo18661a(RotateDirection rotateDirection);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Point mo18662b() {
        return this.f20857a;
    }

    /* renamed from: c */
    public BlockObject clone() {
        BlockObject blockObject = (BlockObject) super.clone();
        blockObject.f20857a.x = this.f20857a.x;
        blockObject.f20857a.y = this.f20857a.y;
        blockObject.f20858b = (Point[]) this.f20858b.clone();
        blockObject.f20859c = this.f20859c;
        blockObject.f20860d = this.f20860d;
        return blockObject;
    }
}
