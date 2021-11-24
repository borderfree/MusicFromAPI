package com.google.firebase.iid;

import android.support.annotation.Keep;
import com.google.firebase.C4890b;
import com.google.firebase.components.C4900a;
import com.google.firebase.components.C4905d;
import com.google.firebase.components.C4906e;
import com.google.firebase.iid.p137a.C4922a;
import com.google.firebase.p134a.C4883d;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements C4905d {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    private static class C4920a implements C4922a {

        /* renamed from: a */
        private final FirebaseInstanceId f17689a;

        public C4920a(FirebaseInstanceId firebaseInstanceId) {
            this.f17689a = firebaseInstanceId;
        }
    }

    @Keep
    public final List<C4900a<?>> getComponents() {
        return Arrays.asList(new C4900a[]{C4900a.m24437a(FirebaseInstanceId.class).mo16128a(C4906e.m24461a(C4890b.class)).mo16128a(C4906e.m24461a(C4883d.class)).mo16127a(C4963p.f17776a).mo16126a().mo16130c(), C4900a.m24437a(C4922a.class).mo16128a(C4906e.m24461a(FirebaseInstanceId.class)).mo16127a(C4964q.f17777a).mo16130c()});
    }
}
