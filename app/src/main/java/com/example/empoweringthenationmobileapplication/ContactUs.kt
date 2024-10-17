package com.example.empoweringthenationmobileapplication

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.webkit.WebSettings

class ContactUs : AppCompatActivity() {

    private lateinit var imageViewAccountContactUs: ImageView
    private lateinit var imageViewBackContactUs: ImageView
    private lateinit var webViewMap: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)

        imageViewAccountContactUs = findViewById(R.id.imageViewAccountContactUs)
        imageViewBackContactUs = findViewById(R.id.imageViewBackContactUs)

        imageViewAccountContactUs.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        imageViewBackContactUs.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val webView = findViewById<WebView>(R.id.webViewMap)

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true

        webView.webViewClient = WebViewClient()

        val mapIframe = """
            <html>
                <body style="margin:0;padding:0;">
                    <iframe 
                        src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3584.3268594089614!2d28.05593887519354!3d-26.05557217716843!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x1e9573ae1134daa7%3A0x5ca397399db2518f!2s23%20De%20La%20Rey%20Rd%2C%20Rivonia%2C%20Sandton%2C%202129!5e0!3m2!1sen!2sza!4v1728835730623!5m2!1sen!2sza"
                        width="100%" height="100%" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade">
                    </iframe>
                </body>
            </html>
        """.trimIndent()

        webView.loadData(mapIframe, "text/html", "UTF-8")
    }
}