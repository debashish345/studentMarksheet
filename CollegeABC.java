import java.util.Scanner;

class Marksheet
{
Scanner n = new Scanner(System.in);

int s_no;
String[] s_names= new String[s_no];
int s_marks[]= new int[s_no];  

//setter method

void setMarksheet(){

System.out.println("Enter student name and marks: ");
String[] dup_names= new String[s_no];
int dup_marks[]= new int[s_no];

s_names = dup_names;
s_marks = dup_marks;

for(int i=0;i<s_no;i++){
System.out.printf("enter %d student name:\t",i+1);
dup_names[i] = n.nextLine();

System.out.printf("enter %s marks:\t",s_names[i]);
dup_marks[i] = n.nextInt();
n.nextLine();
}
}

//getter method

void getMarksheet(){
System.out.printf("\n\n*****marksheet*****\n\n");
for(int i = 0;i<s_no;i++){
System.out.printf("%s get %d\n\n",s_names[i],s_marks[i]);
}
}

}


class CollegeABC
{
	public static void main(String args[])
	{
	Scanner n = new Scanner(System.in);
	Marksheet class_nine = new Marksheet();
	System.out.println("Enter number of students: ");
	int num = n.nextInt();
	class_nine.s_no = num;
	
	class_nine.setMarksheet();
	class_nine.getMarksheet();
	}
}
