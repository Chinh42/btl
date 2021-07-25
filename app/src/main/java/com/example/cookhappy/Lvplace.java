package com.example.cookhappy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Lvplace extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    public static ArrayList<BuaAn> arrTraicay;
    Buaanadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvplace);
        listView = (ListView) findViewById(R.id.lvBuaan);
        arrTraicay = new ArrayList<>();
        arrTraicay.add(new BuaAn("Giày lười Sanvado da sần màu nâu","799.000 Đ", "Được thiết kế đơn giản, cách điệu bởi phần đai da, mang lại cảm giác nhẹ nhàng nhưng vô cùng chắc chắn cho người sử dụng.", R.drawable.giay1));
        arrTraicay.add(new BuaAn("Giày công sở buộc dây Sanvado","699.000 Đ", "Giày buộc dây Savando da trơn màu nâu AP-129 thiết kế dành riêng cho các chàng trai văn phòng lịch lãm, kiểu dáng thanh lịch thon gọn trên chất liệu da bò cao cấp.", R.drawable.giay2));
        arrTraicay.add(new BuaAn("Giày da bò nam quai da ngang GNTA2816-D","590.000 Đ", "Chất liệu da bò cao cấp, da thật 100% Form giày ôm chân, thiết kế trẻ trung hiện đại", R.drawable.giay3));
        arrTraicay.add(new BuaAn("Giày da nam buộc dây da bóng GNTA5502-D","640.000 Đ", "Chất liệu da bò thật 100% thiết kế buộc dây thời trang, dễ kết hợp trang phục", R.drawable.giay4));
        arrTraicay.add(new BuaAn("Giày lười nam James Blanc","899.000 Đ", "Thử mang JB-6103 vào chân, Giaytot.com đảm bảo với bạn rằng bạn sẽ vô cùng thích thú bởi cảm giác êm chân và nét nam tính.", R.drawable.giay5));
        arrTraicay.add(new BuaAn("Giày cổ lửng Sanvado","899.000 Đ", "Giày cổ lửng Sanvado da trơn màu nâu (KT-0095) là một thiết kế mà giày nam Sanvado đặc biệt tự hào", R.drawable.giay6));
        arrTraicay.add(new BuaAn("Giày nam đế cao 7cm mũi thuyền GCTATC123-D","", "Chất liệu da cao cấp, mềm mại cùng thiết kế đế giày bằng chất liệu cao su ép gỗ mang lại cảm giác thoải mái khi sử dụng", R.drawable.giay7));
        arrTraicay.add(new BuaAn("Giày tây nam buộc dây kiểu dáng Derby GNTA1901-D","", "Trẻ trung, nam tính và hiện đại là điều bạn có thể dễ dàng nhận thấy trong thiết kế này.", R.drawable.giay8));
        arrTraicay.add(new BuaAn("Giày Bít Mũi Nhọn Gót Vuông - BMN 0336","499.000 Đ", "Chất liệu da cao cấp, mềm mại cùng thiết kế đế giày bằng chất liệu cao su ép gỗ mang lại cảm giác thoải mái.", R.drawable.giay9));
        adapter = new Buaanadapter(this,R.layout.list_mon_an, arrTraicay);
        listView.setAdapter(adapter);
        //Bắt sự kiện click
        listView.setOnItemClickListener(this);

    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(this,viewthucdon.class);
        startActivity(intent);
    }
}