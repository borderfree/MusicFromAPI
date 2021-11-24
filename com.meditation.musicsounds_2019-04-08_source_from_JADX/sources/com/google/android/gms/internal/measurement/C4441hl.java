package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.hl */
final class C4441hl extends C4440hk<FieldDescriptorType, Object> {
    C4441hl(int i) {
        super(i, null);
    }

    /* renamed from: a */
    public final void mo14592a() {
        if (!mo14594b()) {
            for (int i = 0; i < mo14595c(); i++) {
                Entry b = mo14593b(i);
                if (((C4378fh) b.getKey()).mo14483d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : mo14598d()) {
                if (((C4378fh) entry.getKey()).mo14483d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo14592a();
    }
}
