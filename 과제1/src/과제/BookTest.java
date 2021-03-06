package 과제;

public class BookTest {
    public static void main (String[] args) {
    	
    	BookDTO[] bookDTO = new BookDTO[5]; 
        
        for(int i=0; i<5; i++) {
            bookDTO[i] = new BookDTO();
        }
 
        bookDTO[0].setIsbn(21424);
        bookDTO[1].setIsbn(33455);
        bookDTO[2].setIsbn(55355);
        bookDTO[3].setIsbn(35332);
        bookDTO[4].setIsbn(35355);
        
        bookDTO[0].setTitle("Java Basic");
        bookDTO[1].setTitle("JDBC Pro");
        bookDTO[2].setTitle("Servlet/JSP");
        bookDTO[3].setTitle("Android App");
        bookDTO[4].setTitle("OOAD 분석,설계");
        
        bookDTO[0].setAuthor("김하나");
        bookDTO[1].setAuthor("김철수");
        bookDTO[2].setAuthor("박자바");
        bookDTO[3].setAuthor("홍길동");
        bookDTO[4].setAuthor("소나무");
        
        bookDTO[0].setPublisher("Jaen.kr");
        bookDTO[1].setPublisher("Jaen.kr");
        bookDTO[2].setPublisher("Jaen.kr");
        bookDTO[3].setPublisher("Jaen.kr");
        bookDTO[4].setPublisher("Jaen.kr");
        
        bookDTO[0].setPrice(15000);
        bookDTO[1].setPrice(23000);
        bookDTO[2].setPrice(41000);
        bookDTO[3].setPrice(25000);
        bookDTO[4].setPrice(30000);
        bookDTO[0].setDesc("Java 기본 문법");
        bookDTO[2].setDesc("Model2 기반"); 
        bookDTO[3].setDesc("Lightweight Framework"); 

        System.out.println(bookDTO[0].toString());

        for(int i=0; i<bookDTO.length; i++) {
            if( bookDTO[i].getDesc() == null ) {    
                System.out.println(bookDTO[i].getIsbn() + "\t\t|"+ bookDTO[i].getTitle() + "\t\t|" + bookDTO[i].getAuthor() + "\t\t|"+ bookDTO[i].getPublisher() + "\t\t|"+ bookDTO[i].getPrice() + "\t\t|");            
            } else {
                System.out.println(bookDTO[i].getIsbn() + "\t\t|"+ bookDTO[i].getTitle() + "\t\t|" + bookDTO[i].getAuthor() + "\t\t|"+ bookDTO[i].getPublisher() + "\t\t|"+ bookDTO[i].getPrice() + "\t\t|"+bookDTO[i].getDesc());
            }
        }    
    }
    
}