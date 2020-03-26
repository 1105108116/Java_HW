
public class Student2 {
	private int ch_score, en_score , math_score;
	private String name;
	public void set_name(String name) {
		this.name = name;
	}
	public void set_ch_score(int ch) {
		ch_score = ((ch>=0 & ch<=100) ? ch : 0);
	}
	public void set_en_score(int en) {
		en_score = ((en>=0 & en<=100) ? en : 0);
	}
	public void set_math_score(int math) {
		math_score = ((math>=0 & math<=100) ? math : 0);
	}
	public String get_name() {
		return name;
	}
	public int get_ch_score() {
		return ch_score;
	}
	public int get_en_score() {
		return en_score;
	}
	public int get_math_score() {
		return math_score;
	}
	
	public float calAverage(int ch,int en,int math) {
 		float cal;
 		cal = (ch+en+math)/3;
 		return cal;
	}
	public void showProfile() {
		System.out.print("厩ネ"+get_name()+"\n瓣ゅだ计"+get_ch_score()+" 璣ゅだ计"+get_en_score()+" 计厩だ计"+get_math_score()+"\n羆キАだ计"+ calAverage(get_ch_score(),get_en_score(),get_math_score())+"だ");
	}
}