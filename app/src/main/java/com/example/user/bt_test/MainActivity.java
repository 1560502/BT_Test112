package com.example.user.bt_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    ImageView img;
    Button btn_previous, btn_next;
    ArrayList<Picture> arr=new ArrayList<>();
    int pos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        initdata();
        addEvent();
    }

    private void addEvent() {
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pos++;
                if(pos==arr.size())
                    pos=0;
                img.setImageResource(arr.get(pos).getImage());
                txt.setText(arr.get(pos).getText());
            }
        });
        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pos--;
                if(pos<0)
                    pos=arr.size()-1;
                img.setImageResource(arr.get(pos).getImage());
                txt.setText(arr.get(pos).getText());
            }
        });

    }

    private void initdata() {
        arr.add(new Picture(R.drawable.a01,"adfadad"));
        arr.add(new Picture(R.drawable.a02,"adfadakjdkjdad"));
        arr.add(new Picture(R.drawable.a03,"addadadadndndnndad"));
        arr.add(new Picture(R.drawable.a04,"adfadad"));
        arr.add(new Picture(R.drawable.a05,"adfmhaggadad"));
        arr.add(new Picture(R.drawable.a06,"adfadad"));
        arr.add(new Picture(R.drawable.a07,"adfadad"));
        arr.add(new Picture(R.drawable.a08,"adfadad"));
        arr.add(new Picture(R.drawable.a09,"adfafsadad"));
        arr.add(new Picture(R.drawable.a10,"adfadad"));
        arr.add(new Picture(R.drawable.a11,"adfadad"));


        img.setImageResource(arr.get(pos).getImage());
        txt.setText(arr.get(pos).getText());

    }

    private void addControl() {
        img= (ImageView) findViewById(R.id.image);
        btn_next= (Button) findViewById(R.id.button1);
        btn_previous= (Button) findViewById(R.id.button2);
        txt= (TextView) findViewById(R.id.txtend);
    }
}
