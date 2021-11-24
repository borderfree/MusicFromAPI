package com.seattleclouds.previewer.appmart.order.colorpickerpalette;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.seattleclouds.C5451m.C5456e;
import com.seattleclouds.previewer.appmart.order.colorpickerpalette.C6445b.C6446a;

public class NewOrderColorPickerPalette extends TableLayout {

    /* renamed from: a */
    public C6446a f22905a;

    /* renamed from: b */
    private String f22906b = "mDescription";

    /* renamed from: c */
    private String f22907c = "mDescriptionSelected";

    /* renamed from: d */
    private int f22908d;

    /* renamed from: e */
    private int f22909e;

    /* renamed from: f */
    private int f22910f;

    public NewOrderColorPickerPalette(Context context) {
        super(context);
    }

    public NewOrderColorPickerPalette(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private TableRow m31227a() {
        TableRow tableRow = new TableRow(getContext());
        tableRow.setLayoutParams(new LayoutParams(-2, -2));
        return tableRow;
    }

    /* renamed from: a */
    private C6445b m31228a(int i, int i2) {
        C6445b bVar = new C6445b(getContext(), i, i == i2, this.f22905a);
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(this.f22908d, this.f22908d);
        layoutParams.setMargins(this.f22909e, this.f22909e, this.f22909e, this.f22909e);
        bVar.setLayoutParams(layoutParams);
        return bVar;
    }

    /* renamed from: a */
    private void m31229a(int i, int i2, int i3, boolean z, View view, String[] strArr) {
        String str;
        String str2;
        Object[] objArr;
        if (strArr == null || strArr.length <= i2) {
            int i4 = i % 2 == 0 ? i2 + 1 : ((i + 1) * this.f22910f) - i3;
            if (z) {
                str2 = this.f22907c;
                objArr = new Object[]{Integer.valueOf(i4)};
            } else {
                str2 = this.f22906b;
                objArr = new Object[]{Integer.valueOf(i4)};
            }
            str = String.format(str2, objArr);
        } else {
            str = strArr[i2];
        }
        view.setContentDescription(str);
    }

    /* renamed from: a */
    private static void m31230a(TableRow tableRow, View view, int i) {
        if (i % 2 == 0) {
            tableRow.addView(view);
        } else {
            tableRow.addView(view, 0);
        }
    }

    /* renamed from: b */
    private ImageView m31231b() {
        ImageView imageView = new ImageView(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(this.f22908d, this.f22908d);
        layoutParams.setMargins(this.f22909e, this.f22909e, this.f22909e, this.f22909e);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    /* renamed from: a */
    public void mo20076a(int i, int i2, C6446a aVar) {
        this.f22910f = i2;
        Resources resources = getResources();
        this.f22908d = resources.getDimensionPixelSize(C5456e.color_swatch_small);
        this.f22909e = resources.getDimensionPixelSize(C5456e.color_swatch_margins_small);
        this.f22905a = aVar;
    }

    /* renamed from: a */
    public void mo20077a(int[] iArr, int i) {
        mo20078a(iArr, i, (String[]) null);
    }

    /* renamed from: a */
    public void mo20078a(int[] iArr, int i, String[] strArr) {
        int[] iArr2 = iArr;
        int i2 = i;
        if (iArr2 != null) {
            removeAllViews();
            TableRow a = m31227a();
            int length = iArr2.length;
            TableRow tableRow = a;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = iArr2[i6];
                C6445b a2 = m31228a(i7, i2);
                C6445b bVar = a2;
                TableRow tableRow2 = tableRow;
                m31229a(i3, i4, i5, i7 == i2, a2, strArr);
                m31230a(tableRow2, (View) bVar, i3);
                i4++;
                int i8 = i5 + 1;
                if (i8 == this.f22910f) {
                    addView(tableRow2);
                    i3++;
                    tableRow = m31227a();
                    i5 = 0;
                } else {
                    i5 = i8;
                    tableRow = tableRow2;
                }
            }
            TableRow tableRow3 = tableRow;
            if (i5 > 0) {
                while (i5 != this.f22910f) {
                    m31230a(tableRow3, (View) m31231b(), i3);
                    i5++;
                }
                addView(tableRow3);
            }
        }
    }
}
