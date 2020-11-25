package exp16;
class Student{
	int Roll;
	String Name;
	double Marks;
	Student(int a,String s, double d){
		Roll =a;
		Name =s;
		Marks =d;
		
	}
	Student(String s, int a,double d){
		Roll =a;
		Name =s;
		Marks =d;
		
	}
	void Display() {
		System.out.println("\n\t" +Roll+"\t"  +Name+"\t" +Marks);
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Student A1 =new Student(1 ,"Sam",93.56);
		Student A2 =new Student("Karan",2, 89.63);
		
		System.out.println("\nRoll Name Marks\n");
		A1.Display();
		A2.Display();
	}

}
