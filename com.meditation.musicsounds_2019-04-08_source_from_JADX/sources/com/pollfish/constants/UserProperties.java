package com.pollfish.constants;

import android.util.Log;
import com.pollfish.p150f.C5162b;
import java.util.HashMap;

public class UserProperties extends HashMap {
    private static final String POLLFISH_TAG = "PollFish";
    private static final String TAG = "UserProperties";
    private static final long serialVersionUID = 1;
    private String AGE = "age";
    private String AGE_GROUP = "age_group";
    private String EMAIL = "email";
    private String FACEBOOK_ID = "facebook_id";
    private String GENDER = "gender";
    private String GOOGLE_ID = "google_id";
    private String LINKEDIN_ID = "linkedin_id";
    private String MARITAL_STATUS = "marital_status";
    private String NAME = "name";
    private String NATIONALITY = "nationality";
    private String PHONE = "phone";
    private String PLACE_OF_BIRTH = "place_of_birth";
    private String PLACE_OF_RESIDENCE = "place_of_residence";
    private String POLITICAL_VIEW = "political_view";
    private String RELIGION = "religion";
    private String SURNAME = "surname";
    private String TWITTER_ID = "twitter_id";
    private String YEAR_OF_BIRTH = "year_of_birth";

    public UserProperties() {
        C5162b.m25518a(TAG, "new UserProperties()");
    }

    public UserProperties setAge(int i) {
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setAge: ");
        sb.append(i);
        C5162b.m25518a(str, sb.toString());
        try {
            put(this.AGE, String.valueOf(i));
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "age value provided is invalid");
        }
        return this;
    }

    public UserProperties setAge(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setAge: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.AGE, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "age value provided is invalid");
        }
        return this;
    }

    public UserProperties setAgeGroup(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setAgeGroup: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.AGE_GROUP, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "age group value provided is invalid");
        }
        return this;
    }

    public UserProperties setCustomAtributes(String str, String str2) {
        String str3 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setCustomAtributes(");
        sb.append(str);
        sb.append(" , ");
        sb.append(str2);
        sb.append(")");
        C5162b.m25518a(str3, sb.toString());
        if (str != null) {
            try {
                put(str, str2);
            } catch (Exception unused) {
                Log.e(POLLFISH_TAG, "Custom attr_key value or key provided is invalid");
            }
        } else {
            Log.e(POLLFISH_TAG, "Custom attributes key should not be null");
        }
        return this;
    }

    public UserProperties setEmail(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setEmail: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.EMAIL, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "Email value provided is invalid");
        }
        return this;
    }

    public UserProperties setFacebookId(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setFacebookId: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.FACEBOOK_ID, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "Facebook id value provided is invalid");
        }
        return this;
    }

    public UserProperties setGender(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setGender: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.GENDER, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "gender value provided is invalid");
        }
        return this;
    }

    public UserProperties setGoogleId(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setGoogleId: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.GOOGLE_ID, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "Google id value provided is invalid");
        }
        return this;
    }

    public UserProperties setLinkedInId(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setLinkedInId: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.LINKEDIN_ID, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "LinkedIn id value provided is invalid");
        }
        return this;
    }

    public UserProperties setMaritalStatus(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setMaritalStatus: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.MARITAL_STATUS, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "marital status value provided is invalid");
        }
        return this;
    }

    public UserProperties setName(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setName: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.NAME, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "Name value provided is invalid");
        }
        return this;
    }

    public UserProperties setNationality(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setNationality: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.NATIONALITY, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "nationality value provided is invalid");
        }
        return this;
    }

    public UserProperties setPhone(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setPhone: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.PHONE, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "Phone value provided is invalid");
        }
        return this;
    }

    public UserProperties setPlaceOfBirth(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setPlaceOfBirth: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.PLACE_OF_BIRTH, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "place of birth value provided is invalid");
        }
        return this;
    }

    public UserProperties setPlaceOfRecidence(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setPlaceOfRecidence: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.PLACE_OF_RESIDENCE, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "place of recidence value provided is invalid");
        }
        return this;
    }

    public UserProperties setPoliticalView(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setPoliticalView: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.POLITICAL_VIEW, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "Political views value provided is invalid");
        }
        return this;
    }

    public UserProperties setReligion(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setReligion: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.RELIGION, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "religion status value provided is invalid");
        }
        return this;
    }

    public UserProperties setSurname(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setSurname: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.SURNAME, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "Surname value provided is invalid");
        }
        return this;
    }

    public UserProperties setTwitterId(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setTwitterId: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.TWITTER_ID, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "Twitter id value provided is invalid");
        }
        return this;
    }

    public UserProperties setYearOfBirth(int i) {
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setYearOfBirth: ");
        sb.append(i);
        C5162b.m25518a(str, sb.toString());
        try {
            put(this.YEAR_OF_BIRTH, String.valueOf(i));
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "year of birth value provided is invalid");
        }
        return this;
    }

    public UserProperties setYearOfBirth(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setYearOfBirth: ");
        sb.append(str);
        C5162b.m25518a(str2, sb.toString());
        try {
            put(this.YEAR_OF_BIRTH, str);
        } catch (Exception unused) {
            Log.e(POLLFISH_TAG, "year of birth value provided is invalid");
        }
        return this;
    }
}
