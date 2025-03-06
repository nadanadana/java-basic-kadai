package kadai_021.copy;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void searchArray(String[] wordsToSearch) {
		// 英単語の辞書として機能する
		HashMap<String, String> fruitAry = new HashMap<String, String>();

		// 辞書に単語を追加
		fruitAry.put("apple", "りんご");
		fruitAry.put("peach", "桃");
		fruitAry.put("banana", "バナナ");
		fruitAry.put("lemon", "レモン");
		fruitAry.put("pear", "梨");
		fruitAry.put("kiwi", "キウイ");
		fruitAry.put("strawberry", "いちご");
		fruitAry.put("grape", "ぶどう");
		fruitAry.put("muscat", "マスカット");
		fruitAry.put("cherry", "さくらんぼ");

		// 辞書を調べる
		for (int i = 0; i < wordsToSearch.length; i++) {
			if (fruitAry.containsKey(wordsToSearch[i])) {
				// 特定のキーの意味を取得
				System.out.println(wordsToSearch[i] + "の意味は" + fruitAry.get(wordsToSearch[i]));
			} else {
				System.out.println(wordsToSearch[i] + "は辞書に存在しません");
			}
		}
	}
}