package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.l */
public class C0033l extends Fragment {

    /* renamed from: a */
    private C0034a f67a;

    /* renamed from: android.arch.lifecycle.l$a */
    interface C0034a {
        /* renamed from: a */
        void mo78a();

        /* renamed from: b */
        void mo79b();

        /* renamed from: c */
        void mo80c();
    }

    /* renamed from: a */
    public static void m118a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0033l(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m119a(Event event) {
        Activity activity = getActivity();
        if (activity instanceof C0027f) {
            ((C0027f) activity).mo69b().mo66a(event);
            return;
        }
        if (activity instanceof C0023d) {
            Lifecycle B_ = ((C0023d) activity).mo65B_();
            if (B_ instanceof C0024e) {
                ((C0024e) B_).mo66a(event);
            }
        }
    }

    /* renamed from: a */
    private void m120a(C0034a aVar) {
        if (aVar != null) {
            aVar.mo78a();
        }
    }

    /* renamed from: b */
    private void m121b(C0034a aVar) {
        if (aVar != null) {
            aVar.mo79b();
        }
    }

    /* renamed from: c */
    private void m122c(C0034a aVar) {
        if (aVar != null) {
            aVar.mo80c();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m120a(this.f67a);
        m119a(Event.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m119a(Event.ON_DESTROY);
        this.f67a = null;
    }

    public void onPause() {
        super.onPause();
        m119a(Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m122c(this.f67a);
        m119a(Event.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m121b(this.f67a);
        m119a(Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        m119a(Event.ON_STOP);
    }
}
