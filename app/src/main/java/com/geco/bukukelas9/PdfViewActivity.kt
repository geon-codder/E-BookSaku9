package com.geco.bukukelas9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.geco.bukukelas9.databinding.ActivityPdfViewBinding
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle

class PdfViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfViewBinding
    private var lastPage = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // set toolbar as support action bar
        setSupportActionBar(binding.toolbar)

        supportActionBar?.apply {
            title = "Kembali Ke Daftar Buku"

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)

        }
        binding.apply {
            toolbar.setNavigationOnClickListener {
                startActivity(Intent(applicationContext, Kelas9Activity::class.java))
                finish()
            }
        }

        checkPdfTitle(intent)
    }

    private fun checkPdfTitle(intent: Intent){

        when (intent.getStringExtra("TitleBook9")) {
            "sbk" -> {
                showPdfFromAssets(Utils.getBSSBK9K13())
            }
            "pai" -> {
                showPdfFromAssets(Utils.getBSPAI9K13())
            }
            "bindo" -> {
                showPdfFromAssets(Utils.getBSBindo9K13())
            }
            "ipa1" -> {
                showPdfFromAssets(Utils.getBSIPA9S1K13())
            }
            "ipa2" -> {
                showPdfFromAssets(Utils.getBSIPA9S2K13())
            }
            "ips" -> {
                showPdfFromAssets(Utils.getBSIPS9K13())
            }
            "bing" -> {
                showPdfFromAssets(Utils.getBSBingris9K13())
            }
            "mtk" -> {
                showPdfFromAssets(Utils.getBSMTK9K13())
            }
            "pkn" -> {
                showPdfFromAssets(Utils.getBSPKN9K13())
            }
            "penjas" -> {
                showPdfFromAssets(Utils.getBSPJOK9K13())
            }
            "prakarya1" -> {
                showPdfFromAssets(Utils.getBSPrakarya9S1K13())
            }
            "prakarya2" -> {
                showPdfFromAssets(Utils.getBSPrakarya9S2K13())
            }
        }

        when (intent.getStringExtra("Lainnya")){
            "OliMtk" -> {
                showPdfFromAssets(Utils.getBsOliMTK())
            }
            "ChanelYT" -> {
                showPdfFromAssets(Utils.getLinkYT())
            }
        }
    }


    private fun showPdfFromAssets(pdfName: String) {
        binding.pdfView.fromAsset(pdfName)
//            .pages(0, 2, 1, 3, 3, 3)
            .password(null) // if password protected, then write password
            .defaultPage(0) // set the default page to open
            .scrollHandle(DefaultScrollHandle(this))
            .onPageChange { page, _ ->
                if (page > lastPage) {
                    binding.appBar.setExpanded(false, true)
                    binding.toolbar.visibility = View.GONE
                } else {
                    binding.appBar.setExpanded(true, true)
                    binding.toolbar.visibility = View.VISIBLE
                }
                lastPage = page
            }
            .onPageError { page, _ ->
                Toast.makeText(
                    this@PdfViewActivity,
                    "Error at page: $page", Toast.LENGTH_LONG
                ).show()
            }
            .load()
    }
}