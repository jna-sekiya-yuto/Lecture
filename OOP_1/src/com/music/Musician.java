package com.music;

import java.util.ArrayList;
import java.util.List;

/**
 * ミュージシャンクラス.
 */
public class Musician {

    // アーティスト名
    private String name;

    // 作品
    private List<Production> productions;

    // コンストラクタ
    public Musician(String name) {
        this.name = name;
        this.productions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // ミュージシャンの作品群に新しく作品を追加するメソッド
    // 新曲リリースの際に使用されるイメージ
    public void addProductions(Production production) {
        productions.add(production);
    }

    // インデックスで指定された作品を取得するメソッド
    // 指定されたインデックスに対応する要素がない場合は、nullを返却
    public Production getProduction(int index) {
        if (0 <= index && index < productions.size()) {
            return productions.get(index);
        } else {
            return null;
        }
    }

    // このミュージシャンの作品数を取得するメソッド
    public int getProductionCount() {
        return productions.size();
    }

    // このミュージシャンの全作品を表示する
    public void printAllProductions() {
        System.out.println(name + "の作品は、");
        for (Production production: productions) {
            System.out.println(production.toString());
        }
    }

}
