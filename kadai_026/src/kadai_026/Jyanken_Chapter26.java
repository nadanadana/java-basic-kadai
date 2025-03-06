package src.kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice (){
		System.out.println("自分のじゃんけんの手を入力しましょう");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String input = scanner.next();
		
		if (input.equals("r") || input.equals("s") || input.equals("p")) {
			scanner.close();
			return input;
		} else {
			System.out.println("正しい手を入力してください");
		}
		}
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom () {
		String[] npc = {"r", "s", "p"};
		int random = (int)(Math.floor(Math.random()*3));
		return npc[random];
	}
	
	
	//じゃんけんを行う
	public void playGame () {
	    HashMap<String, String> key = new HashMap<String, String>();
	    key.put("r", "グー");
	    key.put("s", "チョキ");
	    key.put("p", "パー");
	    
	    String me = this.getMyChoice();
	    String you = this.getRandom();
	    
	    // 自分の手と対戦相手の手を日本語で表示する
	    System.out.println("自分の手は" + key.get(me) + ",対戦相手の手は" + key.get(you));
	    
	    if (me.equals(you)) {
	        System.out.println("あいこです");
	    } else if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p"))
	            || (me.equals("p") && you.equals("r"))) {
	        System.out.println("あなたの勝ちです");
	    } else {
	        System.out.println("あなたの負けです");
	    }
	}
}
	

