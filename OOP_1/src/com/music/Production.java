package com.music;

/**
 * 作品クラス.
 */
public class Production {

    // 作品名
    private String name;

    // ジャンル
    private Genre genre;

    // ミリオンセラー作品かどうか
    private boolean isMillionSeller;

    // コンストラクタ
    public Production(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
        this.isMillionSeller = false;
    }

    // ミリオンセラーを達成した場合に使用される
    public void becomeMillionSeller() {
        isMillionSeller = true;
    }

    @Override
    // 曲名、ジャンル名を必ず表示し、ミリオンセラー作品の場合は「ミリオンセラー作品」も表示する
    public String toString() {
        return "曲名：" + name + "　ジャンル:" + genre.getName() + (isMillionSeller? "　ミリオンセラー作品" : "");
    }
}
