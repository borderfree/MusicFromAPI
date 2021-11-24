package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class aci extends ach<FieldDescriptorType, Object> {
    aci(int i) {
        super(i, null);
    }

    /* renamed from: a */
    public final void mo11640a() {
        if (!mo11642b()) {
            for (int i = 0; i < mo11643c(); i++) {
                Entry b = mo11641b(i);
                if (((aae) b.getKey()).mo11458d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : mo11646d()) {
                if (((aae) entry.getKey()).mo11458d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo11640a();
    }
}
