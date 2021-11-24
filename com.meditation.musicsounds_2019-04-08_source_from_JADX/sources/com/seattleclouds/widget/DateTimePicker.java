package com.seattleclouds.widget;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TimePicker;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import java.util.Calendar;
import java.util.Date;

public class DateTimePicker extends LinearLayout {

    /* renamed from: a */
    private Context f23393a;

    /* renamed from: b */
    private Button f23394b;

    /* renamed from: c */
    private Button f23395c;

    /* renamed from: d */
    private Object f23396d;

    /* renamed from: e */
    private Object f23397e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public DatePickerDialog f23398f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TimePickerDialog f23399g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Calendar f23400h;

    /* renamed from: i */
    private int f23401i = 0;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f23406a;

        /* renamed from: b */
        long f23407b;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f23406a = parcel.readInt();
            this.f23407b = parcel.readLong();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23406a);
            parcel.writeLong(this.f23407b);
        }
    }

    public DateTimePicker(Context context) {
        super(context);
        m32140a(context);
    }

    public DateTimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m32140a(context);
    }

    /* renamed from: a */
    private void m32140a(Context context) {
        this.f23393a = context;
        View inflate = LayoutInflater.from(context).inflate(C5460i.date_time_picker, this, true);
        this.f23394b = (Button) inflate.findViewById(C5458g.dateButton);
        this.f23395c = (Button) inflate.findViewById(C5458g.timeButton);
        setDate(new Date());
        if (!isInEditMode()) {
            this.f23396d = new OnDateSetListener() {
                public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    DateTimePicker.this.f23400h.set(1, i);
                    DateTimePicker.this.f23400h.set(2, i2);
                    DateTimePicker.this.f23400h.set(5, i3);
                    DateTimePicker.this.mo20648a();
                }
            };
            DatePickerDialog datePickerDialog = new DatePickerDialog(this.f23393a, (OnDateSetListener) this.f23396d, this.f23400h.get(1), this.f23400h.get(2), this.f23400h.get(5));
            this.f23398f = datePickerDialog;
            this.f23397e = new OnTimeSetListener() {
                public void onTimeSet(TimePicker timePicker, int i, int i2) {
                    DateTimePicker.this.f23400h.set(11, i);
                    DateTimePicker.this.f23400h.set(12, i2);
                    DateTimePicker.this.mo20648a();
                }
            };
            TimePickerDialog timePickerDialog = new TimePickerDialog(this.f23393a, (OnTimeSetListener) this.f23397e, this.f23400h.get(11), this.f23400h.get(12), false);
            this.f23399g = timePickerDialog;
            this.f23394b.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    DateTimePicker.this.f23398f.updateDate(DateTimePicker.this.f23400h.get(1), DateTimePicker.this.f23400h.get(2), DateTimePicker.this.f23400h.get(5));
                    DateTimePicker.this.f23398f.show();
                }
            });
            this.f23395c.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    DateTimePicker.this.f23399g.updateTime(DateTimePicker.this.f23400h.get(11), DateTimePicker.this.f23400h.get(12));
                    DateTimePicker.this.f23399g.show();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo20648a() {
        Date time = this.f23400h.getTime();
        Button button = this.f23394b;
        StringBuilder sb = new StringBuilder();
        sb.append(DateFormat.format("EEE, ", this.f23400h));
        sb.append(DateFormat.getMediumDateFormat(this.f23393a).format(time));
        button.setText(sb.toString());
        this.f23395c.setText(DateFormat.getTimeFormat(this.f23393a).format(time));
    }

    public Calendar getCalendar() {
        return this.f23400h;
    }

    public Date getDate() {
        return this.f23400h.getTime();
    }

    public int getMode() {
        return this.f23401i;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setMode(savedState.f23406a);
        setDate(new Date(savedState.f23407b));
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23406a = this.f23401i;
        savedState.f23407b = this.f23400h.getTimeInMillis();
        return savedState;
    }

    public void setCalendar(Calendar calendar) {
        this.f23400h = calendar;
        mo20648a();
    }

    public void setDate(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        setCalendar(instance);
    }

    public void setMode(int i) {
        Button button;
        this.f23401i = i;
        this.f23394b.setVisibility(0);
        this.f23395c.setVisibility(0);
        switch (this.f23401i) {
            case 1:
                button = this.f23395c;
                break;
            case 2:
                button = this.f23394b;
                break;
            default:
                return;
        }
        button.setVisibility(8);
    }
}
