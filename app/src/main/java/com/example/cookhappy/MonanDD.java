package com.example.cookhappy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MonanDD extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView lstda;
    public static ArrayList<BuaAn> arrTraicay;
    Buaanadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monan_d_d);
        lstda=findViewById(R.id.listdepda);
        arrTraicay = new ArrayList<>();
        arrTraicay.add(new BuaAn("Giày Converse","1.200.000 Đ", "Giày Lunarlon Nike cho bạn những bước đi nhẹ nhàng, êm ái nhất.", R.drawable.cv));
        arrTraicay.add(new BuaAn("Giày Ultra Boost","900.000 Đ", "Giày Sneaker Ultra BOOST công nghệ đế giày mới Stretch Web, dễ dàng thích nghi, co giãn theo những chuyển động và lực tác động của chân với mặt đất.", R.drawable.utr));
        arrTraicay.add(new BuaAn("Giày Sneakers Adidas EQT","1.150.000 Đ", "Giày adidas EQT Bask ADV có vẻ ngoài bắt mắt, cùng công năng thực sự tuyệt vời.", R.drawable.eqt));
        arrTraicay.add(new BuaAn("Gìay MLB chữ NY","850.000 Đ", "Giày Thời Trang Gucci NY Trắng  là một trong những siêu phẩm Sneakers mới của hãng thời trang danh tiếng Gucci mang đến cho bạn sự tự tin lẫn vẻ cá tính.", R.drawable.ny));
        arrTraicay.add(new BuaAn("Giày Boot Nam Chelsea Boots Routine","1.600.000 Đ", "Giày Boot Nam Cao Cổ Chelsea Boots Routine có thiết kế đơn giản nhưng tinh tế.", R.drawable.boot));
        arrTraicay.add(new BuaAn("Giày chạy thể thao nữ Anta","900.000 Đ", "Giày Sneaker Ultra BOOST công nghệ đế giày mới Stretch Web, dễ dàng thích nghi, co giãn theo những chuyển động và lực tác động của chân với mặt đất.", R.drawable.ana));
        adapter = new Buaanadapter(this, R.layout.list_mon_an, arrTraicay);
        lstda.setAdapter(adapter);
        //Bắt sự kiện click
        lstda.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(this,viewmonandd.class);
        startActivity(intent);
    }
}