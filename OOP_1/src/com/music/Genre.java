package com.music;

/**
 * ジャンル.
 */
public enum Genre {

    POP("ポップ"),
    ROCK("ロック");
    private String name;

    // コンストラクタ
    Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
