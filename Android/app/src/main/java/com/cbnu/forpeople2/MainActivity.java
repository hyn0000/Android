package com.cbnu.forpeople2;

import android.app.AlarmManager;


import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DigitalClock;

import java.time.Clock;


public class MainActivity extends AppCompatActivity {
    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R 은 리소스 아래 layout 에 activitymain 이 있다
        button=(Button) findViewById(R.id.button); //리소스에 있다 button1
        button1=(Button) findViewById(R.id.button1); //리소스에 있다 button1
        button2=(Button) findViewById(R.id.button2); //리소스에 있다 button1
        button3=(Button) findViewById(R.id.button3); //리소스에 있다 button1
        //button4=(Button) findViewById(R.id.button4); //리소스에 있다 button1

        //버튼 1에 대한 이벤트를 설정한다
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //인텐트 아직 배우지 않았다. 하지만 꼭 필요한 부분이다. 메인 페이지에서 다른 페이지생성 및 전환이 필요할때 사용하는 객체이다.
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://1.246.176.23:1002/table1.php"));        //Uri 를 이용하여 웹브라우저를 통해 웹페이지로 이동하는 기능
                startActivity((mIntent));
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //인텐트 아직 배우지 않았다. 하지만 꼭 필요한 부분이다. 메인 페이지에서 다른 페이지생성 및 전환이 필요할때 사용하는 객체이다.
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nlp.cbnu.ac.kr:8080/~info1677053/member_form.html"));        //Uri 를 이용하여 웹브라우저를 통해 웹페이지로 이동하는 기능
                startActivity((mIntent));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent mIntent = getPackageManager().getLaunchIntentForPackage("com.sec.android.app.clockpackage");
                //기본 패키지명  https://support.google.com/cloudidentity/answer/7292363?hl=ko
                startActivity((mIntent));

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent mIntent = getPackageManager().getLaunchIntentForPackage("com.google.zxing.client.android");
                //new IntentIntegrator(this).initiateScan();
                //저장되어있는 스토리지에 미디어폴더로 접근하여 겔러리를 보여준다.
                startActivity((mIntent));
//
//스캔에도 패키지명을 쓰기... 그래서 외부바코드 리더 쓰기
            }
        });
       /* button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();                                                                                           //finish() 현재 엑티비티(화면)을 종료하는 메소드이다.
            }
        });*/




    }
}

