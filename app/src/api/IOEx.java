package api;

import java.io.IOException;

/*
	스트림 : 일반적으로 데이터, 패킷 등의 일련의 연속성을 갖는 흐름
	입,출력 스트림: 데이터를 읽고 쓰는 구조를 프로그램의 구조로 모델링
	버퍼: 데이처를 임시적으로 담아두는공간
	
	자바 입출력 스트림 개념
	- 단 방향으로 흐름
	- 버퍼를 가질 수 있다
	- FIFO(First In First Out)의 구조
	- 문자(CHaracter Stream), 바이트(byte Stream)으로 분류 함
	
	
	문자(Character Stream)문자 최상위 스트림
	Reader class
		입력 스트림
	Writer class
		출력 스트림
		
	바이트(byte Stream) 바이트 최상위 스트림
	InputStream class
		입력 스트림
	OutputStream
		출력 스트림
 */
public class IOEx {

	public static void main(String[] args) {
		System.out.println("입력 : ");
		char c = ' ';
		try {
			c = (char)System.in.read();
		}catch(IOException e) {
			e.printStackTrace();
		}System.out.println("출력 : " + c);

	}

}
