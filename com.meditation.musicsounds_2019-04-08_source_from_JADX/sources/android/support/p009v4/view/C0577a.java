package android.support.p009v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.view.p021a.C0583b;
import android.support.p009v4.view.p021a.C0587c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.view.a */
public class C0577a {

    /* renamed from: a */
    private static final C0580b f1692a = (VERSION.SDK_INT >= 16 ? new C0578a() : new C0580b());

    /* renamed from: c */
    private static final AccessibilityDelegate f1693c = new AccessibilityDelegate();

    /* renamed from: b */
    final AccessibilityDelegate f1694b = f1692a.mo2332a(this);

    /* renamed from: android.support.v4.view.a$a */
    static class C0578a extends C0580b {
        C0578a() {
        }

        /* renamed from: a */
        public C0587c mo2331a(AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C0587c(accessibilityNodeProvider);
            }
            return null;
        }

        /* renamed from: a */
        public AccessibilityDelegate mo2332a(final C0577a aVar) {
            return new AccessibilityDelegate() {
                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return aVar.mo2330d(view, accessibilityEvent);
                }

                public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    C0587c a = aVar.mo2325a(view);
                    if (a != null) {
                        return (AccessibilityNodeProvider) a.mo2403a();
                    }
                    return null;
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.mo474a(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    aVar.mo285a(view, C0583b.m2645a(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.mo805b(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return aVar.mo2328a(viewGroup, view, accessibilityEvent);
                }

                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    return aVar.mo2319a(view, i, bundle);
                }

                public void sendAccessibilityEvent(View view, int i) {
                    aVar.mo2327a(view, i);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.mo2329c(view, accessibilityEvent);
                }
            };
        }

        /* renamed from: a */
        public boolean mo2333a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: android.support.v4.view.a$b */
    static class C0580b {
        C0580b() {
        }

        /* renamed from: a */
        public C0587c mo2331a(AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }

        /* renamed from: a */
        public AccessibilityDelegate mo2332a(final C0577a aVar) {
            return new AccessibilityDelegate() {
                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return aVar.mo2330d(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.mo474a(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    aVar.mo285a(view, C0583b.m2645a(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.mo805b(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return aVar.mo2328a(viewGroup, view, accessibilityEvent);
                }

                public void sendAccessibilityEvent(View view, int i) {
                    aVar.mo2327a(view, i);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.mo2329c(view, accessibilityEvent);
                }
            };
        }

        /* renamed from: a */
        public boolean mo2333a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: a */
    public C0587c mo2325a(View view) {
        return f1692a.mo2331a(f1693c, view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public AccessibilityDelegate mo2326a() {
        return this.f1694b;
    }

    /* renamed from: a */
    public void mo2327a(View view, int i) {
        f1693c.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo285a(View view, C0583b bVar) {
        f1693c.onInitializeAccessibilityNodeInfo(view, bVar.mo2350a());
    }

    /* renamed from: a */
    public void mo474a(View view, AccessibilityEvent accessibilityEvent) {
        f1693c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo2319a(View view, int i, Bundle bundle) {
        return f1692a.mo2333a(f1693c, view, i, bundle);
    }

    /* renamed from: a */
    public boolean mo2328a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f1693c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo805b(View view, AccessibilityEvent accessibilityEvent) {
        f1693c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo2329c(View view, AccessibilityEvent accessibilityEvent) {
        f1693c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: d */
    public boolean mo2330d(View view, AccessibilityEvent accessibilityEvent) {
        return f1693c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
