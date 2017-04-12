package edu.gsu.student.hangman;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;

import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.gsu.student.hangman.dialog.VolumeDialog;

public class MainActivity extends BaseActivity {

    @OnClick(R.id.button_start)
    public void buttonStartClick(){
        toActivity(CategoryActivity.class);
    }

    @OnClick(R.id.button_volume)
    public void buttonVolumeClick(){
        volumeDialog();
    }

    Intent svc;
    BackgroundSoundService bgs;
    boolean mBounded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        svc = new Intent(this, BackgroundSoundService.class);
        startService(svc);
    }

    private void volumeDialog() {

        final VolumeDialog dialog = new VolumeDialog(this, new VolumeDialog.ICustomeDialogEventListener() {
            @Override
            public void volume100 () {
                bgs.setVolume(100);
                toastShort("Vol: 100%");
            }
            public void volume75 () {
                bgs.setVolume(75);
                toastShort("Vol: 75%");
            }
            public void volume50 () {
                bgs.setVolume(50);
                toastShort("Vol: 50%");
            }
            public void volume25 () {
                bgs.setVolume(25);
                toastShort("Vol: 25%");
            }
            public void volume0 () {
                bgs.setVolume(0);
                toastShort("Vol: 0%");
            }
        });
        dialog.show();
    }

    protected void onStart() {
        super.onStart();
        Intent mIntent = new Intent(this, BackgroundSoundService.class);
        bindService(mIntent, mConnection, BIND_AUTO_CREATE);
    };

    ServiceConnection mConnection = new ServiceConnection() {

        public void onServiceDisconnected(ComponentName name) {
            mBounded = false;
            bgs = null;
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            mBounded = true;
            BackgroundSoundService.LocalBinder mLocalBinder = (BackgroundSoundService.LocalBinder)service;
            bgs = mLocalBinder.getServerInstance();
        }
    };
}
