package com.seattleclouds.modules.feedback;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6638s;
import java.util.Calendar;

public class PickerView extends LinearLayout {

    /* renamed from: a */
    public TextView f19995a;

    /* renamed from: b */
    public EditText f19996b;

    /* renamed from: c */
    public EditText f19997c = null;

    /* renamed from: d */
    public Button f19998d;

    /* renamed from: e */
    public ImageView f19999e;

    /* renamed from: f */
    public int f20000f;

    /* renamed from: g */
    public int f20001g;

    /* renamed from: h */
    public int f20002h;

    /* renamed from: i */
    public int f20003i;

    /* renamed from: j */
    public int f20004j;

    /* renamed from: k */
    public int f20005k;

    /* renamed from: l */
    public Field f20006l;

    /* renamed from: m */
    public Uri f20007m = null;

    /* renamed from: n */
    public double f20008n = 0.0d;

    /* renamed from: o */
    public double f20009o = 0.0d;

    /* renamed from: p */
    public String f20010p;

    /* renamed from: q */
    public String f20011q;

    /* renamed from: r */
    public OnDateSetListener f20012r = new OnDateSetListener() {
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            PickerView.this.f20000f = i;
            PickerView.this.f20001g = i2;
            PickerView.this.f20002h = i3;
            PickerView.this.m27916b();
        }
    };

    /* renamed from: s */
    public OnTimeSetListener f20013s = new OnTimeSetListener() {
        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            PickerView.this.f20003i = i;
            PickerView.this.f20004j = i2;
            PickerView.this.m27918c();
        }
    };

    /* renamed from: t */
    private Object f20014t;

    /* renamed from: u */
    private Context f20015u = null;

    static class ImagePickerSavedState extends PickerSavedState {
        public static final Creator<ImagePickerSavedState> CREATOR = new Creator<ImagePickerSavedState>() {
            /* renamed from: a */
            public ImagePickerSavedState createFromParcel(Parcel parcel) {
                return new ImagePickerSavedState(parcel);
            }

            /* renamed from: a */
            public ImagePickerSavedState[] newArray(int i) {
                return new ImagePickerSavedState[i];
            }
        };

        /* renamed from: a */
        Uri f20019a;

        private ImagePickerSavedState(Parcel parcel) {
            super(parcel);
            this.f20019a = (Uri) parcel.readValue(Uri.class.getClassLoader());
        }

        ImagePickerSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(this.f20019a);
        }
    }

    static class LocationPickerSavedState extends PickerSavedState {
        public static final Creator<LocationPickerSavedState> CREATOR = new Creator<LocationPickerSavedState>() {
            /* renamed from: a */
            public LocationPickerSavedState createFromParcel(Parcel parcel) {
                return new LocationPickerSavedState(parcel);
            }

            /* renamed from: a */
            public LocationPickerSavedState[] newArray(int i) {
                return new LocationPickerSavedState[i];
            }
        };

        /* renamed from: a */
        double f20020a;

        /* renamed from: b */
        double f20021b;

        private LocationPickerSavedState(Parcel parcel) {
            super(parcel);
            this.f20020a = parcel.readDouble();
            this.f20021b = parcel.readDouble();
        }

        LocationPickerSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeDouble(this.f20020a);
            parcel.writeDouble(this.f20021b);
        }
    }

    public static class PickerSavedState extends BaseSavedState {
        public static final Creator<PickerSavedState> CREATOR = new Creator<PickerSavedState>() {
            /* renamed from: a */
            public PickerSavedState createFromParcel(Parcel parcel) {
                return new PickerSavedState(parcel);
            }

            /* renamed from: a */
            public PickerSavedState[] newArray(int i) {
                return new PickerSavedState[i];
            }
        };

        /* renamed from: c */
        int f20022c;

        protected PickerSavedState(Parcel parcel) {
            super(parcel);
            this.f20022c = parcel.readInt();
        }

        PickerSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f20022c);
        }
    }

    @SuppressLint({"NewApi"})
    public PickerView(Context context, Field field, int i) {
        int i2;
        TextView textView;
        LayoutParams layoutParams;
        int i3;
        EditText editText;
        TextView textView2;
        LayoutParams layoutParams2;
        super(context);
        this.f20015u = context;
        this.f20006l = field;
        this.f20005k = i;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (this.f20005k == 0) {
            layoutInflater.inflate(C5460i.feedbackdatepicker, this);
            this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
            this.f19995a.setText(this.f20006l.f19968c);
            this.f19995a.setGravity(51);
            this.f19995a.setLayoutParams(new LayoutParams(-1, -2));
            this.f19996b = (EditText) findViewById(C5458g.feedbackTextEdit);
            this.f19998d = (Button) findViewById(C5458g.feedbackBtn);
            this.f19996b.setFocusable(false);
            Calendar instance = Calendar.getInstance();
            this.f20000f = instance.get(1);
            this.f20001g = instance.get(2);
            this.f20002h = instance.get(5);
            m27916b();
        } else if (this.f20005k == 1) {
            layoutInflater.inflate(C5460i.feedbacktimepicker, this);
            this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
            this.f19995a.setText(this.f20006l.f19968c);
            this.f19995a.setGravity(51);
            this.f19995a.setLayoutParams(new LayoutParams(-1, -2));
            this.f19996b = (EditText) findViewById(C5458g.feedbackTextEdit);
            this.f19998d = (Button) findViewById(C5458g.feedbackBtn);
            this.f19996b.setFocusable(false);
            Calendar instance2 = Calendar.getInstance();
            this.f20003i = instance2.get(11);
            this.f20004j = instance2.get(12);
            m27918c();
        } else if (this.f20005k == 12) {
            layoutInflater.inflate(C5460i.feedback_date_time_picker, this);
            this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
            this.f19995a.setText(this.f20006l.f19968c);
            this.f19995a.setGravity(51);
            this.f19995a.setLayoutParams(new LayoutParams(-1, -2));
            this.f19996b = (EditText) findViewById(C5458g.feedbackTextEdit);
            this.f19998d = (Button) findViewById(C5458g.feedbackBtn);
            this.f19996b.setFocusable(false);
            Calendar instance3 = Calendar.getInstance();
            this.f20000f = instance3.get(1);
            this.f20001g = instance3.get(2);
            this.f20002h = instance3.get(5);
            this.f20003i = instance3.get(11);
            this.f20004j = instance3.get(12);
            m27919d();
        } else if (this.f20005k == 13) {
            layoutInflater.inflate(C5460i.feedback_switch_picker, this);
            this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
            this.f19995a.setText(this.f20006l.f19968c);
            this.f20014t = findViewById(C5458g.enabled);
            ((View) this.f20014t).setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
        } else {
            if (this.f20005k == 2) {
                layoutInflater.inflate(C5460i.feedbacklocationpicker, this);
                this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                this.f19995a.setText(this.f20006l.f19968c);
                this.f19995a.setGravity(51);
                this.f19995a.setLayoutParams(new LayoutParams(-1, -2));
                this.f19996b = (EditText) findViewById(C5458g.feedbackTextEdit);
            } else {
                if (this.f20005k == 3) {
                    layoutInflater.inflate(C5460i.feedbackimagepicker, this);
                    this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                    this.f19995a.setText(this.f20006l.f19968c);
                    this.f19995a.setGravity(51);
                    textView2 = this.f19995a;
                    layoutParams2 = new LayoutParams(-1, -2);
                } else if (this.f20005k == 9) {
                    layoutInflater.inflate(C5460i.feedbacksignaturepicker, this);
                    this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                    this.f19995a.setText(this.f20006l.f19968c);
                    this.f19995a.setGravity(51);
                    textView2 = this.f19995a;
                    layoutParams2 = new LayoutParams(-1, -2);
                } else if (this.f20005k == 4) {
                    layoutInflater.inflate(C5460i.feedbackcameracapture, this);
                    this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                    this.f19995a.setText(this.f20006l.f19968c);
                    this.f19995a.setGravity(51);
                    textView2 = this.f19995a;
                    layoutParams2 = new LayoutParams(-1, -2);
                } else if (this.f20005k == 5) {
                    layoutInflater.inflate(C5460i.feedbacktextfield, this);
                    this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                    this.f19995a.setText(this.f20006l.f19968c);
                    this.f19995a.setGravity(51);
                    this.f19995a.setLayoutParams(new LayoutParams(-1, -2));
                    this.f19996b = (EditText) findViewById(C5458g.feedbackTextEdit);
                    this.f19996b.setRawInputType(1);
                    return;
                } else if (this.f20005k == 16) {
                    layoutInflater.inflate(C5460i.feedbacknumberfield, this);
                    this.f19995a = (TextView) findViewById(C5458g.feedbackNumberView);
                    this.f19995a.setText(this.f20006l.f19968c);
                    this.f19995a.setGravity(51);
                    this.f19995a.setLayoutParams(new LayoutParams(-1, -2));
                    this.f19996b = (EditText) findViewById(C5458g.feedbackNumberEdit);
                    this.f19996b.setRawInputType(2);
                    return;
                } else {
                    if (this.f20005k == 11) {
                        layoutInflater.inflate(C5460i.feedbacktextfield, this);
                        this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                        this.f19995a.setText(this.f20006l.f19968c);
                        this.f19995a.setGravity(51);
                        this.f19995a.setLayoutParams(new LayoutParams(-1, -2));
                        this.f19996b = (EditText) findViewById(C5458g.feedbackTextEdit);
                        this.f19996b.setRawInputType(1);
                        this.f19996b.setSingleLine(false);
                        this.f19996b.setGravity(48);
                        i3 = this.f20006l.mo18178i();
                        if (i3 < 0) {
                            i3 = 4;
                        }
                        editText = this.f19996b;
                    } else if (this.f20005k == 14) {
                        layoutInflater.inflate(C5460i.feedback_richtext_field, this);
                        this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                        this.f19995a.setText(this.f20006l.f19968c);
                        this.f19995a.setGravity(51);
                        this.f19995a.setLayoutParams(new LayoutParams(-1, -2));
                        this.f19997c = (EditText) findViewById(C5458g.feedbackTextEdit);
                        this.f19997c.setRawInputType(1);
                        this.f19997c.setSingleLine(false);
                        this.f19997c.setGravity(48);
                        int i4 = this.f20006l.mo18178i();
                        if (i4 < 0) {
                            i4 = 4;
                        }
                        editText = this.f19997c;
                    } else if (this.f20005k == 6) {
                        layoutInflater.inflate(C5460i.feedbacktextfield, this);
                        this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                        this.f19995a.setText(this.f20006l.f19968c);
                        this.f19995a.setGravity(51);
                        this.f19995a.setLayoutParams(new LayoutParams(-1, -2));
                        this.f19996b = (EditText) findViewById(C5458g.feedbackTextEdit);
                        this.f19996b.setRawInputType(33);
                        return;
                    } else {
                        if (this.f20005k == 7) {
                            layoutInflater.inflate(C5460i.feedbacklistpicker, this);
                            this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                            this.f19995a.setText(this.f20006l.f19968c);
                            this.f19995a.setGravity(51);
                            textView = this.f19995a;
                            layoutParams = new LayoutParams(-1, -2);
                        } else if (this.f20005k == 8) {
                            layoutInflater.inflate(C5460i.feedbacklistpicker, this);
                            this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                            this.f19995a.setText(this.f20006l.f19968c);
                            this.f19995a.setGravity(51);
                            textView = this.f19995a;
                            layoutParams = new LayoutParams(-1, -2);
                        } else if (this.f20005k == 10) {
                            layoutInflater.inflate(C5460i.feedbacktextfield, this);
                            this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                            this.f19995a.setText(this.f20006l.f19968c);
                            this.f19995a.setGravity(51);
                            this.f19995a.setLayoutParams(new LayoutParams(-1, -2));
                            this.f19996b = (EditText) findViewById(C5458g.feedbackTextEdit);
                            this.f19996b.setRawInputType(1);
                            this.f19996b.setVisibility(8);
                            return;
                        } else if (this.f20005k == 15) {
                            layoutInflater.inflate(C5460i.feedbackvoicerecordpicker, this);
                            this.f19998d = (Button) findViewById(C5458g.feedbackBtn);
                            this.f19995a = (TextView) findViewById(C5458g.textView);
                            return;
                        } else if (this.f20005k == 17) {
                            layoutInflater.inflate(C5460i.feedbackpictureselection, this);
                            this.f19995a = (TextView) findViewById(C5458g.feedbackTextView);
                            this.f19995a.setText(this.f20006l.f19968c);
                            this.f19995a.setGravity(51);
                            this.f19995a.setLayoutParams(new LayoutParams(-1, -2));
                            i2 = C5458g.feedbackPictureSelection;
                            this.f19999e = (ImageView) findViewById(i2);
                        } else {
                            return;
                        }
                        textView.setLayoutParams(layoutParams);
                        this.f19996b = (EditText) findViewById(C5458g.feedbackTextEdit);
                        this.f19996b.setFocusable(false);
                    }
                    editText.setLines(i3);
                    return;
                }
                textView2.setLayoutParams(layoutParams2);
                i2 = C5458g.feedbackImageView;
                this.f19999e = (ImageView) findViewById(i2);
            }
            this.f19998d = (Button) findViewById(C5458g.feedbackBtn);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m27916b() {
        EditText editText = this.f19996b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20000f);
        sb.append("-");
        sb.append(this.f20002h);
        sb.append("-");
        sb.append(this.f20001g + 1);
        editText.setText(sb);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m27918c() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, this.f20003i);
        instance.set(12, this.f20004j);
        this.f19996b.setText(DateFormat.getTimeFormat(this.f20015u).format(instance.getTime()));
    }

    /* renamed from: d */
    private void m27919d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20000f);
        sb.append("-");
        sb.append(this.f20002h);
        sb.append("-");
        sb.append(this.f20001g + 1);
        String sb2 = sb.toString();
        Calendar instance = Calendar.getInstance();
        instance.set(11, this.f20003i);
        instance.set(12, this.f20004j);
        EditText editText = this.f19996b;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(" ");
        sb3.append(DateFormat.getTimeFormat(this.f20015u).format(instance.getTime()));
        editText.setText(sb3.toString());
    }

    /* renamed from: a */
    public boolean mo18192a() {
        if (this.f20006l.f19969d.equalsIgnoreCase("yes")) {
            return (this.f20005k == 0 || this.f20005k == 1 || this.f20005k == 2 || this.f20005k == 5 || this.f20005k == 16 || this.f20005k == 6 || this.f20005k == 12 || this.f20005k == 11 || this.f20005k == 8) ? this.f19996b != null && !this.f19996b.getText().toString().trim().equals("") : ((this.f20005k == 3 || this.f20005k == 4 || this.f20005k == 9 || this.f20005k == 17) && this.f20007m == null) ? false : true;
        }
        return true;
    }

    public String getRequirementMessage() {
        return this.f20015u.getString(C5462k.feedback_field_cannot_be_empty, new Object[]{this.f20006l.f19968c});
    }

    @SuppressLint({"NewApi"})
    public boolean getSwithPosition() {
        return this.f20014t instanceof Switch ? ((Switch) this.f20014t).isChecked() : ((CheckBox) this.f20014t).isChecked();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof PickerSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        PickerSavedState pickerSavedState = (PickerSavedState) parcelable;
        this.f20005k = pickerSavedState.f20022c;
        int i = this.f20005k;
        if (i != 9) {
            if (i != 17) {
                switch (i) {
                    case 2:
                        LocationPickerSavedState locationPickerSavedState = (LocationPickerSavedState) pickerSavedState;
                        this.f20008n = locationPickerSavedState.f20020a;
                        this.f20009o = locationPickerSavedState.f20021b;
                        break;
                    case 3:
                    case 4:
                        break;
                }
            }
            this.f20007m = ((ImagePickerSavedState) pickerSavedState).f20019a;
            if (this.f20007m != null) {
                Bitmap a = C6638s.m32067a(this.f20007m, 220, (Activity) this.f20015u);
                if (a != null) {
                    String a2 = C6598aq.m31938a(getContext(), this.f20007m);
                    if (a2 == null) {
                        a2 = this.f20007m.getPath();
                    }
                    if (a2 != null) {
                        Bitmap a3 = C6638s.m32070a(a2, a);
                        if (a3 != null) {
                            this.f19999e.setImageBitmap(a3);
                        }
                    }
                }
            }
        } else {
            this.f20007m = ((ImagePickerSavedState) pickerSavedState).f20019a;
            if (this.f20007m != null) {
                this.f19999e.setImageBitmap(BitmapFactory.decodeFile(this.f20007m.getPath()));
            }
        }
        super.onRestoreInstanceState(pickerSavedState.getSuperState());
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        int i = this.f20005k;
        if (!(i == 9 || i == 17)) {
            switch (i) {
                case 2:
                    LocationPickerSavedState locationPickerSavedState = new LocationPickerSavedState(onSaveInstanceState);
                    locationPickerSavedState.f20022c = this.f20005k;
                    locationPickerSavedState.f20020a = this.f20008n;
                    locationPickerSavedState.f20021b = this.f20009o;
                    return locationPickerSavedState;
                case 3:
                case 4:
                    break;
                default:
                    return onSaveInstanceState;
            }
        }
        ImagePickerSavedState imagePickerSavedState = new ImagePickerSavedState(onSaveInstanceState);
        imagePickerSavedState.f20022c = this.f20005k;
        imagePickerSavedState.f20019a = this.f20007m;
        return imagePickerSavedState;
    }

    @SuppressLint({"NewApi"})
    public void setSwithPosition(boolean z) {
        if (this.f20014t instanceof Switch) {
            ((Switch) this.f20014t).setChecked(z);
        } else {
            ((CheckBox) this.f20014t).setChecked(z);
        }
    }

    public void setViewId(Integer num) {
        setId(num.intValue());
        if (this.f19996b != null) {
            this.f19996b.setId(num.intValue() + 1000);
        }
    }
}
