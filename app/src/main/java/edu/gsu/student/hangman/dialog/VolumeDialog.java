package edu.gsu.student.hangman.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.gsu.student.hangman.R;

/**
 * Created by milto on 4/10/2017.
 */

public class VolumeDialog extends Dialog {

    private int checkedID;

    @BindView(R.id.volume_radio_group) RadioGroup radioGroup;

    @OnClick(R.id.button_volume_cancel)
    public void cancelClick(){
        dismiss();
    }

    @OnClick(R.id.button_volume_ok)
    public void okClick(){

        switch (checkedID){
            case R.id.volume_100:
                volume100();
                break;
            case R.id.volume_75:
                volume75();
                break;
            case R.id.volume_50:
                volume50();
                break;
            case R.id.volume_25:
                volume25();
                break;
            case R.id.volume_0:
                volume0();
                break;
            default:
                dismiss();
                break;
        }
    }

    private void volume100() {
        listener.volume100();
        dismiss();
    }
    private void volume75() {
        listener.volume75();
        dismiss();
    }
    private void volume50() {
        listener.volume50();
        dismiss();
    }
    private void volume25() {
        listener.volume25();
        dismiss();
    }
    private void volume0() {
        listener.volume0();
        dismiss();
    }


    private ICustomeDialogEventListener listener;

    public interface ICustomeDialogEventListener {
        public void volume100();
        public void volume75();
        public void volume50();
        public void volume25();
        public void volume0();
    }

    public VolumeDialog(@NonNull Context context, ICustomeDialogEventListener listener) {
        super(context, R.style.Theme_AppCompat_DayNight_Dialog);
        this.listener = listener;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_volume);
        ButterKnife.bind(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                checkedID = checkedId;

            }


        });
    }

}
