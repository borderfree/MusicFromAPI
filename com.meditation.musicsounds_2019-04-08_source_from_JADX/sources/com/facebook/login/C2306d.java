package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.C2177c;
import com.facebook.C2185d;
import com.facebook.C2189f;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.C2236o;
import com.facebook.internal.C2264y;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.C2200a;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.facebook.login.d */
public class C2306d {

    /* renamed from: a */
    private static final Set<String> f7398a = m10705c();

    /* renamed from: b */
    private static volatile C2306d f7399b;

    /* renamed from: c */
    private LoginBehavior f7400c = LoginBehavior.NATIVE_WITH_FALLBACK;

    /* renamed from: d */
    private DefaultAudience f7401d = DefaultAudience.FRIENDS;

    /* renamed from: e */
    private final SharedPreferences f7402e;

    /* renamed from: com.facebook.login.d$a */
    private static class C2309a implements C2312f {

        /* renamed from: a */
        private final C2236o f7406a;

        C2309a(C2236o oVar) {
            C2264y.m10422a((Object) oVar, "fragment");
            this.f7406a = oVar;
        }

        /* renamed from: a */
        public Activity mo8085a() {
            return this.f7406a.mo7861a();
        }

        /* renamed from: a */
        public void mo8086a(Intent intent, int i) {
            this.f7406a.mo7862a(intent, i);
        }
    }

    /* renamed from: com.facebook.login.d$b */
    private static class C2310b {

        /* renamed from: a */
        private static C2305c f7407a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static synchronized C2305c m10718b(Context context) {
            synchronized (C2310b.class) {
                if (context == null) {
                    context = C2189f.m10092f();
                }
                if (context == null) {
                    return null;
                }
                if (f7407a == null) {
                    f7407a = new C2305c(context, C2189f.m10096j());
                }
                C2305c cVar = f7407a;
                return cVar;
            }
        }
    }

    C2306d() {
        C2264y.m10419a();
        this.f7402e = C2189f.m10092f().getSharedPreferences("com.facebook.loginManager", 0);
    }

    /* renamed from: a */
    public static C2306d m10693a() {
        if (f7399b == null) {
            synchronized (C2306d.class) {
                if (f7399b == null) {
                    f7399b = new C2306d();
                }
            }
        }
        return f7399b;
    }

    /* renamed from: a */
    static C2311e m10694a(Request request, AccessToken accessToken) {
        Set a = request.mo8027a();
        HashSet hashSet = new HashSet(accessToken.mo6520d());
        if (request.mo8035f()) {
            hashSet.retainAll(a);
        }
        HashSet hashSet2 = new HashSet(a);
        hashSet2.removeAll(hashSet);
        return new C2311e(accessToken, hashSet, hashSet2);
    }

    /* renamed from: a */
    private void m10695a(Context context, Request request) {
        C2305c a = C2310b.m10718b(context);
        if (a != null && request != null) {
            a.mo8071a(request);
        }
    }

    /* renamed from: a */
    private void m10696a(Context context, Code code, Map<String, String> map, Exception exc, boolean z, Request request) {
        C2305c a = C2310b.m10718b(context);
        if (a != null) {
            if (request == null) {
                a.mo8077c("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("try_login_activity", z ? "1" : "0");
                a.mo8075a(request.mo8034e(), hashMap, code, map, exc);
            }
        }
    }

    /* renamed from: a */
    private void m10697a(AccessToken accessToken, Request request, FacebookException facebookException, boolean z, C2185d<C2311e> dVar) {
        if (accessToken != null) {
            AccessToken.m7989a(accessToken);
            Profile.m8108b();
        }
        if (dVar != null) {
            C2311e a = accessToken != null ? m10694a(request, accessToken) : null;
            if (z || (a != null && a.mo8088b().size() == 0)) {
                dVar.mo7742a();
            } else if (facebookException != null) {
                dVar.mo7743a(facebookException);
            } else if (accessToken != null) {
                m10700a(true);
                dVar.mo7744a(a);
            }
        }
    }

    /* renamed from: a */
    private void m10698a(C2236o oVar, Collection<String> collection) {
        m10703b(collection);
        m10699a((C2312f) new C2309a(oVar), mo8079a(collection));
    }

    /* renamed from: a */
    private void m10699a(C2312f fVar, Request request) {
        m10695a((Context) fVar.mo8085a(), request);
        CallbackManagerImpl.m10136a(RequestCodeOffset.Login.toRequestCode(), new C2200a() {
            /* renamed from: a */
            public boolean mo7800a(int i, Intent intent) {
                return C2306d.this.mo8082a(i, intent);
            }
        });
        if (!m10704b(fVar, request)) {
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            m10696a(fVar.mo8085a(), Code.ERROR, null, facebookException, false, request);
            throw facebookException;
        }
    }

    /* renamed from: a */
    private void m10700a(boolean z) {
        Editor edit = this.f7402e.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    /* renamed from: a */
    private boolean m10701a(Intent intent) {
        return C2189f.m10092f().getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* renamed from: a */
    static boolean m10702a(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || f7398a.contains(str));
    }

    /* renamed from: b */
    private void m10703b(Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                if (m10702a(str)) {
                    throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{str}));
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m10704b(C2312f fVar, Request request) {
        Intent a = mo8078a(request);
        if (!m10701a(a)) {
            return false;
        }
        try {
            fVar.mo8086a(a, LoginClient.m10578d());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Set<String> m10705c() {
        return Collections.unmodifiableSet(new LoginManager$2());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo8078a(Request request) {
        Intent intent = new Intent();
        intent.setClass(C2189f.m10092f(), FacebookActivity.class);
        intent.setAction(request.mo8030b().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Request mo8079a(Collection<String> collection) {
        Request request = new Request(this.f7400c, Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet()), this.f7401d, C2189f.m10096j(), UUID.randomUUID().toString());
        request.mo8029a(AccessToken.m7985a() != null);
        return request;
    }

    /* renamed from: a */
    public void mo8080a(Fragment fragment, Collection<String> collection) {
        m10698a(new C2236o(fragment), collection);
    }

    /* renamed from: a */
    public void mo8081a(C2177c cVar, final C2185d<C2311e> dVar) {
        if (cVar instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) cVar).mo7798b(RequestCodeOffset.Login.toRequestCode(), new C2200a() {
                /* renamed from: a */
                public boolean mo7800a(int i, Intent intent) {
                    return C2306d.this.mo8083a(i, intent, dVar);
                }
            });
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo8082a(int i, Intent intent) {
        return mo8083a(i, intent, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo8083a(int i, Intent intent, C2185d<C2311e> dVar) {
        Map map;
        Code code;
        boolean z;
        AccessToken accessToken;
        Request request;
        Request request2;
        Map map2;
        AccessToken accessToken2;
        int i2 = i;
        Intent intent2 = intent;
        Code code2 = Code.ERROR;
        FacebookException facebookException = null;
        boolean z2 = false;
        if (intent2 != null) {
            Result result = (Result) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                Request request3 = result.f7377e;
                Code code3 = result.f7373a;
                if (i2 == -1) {
                    if (result.f7373a == Code.SUCCESS) {
                        accessToken2 = result.f7374b;
                    } else {
                        facebookException = new FacebookAuthorizationException(result.f7375c);
                        accessToken2 = null;
                    }
                } else if (i2 == 0) {
                    accessToken2 = null;
                    z2 = true;
                } else {
                    accessToken2 = null;
                }
                map2 = result.f7378f;
                Code code4 = code3;
                request2 = request3;
                code2 = code4;
            } else {
                accessToken2 = null;
                map2 = null;
                request2 = null;
            }
            map = map2;
            code = code2;
            z = z2;
            Request request4 = request2;
            accessToken = accessToken2;
            request = request4;
        } else if (i2 == 0) {
            code = Code.CANCEL;
            request = null;
            accessToken = null;
            map = null;
            z = true;
        } else {
            code = code2;
            request = null;
            accessToken = null;
            map = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        m10696a(null, code, map, facebookException, true, request);
        m10697a(accessToken, request, facebookException, z, dVar);
        return true;
    }

    /* renamed from: b */
    public void mo8084b() {
        AccessToken.m7989a((AccessToken) null);
        Profile.m8107a(null);
        m10700a(false);
    }
}
