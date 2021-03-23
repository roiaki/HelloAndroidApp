package jp.techacademy.akihiro.hagiwara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 整数型の変数をnumという名前で作成して、10を代入する
        var num = 10
        Log.d("Kotlintest", Integer.toString(num))

        // num に50を代入する
        // 変数や定数に.toString()と記述する方法もある。
        num = 50
        Log.d("kotlintest", num.toString())
    }
}
