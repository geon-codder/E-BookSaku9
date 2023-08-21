package com.geco.bukukelas9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.geco.bukukelas9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnkls9.setOnClickListener {
                val intent = Intent(this@MainActivity, Kelas9Activity::class.java)
                startActivity(intent)
            }
            btnBukuLainnya.setOnClickListener {
                val intent = Intent(this@MainActivity, BukuLainnyaActivity::class.java)
                startActivity(intent)
            }
            btnPanduan.setOnClickListener {
                val intent = Intent(this@MainActivity, PanduanActivity::class.java)
                startActivity(intent)
            }
            btnBiodataDeveloper.setOnClickListener {
                val intent = Intent(this@MainActivity, BiodataDeveloperActivity::class.java)
                startActivity(intent)
            }
        }
    }
    @Deprecated("Deprecated in Java",
        ReplaceWith("super.onBackPressed()", "androidx.appcompat.app.AppCompatActivity")
    )
    override fun onBackPressed(){
        AlertDialog.Builder(this)
            .setTitle("Konfirmasi keluar aplikasi")
            .setMessage("Anda Yakin Ingin Keluar Aplikasi?")
            .setCancelable(false)
            .setPositiveButton(android.R.string.ok) { dialog, whichButton ->
                super.onBackPressed()
            }
            .setNegativeButton(android.R.string.cancel) { dialog, whichButton ->
            }
            .show()
    }
}