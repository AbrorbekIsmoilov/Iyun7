package com.abrorbek_uz.iyun7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abrorbek_uz.iyun7.adapters.Adapter
import com.abrorbek_uz.iyun7.databinding.ActivityMainBinding
import com.abrorbek_uz.iyun7.utils.MyData

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: Adapter
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        MyData.movieFun()
        adapter = Adapter(MyData.list,this)
        binding.rv.adapter = adapter
    }
}