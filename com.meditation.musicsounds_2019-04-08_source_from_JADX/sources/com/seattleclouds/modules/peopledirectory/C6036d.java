package com.seattleclouds.modules.peopledirectory;

import android.os.Bundle;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.bitmapfun.C2422c;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6619m;
import java.util.regex.Pattern;

/* renamed from: com.seattleclouds.modules.peopledirectory.d */
public class C6036d extends C6557s {

    /* renamed from: a */
    private Person f21436a;

    /* renamed from: b */
    private C2422c f21437b;

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.people_directory_person_info, viewGroup, false);
        if (this.f21436a == null) {
            inflate.setVisibility(0);
            return inflate;
        }
        ImageView imageView = (ImageView) inflate.findViewById(C5458g.imageView);
        if (!C6592al.m31910c(this.f21436a.f21409f)) {
            this.f21437b = C6031b.m29562a(mo1318s(), mo1322u(), C6619m.m32014a(mo1318s(), 100.0f));
            this.f21437b.mo8578a((Object) this.f21436a.f21409f, imageView);
        }
        TextView textView = (TextView) inflate.findViewById(C5458g.secondNameTextView);
        TextView textView2 = (TextView) inflate.findViewById(C5458g.titleTextView);
        ((TextView) inflate.findViewById(C5458g.nameTextView)).setText(this.f21436a.f21404a);
        textView.setText(this.f21436a.f21405b);
        textView2.setText(this.f21436a.f21406c);
        if (C6592al.m31910c(this.f21436a.f21407d)) {
            inflate.findViewById(C5458g.phoneLayout).setVisibility(8);
        } else {
            TextView textView3 = (TextView) inflate.findViewById(C5458g.phoneTextView);
            textView3.setText(this.f21436a.f21407d);
            Linkify.addLinks(textView3, Pattern.compile(".*"), "tel:");
        }
        if (C6592al.m31910c(this.f21436a.f21408e)) {
            inflate.findViewById(C5458g.emailLayout).setVisibility(8);
        } else {
            TextView textView4 = (TextView) inflate.findViewById(C5458g.emailTextView);
            textView4.setText(this.f21436a.f21408e);
            Linkify.addLinks(textView4, 2);
        }
        if (C6592al.m31910c(this.f21436a.f21410g)) {
            inflate.findViewById(C5458g.descriptionTextView).setVisibility(8);
        } else {
            TextView textView5 = (TextView) inflate.findViewById(C5458g.descriptionTextView);
            textView5.setText(this.f21436a.f21410g);
            Linkify.addLinks(textView5, 15);
        }
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f21436a = (Person) m.getParcelable("ARG_PERSON");
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        super.mo1296i();
        if (this.f21437b != null) {
            this.f21437b.mo8585i();
            this.f21437b = null;
        }
    }
}
