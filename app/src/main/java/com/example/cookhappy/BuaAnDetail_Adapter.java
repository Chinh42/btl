package com.example.cookhappy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class BuaAnDetail_Adapter extends PagerAdapter {
    private Context context;
    private ArrayList<BuaAn> arr;
    public BuaAnDetail_Adapter(Context context, ArrayList<BuaAn> arr) {
        this.context = context;
        this.arr = arr;
    }
    public int getCount() {
        return arr.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(this.context);
        View view = inflater.inflate(R.layout.activity_bua_an_detail__adapter, container, false);
        WebView webView = (WebView) view.findViewById(R.id.web_view);
        String url = "file:///android_asset/" + arr.get(position).getName() + ".html";
        url = url.replace(" ", "%20");
        webView.loadUrl(url);
        //show controll
        webView.getSettings().setBuiltInZoomControls(true);
        container.addView(view);
        return view;


    }


}