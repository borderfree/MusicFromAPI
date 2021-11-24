package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ba */
public final class C4262ba {

    /* renamed from: A */
    public static C4263bb<Long> f15741A = C4263bb.m21038a("analytics.service_client.idle_disconnect_millis", 10000, 10000);

    /* renamed from: B */
    public static C4263bb<Long> f15742B = C4263bb.m21038a("analytics.service_client.connect_timeout_millis", 5000, 5000);

    /* renamed from: C */
    public static C4263bb<Long> f15743C = C4263bb.m21038a("analytics.service_client.reconnect_throttle_millis", 1800000, 1800000);

    /* renamed from: D */
    public static C4263bb<Long> f15744D = C4263bb.m21038a("analytics.monitoring.sample_period_millis", 86400000, 86400000);

    /* renamed from: E */
    public static C4263bb<Long> f15745E = C4263bb.m21038a("analytics.initialization_warning_threshold", 5000, 5000);

    /* renamed from: F */
    public static C4263bb<Boolean> f15746F = C4263bb.m21040a("analytics.gcm_task_service", false, false);

    /* renamed from: G */
    private static C4263bb<Boolean> f15747G = C4263bb.m21040a("analytics.service_enabled", false, false);

    /* renamed from: H */
    private static C4263bb<Long> f15748H = C4263bb.m21038a("analytics.max_tokens", 60, 60);

    /* renamed from: I */
    private static C4263bb<Float> f15749I = C4263bb.m21036a("analytics.tokens_per_sec", 0.5f, 0.5f);

    /* renamed from: J */
    private static C4263bb<Integer> f15750J = C4263bb.m21037a("analytics.max_stored_hits_per_app", 2000, 2000);

    /* renamed from: K */
    private static C4263bb<Long> f15751K = C4263bb.m21038a("analytics.min_local_dispatch_millis", 120000, 120000);

    /* renamed from: L */
    private static C4263bb<Long> f15752L = C4263bb.m21038a("analytics.max_local_dispatch_millis", 7200000, 7200000);

    /* renamed from: M */
    private static C4263bb<Integer> f15753M = C4263bb.m21037a("analytics.max_hits_per_request.k", 20, 20);

    /* renamed from: N */
    private static C4263bb<Long> f15754N = C4263bb.m21038a("analytics.service_monitor_interval", 86400000, 86400000);

    /* renamed from: O */
    private static C4263bb<String> f15755O;

    /* renamed from: P */
    private static C4263bb<Integer> f15756P = C4263bb.m21037a("analytics.first_party_experiment_variant", 0, 0);

    /* renamed from: Q */
    private static C4263bb<Long> f15757Q = C4263bb.m21038a("analytics.service_client.second_connect_delay_millis", 5000, 5000);

    /* renamed from: R */
    private static C4263bb<Long> f15758R = C4263bb.m21038a("analytics.service_client.unexpected_reconnect_millis", 60000, 60000);

    /* renamed from: a */
    public static C4263bb<Boolean> f15759a = C4263bb.m21040a("analytics.service_client_enabled", true, true);

    /* renamed from: b */
    public static C4263bb<String> f15760b = C4263bb.m21039a("analytics.log_tag", "GAv4", "GAv4-SVC");

    /* renamed from: c */
    public static C4263bb<Integer> f15761c = C4263bb.m21037a("analytics.max_stored_hits", 2000, 20000);

    /* renamed from: d */
    public static C4263bb<Integer> f15762d = C4263bb.m21037a("analytics.max_stored_properties_per_app", 100, 100);

    /* renamed from: e */
    public static C4263bb<Long> f15763e = C4263bb.m21038a("analytics.local_dispatch_millis", 1800000, 120000);

    /* renamed from: f */
    public static C4263bb<Long> f15764f = C4263bb.m21038a("analytics.initial_local_dispatch_millis", 5000, 5000);

    /* renamed from: g */
    public static C4263bb<Long> f15765g = C4263bb.m21038a("analytics.dispatch_alarm_millis", 7200000, 7200000);

    /* renamed from: h */
    public static C4263bb<Long> f15766h = C4263bb.m21038a("analytics.max_dispatch_alarm_millis", 32400000, 32400000);

    /* renamed from: i */
    public static C4263bb<Integer> f15767i = C4263bb.m21037a("analytics.max_hits_per_dispatch", 20, 20);

    /* renamed from: j */
    public static C4263bb<Integer> f15768j = C4263bb.m21037a("analytics.max_hits_per_batch", 20, 20);

    /* renamed from: k */
    public static C4263bb<String> f15769k;

    /* renamed from: l */
    public static C4263bb<String> f15770l;

    /* renamed from: m */
    public static C4263bb<String> f15771m;

    /* renamed from: n */
    public static C4263bb<String> f15772n;

    /* renamed from: o */
    public static C4263bb<Integer> f15773o = C4263bb.m21037a("analytics.max_get_length", 2036, 2036);

    /* renamed from: p */
    public static C4263bb<String> f15774p = C4263bb.m21039a("analytics.batching_strategy.k", zzbn.BATCH_BY_COUNT.name(), zzbn.BATCH_BY_COUNT.name());

    /* renamed from: q */
    public static C4263bb<String> f15775q;

    /* renamed from: r */
    public static C4263bb<Integer> f15776r = C4263bb.m21037a("analytics.max_hit_length.k", 8192, 8192);

    /* renamed from: s */
    public static C4263bb<Integer> f15777s = C4263bb.m21037a("analytics.max_post_length.k", 8192, 8192);

    /* renamed from: t */
    public static C4263bb<Integer> f15778t = C4263bb.m21037a("analytics.max_batch_post_length", 8192, 8192);

    /* renamed from: u */
    public static C4263bb<String> f15779u;

    /* renamed from: v */
    public static C4263bb<Integer> f15780v = C4263bb.m21037a("analytics.batch_retry_interval.seconds.k", 3600, 3600);

    /* renamed from: w */
    public static C4263bb<Integer> f15781w = C4263bb.m21037a("analytics.http_connection.connect_timeout_millis", 60000, 60000);

    /* renamed from: x */
    public static C4263bb<Integer> f15782x = C4263bb.m21037a("analytics.http_connection.read_timeout_millis", 61000, 61000);

    /* renamed from: y */
    public static C4263bb<Long> f15783y = C4263bb.m21038a("analytics.campaigns.time_limit", 86400000, 86400000);

    /* renamed from: z */
    public static C4263bb<Boolean> f15784z = C4263bb.m21040a("analytics.test.disable_receiver", false, false);

    static {
        String str = "http://www.google-analytics.com";
        f15769k = C4263bb.m21039a("analytics.insecure_host", str, str);
        String str2 = "https://ssl.google-analytics.com";
        f15770l = C4263bb.m21039a("analytics.secure_host", str2, str2);
        String str3 = "/collect";
        f15771m = C4263bb.m21039a("analytics.simple_endpoint", str3, str3);
        String str4 = "/batch";
        f15772n = C4263bb.m21039a("analytics.batching_endpoint", str4, str4);
        String name = zzbt.GZIP.name();
        f15775q = C4263bb.m21039a("analytics.compression_strategy.k", name, name);
        String str5 = "404,502";
        f15779u = C4263bb.m21039a("analytics.fallback_responses.k", str5, str5);
        String str6 = "";
        f15755O = C4263bb.m21039a("analytics.first_party_experiment_id", str6, str6);
    }
}
