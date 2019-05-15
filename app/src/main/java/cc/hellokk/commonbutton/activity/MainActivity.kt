package cc.hellokk.commonbutton.activity

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import cc.hellokk.commonbutton.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_1.setOnClickListener { showToast(btn_1.text) }
        btn_2.setOnClickListener { showToast(btn_2.text) }
        btn_3.setOnClickListener { showToast(btn_3.text) }
        btn_4.setOnClickListener { showToast(btn_4.text) }
        btn_5.setOnClickListener { showToast(btn_5.text) }
        btn_6.setOnClickListener { showToast(btn_6.text) }
    }

    private var mToast: Toast? = null
    private fun showToast(text: CharSequence?) {
        if (mToast == null)
            mToast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        mToast?.setText(text)
        mToast?.show()
    }
}
