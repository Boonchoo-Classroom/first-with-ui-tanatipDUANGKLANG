package scisrc.mobiledev.firstuiassignment

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class RegisterActivity : AppCompatActivity() {

    lateinit var backToMainPageBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // ทำให้หน้าจอแสดงเต็มพื้นที่ (Edge-to-Edge)
        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = true

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        backToMainPageBtn = findViewById(R.id.registBackToMainBtn)

        backToMainPageBtn.setOnClickListener {
            finish()
        }
    }
}
