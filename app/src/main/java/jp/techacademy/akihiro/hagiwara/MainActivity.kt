package jp.techacademy.akihiro.hagiwara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.move()
/*
        dog.say()  // ポチが吠えます（ログ出力）
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val bigdog = BigDog("ヨーゼフ", 15)
        bigdog.say()

        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "です")
*/
    }
}
        // total(50, 1000)

/*
        // 整数型の変数をnumという名前で作成して、10を代入する
        var num = 10
        Log.d("Kotlintest", Integer.toString(num))

        // num に50を代入する
        // 変数や定数に.toString()と記述する方法もある。
        num = 50
        Log.d("kotlintest", num.toString())

*/

        /*
        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))
        */
/*
        val drink = 0
        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")
        }
*/

/*
        for(i in 0 until 10) {
            Log.d("kotlintest", Integer.toString(i))
        }
*/

/*
        val num1 = 100
        val num2 = 0
        var ans = 0

        try {
            ans = num1 / num2
        } catch (e: Exception) {
            Log.d("kotlintest", "0で割ろうとしましたね")
            Log.d("kotlintest", e.message)

        } finally {
            Log.d("kotlintest", "ans = " + ans.toString())
        }

*/

/*
        val points = arrayOf(10, 6, 15, 23, 17)

        for(i in points) {
            Log.d("kotlintest", i.toString())
        }
*/

/*
    private fun total(first: Int, last: Int) {
        var sum = 0
        for (i in first..last) {
            sum += i
        }
        Log.d("kotlintest", sum.toString())
    }
*/


