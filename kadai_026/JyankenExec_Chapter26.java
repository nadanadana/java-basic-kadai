//じゃんけんを実行するクラス
public class JyankenExec_Chapter26 {
	public static void main(String[] args) {

		//じゃんけんクラスのインスタンス化
		Jyanken_Chapter26 janken = new Jyanken_Chapter26();

		//自分のじゃんけんの手を入力

		//対戦相手の手が乱数で選ばれる

		//じゃんけんの結果を出
		janken.getMyChoice();
		janken.getRandom();
		janken.playGame();

	}
}
