package exception;

public class ScoreException extends Exception{
	public ScoreException() {
		super("점수가 범위를 벗어남");
		//상위 클래스 생성자 super
	}
} 
