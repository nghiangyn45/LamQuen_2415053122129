package com.ute.lamquen_2415053122129

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ute.lamquen_2415053122129.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKiemTra.setOnClickListener {
            val rawTen = binding.edtTen.text.toString()
            val rawSL = binding.edtSoLuong.text.toString()
            val ten = Try20Logic.tenHopLe(rawTen)
            val soLuong = Try20Logic.docSoLuong(rawSL)

            if (ten == null || soLuong == null) {
                binding.tvKetQua.text = "Lỗi: Dữ liệu không hợp lệ!"
                Toast.makeText(this, "Dữ liệu không hợp lệ", Toast.LENGTH_SHORT).show()
            } else {
                binding.tvKetQua.text = Try20Logic.loiChao(ten, soLuong)
            }
        }

        binding.btnXoa.setOnClickListener {
            binding.edtTen.text?.clear()
            binding.edtSoLuong.text?.clear()
            binding.tvKetQua.text = "Kết quả hiển thị ở đây"
        }
    }
}