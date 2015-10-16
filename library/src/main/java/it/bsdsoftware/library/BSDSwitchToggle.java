package it.bsdsoftware.library;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;

/**
 * Created by Simone on 16/10/15.
 */
public class BSDSwitchToggle extends SwitchCompat {

    private CharSequence onText, offText;

    public BSDSwitchToggle(Context context) {
        super(context);
        init(context);
    }

    public BSDSwitchToggle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public BSDSwitchToggle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        super.setThumbResource(R.drawable.toggle_selector);
        super.setTrackResource(R.drawable.toggle_sfondo);
        super.setShowText(true);
        super.setSwitchTextAppearance(context, R.style.AppTheme_Base_SwitchCompat_TextAppearance);
        super.setTextOff(context.getString(R.string.text_switch_off));
        super.setTextOn(context.getString(R.string.text_switch_on));

        //on and off text is inverted
        onText = super.getTextOff();
        offText = super.getTextOn();
        super.setTextOff(offText);
        super.setTextOn(onText);
        super.setChecked(!super.isChecked());
    }

    @Override
    public CharSequence getTextOn() {
        return offText;
    }

    @Override
    public CharSequence getTextOff() {
        return onText;
    }

    @Override
    public void setTextOff(CharSequence textOff) {
        onText = textOff;
        super.setTextOn(textOff);
    }

    @Override
    public void setTextOn(CharSequence textOn) {
        offText = textOn;
        super.setTextOff(textOn);
    }

    public boolean isRealChecked() {
        return !super.isChecked();
    }

    public void setRealChecked(boolean checked) {
        super.setChecked(!checked);
    }

    public String getTextSelection(){
        if(isRealChecked())
            return getTextOn().toString();
        else
            return getTextOff().toString();
    }
}
