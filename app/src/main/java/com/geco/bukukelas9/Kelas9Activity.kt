package com.geco.bukukelas9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.bukukelas9.databinding.ActivityKelas9Binding

class Kelas9Activity : AppCompatActivity() {
    private lateinit var binding: ActivityKelas9Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKelas9Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnBack9toHome.setOnClickListener{
                val intent = Intent(this@Kelas9Activity, MainActivity::class.java)
                startActivity(intent)
            }
            btnSBK913.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "sbk")
                startActivity(intent)
            }
            btnAgama913.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "pai")
                startActivity(intent)
            }
            btnBhsIndo913.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "bindo")
                startActivity(intent)
            }
            btnIPA9S113.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "ipa1")
                startActivity(intent)
            }
            btnIPA9S213.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "ipa2")
                startActivity(intent)
            }
            btnIPS913.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "ips")
                startActivity(intent)
            }
            btnBhsIng913.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "bing")
                startActivity(intent)
            }
            btnMTK913.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "mtk")
                startActivity(intent)
            }
            btnPKN913.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "pkn")
                startActivity(intent)
            }
            btnPenjaskes913.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "penjas")
                startActivity(intent)
            }
            btnPrakarya9S113.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "prakarya1")
                startActivity(intent)
            }
            btnPrakarya9S213.setOnClickListener {
                val intent = Intent(this@Kelas9Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook9", "prakarya2")
                startActivity(intent)
            }
        }
    }
}