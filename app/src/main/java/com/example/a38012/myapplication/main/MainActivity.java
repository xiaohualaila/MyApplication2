package com.example.a38012.myapplication.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.a38012.myapplication.R;

public class MainActivity extends AppCompatActivity implements MainContract.View{
    private MainContract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MainPresenter(this);
    }

    public void todoRequet(View view) {
        presenter.getScreenData(true, "1C:CA:E3:41:7D:74","192.168.1.23", this);
    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public void toUpdateVer(String apkurl, String version) {

    }

    @Override
    public void toFragemntUpdate() {

    }

    @Override
    public void toFragemntMain() {

    }

    @Override
    public void toFragemntBigPic() {

    }

    @Override
    public void showSubData() {

    }

    @Override
    public void getAlarmId(String alarmId) {

    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
