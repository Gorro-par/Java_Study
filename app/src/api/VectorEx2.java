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
		sb.append("��");
		sb.append(cal.get(Calendar.MONTH) + 1);
		sb.append("��");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd a HH:mm:ss");
//		Math.random();
//		Random ran = new Random();
		list.add(new Board("���� 1", "���� 1", "�۾��� 1", sb.toString()));//��¥
		list.add(new Board("���� 2", "���� 2", "�۾��� 2", sdf.format(date)));
		list.add(new Board("���� 3", "���� 3", "�۾��� 3", ""));
		list.add(new Board("���� 4", "���� 4", "�۾��� 4", ""));
		list.add(new Board("���� 5", "���� 5", "�۾��� 5", ""));
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
