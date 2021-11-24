package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.internal.measurement.C4321df;
import com.google.android.gms.internal.measurement.C4332dq;
import com.google.android.gms.internal.measurement.C4333dr;
import com.google.android.gms.internal.measurement.C4339dx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.h */
public final class C4756h {

    /* renamed from: A */
    public static C4757a<Long> f17111A = C4757a.m23790a("measurement.upload.window_interval", 3600000, 3600000);

    /* renamed from: B */
    public static C4757a<Long> f17112B = C4757a.m23790a("measurement.upload.interval", 3600000, 3600000);

    /* renamed from: C */
    public static C4757a<Long> f17113C = C4757a.m23790a("measurement.upload.realtime_upload_interval", 10000, 10000);

    /* renamed from: D */
    public static C4757a<Long> f17114D = C4757a.m23790a("measurement.upload.debug_upload_interval", 1000, 1000);

    /* renamed from: E */
    public static C4757a<Long> f17115E = C4757a.m23790a("measurement.upload.minimum_delay", 500, 500);

    /* renamed from: F */
    public static C4757a<Long> f17116F = C4757a.m23790a("measurement.alarm_manager.minimum_interval", 60000, 60000);

    /* renamed from: G */
    public static C4757a<Long> f17117G = C4757a.m23790a("measurement.upload.stale_data_deletion_interval", 86400000, 86400000);

    /* renamed from: H */
    public static C4757a<Long> f17118H = C4757a.m23790a("measurement.upload.refresh_blacklisted_config_interval", 604800000, 604800000);

    /* renamed from: I */
    public static C4757a<Long> f17119I = C4757a.m23790a("measurement.upload.initial_upload_delay_time", 15000, 15000);

    /* renamed from: J */
    public static C4757a<Long> f17120J = C4757a.m23790a("measurement.upload.retry_time", 1800000, 1800000);

    /* renamed from: K */
    public static C4757a<Integer> f17121K = C4757a.m23789a("measurement.upload.retry_count", 6, 6);

    /* renamed from: L */
    public static C4757a<Long> f17122L = C4757a.m23790a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);

    /* renamed from: M */
    public static C4757a<Integer> f17123M = C4757a.m23789a("measurement.lifetimevalue.max_currency_tracked", 4, 4);

    /* renamed from: N */
    public static C4757a<Integer> f17124N = C4757a.m23789a("measurement.audience.filter_result_max_count", 200, 200);

    /* renamed from: O */
    public static C4757a<Long> f17125O = C4757a.m23790a("measurement.service_client.idle_disconnect_millis", 5000, 5000);

    /* renamed from: P */
    public static C4757a<Boolean> f17126P = C4757a.m23792a("measurement.test.boolean_flag", false, false);

    /* renamed from: Q */
    public static C4757a<String> f17127Q;

    /* renamed from: R */
    public static C4757a<Long> f17128R = C4757a.m23790a("measurement.test.long_flag", -1, -1);

    /* renamed from: S */
    public static C4757a<Integer> f17129S = C4757a.m23789a("measurement.test.int_flag", -2, -2);

    /* renamed from: T */
    public static C4757a<Double> f17130T = C4757a.m23788a("measurement.test.double_flag", -3.0d, -3.0d);

    /* renamed from: U */
    public static C4757a<Integer> f17131U = C4757a.m23789a("measurement.experiment.max_ids", 50, 50);

    /* renamed from: V */
    public static C4757a<Boolean> f17132V = C4757a.m23792a("measurement.lifetimevalue.user_engagement_tracking_enabled", true, true);

    /* renamed from: W */
    public static C4757a<Boolean> f17133W = C4757a.m23792a("measurement.audience.complex_param_evaluation", true, true);

    /* renamed from: X */
    public static C4757a<Boolean> f17134X = C4757a.m23792a("measurement.validation.internal_limits_internal_event_params", false, false);

    /* renamed from: Y */
    public static C4757a<Boolean> f17135Y = C4757a.m23792a("measurement.quality.unsuccessful_update_retry_counter", true, true);

    /* renamed from: Z */
    public static C4757a<Boolean> f17136Z = C4757a.m23792a("measurement.iid.disable_on_collection_disabled", true, true);

    /* renamed from: a */
    static C4742eq f17137a;

    /* renamed from: aA */
    private static C4757a<Boolean> f17138aA = C4757a.m23792a("measurement.log_upgrades_enabled", false, false);

    /* renamed from: aa */
    public static C4757a<Boolean> f17139aa = C4757a.m23792a("measurement.app_launch.call_only_when_enabled", true, true);

    /* renamed from: ab */
    public static C4757a<Boolean> f17140ab = C4757a.m23792a("measurement.run_on_worker_inline", true, false);

    /* renamed from: ac */
    public static C4757a<Boolean> f17141ac = C4757a.m23792a("measurement.audience.dynamic_filters", true, true);

    /* renamed from: ad */
    public static C4757a<Boolean> f17142ad = C4757a.m23792a("measurement.reset_analytics.persist_time", false, false);

    /* renamed from: ae */
    public static C4757a<Boolean> f17143ae = C4757a.m23792a("measurement.validation.value_and_currency_params", false, false);

    /* renamed from: af */
    public static C4757a<Boolean> f17144af = C4757a.m23792a("measurement.sampling.time_zone_offset_enabled", false, false);

    /* renamed from: ag */
    public static C4757a<Boolean> f17145ag = C4757a.m23792a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false, false);

    /* renamed from: ah */
    public static C4757a<Boolean> f17146ah = C4757a.m23792a("measurement.fetch_config_with_admob_app_id", true, true);

    /* renamed from: ai */
    public static C4757a<Boolean> f17147ai = C4757a.m23792a("measurement.sessions.session_id_enabled", false, false);

    /* renamed from: aj */
    public static C4757a<Boolean> f17148aj = C4757a.m23792a("measurement.sessions.session_number_enabled", false, false);

    /* renamed from: ak */
    public static C4757a<Boolean> f17149ak = C4757a.m23792a("measurement.sessions.immediate_start_enabled", false, false);

    /* renamed from: al */
    public static C4757a<Boolean> f17150al = C4757a.m23792a("measurement.sessions.background_sessions_enabled", false, false);

    /* renamed from: am */
    public static C4757a<Boolean> f17151am = C4757a.m23792a("measurement.collection.firebase_global_collection_flag_enabled", true, true);

    /* renamed from: an */
    public static C4757a<Boolean> f17152an = C4757a.m23792a("measurement.collection.efficient_engagement_reporting_enabled", false, false);

    /* renamed from: ao */
    public static C4757a<Boolean> f17153ao = C4757a.m23792a("measurement.collection.redundant_engagement_removal_enabled", false, false);

    /* renamed from: ap */
    public static C4757a<Boolean> f17154ap = C4757a.m23792a("measurement.remove_app_instance_id_cache_enabled", true, true);

    /* renamed from: aq */
    public static C4757a<Boolean> f17155aq = C4757a.m23792a("measurement.collection.init_params_control_enabled", true, true);

    /* renamed from: ar */
    public static C4757a<Boolean> f17156ar = C4757a.m23792a("measurement.upload.disable_is_uploader", false, false);

    /* renamed from: as */
    public static C4757a<Boolean> f17157as = C4757a.m23792a("measurement.experiment.enable_experiment_reporting", false, false);

    /* renamed from: at */
    public static C4757a<Boolean> f17158at = C4757a.m23792a("measurement.collection.log_event_and_bundle_v2", true, true);

    /* renamed from: au */
    public static C4757a<Boolean> f17159au = C4757a.m23792a("measurement.collection.null_empty_event_name_fix", true, true);
    /* access modifiers changed from: private */

    /* renamed from: av */
    public static final C4339dx f17160av = new C4339dx(C4332dq.m21266a("com.google.android.gms.measurement"));

    /* renamed from: aw */
    private static volatile C4638av f17161aw;

    /* renamed from: ax */
    private static Boolean f17162ax;

    /* renamed from: ay */
    private static C4757a<Boolean> f17163ay = C4757a.m23792a("measurement.log_third_party_store_events_enabled", false, false);

    /* renamed from: az */
    private static C4757a<Boolean> f17164az = C4757a.m23792a("measurement.log_installs_enabled", false, false);

    /* renamed from: b */
    static List<C4757a<Integer>> f17165b = new ArrayList();

    /* renamed from: c */
    static List<C4757a<Long>> f17166c = new ArrayList();

    /* renamed from: d */
    static List<C4757a<Boolean>> f17167d = new ArrayList();

    /* renamed from: e */
    static List<C4757a<String>> f17168e = new ArrayList();

    /* renamed from: f */
    static List<C4757a<Double>> f17169f = new ArrayList();

    /* renamed from: g */
    public static C4757a<Boolean> f17170g = C4757a.m23792a("measurement.log_androidId_enabled", false, false);

    /* renamed from: h */
    public static C4757a<Boolean> f17171h = C4757a.m23792a("measurement.upload_dsid_enabled", false, false);

    /* renamed from: i */
    public static C4757a<String> f17172i = C4757a.m23791a("measurement.log_tag", "FA", "FA-SVC");

    /* renamed from: j */
    public static C4757a<Long> f17173j = C4757a.m23790a("measurement.ad_id_cache_time", 10000, 10000);

    /* renamed from: k */
    public static C4757a<Long> f17174k = C4757a.m23790a("measurement.monitoring.sample_period_millis", 86400000, 86400000);

    /* renamed from: l */
    public static C4757a<Long> f17175l = C4757a.m23790a("measurement.config.cache_time", 86400000, 3600000);

    /* renamed from: m */
    public static C4757a<String> f17176m;

    /* renamed from: n */
    public static C4757a<String> f17177n;

    /* renamed from: o */
    public static C4757a<Integer> f17178o = C4757a.m23789a("measurement.upload.max_bundles", 100, 100);

    /* renamed from: p */
    public static C4757a<Integer> f17179p = C4757a.m23789a("measurement.upload.max_batch_size", 65536, 65536);

    /* renamed from: q */
    public static C4757a<Integer> f17180q = C4757a.m23789a("measurement.upload.max_bundle_size", 65536, 65536);

    /* renamed from: r */
    public static C4757a<Integer> f17181r = C4757a.m23789a("measurement.upload.max_events_per_bundle", 1000, 1000);

    /* renamed from: s */
    public static C4757a<Integer> f17182s = C4757a.m23789a("measurement.upload.max_events_per_day", 100000, 100000);

    /* renamed from: t */
    public static C4757a<Integer> f17183t = C4757a.m23789a("measurement.upload.max_error_events_per_day", 1000, 1000);

    /* renamed from: u */
    public static C4757a<Integer> f17184u = C4757a.m23789a("measurement.upload.max_public_events_per_day", 50000, 50000);

    /* renamed from: v */
    public static C4757a<Integer> f17185v = C4757a.m23789a("measurement.upload.max_conversions_per_day", 500, 500);

    /* renamed from: w */
    public static C4757a<Integer> f17186w = C4757a.m23789a("measurement.upload.max_realtime_events_per_day", 10, 10);

    /* renamed from: x */
    public static C4757a<Integer> f17187x = C4757a.m23789a("measurement.store.max_stored_events_per_app", 100000, 100000);

    /* renamed from: y */
    public static C4757a<String> f17188y;

    /* renamed from: z */
    public static C4757a<Long> f17189z = C4757a.m23790a("measurement.upload.backoff_period", 43200000, 43200000);

    /* renamed from: com.google.android.gms.measurement.internal.h$a */
    public static final class C4757a<V> {

        /* renamed from: a */
        private C4333dr<V> f17190a;

        /* renamed from: b */
        private final V f17191b;

        /* renamed from: c */
        private final V f17192c;

        /* renamed from: d */
        private volatile V f17193d;

        /* renamed from: e */
        private final String f17194e;

        private C4757a(String str, V v, V v2) {
            this.f17194e = str;
            this.f17192c = v;
            this.f17191b = v2;
        }

        /* renamed from: a */
        static C4757a<Double> m23788a(String str, double d, double d2) {
            C4757a<Double> aVar = new C4757a<>(str, Double.valueOf(-3.0d), Double.valueOf(-3.0d));
            C4756h.f17169f.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C4757a<Integer> m23789a(String str, int i, int i2) {
            C4757a<Integer> aVar = new C4757a<>(str, Integer.valueOf(i), Integer.valueOf(i2));
            C4756h.f17165b.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C4757a<Long> m23790a(String str, long j, long j2) {
            C4757a<Long> aVar = new C4757a<>(str, Long.valueOf(j), Long.valueOf(j2));
            C4756h.f17166c.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C4757a<String> m23791a(String str, String str2, String str3) {
            C4757a<String> aVar = new C4757a<>(str, str2, str3);
            C4756h.f17168e.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C4757a<Boolean> m23792a(String str, boolean z, boolean z2) {
            C4757a<Boolean> aVar = new C4757a<>(str, Boolean.valueOf(z), Boolean.valueOf(z2));
            C4756h.f17167d.add(aVar);
            return aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static void m23794d() {
            synchronized (C4757a.class) {
                for (C4757a aVar : C4756h.f17167d) {
                    C4339dx a = C4756h.f17160av;
                    String str = aVar.f17194e;
                    C4742eq eqVar = C4756h.f17137a;
                    aVar.f17190a = a.mo14292a(str, ((Boolean) aVar.f17192c).booleanValue());
                }
                for (C4757a aVar2 : C4756h.f17168e) {
                    C4339dx a2 = C4756h.f17160av;
                    String str2 = aVar2.f17194e;
                    C4742eq eqVar2 = C4756h.f17137a;
                    aVar2.f17190a = a2.mo14291a(str2, (String) aVar2.f17192c);
                }
                for (C4757a aVar3 : C4756h.f17166c) {
                    C4339dx a3 = C4756h.f17160av;
                    String str3 = aVar3.f17194e;
                    C4742eq eqVar3 = C4756h.f17137a;
                    aVar3.f17190a = a3.mo14290a(str3, ((Long) aVar3.f17192c).longValue());
                }
                for (C4757a aVar4 : C4756h.f17165b) {
                    C4339dx a4 = C4756h.f17160av;
                    String str4 = aVar4.f17194e;
                    C4742eq eqVar4 = C4756h.f17137a;
                    aVar4.f17190a = a4.mo14289a(str4, ((Integer) aVar4.f17192c).intValue());
                }
                for (C4757a aVar5 : C4756h.f17169f) {
                    C4339dx a5 = C4756h.f17160av;
                    String str5 = aVar5.f17194e;
                    C4742eq eqVar5 = C4756h.f17137a;
                    aVar5.f17190a = a5.mo14288a(str5, ((Double) aVar5.f17192c).doubleValue());
                }
            }
        }

        /* renamed from: e */
        private static void m23795e() {
            synchronized (C4757a.class) {
                if (!C4742eq.m23658a()) {
                    C4742eq eqVar = C4756h.f17137a;
                    try {
                        for (C4757a aVar : C4756h.f17167d) {
                            aVar.f17193d = aVar.f17190a.mo14287d();
                        }
                        for (C4757a aVar2 : C4756h.f17168e) {
                            aVar2.f17193d = aVar2.f17190a.mo14287d();
                        }
                        for (C4757a aVar3 : C4756h.f17166c) {
                            aVar3.f17193d = aVar3.f17190a.mo14287d();
                        }
                        for (C4757a aVar4 : C4756h.f17165b) {
                            aVar4.f17193d = aVar4.f17190a.mo14287d();
                        }
                        for (C4757a aVar5 : C4756h.f17169f) {
                            aVar5.f17193d = aVar5.f17190a.mo14287d();
                        }
                    } catch (SecurityException e) {
                        C4756h.m23787a((Exception) e);
                    }
                } else {
                    throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
                }
            }
        }

        /* renamed from: a */
        public final V mo15819a(V v) {
            if (v != null) {
                return v;
            }
            if (C4756h.f17137a == null) {
                return this.f17192c;
            }
            C4742eq eqVar = C4756h.f17137a;
            if (C4742eq.m23658a()) {
                return this.f17193d == null ? this.f17192c : this.f17193d;
            }
            m23795e();
            try {
                return this.f17190a.mo14287d();
            } catch (SecurityException e) {
                C4756h.m23787a((Exception) e);
                return this.f17190a.mo14286c();
            }
        }

        /* renamed from: a */
        public final String mo15820a() {
            return this.f17194e;
        }

        /* renamed from: b */
        public final V mo15821b() {
            if (C4756h.f17137a == null) {
                return this.f17192c;
            }
            C4742eq eqVar = C4756h.f17137a;
            if (C4742eq.m23658a()) {
                return this.f17193d == null ? this.f17192c : this.f17193d;
            }
            m23795e();
            try {
                return this.f17190a.mo14287d();
            } catch (SecurityException e) {
                C4756h.m23787a((Exception) e);
                return this.f17190a.mo14286c();
            }
        }
    }

    static {
        String str = "https";
        f17176m = C4757a.m23791a("measurement.config.url_scheme", str, str);
        String str2 = "app-measurement.com";
        f17177n = C4757a.m23791a("measurement.config.url_authority", str2, str2);
        String str3 = "https://app-measurement.com/a";
        f17188y = C4757a.m23791a("measurement.upload.url", str3, str3);
        String str4 = "---";
        f17127Q = C4757a.m23791a("measurement.test.string_flag", str4, str4);
    }

    /* renamed from: a */
    public static Map<String, String> m23784a(Context context) {
        return C4321df.m21246a(context.getContentResolver(), C4332dq.m21266a("com.google.android.gms.measurement")).mo14276a();
    }

    /* renamed from: a */
    static void m23785a(C4638av avVar) {
        f17161aw = avVar;
    }

    /* renamed from: a */
    static void m23786a(C4742eq eqVar) {
        f17137a = eqVar;
        C4757a.m23794d();
    }

    /* renamed from: a */
    static void m23787a(Exception exc) {
        if (f17161aw != null) {
            Context n = f17161aw.mo15249n();
            if (f17162ax == null) {
                f17162ax = Boolean.valueOf(C3182e.m14660b().mo11117b(n, (int) C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0);
            }
            if (f17162ax.booleanValue()) {
                f17161aw.mo15253r().mo15852u_().mo15859a("Got Exception on PhenotypeFlag.get on Play device", exc);
            }
        }
    }
}
