package api;

public class Member {
	   private String name;
	   private int age;
	   public Member(String name, int age) {
	      this.name = name;
	      this.age = age;
	   }
	   public boolean equals(Object obj) {
		   if(obj instanceof Member) {
			   Member member = (Member)obj;
			   return member.name.equals(name) && (member.age == age);
		   }
		   return false;
			   
	   }
	   public int hashCode() {
		   return name.hashCode() + age;
	   }
}