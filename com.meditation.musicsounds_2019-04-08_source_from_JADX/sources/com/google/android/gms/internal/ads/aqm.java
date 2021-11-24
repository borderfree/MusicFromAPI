package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@C3464ci
public final class aqm {

    /* renamed from: A */
    public static final aqc<Long> f12608A = aqc.m16885a(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: B */
    public static final aqc<Boolean> f12609B = aqc.m16886a(1, "gads:video:aggressive_media_codec_release", Boolean.valueOf(false));

    /* renamed from: C */
    public static final aqc<Boolean> f12610C = aqc.m16886a(1, "gads:memory_bundle:debug_info", Boolean.valueOf(false));

    /* renamed from: D */
    public static final aqc<Boolean> f12611D = aqc.m16886a(1, "gads:memory_bundle:runtime_info", Boolean.valueOf(true));

    /* renamed from: E */
    public static final aqc<String> f12612E = aqc.m16887a(1, "gads:video:codec_query_mime_types", "");

    /* renamed from: F */
    public static final aqc<Integer> f12613F = aqc.m16884a(1, "gads:video:codec_query_minimum_version", 16);

    /* renamed from: G */
    public static final aqc<Boolean> f12614G = aqc.m16886a(0, "gads:looper_for_gms_client:enabled", Boolean.valueOf(true));

    /* renamed from: H */
    public static final aqc<Boolean> f12615H = aqc.m16886a(0, "gads:sw_ad_request_service:enabled", Boolean.valueOf(true));

    /* renamed from: I */
    public static final aqc<String> f12616I = aqc.m16887a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");

    /* renamed from: J */
    public static final aqc<String> f12617J = aqc.m16887a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");

    /* renamed from: K */
    public static final aqc<String> f12618K = aqc.m16887a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");

    /* renamed from: L */
    public static final aqc<String> f12619L = aqc.m16887a(1, "gad:mraid:version", "2.0");

    /* renamed from: M */
    public static final aqc<Boolean> f12620M = aqc.m16886a(1, "gads:mraid:unload", Boolean.valueOf(false));

    /* renamed from: N */
    public static final aqc<Boolean> f12621N = aqc.m16886a(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));

    /* renamed from: O */
    public static final aqc<String> f12622O = aqc.m16887a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");

    /* renamed from: P */
    public static final aqc<Boolean> f12623P = aqc.m16886a(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));

    /* renamed from: Q */
    public static final aqc<Boolean> f12624Q = aqc.m16886a(0, "gads:enable_content_fetching", Boolean.valueOf(true));

    /* renamed from: R */
    public static final aqc<Integer> f12625R = aqc.m16884a(0, "gads:content_length_weight", 1);

    /* renamed from: S */
    public static final aqc<Integer> f12626S = aqc.m16884a(0, "gads:content_age_weight", 1);

    /* renamed from: T */
    public static final aqc<Integer> f12627T = aqc.m16884a(0, "gads:min_content_len", 11);

    /* renamed from: U */
    public static final aqc<Integer> f12628U = aqc.m16884a(0, "gads:fingerprint_number", 10);

    /* renamed from: V */
    public static final aqc<Integer> f12629V = aqc.m16884a(0, "gads:sleep_sec", 10);

    /* renamed from: W */
    public static final aqc<Boolean> f12630W = aqc.m16886a(1, "gads:enable_content_url_hash", Boolean.valueOf(true));

    /* renamed from: X */
    public static final aqc<Integer> f12631X = aqc.m16884a(1, "gads:content_vertical_fingerprint_number", 100);

    /* renamed from: Y */
    public static final aqc<Boolean> f12632Y = aqc.m16886a(1, "gads:enable_content_vertical_hash", Boolean.valueOf(true));

    /* renamed from: Z */
    public static final aqc<Integer> f12633Z = aqc.m16884a(1, "gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: a */
    public static final aqc<String> f12634a = aqc.m16887a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");

    /* renamed from: aA */
    public static final aqc<Boolean> f12635aA = aqc.m16886a(0, "gads:corewebview:javascript_engine", Boolean.valueOf(false));

    /* renamed from: aB */
    public static final aqc<Boolean> f12636aB = aqc.m16886a(1, "gad:webview:inject_scripts", Boolean.valueOf(false));

    /* renamed from: aC */
    public static final aqc<Boolean> f12637aC = aqc.m16886a(0, "gads:webview:permission:disabled", Boolean.valueOf(false));

    /* renamed from: aD */
    public static final aqc<Boolean> f12638aD = aqc.m16886a(1, "gads:rewarded:adapter_initialization_enabled", Boolean.valueOf(false));

    /* renamed from: aE */
    public static final aqc<Long> f12639aE = aqc.m16885a(1, "gads:rewarded:adapter_timeout_ms", 20000);

    /* renamed from: aF */
    public static final aqc<Boolean> f12640aF = aqc.m16886a(1, "gads:rewarded:ad_metadata_enabled", Boolean.valueOf(false));

    /* renamed from: aG */
    public static final aqc<Boolean> f12641aG = aqc.m16886a(1, "gads:app_activity_tracker:enabled", Boolean.valueOf(true));

    /* renamed from: aH */
    public static final aqc<Long> f12642aH = aqc.m16885a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: aI */
    public static final aqc<Long> f12643aI = aqc.m16885a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: aJ */
    public static final aqc<Boolean> f12644aJ = aqc.m16886a(1, "gads:adid_values_in_adrequest:enabled", Boolean.valueOf(false));

    /* renamed from: aK */
    public static final aqc<Long> f12645aK = aqc.m16885a(1, "gads:adid_values_in_adrequest:timeout", 2000);

    /* renamed from: aL */
    public static final aqc<Boolean> f12646aL = aqc.m16886a(1, "gads:disable_adid_values_in_ms", Boolean.valueOf(false));

    /* renamed from: aM */
    public static final aqc<Boolean> f12647aM = aqc.m16886a(1, "gads:enable_ad_loader_manager", Boolean.valueOf(true));

    /* renamed from: aN */
    public static final aqc<Boolean> f12648aN = aqc.m16886a(1, "gads:ad_manager_enforce_arp_invariant:enabled", Boolean.valueOf(true));

    /* renamed from: aO */
    public static final aqc<Boolean> f12649aO = aqc.m16886a(1, "gads:ad_manager:admob_extra:new_bundle", Boolean.valueOf(true));

    /* renamed from: aP */
    public static final aqc<Long> f12650aP = aqc.m16885a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);

    /* renamed from: aQ */
    public static final aqc<Boolean> f12651aQ = aqc.m16886a(1, "gads:interstitial_ad_immersive_mode", Boolean.valueOf(true));

    /* renamed from: aR */
    public static final aqc<Boolean> f12652aR = aqc.m16886a(1, "gads:custom_close_blocking:enabled", Boolean.valueOf(false));

    /* renamed from: aS */
    public static final aqc<Boolean> f12653aS = aqc.m16886a(1, "gads:disabling_closable_area:enabled", Boolean.valueOf(false));

    /* renamed from: aT */
    public static final aqc<Boolean> f12654aT = aqc.m16886a(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));

    /* renamed from: aU */
    public static final aqc<Boolean> f12655aU = aqc.m16886a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));

    /* renamed from: aV */
    public static final aqc<String> f12656aV = aqc.m16887a(1, "gads:interstitial_ad_pool:schema", "customTargeting");

    /* renamed from: aW */
    public static final aqc<String> f12657aW = aqc.m16887a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");

    /* renamed from: aX */
    public static final aqc<Integer> f12658aX = aqc.m16884a(1, "gads:interstitial_ad_pool:max_pools", 3);

    /* renamed from: aY */
    public static final aqc<Integer> f12659aY = aqc.m16884a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);

    /* renamed from: aZ */
    public static final aqc<Integer> f12660aZ = aqc.m16884a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);

    /* renamed from: aa */
    public static final aqc<Integer> f12661aa = aqc.m16884a(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: ab */
    public static final aqc<String> f12662ab = aqc.m16887a(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* renamed from: ac */
    public static final aqc<String> f12663ac = aqc.m16887a(1, "gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: ad */
    public static final aqc<Boolean> f12664ad = aqc.m16886a(0, "gad:app_index_enabled", Boolean.valueOf(true));

    /* renamed from: ae */
    public static final aqc<Boolean> f12665ae = aqc.m16886a(1, "gads:content_fetch_disable_get_title_from_webview", Boolean.valueOf(false));

    /* renamed from: af */
    public static final aqc<Boolean> f12666af = aqc.m16886a(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));

    /* renamed from: ag */
    public static final aqc<Long> f12667ag = aqc.m16885a(0, "gads:app_index:timeout_ms", 1000);

    /* renamed from: ah */
    public static final aqc<Boolean> f12668ah = aqc.m16886a(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));

    /* renamed from: ai */
    public static final aqc<Boolean> f12669ai = aqc.m16886a(0, "gads:interstitial_follow_url", Boolean.valueOf(true));

    /* renamed from: aj */
    public static final aqc<Boolean> f12670aj = aqc.m16886a(0, "gads:interstitial_follow_url:register_click", Boolean.valueOf(true));

    /* renamed from: ak */
    public static final aqc<Boolean> f12671ak = aqc.m16886a(0, "gads:ad_key_enabled", Boolean.valueOf(false));

    /* renamed from: al */
    public static final aqc<Boolean> f12672al = aqc.m16886a(1, "gads:sai:enabled", Boolean.valueOf(true));

    /* renamed from: am */
    public static final aqc<Boolean> f12673am = aqc.m16886a(1, "gads:sai:banner_ad_enabled", Boolean.valueOf(true));

    /* renamed from: an */
    public static final aqc<Boolean> f12674an = aqc.m16886a(1, "gads:sai:native_ad_enabled", Boolean.valueOf(true));

    /* renamed from: ao */
    public static final aqc<Boolean> f12675ao = aqc.m16886a(1, "gads:sai:interstitial_ad_enabled", Boolean.valueOf(true));

    /* renamed from: ap */
    public static final aqc<Boolean> f12676ap = aqc.m16886a(1, "gads:sai:rewardedvideo_ad_enabled", Boolean.valueOf(true));

    /* renamed from: aq */
    public static final aqc<String> f12677aq = aqc.m16887a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: ar */
    public static final aqc<String> f12678ar = aqc.m16887a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");

    /* renamed from: as */
    public static final aqc<Boolean> f12679as = aqc.m16886a(1, "gads:sai:click_gmsg_enabled", Boolean.valueOf(true));

    /* renamed from: at */
    public static final aqc<Boolean> f12680at = aqc.m16886a(1, "gads:sai:using_macro:enabled", Boolean.valueOf(false));

    /* renamed from: au */
    public static final aqc<String> f12681au = aqc.m16887a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: av */
    public static final aqc<Long> f12682av = aqc.m16885a(1, "gads:sai:timeout_ms", -1);

    /* renamed from: aw */
    public static final aqc<Integer> f12683aw = aqc.m16884a(1, "gads:sai:scion_thread_pool_size", 5);

    /* renamed from: ax */
    public static final aqc<Boolean> f12684ax = aqc.m16886a(1, "gads:x_seconds_rewarded:enable", Boolean.valueOf(false));

    /* renamed from: ay */
    public static final aqc<Boolean> f12685ay = aqc.m16886a(1, "gads:webview:ignore_over_scroll", Boolean.valueOf(true));

    /* renamed from: az */
    public static final aqc<Boolean> f12686az = aqc.m16886a(0, "gads:corewebview:adwebview_factory:enable", Boolean.valueOf(false));

    /* renamed from: b */
    public static final aqc<Boolean> f12687b = aqc.m16886a(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));

    /* renamed from: bA */
    public static final aqc<Long> f12688bA = aqc.m16885a(0, "gads:ad_loader:timeout_ms", 60000);

    /* renamed from: bB */
    public static final aqc<Long> f12689bB = aqc.m16885a(0, "gads:rendering:timeout_ms", 60000);

    /* renamed from: bC */
    public static final aqc<Boolean> f12690bC = aqc.m16886a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));

    /* renamed from: bD */
    public static final aqc<Long> f12691bD = aqc.m16885a(1, "gads:gestures:task_timeout", 2000);

    /* renamed from: bE */
    public static final aqc<Boolean> f12692bE = aqc.m16886a(1, "gads:gestures:asig:enabled", Boolean.valueOf(false));

    /* renamed from: bF */
    public static final aqc<Boolean> f12693bF = aqc.m16886a(1, "gads:gestures:ans:enabled", Boolean.valueOf(false));

    /* renamed from: bG */
    public static final aqc<Boolean> f12694bG = aqc.m16886a(1, "gads:gestures:tos:enabled", Boolean.valueOf(false));

    /* renamed from: bH */
    public static final aqc<Boolean> f12695bH = aqc.m16886a(1, "gads:signal:app_permissions:disabled", Boolean.valueOf(false));

    /* renamed from: bI */
    public static final aqc<Boolean> f12696bI = aqc.m16886a(1, "gads:gestures:inthex:enabled", Boolean.valueOf(false));

    /* renamed from: bJ */
    public static final aqc<Boolean> f12697bJ = aqc.m16886a(1, "gads:gestures:hpk:enabled", Boolean.valueOf(true));

    /* renamed from: bK */
    public static final aqc<String> f12698bK = aqc.m16887a(1, "gads:gestures:pk", "");

    /* renamed from: bL */
    public static final aqc<Boolean> f12699bL = aqc.m16886a(1, "gads:gestures:bs:enabled", Boolean.valueOf(true));

    /* renamed from: bM */
    public static final aqc<Boolean> f12700bM = aqc.m16886a(1, "gads:gestures:check_initialization_thread:enabled", Boolean.valueOf(false));

    /* renamed from: bN */
    public static final aqc<Boolean> f12701bN = aqc.m16886a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", Boolean.valueOf(true));

    /* renamed from: bO */
    public static final aqc<Boolean> f12702bO = aqc.m16886a(0, "gass:enabled", Boolean.valueOf(true));

    /* renamed from: bP */
    public static final aqc<Boolean> f12703bP = aqc.m16886a(0, "gass:enable_int_signal", Boolean.valueOf(true));

    /* renamed from: bQ */
    public static final aqc<Boolean> f12704bQ = aqc.m16886a(0, "gass:enable_ad_attestation_signal", Boolean.valueOf(true));

    /* renamed from: bR */
    public static final aqc<Boolean> f12705bR = aqc.m16886a(0, "gads:support_screen_shot", Boolean.valueOf(true));

    /* renamed from: bS */
    public static final aqc<Boolean> f12706bS = aqc.m16886a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", Boolean.valueOf(true));

    /* renamed from: bT */
    public static final aqc<String> f12707bT = aqc.m16887a(1, "gads:sdk_core_constants:caps", "");

    /* renamed from: bU */
    public static final aqc<Long> f12708bU = aqc.m16885a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));

    /* renamed from: bV */
    public static final aqc<Boolean> f12709bV = aqc.m16886a(0, "gads:js_flags:mf", Boolean.valueOf(false));

    /* renamed from: bW */
    public static final aqc<Boolean> f12710bW = aqc.m16886a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));

    /* renamed from: bX */
    public static final aqc<String> f12711bX = aqc.m16887a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: bY */
    public static final aqc<String> f12712bY = aqc.m16887a(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: bZ */
    public static final aqc<Boolean> f12713bZ = aqc.m16886a(1, "gads:enable_untrack_view_native", Boolean.valueOf(true));

    /* renamed from: ba */
    public static final aqc<String> f12714ba = aqc.m16887a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");

    /* renamed from: bb */
    public static final aqc<Integer> f12715bb = aqc.m16884a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);

    /* renamed from: bc */
    public static final aqc<Integer> f12716bc = aqc.m16884a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);

    /* renamed from: bd */
    public static final aqc<Long> f12717bd = aqc.m16885a(1, "gads:interstitial_ad_pool:discard_thresholds", 0);

    /* renamed from: be */
    public static final aqc<Long> f12718be = aqc.m16885a(1, "gads:interstitial_ad_pool:miss_thresholds", 0);

    /* renamed from: bf */
    public static final aqc<Float> f12719bf = aqc.m16883a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);

    /* renamed from: bg */
    public static final aqc<Float> f12720bg = aqc.m16883a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);

    /* renamed from: bh */
    public static final aqc<Boolean> f12721bh = aqc.m16886a(0, "gads:debug_logging_feature:enable", Boolean.valueOf(false));

    /* renamed from: bi */
    public static final aqc<Boolean> f12722bi = aqc.m16886a(0, "gads:debug_logging_feature:intercept_web_view", Boolean.valueOf(false));

    /* renamed from: bj */
    public static final aqc<String> f12723bj = aqc.m16887a(1, "gads:spherical_video:vertex_shader", "");

    /* renamed from: bk */
    public static final aqc<String> f12724bk = aqc.m16887a(1, "gads:spherical_video:fragment_shader", "");

    /* renamed from: bl */
    public static final aqc<Boolean> f12725bl = aqc.m16886a(0, "gads:log:verbose_enabled", Boolean.valueOf(false));

    /* renamed from: bm */
    public static final aqc<Boolean> f12726bm = aqc.m16886a(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));

    /* renamed from: bn */
    public static final aqc<Long> f12727bn = aqc.m16885a(1, "gads:position_watcher:throttle_ms", 200);

    /* renamed from: bo */
    public static final aqc<Boolean> f12728bo = aqc.m16886a(1, "gads:include_lock_screen_apps_for_visibility", Boolean.valueOf(true));

    /* renamed from: bp */
    public static final aqc<Boolean> f12729bp = aqc.m16886a(0, "gads:device_info_caching:enabled", Boolean.valueOf(true));

    /* renamed from: bq */
    public static final aqc<Long> f12730bq = aqc.m16885a(0, "gads:device_info_caching_expiry_ms:expiry", 300000);

    /* renamed from: br */
    public static final aqc<Boolean> f12731br = aqc.m16886a(1, "gads:gen204_signals:enabled", Boolean.valueOf(false));

    /* renamed from: bs */
    public static final aqc<Boolean> f12732bs = aqc.m16886a(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));

    /* renamed from: bt */
    public static final aqc<Boolean> f12733bt = aqc.m16886a(1, "gads:gmsg:disable_back_button:enabled", Boolean.valueOf(true));

    /* renamed from: bu */
    public static final aqc<Boolean> f12734bu = aqc.m16886a(0, "gads:gmsg:video_meta:enabled", Boolean.valueOf(true));

    /* renamed from: bv */
    public static final aqc<Long> f12735bv = aqc.m16885a(1, "gads:network:network_prediction_timeout_ms", 2000);

    /* renamed from: bw */
    public static final aqc<Boolean> f12736bw = aqc.m16886a(0, "gads:mediation:dynamite_first:admobadapter", Boolean.valueOf(true));

    /* renamed from: bx */
    public static final aqc<Boolean> f12737bx = aqc.m16886a(0, "gads:mediation:dynamite_first:adurladapter", Boolean.valueOf(true));

    /* renamed from: by */
    public static final aqc<Boolean> f12738by = aqc.m16886a(1, "gads:bypass_adrequest_service_for_inlined_mediation", Boolean.valueOf(true));

    /* renamed from: bz */
    public static final aqc<Long> f12739bz = aqc.m16885a(0, "gads:resolve_future:default_timeout_ms", 30000);

    /* renamed from: c */
    public static final aqc<Boolean> f12740c = aqc.m16886a(0, "gads:report_dynamite_crash_in_background_thread", Boolean.valueOf(false));

    /* renamed from: cA */
    public static final aqc<Long> f12741cA = aqc.m16885a(1, "gads:parental_controls:timeout", 2000);

    /* renamed from: cB */
    public static final aqc<Boolean> f12742cB = aqc.m16886a(0, "gads:safe_browsing:debug", Boolean.valueOf(false));

    /* renamed from: cC */
    public static final aqc<Boolean> f12743cC = aqc.m16886a(0, "gads:webview_cookie:enabled", Boolean.valueOf(true));

    /* renamed from: cD */
    public static final aqc<Boolean> f12744cD = aqc.m16886a(1, "gads:cache:bind_on_foreground", Boolean.valueOf(false));

    /* renamed from: cE */
    public static final aqc<Boolean> f12745cE = aqc.m16886a(1, "gads:cache:bind_on_init", Boolean.valueOf(false));

    /* renamed from: cF */
    public static final aqc<Boolean> f12746cF = aqc.m16886a(1, "gads:cache:bind_on_request", Boolean.valueOf(false));

    /* renamed from: cG */
    public static final aqc<Long> f12747cG = aqc.m16885a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: cH */
    public static final aqc<Boolean> f12748cH = aqc.m16886a(1, "gads:cache:use_cache_data_source", Boolean.valueOf(false));

    /* renamed from: cI */
    public static final aqc<Boolean> f12749cI = aqc.m16886a(1, "gads:http_assets_cache:enabled", Boolean.valueOf(false));

    /* renamed from: cJ */
    public static final aqc<String> f12750cJ = aqc.m16887a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: cK */
    public static final aqc<Integer> f12751cK = aqc.m16884a(1, "gads:http_assets_cache:time_out", 100);

    /* renamed from: cL */
    public static final aqc<Boolean> f12752cL = aqc.m16886a(1, "gads:chrome_custom_tabs:enabled", Boolean.valueOf(true));

    /* renamed from: cM */
    public static final aqc<Boolean> f12753cM = aqc.m16886a(1, "gads:chrome_custom_tabs_browser:enabled", Boolean.valueOf(false));

    /* renamed from: cN */
    public static final aqc<Boolean> f12754cN = aqc.m16886a(1, "gads:chrome_custom_tabs:disabled", Boolean.valueOf(false));

    /* renamed from: cO */
    public static final aqc<Boolean> f12755cO = aqc.m16886a(1, "gads:drx_in_app_preview:enabled", Boolean.valueOf(true));

    /* renamed from: cP */
    public static final aqc<Boolean> f12756cP = aqc.m16886a(1, "gads:drx_debug_signals:enabled", Boolean.valueOf(true));

    /* renamed from: cQ */
    public static final aqc<Boolean> f12757cQ = aqc.m16886a(1, "gads:debug_hold_gesture:enabled", Boolean.valueOf(false));

    /* renamed from: cR */
    public static final aqc<Long> f12758cR = aqc.m16885a(1, "gads:debug_hold_gesture:time_millis", 2000);

    /* renamed from: cS */
    public static final aqc<String> f12759cS = aqc.m16887a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: cT */
    public static final aqc<String> f12760cT = aqc.m16887a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: cU */
    public static final aqc<String> f12761cU = aqc.m16887a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: cV */
    public static final aqc<String> f12762cV = aqc.m16887a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: cW */
    public static final aqc<Integer> f12763cW = aqc.m16884a(1, "gads:drx_debug:timeout_ms", 5000);

    /* renamed from: cX */
    public static final aqc<Integer> f12764cX = aqc.m16884a(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: cY */
    public static final aqc<Boolean> f12765cY = aqc.m16886a(1, "gad:interstitial_for_multi_window", Boolean.valueOf(false));

    /* renamed from: cZ */
    public static final aqc<Boolean> f12766cZ = aqc.m16886a(1, "gad:interstitial_ad_stay_active_in_multi_window", Boolean.valueOf(false));

    /* renamed from: ca */
    public static final aqc<Boolean> f12767ca = aqc.m16886a(1, "gads:ignore_untrack_view_google_native", Boolean.valueOf(true));

    /* renamed from: cb */
    public static final aqc<Boolean> f12768cb = aqc.m16886a(1, "gads:reset_listeners_preparead_native", Boolean.valueOf(true));

    /* renamed from: cc */
    public static final aqc<Integer> f12769cc = aqc.m16884a(1, "gads:native_video_load_timeout", 10);

    /* renamed from: cd */
    public static final aqc<Integer> f12770cd = aqc.m16884a(1, "gads:omid:native_webview_load_timeout", 2000);

    /* renamed from: ce */
    public static final aqc<String> f12771ce = aqc.m16887a(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: cf */
    public static final aqc<Boolean> f12772cf = aqc.m16886a(1, "gads:clamp_native_video_player_dimensions", Boolean.valueOf(true));

    /* renamed from: cg */
    public static final aqc<Boolean> f12773cg = aqc.m16886a(1, "gads:enable_store_active_view_state", Boolean.valueOf(false));

    /* renamed from: ch */
    public static final aqc<Boolean> f12774ch = aqc.m16886a(1, "gads:enable_singleton_broadcast_receiver", Boolean.valueOf(false));

    /* renamed from: ci */
    public static final aqc<Boolean> f12775ci = aqc.m16886a(1, "gads:native:overlay_new_fix:enabled", Boolean.valueOf(true));

    /* renamed from: cj */
    public static final aqc<Boolean> f12776cj = aqc.m16886a(1, "gads:native:count_impression_for_assets", Boolean.valueOf(false));

    /* renamed from: ck */
    public static final aqc<Boolean> f12777ck = aqc.m16886a(1, "gads:native:custom_one_point_five_click:enable", Boolean.valueOf(true));

    /* renamed from: cl */
    public static final aqc<Boolean> f12778cl = aqc.m16886a(1, "gads:unified_native_ad:enable", Boolean.valueOf(true));

    /* renamed from: cm */
    public static final aqc<Boolean> f12779cm = aqc.m16886a(1, "gads:fluid_ad:use_wrap_content_height", Boolean.valueOf(false));

    /* renamed from: cn */
    public static final aqc<Boolean> f12780cn = aqc.m16886a(0, "gads:method_tracing:enabled", Boolean.valueOf(false));

    /* renamed from: co */
    public static final aqc<Long> f12781co = aqc.m16885a(0, "gads:method_tracing:duration_ms", 30000);

    /* renamed from: cp */
    public static final aqc<Integer> f12782cp = aqc.m16884a(0, "gads:method_tracing:count", 5);

    /* renamed from: cq */
    public static final aqc<Integer> f12783cq = aqc.m16884a(0, "gads:method_tracing:filesize", 134217728);

    /* renamed from: cr */
    public static final aqc<Long> f12784cr = aqc.m16885a(1, "gads:auto_location_timeout", 2000);

    /* renamed from: cs */
    public static final aqc<Boolean> f12785cs = aqc.m16886a(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));

    /* renamed from: ct */
    public static final aqc<Long> f12786ct = aqc.m16885a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);

    /* renamed from: cu */
    public static final aqc<String> f12787cu = aqc.m16887a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");

    /* renamed from: cv */
    public static final aqc<String> f12788cv = aqc.m16887a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");

    /* renamed from: cw */
    public static final aqc<String> f12789cw = aqc.m16887a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");

    /* renamed from: cx */
    public static final aqc<String> f12790cx = aqc.m16887a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");

    /* renamed from: cy */
    public static final aqc<String> f12791cy = aqc.m16887a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");

    /* renamed from: cz */
    public static final aqc<Long> f12792cz = aqc.m16885a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);

    /* renamed from: d */
    public static final aqc<Boolean> f12793d = aqc.m16886a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));

    /* renamed from: dA */
    private static final aqc<String> f12794dA = aqc.m16882a(0, "gads:video_stream_cache:experiment_id");

    /* renamed from: dB */
    private static final aqc<Boolean> f12795dB = aqc.m16886a(0, "gads:ad_id_app_context:enabled", Boolean.valueOf(false));

    /* renamed from: dC */
    private static final aqc<Float> f12796dC = aqc.m16883a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);

    /* renamed from: dD */
    private static final aqc<String> f12797dD = aqc.m16882a(0, "gads:ad_id_app_context:experiment_id");

    /* renamed from: dE */
    private static final aqc<String> f12798dE = aqc.m16882a(0, "gads:ad_id_use_shared_preference:experiment_id");

    /* renamed from: dF */
    private static final aqc<Boolean> f12799dF = aqc.m16886a(0, "gads:ad_id_use_shared_preference:enabled", Boolean.valueOf(false));

    /* renamed from: dG */
    private static final aqc<Float> f12800dG = aqc.m16883a(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);

    /* renamed from: dH */
    private static final aqc<Boolean> f12801dH = aqc.m16886a(0, "gads:ad_id_use_persistent_service:enabled", Boolean.valueOf(false));

    /* renamed from: dI */
    private static final aqc<Boolean> f12802dI = aqc.m16886a(0, "gads:ad_id:use_ipc:enabled", Boolean.valueOf(false));

    /* renamed from: dJ */
    private static final aqc<String> f12803dJ = aqc.m16888b(0, "gads:looper_for_gms_client:experiment_id");

    /* renamed from: dK */
    private static final aqc<Boolean> f12804dK = aqc.m16886a(0, "gads:sw_dynamite:enabled", Boolean.valueOf(true));

    /* renamed from: dL */
    private static final aqc<String> f12805dL = aqc.m16882a(0, "gads:app_index:experiment_id");

    /* renamed from: dM */
    private static final aqc<String> f12806dM = aqc.m16882a(0, "gads:kitkat_interstitial_workaround:experiment_id");

    /* renamed from: dN */
    private static final aqc<String> f12807dN = aqc.m16882a(0, "gads:interstitial_follow_url:experiment_id");

    /* renamed from: dO */
    private static final aqc<Boolean> f12808dO = aqc.m16886a(0, "gads:analytics_enabled", Boolean.valueOf(true));

    /* renamed from: dP */
    private static final aqc<Integer> f12809dP = aqc.m16884a(0, "gads:webview_cache_version", 0);

    /* renamed from: dQ */
    private static final aqc<String> f12810dQ = aqc.m16888b(0, "gads:pan:experiment_id");

    /* renamed from: dR */
    private static final aqc<Boolean> f12811dR = aqc.m16886a(0, "gads:ad_serving:enabled", Boolean.valueOf(true));

    /* renamed from: dS */
    private static final aqc<Boolean> f12812dS = aqc.m16886a(1, "gads:impression_optimization_enabled", Boolean.valueOf(false));

    /* renamed from: dT */
    private static final aqc<String> f12813dT = aqc.m16887a(1, "gads:banner_ad_pool:schema", "customTargeting");

    /* renamed from: dU */
    private static final aqc<Integer> f12814dU = aqc.m16884a(1, "gads:banner_ad_pool:max_queues", 3);

    /* renamed from: dV */
    private static final aqc<Integer> f12815dV = aqc.m16884a(1, "gads:banner_ad_pool:max_pools", 3);

    /* renamed from: dW */
    private static final aqc<Integer> f12816dW = aqc.m16884a(1, "gads:heap_wastage:bytes", 0);

    /* renamed from: dX */
    private static final aqc<Boolean> f12817dX = aqc.m16886a(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: dY */
    private static final aqc<Boolean> f12818dY = aqc.m16886a(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: dZ */
    private static final aqc<Boolean> f12819dZ = aqc.m16886a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: da */
    public static final aqc<Integer> f12820da = aqc.m16884a(1, "gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: db */
    public static final aqc<Boolean> f12821db = aqc.m16886a(1, "gads:clearcut_logging:enabled", Boolean.valueOf(false));

    /* renamed from: dc */
    public static final aqc<Boolean> f12822dc = aqc.m16886a(1, "gads:clearcut_logging:write_to_file", Boolean.valueOf(false));

    /* renamed from: dd */
    public static final aqc<Boolean> f12823dd = aqc.m16886a(0, "gad:force_local_ad_request_service:enabled", Boolean.valueOf(false));

    /* renamed from: de */
    public static final aqc<Boolean> f12824de = aqc.m16886a(0, "gad:force_dynamite_loading_enabled", Boolean.valueOf(false));

    /* renamed from: df */
    public static final aqc<Integer> f12825df = aqc.m16884a(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: dg */
    public static final aqc<Boolean> f12826dg = aqc.m16886a(1, "gads:omid:enabled", Boolean.valueOf(false));

    /* renamed from: dh */
    public static final aqc<Boolean> f12827dh = aqc.m16886a(1, "gads:nonagon:banner:check_dp_size", Boolean.valueOf(false));

    /* renamed from: di */
    public static final aqc<Long> f12828di = aqc.m16885a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: dj */
    public static final aqc<String> f12829dj = aqc.m16887a(0, "gads:public_beta:traffic_multiplier", "1.0");

    /* renamed from: dk */
    public static final aqc<Boolean> f12830dk = aqc.m16886a(1, "gads:real_test_request:enabled", Boolean.valueOf(true));

    /* renamed from: dl */
    public static final aqc<Boolean> f12831dl = aqc.m16886a(1, "gads:real_test_request:render_webview_label", Boolean.valueOf(true));

    /* renamed from: dm */
    public static final aqc<Boolean> f12832dm = aqc.m16886a(1, "gads:real_test_request:render_native_label", Boolean.valueOf(true));

    /* renamed from: dn */
    public static final aqc<Integer> f12833dn = aqc.m16884a(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: do */
    public static final aqc<Integer> f12834do = aqc.m16884a(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 27);

    /* renamed from: dp */
    public static final aqc<Integer> f12835dp = aqc.m16884a(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 26);

    /* renamed from: dq */
    public static final aqc<Integer> f12836dq = aqc.m16884a(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 27);

    /* renamed from: dr */
    private static final aqc<String> f12837dr = aqc.m16882a(0, "gads:sdk_core_experiment_id");

    /* renamed from: ds */
    private static final aqc<String> f12838ds = aqc.m16887a(0, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");

    /* renamed from: dt */
    private static final aqc<Boolean> f12839dt = aqc.m16886a(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));

    /* renamed from: du */
    private static final aqc<String> f12840du = aqc.m16882a(0, "gads:request_builder:singleton_webview_experiment_id");

    /* renamed from: dv */
    private static final aqc<Boolean> f12841dv = aqc.m16886a(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));

    /* renamed from: dw */
    private static final aqc<String> f12842dw = aqc.m16882a(0, "gads:sdk_use_dynamic_module_experiment_id");

    /* renamed from: dx */
    private static final aqc<String> f12843dx = aqc.m16882a(0, "gads:block_autoclicks_experiment_id");

    /* renamed from: dy */
    private static final aqc<String> f12844dy = aqc.m16882a(0, "gads:spam_app_context:experiment_id");

    /* renamed from: dz */
    private static final aqc<Integer> f12845dz = aqc.m16884a(1, "gads:http_url_connection_factory:timeout_millis", 10000);

    /* renamed from: e */
    public static final aqc<String> f12846e = aqc.m16887a(0, "gads:sdk_crash_report_class_prefix", "com.google.");

    /* renamed from: eA */
    private static final aqc<Long> f12847eA = aqc.m16885a(1, "gads:cache:javascript_timeout_millis", 5000);

    /* renamed from: eB */
    private static final aqc<Boolean> f12848eB = aqc.m16886a(1, "gads:cache:connection_per_read", Boolean.valueOf(false));

    /* renamed from: eC */
    private static final aqc<Long> f12849eC = aqc.m16885a(1, "gads:cache:connection_timeout", 5000);

    /* renamed from: eD */
    private static final aqc<Long> f12850eD = aqc.m16885a(1, "gads:cache:read_only_connection_timeout", 5000);

    /* renamed from: eE */
    private static final aqc<Boolean> f12851eE = aqc.m16886a(0, "gads:nonagon:red_button", Boolean.valueOf(false));

    /* renamed from: eF */
    private static final aqc<Boolean> f12852eF = aqc.m16886a(1, "gads:nonagon:banner:enabled", Boolean.valueOf(false));

    /* renamed from: eG */
    private static final aqc<String> f12853eG = aqc.m16887a(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");

    /* renamed from: eH */
    private static final aqc<Boolean> f12854eH = aqc.m16886a(1, "gads:nonagon:interstitial:enabled", Boolean.valueOf(false));

    /* renamed from: eI */
    private static final aqc<String> f12855eI = aqc.m16887a(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");

    /* renamed from: eJ */
    private static final aqc<Boolean> f12856eJ = aqc.m16886a(1, "gads:nonagon:rewardedvideo:enabled", Boolean.valueOf(false));

    /* renamed from: eK */
    private static final aqc<Boolean> f12857eK = aqc.m16886a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", Boolean.valueOf(false));

    /* renamed from: eL */
    private static final aqc<String> f12858eL = aqc.m16887a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");

    /* renamed from: eM */
    private static final aqc<Boolean> f12859eM = aqc.m16886a(1, "gads:nonagon:nativead:enabled", Boolean.valueOf(false));

    /* renamed from: eN */
    private static final aqc<String> f12860eN = aqc.m16887a(1, "gads:nonagon:nativead:app_name", "(?!)");

    /* renamed from: eO */
    private static final aqc<Boolean> f12861eO = aqc.m16886a(1, "gads:nonagon:service:enabled", Boolean.valueOf(false));

    /* renamed from: eP */
    private static final aqc<Boolean> f12862eP = aqc.m16886a(1, "gads:signals:ad_id_info:enabled", Boolean.valueOf(false));

    /* renamed from: eQ */
    private static final aqc<Boolean> f12863eQ = aqc.m16886a(1, "gads:signals:app_index:enabled", Boolean.valueOf(false));

    /* renamed from: eR */
    private static final aqc<Boolean> f12864eR = aqc.m16886a(1, "gads:signals:cache:enabled", Boolean.valueOf(false));

    /* renamed from: eS */
    private static final aqc<Boolean> f12865eS = aqc.m16886a(1, "gads:signals:doritos:enabled", Boolean.valueOf(false));

    /* renamed from: eT */
    private static final aqc<Boolean> f12866eT = aqc.m16886a(1, "gads:signals:location:enabled", Boolean.valueOf(false));

    /* renamed from: eU */
    private static final aqc<Boolean> f12867eU = aqc.m16886a(1, "gads:signals:network_prediction:enabled", Boolean.valueOf(false));

    /* renamed from: eV */
    private static final aqc<Boolean> f12868eV = aqc.m16886a(1, "gads:signals:parental_control:enabled", Boolean.valueOf(false));

    /* renamed from: eW */
    private static byte[] f12869eW;

    /* renamed from: ea */
    private static final aqc<Boolean> f12870ea = aqc.m16886a(0, "gads:request_pkg:enabled", Boolean.valueOf(true));

    /* renamed from: eb */
    private static final aqc<String> f12871eb = aqc.m16882a(0, "gads:gmsg:video_meta:experiment_id");

    /* renamed from: ec */
    private static final aqc<Long> f12872ec = aqc.m16885a(1, "gads:network:cache_prediction_duration_s", 300);

    /* renamed from: ed */
    private static final aqc<Long> f12873ed = aqc.m16885a(1, "gads:rtb_signal_timeout_ms", 1000);

    /* renamed from: ee */
    private static final aqc<Boolean> f12874ee = aqc.m16886a(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));

    /* renamed from: ef */
    private static final aqc<Boolean> f12875ef = aqc.m16886a(0, "gads:edu_device_helper:enabled", Boolean.valueOf(true));

    /* renamed from: eg */
    private static final aqc<String> f12876eg = aqc.m16882a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");

    /* renamed from: eh */
    private static final aqc<String> f12877eh = aqc.m16882a(1, "gads:sdk_core_constants:experiment_id");

    /* renamed from: ei */
    private static final aqc<Boolean> f12878ei = aqc.m16886a(1, "gads:js_flags:disable_phenotype", Boolean.valueOf(false));

    /* renamed from: ej */
    private static final aqc<String> f12879ej = aqc.m16887a(0, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");

    /* renamed from: ek */
    private static final aqc<String> f12880ek = aqc.m16887a(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: el */
    private static final aqc<String> f12881el = aqc.m16882a(1, "gads:singleton_webview_native:experiment_id");

    /* renamed from: em */
    private static final aqc<Boolean> f12882em = aqc.m16886a(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));

    /* renamed from: en */
    private static final aqc<String> f12883en = aqc.m16888b(1, "gads:auto_location_for_coarse_permission:experiment_id");

    /* renamed from: eo */
    private static final aqc<String> f12884eo = aqc.m16888b(1, "gads:auto_location_timeout:experiment_id");

    /* renamed from: ep */
    private static final aqc<Long> f12885ep = aqc.m16885a(1, "gads:auto_location_interval", -1);

    /* renamed from: eq */
    private static final aqc<String> f12886eq = aqc.m16888b(1, "gads:auto_location_interval:experiment_id");

    /* renamed from: er */
    private static final aqc<String> f12887er = aqc.m16882a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");

    /* renamed from: es */
    private static final aqc<String> f12888es = aqc.m16882a(0, "gads:afs:csa:experiment_id");

    /* renamed from: et */
    private static final aqc<Boolean> f12889et = aqc.m16886a(0, "gads:afs:csa_ad_manager_enabled", Boolean.valueOf(true));

    /* renamed from: eu */
    private static final aqc<Boolean> f12890eu = aqc.m16886a(1, "gads:parental_controls:send_from_client", Boolean.valueOf(true));

    /* renamed from: ev */
    private static final aqc<Boolean> f12891ev = aqc.m16886a(1, "gads:parental_controls:cache_results", Boolean.valueOf(true));

    /* renamed from: ew */
    private static final aqc<String> f12892ew = aqc.m16887a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");

    /* renamed from: ex */
    private static final aqc<Long> f12893ex = aqc.m16885a(0, "gads:safe_browsing:safety_net:delay_ms", 2000);

    /* renamed from: ey */
    private static final aqc<Integer> f12894ey = aqc.m16884a(1, "gads:cache:ad_request_timeout_millis", 250);

    /* renamed from: ez */
    private static final aqc<Integer> f12895ez = aqc.m16884a(1, "gads:cache:max_concurrent_downloads", 10);

    /* renamed from: f */
    public static final aqc<Float> f12896f = aqc.m16883a(1, "gads:trapped_exception_sample_rate", 0.01f);

    /* renamed from: g */
    public static final aqc<Boolean> f12897g = aqc.m16886a(0, "gads:block_autoclicks", Boolean.valueOf(false));

    /* renamed from: h */
    public static final aqc<String> f12898h = aqc.m16887a(1, "gads:video_exo_player:version", "1");

    /* renamed from: i */
    public static final aqc<Integer> f12899i = aqc.m16884a(1, "gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: j */
    public static final aqc<Integer> f12900j = aqc.m16884a(1, "gads:video_exo_player:read_timeout", 8000);

    /* renamed from: k */
    public static final aqc<Integer> f12901k = aqc.m16884a(1, "gads:video_exo_player:loading_check_interval", 1048576);

    /* renamed from: l */
    public static final aqc<Integer> f12902l = aqc.m16884a(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: m */
    public static final aqc<Integer> f12903m = aqc.m16884a(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: n */
    public static final aqc<Integer> f12904n = aqc.m16884a(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: o */
    public static final aqc<Integer> f12905o = aqc.m16884a(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: p */
    public static final aqc<Integer> f12906p = aqc.m16884a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: q */
    public static final aqc<Long> f12907q = aqc.m16885a(1, "gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: r */
    public static final aqc<Long> f12908r = aqc.m16885a(1, "gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: s */
    public static final aqc<Integer> f12909s = aqc.m16884a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);

    /* renamed from: t */
    public static final aqc<Boolean> f12910t = aqc.m16886a(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));

    /* renamed from: u */
    public static final aqc<String> f12911u = aqc.m16887a(1, "gads:video:metric_frame_hash_times", "");

    /* renamed from: v */
    public static final aqc<Long> f12912v = aqc.m16885a(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: w */
    public static final aqc<Boolean> f12913w = aqc.m16886a(1, "gads:video:force_watermark", Boolean.valueOf(false));

    /* renamed from: x */
    public static final aqc<Long> f12914x = aqc.m16885a(1, "gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: y */
    public static final aqc<Boolean> f12915y = aqc.m16886a(1, "gads:video:spinner:enabled", Boolean.valueOf(false));

    /* renamed from: z */
    public static final aqc<Integer> f12916z = aqc.m16884a(1, "gads:video:spinner:scale", 4);

    /* renamed from: a */
    public static List<String> m16919a() {
        return ane.m16649e().mo12291a();
    }

    /* renamed from: a */
    public static void m16920a(Context context) {
        C3710lk.m19088a(context, new aqn(context));
        int intValue = ((Integer) ane.m16650f().mo12297a(f12816dW)).intValue();
        if (intValue > 0 && f12869eW == null) {
            f12869eW = new byte[intValue];
        }
    }

    /* renamed from: a */
    public static void m16921a(Context context, int i, JSONObject jSONObject) {
        ane.m16648d();
        Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
        ane.m16649e().mo12292a(edit, 1, jSONObject);
        ane.m16648d();
        edit.commit();
    }

    /* renamed from: b */
    public static List<String> m16922b() {
        return ane.m16649e().mo12294b();
    }
}
