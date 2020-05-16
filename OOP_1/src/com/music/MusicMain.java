package com.music;

/**
 * 本プロジェクトのmainメソッドを持つクラス.
 */
public class MusicMain {
    public static void main(String[] args) {

        // Mr.Childrenについて考えてみましょう
        Musician mrChildren = new Musician("Mr.Children");

        // ミスチルが3曲をリリースしました
        Production tomorrowNeverKnows = new Production("Tomorrow never knows", Genre.POP);
        Production owariNakiTabi = new Production("終わりなき旅", Genre.POP);
        Production hanabi = new Production("HANABI", Genre.ROCK);

        mrChildren.addProductions(tomorrowNeverKnows);
        mrChildren.addProductions(owariNakiTabi);
        mrChildren.addProductions(hanabi);

        // 「Tomorrow never knows」と「終わりなき旅」がミリオンを達成！
        tomorrowNeverKnows.becomeMillionSeller();
        owariNakiTabi.becomeMillionSeller();


        // 次にあいみょんについて考えてみましょう
        Musician aimyon = new Musician("あいみょん");

        // あいみょんが2曲をリリースしました
        aimyon.addProductions(new Production("マリーゴールド", Genre.POP));
        aimyon.addProductions(new Production("君はロックを聴かない", Genre.ROCK));

        // 残念ながらあいみょんのCDはミリオンを達成できませんでした、、


        // ここで各ミュージシャンの作品を出力してみましょう

        // まずMr.Childrenの全作品を表示させます
        // 表示させたい作品群はmrChildrenが保持するproductionsの中身ですが、
        // この変数がprivateなためmainメソッドからは直接アクセス不可です(mrChildren.productions出来ない)。
        // そのためproductionsの中身を返却してくれるgetProduction()を使ってproductionsの中身を取得
        System.out.println(mrChildren.getName() + "の作品は、");
        for (int i = 0; i < mrChildren.getProductionCount(); i++) {
            System.out.println(mrChildren.getProduction(i));
        }

        // 次にあいみょんの全作品を表示させます
        System.out.println(aimyon.getName() + "の作品は、");
        for (int i = 0; i < aimyon.getProductionCount(); i++) {
            System.out.println(aimyon.getProduction(i));
        }


        // ↑うまく表示されましたね！
        // ただ42～45行目、47～51行目が完全に重複していてかなり冗長的ですね
        // 上記コードは、ミスチルかあいみょんの違いだけですよね。つまりミュージシャン一般に言えることなのです
        // このような場合は、Musicianクラスに上記処理をメソッドとして移す方が簡単なコードになります！

        System.out.println();
        System.out.println("【別解】printAllProductions()を使用した場合");
        mrChildren.printAllProductions();
        aimyon.printAllProductions();
    }
}
