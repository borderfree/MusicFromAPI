package com.seattleclouds.previewer.appmart.order.colorpickerpalette;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;

/* renamed from: com.seattleclouds.previewer.appmart.order.colorpickerpalette.b */
public class C6445b extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    private int f22921a;

    /* renamed from: b */
    private ImageView f22922b = ((ImageView) findViewById(C5458g.color_picker_swatch));

    /* renamed from: c */
    private ImageView f22923c = ((ImageView) findViewById(C5458g.color_picker_checkmark));

    /* renamed from: d */
    private C6446a f22924d;

    /* renamed from: com.seattleclouds.previewer.appmart.order.colorpickerpalette.b$a */
    public interface C6446a {
        /* renamed from: d */
        void mo20082d(int i);
    }

    public C6445b(Context context, int i, boolean z, C6446a aVar) {
        super(context);
        this.f22921a = i;
        this.f22924d = aVar;
        LayoutInflater.from(context).inflate(C5460i.fragment_new_order_color_palette_swatch, this);
        this.f22923c.setScaleType(ScaleType.FIT_XY);
        setColor(i);
        setChecked(z);
        setOnClickListener(this);
    }

    private void setChecked(boolean z) {
        ImageView imageView;
        int i;
        if (z) {
            imageView = this.f22923c;
            i = 0;
        } else {
            imageView = this.f22923c;
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void onClick(View view) {
        if (this.f22924d != null) {
            this.f22924d.mo20082d(this.f22921a);
        }
    }

    /* access modifiers changed from: protected */
    public void setColor(int i) {
        this.f22922b.setImageDrawable(new C6447c(new Drawable[]{getContext().getResources().getDrawable(C5457f.color_picker_swatch_new_order)}, i));
    }
}
