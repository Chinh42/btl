package com.example.cookhappy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class meohay extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView a;
    public static ArrayList<BuaAn> arrTraicay;
    Buaanadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meohay);
        a=findViewById(R.id.listmeohay);
        arrTraicay = new ArrayList<>();
        arrTraicay.add(new BuaAn("Dép sandal cao gót nữ 9 cm da bóng","520.000 Đ", "Có thể kết hợp dễ dàng với quần jean hay quần thun ôm, quần lửng, váy và cực kì hợp với các trang phục ngầu, cá tính.", R.drawable.dep1));
        arrTraicay.add(new BuaAn("DÉP CAO GÓT - DHL59","580.000 Đ", "Dép nữ cao gót Zucia DHL59 với chát liệu lấp lánh sang trọng, phần gót nhựa được cách điệu lạ mắt siêu nhẹ cao 8cm tôn dáng.", R.drawable.dep2));
        arrTraicay.add(new BuaAn("DÉP NỮ - D85O9","450.000 Đ", "Dép cao gót nữ Đông Hải D85O9 được thiết kế mới lạ với chi tiết nơ đôi xoắn tạo thành nút thắt ở mặt sân.", R.drawable.dep3));
        arrTraicay.add(new BuaAn("Giày cao gót nữ quai trong","240.000 Đ", "Dép, guốc cao gót 9 phân hở mũi, đính nơ mặt trời gắn đá kim cương.", R.drawable.dep4));
        arrTraicay.add(new BuaAn("Giày sandal cao gót nữ quai chéo","269.000 Đ", "Giày sandal cao gót nữ quai chéo đính đá phối quai kẹp trong suốt - Linus LN303", R.drawable.dep5));
        arrTraicay.add(new BuaAn("Giày sandal cao gót","299.000 Đ", "Giày sandal cao gót nữ quai mảnh phối dây đan chéo - Linus LN304", R.drawable.dep6));
        adapter = new Buaanadapter(this, R.layout.list_mon_an, arrTraicay);
        a.setAdapter(adapter);
        //Bắt sự kiện click
        a.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(this,viewmeohay.class);
        startActivity(intent);
    }
}