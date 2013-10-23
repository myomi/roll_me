# さいころで覚えるJava

ver1.0.0
## 目次
- はじめに
- 対象読者
- 注意点
- 登場人物
- 0章 さいころとの出会い
- 1章 さいころの洗礼


## はじめに
おめでとうございます！

あなたは晴れて、「（株）オレンジレッドソックス」（以下ORS）という、オレンジなんだか赤なんだか、よく分からないブラック企業に就職することが出来ました。

ORSは業務系からサービス系まで幅広く扱うソフトウェア開発会社です。これからあなたはORSの中で様々な業務をこなしていかなくてはなりません。果たして、無事勤め上げることができるのでしょうか。

## 対象読者
Javaの教科書を一通り読んだけど、いざ自分で何か作ってみようとしても、うまく作れない人。

## 注意点
- この本とは別に、なにか1冊Javaの教科書を用意してください。ORSはブラック企業なので、Javaの基本文法を懇切丁寧に教えてはくれません！
- 最初から順に読み進めて下さい。
- 文章の途中で **【Action!】**　と書かれた箇所にであったら、実践課題の始まりです。実際にソースコードを書き、実行してみてください。
- 文章の途中で **【Boss!】** と書かれた箇所にであったら、ボス戦の始まりです。 **【Action】** とやるべきことは同じですが、力ずくで解こうとすると、あなたはとんでもないダメージを食らいます。よく考えて、問題に取り組んで下さい。
- 分からない問題や解決に余りにも時間がかかりそうな場合、飛ばして先に進むことはできません。ほかの参考書等を参照して、必ず問題を解決してから、先に進んでください。
- ボス戦など、こんなのできるか！と思ってしまうような理不尽な問題に、直面することがあるかもしれません。しかしそれは、問題が理不尽なのではなく、あなたの実力が足りないのです。考え方を変えれば、必ず解決できるはずなので、じっくりと考えてみてください。

## 登場人物
- ハラ部長		・・・ORSゲーム開発部部長。リーダーシップ溢れる、頼れる上司。だが部下の評価に関しては冷酷な一面もあり、駄目だと判断した時の見切りも早い。
- ウツミグループ長	・・・ORSゲーム開発部サイコロチームのグループ長。打たれ強い。
- サワムラ先輩		・・・ORSゲーム開発部サイコロチームの先輩。力持ち。
- クワタさん		・・・ORSゲーム開発部サイコロチームの先輩。冷静で理論家。
- スガノ君		・・・あなたと同期入社。ハラ部長の親戚で完全なコネ入社だが、実力は抜群。今年の新人王候補。
- クリヤマ部長		・・・ORSハム開発部部長。口癖は「コロス」。なぜソフト会社でハムを作っているのかは謎。
- オオタニ君		・・・あなたと同期入社。ソフトとハムの両方を開発する二刀流を目指している。なぜハムを作りたいのかは謎。
- 伝説のナガシマ	・・・かつてORSでDiceクラスを一人で開発した、伝説のプログラマー。現在は消息不明
- ナベツネ会長		・・・ORS会長。ソフトウェア開発のことなどまるで分らないが、幅広い人脈と豊富な資金力で、社内外に多大な影響力を持つ。

## 0章 さいころとの出会い
入社初日。あなたはハラ部長に連れられて、「ゲーム開発部」と書かれた部屋に案内されました。そう。あなたはゲーム開発部門に配属されたのです。ゲーム開発部ではウツミグループ長のもとで、サイコロチームに所属することになりました。

席は先輩のサワムラさんの隣。何だかいかつくて、怖そうな先輩です。チームにはもう一人、クワタさんという方がいるそうなのですが、今は有休を取ってアメリカ旅行中なのだそうです。

自己紹介を終え、席について割り当てられたPCの電源を入れていると、早速ウツミ部長が話しかけてきました。

ウツミ「このチームでは、サイコロを使ったゲーム開発をやっているんだ。君にも早くサイコロを使いこなしてもらわないとね」

サイコロ？

ウツミ「そう、サイコロだ。サイコロゲームで一山当てるのが、このチームの目標だ」

サイコロ転がして金儲けできれば、だれも苦労しないだろうとあなたは思いましたが、入社初日から文句を言う事も出来ず、おとなしく聞いておくことにしました。

ウツミ「では、さっそくこのクラスを見てほしい」**【Action!】**

### 問題00-00 ソースコードを開いてみよう ###
> Eclipse の「プロジェクト・エクスプローラ」上で、src/ors/dice/Dice.java をダブルクリックし、
> ソースコードを開いて下さい。開くことができましたか？

```java:ors.dice.Dice.java
// works.work000.Main000_00.java
package ors.dice;

/**
 * 6面体サイコロ
 * @author nagashima
 */
public class Dice {
	/** サイコロの面の数 */
	private int face = 6;

	/**
	 * サイコロを1回振ります
	 * @return 出た目の値（1～6）
	 */
	public int role() {
		return (int)(Math.random() * face) + 1;
	}
}
```

これは？

ウツミ「これがわが社が誇るサイコロクラス Diceクラスだ。かつて会社に所属していた伝説のプログラマー『ナガシマ』氏が作成した最高傑作だ。どうだい、素晴らしい出来だろう」

はぁ。あなたはまだプログラミング初心者でプログラムの良し悪しなどわかりませんので、相槌を打つしかありません。

ウツミ「このクラスを使いこなせるようになるのが、君がまず取り組むべき課題だ。続いて、 works.work000.Main000_01.java を開けてみたまえ。」

```java:works.work000.Main000_01.java
// works.work000.Main000_01.java
package works.work000;

import ors.dice.Dice;

/**
 * さいころの動作確認クラス
 * @author sawamura
 */
public class Main000_01 {
	public static void main(String[] args) {
		// さいころを１つ用意します
		Dice dice = new Dice();
		// さいころを1回振ります
		int value = dice.role();
		// 出た目を表示します
		System.out.println("さいころの目は" + value + "です");
	}
}

```

ウツミグループ長「これは、サワムラ君が用意しておいてくれた、Diceの使い方を学ぶためのサンプルだ。ささ、早速物は試しだ。動かしてみたまえ」**【Action!】**

### 問題00-01　プログラムを実行してみよう
> 先ほど見せてもらった、works.work000.Main.java をEclipse上で実行してみましょう。
> 
> 「コンソール」に何と表示されましたか？

ウツミ「Diceの使い方は分かってくれたかな？では、君の始めての仕事だ。Diceのテストをひたすら行うのが君に与えられる役割だ。後はサワムラ君、任せたよ」

サワムラ「じゃあ、works.work000.Main000_02.javaを開けてくれるかな」**【Action!】**

```java:works.work000.Main000_02.java
// works.work000.Main000_02.java より抜粋
Dice dice = new Dice();
System.out.println("さいころの目は" + dice.role() + "です");
// TODO 問題0-02をやってみよう「さいころを3回振り、結果をコンソールに表示する」
```

### 問題00-02 さいころを3回振り、1回ずつ、その結果をコンソールに表示してください
> サワムラ先輩曰く、「俺が1回、試しに振っておいたから、あと3回繰り返すだけだ。簡単だろう？」　だそうです。

サワムラ「じゃあ、今日はここまで。明日から本格的なテストに入るから。お疲れさん」

強面のサワムラ先輩も、しゃべってみれば優しそうな先輩で、あなたはホッとしました。

明日も頑張ろう。そう思いながら、あなたは家路につくのでした。


## 1章 さいころの洗礼

サワムラ「おはよう。じゃあ、昨日の続きだ。機能さいころを3回振るテストをやったよね。あれを、あと1万回お願いしたい」

えっ？**【Boss!】**

### 問題01-01 さいころを1万回振り、1回ずつ、その結果をコンソールに表示してください
> サワムラ「優しい先輩だと言ったな。あれはウソだ」　
> works.work001.Main001_01.java に実装してください。


サワムラ「さいころを振るだけのゲームってつまらないと思うんだ」

そりゃそうですね。

サワムラ「なので、斬新なゲームを考えてみた。ちょっと見てくれ。こいつをどう思う？」

> #### ■勝ち負け判定ゲームの仕様
> 1. さいころを1回振ります
> 2. 出た目が3以下の場合は「あなたの負けです(N)」とコンソールに表示します。それ以外の値の場合は、「あなたの勝ちです(N)」と表示します
>
> ※Nにはさいころで出た目が表示されます

んー、どうでしょう？

ウツミ「おっ、ナガシマ先輩のマネか？」**【Action!】**

### 問題01-02 サワムラ先輩の考えた、勝ち負け判定ゲームを作ってください。
> works.work001.Main001_02.java に実装してください。

サワムラ「1回しか遊べないのはつまらんな。5回くらいの連続勝負にするか」

繰り返すの、好きですね。**【Action!】**

### 問題01-03 以下の仕様で、勝ち負け判定ゲームver2を作ってください。
> works.work001.Main001_03.java に実装してください。
> ### ■勝ち負け判定ゲームver2の仕様
> 1. さいころを1回振ります
> 2. 出た目が3以下の場合は「あなたの負けです(N)」とコンソールに表示します。それ以外の値の場合は、「あなたの勝ちです(N)」と表示します
> 3. 1～2 を計5回繰り返します。
>
> ※Nにはさいころで出た目が表示されます

？？？「あなた、ループ処理の中で、出た目の判定を書いてるの」

はい。

？？？「バカじゃないの？そういう時は判定処理をメソッドとして外に出すのよ。そうすれば、判定条件を後から変更したくなったときにループ処理を壊さずに安全に変更できるでしょ」

、、、どちら様ですか？

サワムラ「有休明けのクワタさん。俺の天敵だ。」

クワタ「サワムラも、何でも力ずくでやろうとすんじゃないわよ。」

サワムラ「。。。すんません」

怖い先輩がまた一人増えました！！**【Action!】**

### 問題01-04 以下の仕様で、勝ち負け判定ゲームver2を作り直してください。
> works.work001.Main001_04.java に実装してください。
> サワムラ「俺が、勝ち負けの判定をするjudgeメソッドのひな形をあらかじめ作っておいたから」
> ```
> 	public static boolean judge(Dice dice) {
>		// TODO 勝ち負け判定処理を実装しろ！
>		return false;
>	}
> ```
> サワムラ「今は必ずfalse、つまり負けを返すような仮の実装になっている。まずは、このメソッドの中身を以下の仕様で修正してくれ。
> 
> 1. 引数.diceを使って、さいころを1回振る
> 2.　さいころの出目が3以下の場合はfalseを返します。それ以外の値の場合は、trueを返します。
> 
> サワムラ「次に、mainメソッドの実装だ。以下の仕様通りに作ってくれ」
> 
> 1. さいころを引数に、judgeメソッドを呼び出し、その戻り値を受け取ります
> 2. 戻り値がtrue（勝ち）の場合は、「あなたの勝ちです」とコンソールに表示します。false（負け）の場合は「あなたの負けです」と表示します。


サワムラ「なんか、ゲームが退化してんな。」

退化、ですか？

サワムラ「ver1のころは『あなたの勝ちです（４）』って感じで、勝敗の後に出目を表示させてたじゃん？今回、勝敗判定をメソッドとして外に出したせいで、出目が何だったのかわかんなくなっちゃったよな。やっぱりクワタさんって口だけ。。。」

クワタ「あんたのメソッド設計が悪いのよ。何、単純にboolean型返してんのよ。そういう時は、判定結果と出目を持つオブジェクトを戻り値にすんのよ。」

クワタ「何にも考えずに基本型を戻り値にするから、拡張性のないメソッドになるのよ。バカ。筋肉バカ」

サワムラ「ぐぬぬ」**【Action!】**

### 問題01-05 以下の仕様で、勝ち負け判定ゲームver2を作リ直して下さい。
> works.work001.Main001_05.java に実装してください。
> クワタ「わたしが、勝ち負けの判定をするjudgeメソッドのひな形をあらかじめ作っておいたわ」
> ```
> 	public static JudgeResult judge(Dice dice) {
>		// TODO 勝ち負け判定処理を実装しろ！
>		return null;
>	}
> ```
> サワムラ「今は必ずnullを返すような仮の実装になっているの。このままじゃ何の役にも立たないメソッドね。まずは、このメソッドの中身を以下の仕様で修正してくれる？
> 
> 1. ors.dice.JudgeResult クラスのインスタンスを作成します
> 2. 引数.diceを使って、さいころを1回振る
> 3. 1で作ったインスタンスのsetValue() メソッドを使って、さいころの出目をセットします。
> 4.　さいころの出目が3以下の場合はfalseを１．で作ったインスタンスにsetWin()メソッドを使って値をセット返します。それ以外の値の場合は、trueをセットします。
> 
> サワムラ「次に、mainメソッドの実装よ。以下の仕様通りに作ってね」
> 
> 1. さいころを引数に、judgeメソッドを呼び出し、その戻り値を受け取ります
> 2. 戻り値のisWin()メソッドを呼び出し、true(勝ち）の場合は「あなたの勝ちです(N)」とコンソールに表示します。false（負け）の場合は「あなたの負けです(N)」と表示します。
>
> ※Nにはさいころで出た目が表示されます。さいころの出目は、judgeメソッドの戻り値のgetValue() メソッドで取り出します。

サワムラ「さいころって、なんか空しいよな」

どうしたんですか、いきなり

サワムラ「だって、１から６までの目しか出ないんだぜ！そんで、4以上が勝ちってなんだよ、このゲーム。下らない」

サイコロチームを全否定してますけど、大丈夫ですか？

サワムラ「大丈夫だ。問題な、、」

ウツミ「言わせねーよ！」

クワタ「1振りのさいころは1～6しか出ないけど、3回振って合計すれば3～18よね」（ぼそっ）

ウツミ・サワムラ「イイね！」

なんだこれ？**【Action!】**

### 問題01-06 以下の仕様で、勝ち負け判定ゲームver3を作って下さい。
> works.work001.Main001_06.java に実装してください。
> 
> 1. さいころを3回振り、出た目を合計します。
> 2. さいころの出目に応じて、以下のようにコンソールに表示してください。
> 
> - 3の時： あなたのぼろ負けです！（N)
> - 4～7の時： あなたの負けです（N)
> - 8～12の時：引き分けです（N)
> - 13～17の時：あなたの勝ちです（N)
> - 18の時：あなたの圧勝です！（N)
> 
> ※Nにはさいころで出た目が表示されます。
> 
> サワムラ「もう、俺はひな形なんて作らないからな。クラスとmainメソッドの宣言だけ書いておいたから、後は全部自分でやるんだ」
> 
> サワムラ「いいか、今まで学んだことを踏まえてプログラムを書くんだぞ。決してのびのび自由に書くんじゃないぞ。わかってるな」
> 
> サワムラ「もしのびのび書いてみろ、クリヤマ部長呼ぶからな。クリヤマさん呼んだらあれだぞ、お前、この本が終わるからな」
> 
> サワムラ「2章からはハム開発編が始まるからな。『問題02-01 豚肉を塩漬けしろ！』なんつって、俺とお前、ふたりでハムを作る作業に取り掛かるからな」
> 
> クワタ「誰か、こいつ黙らせて」
> 
> サワムラ先輩を黙らせる、文句ないコードをあなたが書くのです！

？？？「くだらん！」

ウツミ「か、会長！」

ナベツネ「何がさいころ3回だ、みみっちい。もっと大量のさいころをこう、ドバーッと振らせればいいじゃないか。」

ナベツネ「本当のさいころでは実現できないことをやってこそ、コンピュータじゃないのかね？1万個振らせればいい。男らしくな！」

ウツミ「おっしゃる通り！」

サワムラ「さすがです！」

クワタ「わたし、女ですけど」

もうやだ、この会社**【Boss!】**

### 問題01-07 以下の仕様で、さいころてんこ盛りゲームver1を作って下さい。
> works.work001.Main001_07.java に実装してください。
> 
> 1. さいころを1万回振り、出た目を合計します。
> 2. 1で求めた値をコンソールに表示してください。
> 3. 1～2 を10回繰り返してください。
> 

## 更新履歴 ##
- 2013/10/19 ver1.0.0 初版作成