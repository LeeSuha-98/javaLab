package sec02.exam02_vector;

public class Board { //게시판 이라고 생각하면 됨
	String subject; //제목
	String content; //내용
	String writer; //작성자
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}
