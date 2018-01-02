package timeline.lizimumu.com.t.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;


/**
 * Alarm manage
 * Created by zb on 02/01/2018.
 */

public class AlarmUtil {

    public static void setAlarm(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        if (alarmManager != null) {
            long start = System.currentTimeMillis();
            Intent in = new Intent("ALARM_RECEIVER");
            PendingIntent pi = PendingIntent.getBroadcast(context, 0, in, PendingIntent.FLAG_CANCEL_CURRENT);
            // TODO 修改为真实值
            alarmManager.set(AlarmManager.RTC_WAKEUP, start + 5 * 60 * 1000, pi);
        }
    }
}
