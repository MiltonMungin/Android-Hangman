package edu.gsu.student.hangman;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

/**
 * Created by milto on 4/10/2017.
 */

public class BackgroundSoundService extends Service {
    private static final String TAG = null;
    MediaPlayer player;
    int maxVolume = 100;

    IBinder mBinder = new LocalBinder();

    @Override
    public IBinder onBind(Intent intent) {

        return mBinder;
    }

    public class LocalBinder extends Binder {
        public BackgroundSoundService getServerInstance() {
            return BackgroundSoundService.this;
        }
    }
    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this, R.raw.morningstar);
        player.setLooping(true); // Set looping
        float log1=(float)(Math.log(maxVolume-100)/Math.log(maxVolume));
        player.setVolume(1-log1, 1-log1);
    }

    public void setVolume(int vol){
        float log1=(float)(Math.log(maxVolume-vol)/Math.log(maxVolume));
        player.setVolume(1-log1, 1-log1);
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        return START_NOT_STICKY;
    }

    public void onStart(Intent intent, int startId) {
        // TO DO
    }
    public IBinder onUnBind(Intent arg0) {
        // TO DO Auto-generated method
        return null;
    }

    public void onStop() {

    }
    public void onPause() {

    }
    @Override
    public void onDestroy() {
        player.stop();
        player.release();
    }

    @Override
    public void onLowMemory() {

    }


}
