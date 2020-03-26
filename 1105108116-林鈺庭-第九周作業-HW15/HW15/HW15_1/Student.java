
public class Student {
	int ch_score, en_score , math_score;
	String name;
	Student(String name,int ch,int en,int math){
		this.name=name;
		ch = ch_score;
		en = en_score;
		math = math_score;
	}
	public float calAverage(int ch,int en,int math) {
 		float cal;
 		cal = (ch+en+math)/3;
 		return cal;
	}
	public void showProfile() {
		System.out.print("厩ネ"+name+"\n瓣ゅだ计"+ch_score+" 璣ゅだ计"+en_score+" 计厩だ计"+math_score+"\n羆キАだ计"+ calAverage(ch_score,en_score,math_score)+"だ");
	}
	
}
