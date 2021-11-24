package com.seattleclouds.ads;

public class AdMobUtil {
    public static String getAdmobErrorDescription(int i) {
        switch (i) {
            case 0:
                return "ERROR_CODE_INTERNAL_ERROR: Something happened internally; for instance, an invalid response was received from the ad server.";
            case 1:
                return "ERROR_CODE_INVALID_REQUEST: The ad request was invalid; for instance, the ad unit ID was incorrect.";
            case 2:
                return "ERROR_CODE_NETWORK_ERROR: The ad request was unsuccessful due to network connectivity.";
            case 3:
                return "ERROR_CODE_NO_FILL: The ad request was successful, but no ad was returned due to lack of ad inventory.";
            default:
                return "Unknown error";
        }
    }
}
