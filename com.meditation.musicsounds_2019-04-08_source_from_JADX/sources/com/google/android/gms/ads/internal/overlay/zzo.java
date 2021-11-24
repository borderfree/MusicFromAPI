package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3719lt;
import com.google.android.gms.internal.ads.ane;
import javax.annotation.Nullable;

@C3464ci
public final class zzo extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    private final ImageButton f10081a;

    /* renamed from: b */
    private final zzw f10082b;

    public zzo(Context context, C2914f fVar, @Nullable zzw zzw) {
        super(context);
        this.f10082b = zzw;
        setOnClickListener(this);
        this.f10081a = new ImageButton(context);
        this.f10081a.setImageResource(17301527);
        this.f10081a.setBackgroundColor(0);
        this.f10081a.setOnClickListener(this);
        ImageButton imageButton = this.f10081a;
        ane.m16645a();
        int a = C3719lt.m19107a(context, fVar.f10053a);
        ane.m16645a();
        int a2 = C3719lt.m19107a(context, 0);
        ane.m16645a();
        int a3 = C3719lt.m19107a(context, fVar.f10054b);
        ane.m16645a();
        imageButton.setPadding(a, a2, a3, C3719lt.m19107a(context, fVar.f10056d));
        this.f10081a.setContentDescription("Interstitial close button");
        ane.m16645a();
        C3719lt.m19107a(context, fVar.f10057e);
        ImageButton imageButton2 = this.f10081a;
        ane.m16645a();
        int a4 = C3719lt.m19107a(context, fVar.f10057e + fVar.f10053a + fVar.f10054b);
        ane.m16645a();
        addView(imageButton2, new LayoutParams(a4, C3719lt.m19107a(context, fVar.f10057e + fVar.f10056d), 17));
    }

    public final void onClick(View view) {
        if (this.f10082b != null) {
            this.f10082b.zzni();
        }
    }

    public final void zzu(boolean z) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.f10081a;
            i = 8;
        } else {
            imageButton = this.f10081a;
            i = 0;
        }
        imageButton.setVisibility(i);
    }
}
