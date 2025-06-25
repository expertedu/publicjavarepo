import java.util.Scanner;
class Personsalary{
public static void main(String...args){
 Scanner sc = new Scanner(System.in);
System.out.println("enter age + enter salary");

int age = sc.nextInt();
int salary = sc.nextInt();
 if(age < 30 && salary > 100000){
System.out.println("u are eligible for marriage");}
else
System.out.println("not eligible");
sc.close();
}
}


