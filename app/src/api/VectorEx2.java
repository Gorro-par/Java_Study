package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;



public class VectorEx2 {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		Calendar cal = Calendar.getInstance();
		StringBuilder sb = new StringBuilder();
		sb.append(cal.get(Calendar.YEAR));
		sb.append("년");
		sb.append(cal.get(Calendar.MONTH) + 1);
		sb.append("월");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd a HH:mm:ss");
//		Math.random();
//		Random ran = new Random();
		list.add(new Board("제목 1", "내용 1", "글쓴이 1", sb.toString()));//날짜
		list.add(new Board("제목 2", "내용 2", "글쓴이 2", sdf.format(date)));
		list.add(new Board("제목 3", "내용 3", "글쓴이 3", ""));
		list.add(new Board("제목 4", "내용 4", "글쓴이 4", ""));
		list.add(new Board("제목 5", "내용 5", "글쓴이 5", ""));
		list.remove(2);
		list.remove(3);
		for(int i = 0; i < list.size(); i++) {
//			Object obj = list.get(i);
			Board board = list.get(i);
			System.out.println(board.subject + "\t" 
								+ board.content + "\t" 
								+ board.Writer + "\t"
								+ board.date);
		}

	}

}
