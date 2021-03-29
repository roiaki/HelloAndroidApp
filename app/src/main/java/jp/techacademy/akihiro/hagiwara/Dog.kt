package jp.techacademy.akihiro.hagiwara

import android.util.Log

// オーバライドするときは親クラスにopenをつけてオーバライドできるようにする
open class Dog :Animal, Movable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    // メソッド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン!」")
    }

    // Movableインターフェイスのメソッドをオーバライド
    override fun move() {
        Log.d("Kotlintest", this.name + "(" + this.age + ")" + "は全力で走った" )
    }
}