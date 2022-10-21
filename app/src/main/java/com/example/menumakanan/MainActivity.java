package com.example.menumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList <Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        // memanggil class KulinerAdapter agar menu muncul
        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Pecel Lele",
                "Rp. 15.000",
                "Lele dengan sambel penyet.",
                R.drawable.pecellele));
        listMakanan.add(new Kuliner("Nasi Goreng Mercon",
                "Rp. 14.500",
                "Nasi goreng dengan bumbu mercon yang sangat pedas.",
                R.drawable.nasgormercon));
        listMakanan.add(new Kuliner("Ayam Geprek Keju",
                "Rp. 20.000",
                "Ayam geprek dengan toping keju.",
                R.drawable.geprekkeju));
        listMakanan.add(new Kuliner("Kari Ayam",
                "Rp. 17.500",
                "Ayam dengan bumbu kari khas India.",
                R.drawable.kariayam));
        listMakanan.add(new Kuliner("Tahu Bulat",
                "Rp. 500",
                "Tahu bulat khas Jawa Barat.",
                R.drawable.tahubulat));
        listMakanan.add(new Kuliner("Salad Buah",
                "Rp. 12.000",
                "Salad dengan varian buah yang dipotong dadu.",
                R.drawable.saladbuah));
    }


}