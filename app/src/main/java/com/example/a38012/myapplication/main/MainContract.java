package com.example.a38012.myapplication.main;



import android.content.Context;

import com.example.a38012.myapplication.base.IBasePresenter;
import com.example.a38012.myapplication.base.IBaseView;


/**
 * Created by Administrator on 2017/6/3.
 */

public interface MainContract {
    interface View extends IBaseView<Presenter> {
        void showError(String msg);

        void toUpdateVer(String apkurl, String version);

        void toFragemntUpdate();

        void toFragemntMain();

        void toFragemntBigPic();

        void showSubData();

        void getAlarmId(String alarmId);
    }

    interface Presenter extends IBasePresenter {
        void uploadAlarm(String macAddress, int telkey);

        void getScreenData(boolean isRefresh, String mac, String ipAddress, Context context);

        void uploadAlarmInfo(String macAddress, String recordId, String video_path, String pic_path);
    }
}
