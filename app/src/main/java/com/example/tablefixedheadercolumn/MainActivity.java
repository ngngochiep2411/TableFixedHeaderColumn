package com.example.tablefixedheadercolumn;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tablefixedheadercolumn.table.Table;
import com.example.tablefixedheadercolumn.table.ViewSizeUtils;
import com.example.tablefixedheadercolumn.table1.CustomTable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Table table = new Table(this);

        setContentView(table);



    }


    private void test(){

        LinearLayout linearLayout = new LinearLayout(this);

        LinearLayout linearLayout1 = new LinearLayout(this);
        linearLayout1.setLayoutParams(new LinearLayout.LayoutParams(200,ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout1.setBackgroundColor(Color.BLUE);

        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout2.setBackgroundColor(Color.GREEN);

        TextView textView1 = new TextView(this);
        textView1.setText("Sample\nt");

        TextView textView2 = new TextView(this);
        textView2.setText("Sample 2");

        linearLayout1.addView(textView1);
        linearLayout2.addView(textView2);

        linearLayout.addView(linearLayout1);
        linearLayout.addView(linearLayout2);

        int textview1Width = ViewSizeUtils.getViewHeight(textView1,200);
        int textview2Width = ViewSizeUtils.getViewHeight(textView2);

        textView2.getLayoutParams().height = textview1Width;

        Log.e("textview width",textview1Width+" "+textview2Width+" "+ViewSizeUtils.getViewWidth(textView1)+" "+textView1.getLayoutParams().width);
        this.setContentView(linearLayout);


    }
}
