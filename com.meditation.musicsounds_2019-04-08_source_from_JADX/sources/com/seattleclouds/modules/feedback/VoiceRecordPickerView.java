package com.seattleclouds.modules.feedback;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.modules.feedback.PickerView.PickerSavedState;
import com.seattleclouds.util.C6598aq;
import java.io.File;

public class VoiceRecordPickerView extends PickerView {

    /* renamed from: t */
    private ImageButton f20023t = ((ImageButton) findViewById(C5458g.playImageButton));

    /* renamed from: u */
    private String f20024u;

    /* renamed from: v */
    private String f20025v;

    static class VoicePickerSavedState extends PickerSavedState {
        public static final Creator<VoicePickerSavedState> CREATOR = new Creator<VoicePickerSavedState>() {
            /* renamed from: a */
            public VoicePickerSavedState createFromParcel(Parcel parcel) {
                return new VoicePickerSavedState(parcel);
            }

            /* renamed from: a */
            public VoicePickerSavedState[] newArray(int i) {
                return new VoicePickerSavedState[i];
            }
        };

        /* renamed from: a */
        String f20027a;

        /* renamed from: b */
        String f20028b;

        private VoicePickerSavedState(Parcel parcel) {
            super(parcel);
            this.f20027a = parcel.readString();
            this.f20028b = parcel.readString();
        }

        VoicePickerSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f20027a);
            parcel.writeString(this.f20028b);
        }
    }

    public VoiceRecordPickerView(Context context, Field field, int i) {
        super(context, field, i);
        this.f20023t.setEnabled(false);
        this.f20023t.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                VoiceRecordPickerView.this.m27928b();
            }
        });
        this.f19998d.setText(C5462k.feedback_btn_record);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m27928b() {
        File file = new File(this.f20025v);
        if (file.exists()) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(C6598aq.m31937a(file), "audio/*");
            intent.setFlags(1);
            getContext().startActivity(intent);
        }
    }

    /* renamed from: a */
    public boolean mo18192a() {
        if (this.f20006l.f19969d.equalsIgnoreCase("yes")) {
            return this.f20025v != null && new File(this.f20025v).exists();
        }
        return true;
    }

    public String getRecordName() {
        return this.f20024u;
    }

    public String getRecordPath() {
        return this.f20025v;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof PickerSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        PickerSavedState pickerSavedState = (PickerSavedState) parcelable;
        this.f20005k = pickerSavedState.f20022c;
        VoicePickerSavedState voicePickerSavedState = (VoicePickerSavedState) pickerSavedState;
        this.f20024u = voicePickerSavedState.f20027a;
        this.f20025v = voicePickerSavedState.f20028b;
        super.onRestoreInstanceState(pickerSavedState.getSuperState());
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        VoicePickerSavedState voicePickerSavedState = new VoicePickerSavedState(super.onSaveInstanceState());
        voicePickerSavedState.f20022c = this.f20005k;
        voicePickerSavedState.f20027a = this.f20024u;
        voicePickerSavedState.f20028b = this.f20025v;
        return voicePickerSavedState;
    }

    public void setRecordName(String str) {
        this.f20024u = str;
        this.f19995a.setText(str);
    }

    public void setRecordPath(String str) {
        this.f20025v = str;
        if (new File(str).exists()) {
            this.f20023t.setEnabled(true);
        }
    }
}
