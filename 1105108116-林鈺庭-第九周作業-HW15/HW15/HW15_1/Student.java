
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
		System.out.print("�ǥ͡G"+name+"\n�����ơG"+ch_score+" �^����ơG"+en_score+" �ƾǤ���"+math_score+"\n�`�������ơG"+ calAverage(ch_score,en_score,math_score)+"��");
	}
	
}
