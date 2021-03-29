package jp.techacademy.akihiro.hagiwara

abstract class Animal {
    // プロパティ
    var name: String
    var age: Int

    // 引数つきコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()
}