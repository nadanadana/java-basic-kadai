package kadai_021.copy;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {

		//辞書クラスのインスタンスを作成
		Dictionary_Chapter21 myDictionary = new Dictionary_Chapter21();

		//調べる英単語を配列にセット
		String[] wordsToSearch = { "apple", "banana", "grape", "orange" };

		// searchArrayメソッドを呼び出します
		myDictionary.searchArray(wordsToSearch);
	}
}