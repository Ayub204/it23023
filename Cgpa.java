import java.util.Scanner;
public class Cgpa{
public static void main(String [] args)
{
double p;
int credit_Earn=0;
System.out.println("Enter student ID");
Scanner sc = new Scanner(System.in);
//int ID = sc.nextInt();
String ID = sc.nextLine();
System.out.println("Enter No. of Courses");
int course = sc.nextInt();

//Start c1
System.out.println("Enter C1 information:");

System.out.println("Enter C1 Credit");
int credit1 = sc.nextInt();

System.out.println("Enter CT marks for C1");
int ct = sc.nextInt();
System.out.println("Enter AT marks for C1");
int at = sc.nextInt();
System.out.println("Enter FE marks for C1");
int fe = sc.nextInt();
int sum=(ct+at+fe);

if(sum>=80)
p=4.00;
else if(sum>=75)
p=3.75;
else if(sum>=70)
p=3.50;
else if(sum>=65)
p=3.25;
else if(sum>=60)
p=3.00;
else if(sum>=55)
p=2.75;
else if(sum>=50)
p=2.50;
else if(sum>=45)
p=2.25;
else if(sum>=40)
p=2.00;
else p=0.00;

double c1cgpa=p*credit1;
if(p!=0)
credit_Earn=credit_Earn+credit1;
//System.out.println("Your cgpa is : "+p);

//start c2

System.out.println("Enter C2 information:");

System.out.println("Enter C2 Credit");
int  credit2 = sc.nextInt();

System.out.println("Enter CT marks for C2");
ct = sc.nextInt();
System.out.println("Enter AT marks for C2");
at = sc.nextInt();
System.out.println("Enter FE marks for C2");
fe = sc.nextInt();
 sum=(ct+at+fe);

if(sum>=80)
p=4.00;
else if(sum>=75)
p=3.75;
else if(sum>=70)
p=3.50;
else if(sum>=65)
p=3.25;
else if(sum>=60)
p=3.00;
else if(sum>=55)
p=2.75;
else if(sum>=50)
p=2.50;
else if(sum>=45)
p=2.25;
else if(sum>=40)
p=2.00;
else p=0.00;

double c2cgpa=p*credit2 ;
if(p!=0)
credit_Earn=credit_Earn+credit2;
//System.out.println("Your cgpa is : "+p);

//start c3

System.out.println("Enter C3 information:");

System.out.println("Enter C3 Credit");
int  credit3 = sc.nextInt();

System.out.println("Enter CT marks for C3");
ct = sc.nextInt();
System.out.println("Enter AT marks for C3");
at = sc.nextInt();
System.out.println("Enter FE marks for C3");
fe = sc.nextInt();
 sum=(ct+at+fe);

if(sum>=80)
p=4.00;
else if(sum>=75)
p=3.75;
else if(sum>=70)
p=3.50;
else if(sum>=65)
p=3.25;
else if(sum>=60)
p=3.00;
else if(sum>=55)
p=2.75;
else if(sum>=50)
p=2.50;
else if(sum>=45)
p=2.25;
else if(sum>=40)
p=2.00;
else p=0.00;

double c3cgpa=p*credit3 ;
if(p!=0)
credit_Earn=credit_Earn+credit3;
//System.out.println("Your cgpa is : "+p);

double cgpa=(c3cgpa+c2cgpa+c1cgpa)/(credit1+credit2+credit3);
int credit_taken=credit1+credit2+credit3;
System.out.println("Student ID:"+ ID);
 
System.out.println("Your credit Taken : "+credit_taken);
System.out.println("Your credit Earned : "+credit_Earn);

System.out.println("Your cgpa is : "+cgpa);

if(cgpa>=4)
System.out.println("Your Grade is :A+");
else if(cgpa>=3.75)
System.out.println("Your Grade is :A");
else if(cgpa>=3.50)
System.out.println("Your Grade is :A-");
else if(cgpa>=3.25)
System.out.println("Your Grade is :B+");
else if(cgpa>=3.00)
System.out.println("Your Grade is :B");
else if(cgpa>=2.75)
System.out.println("Your Grade is :B-");
else if(cgpa>=2.50)
System.out.println("Your Grade is :C+");
else if(cgpa>=2.25)
System.out.println("Your Grade is :C");
else if(cgpa>=2.00)
System.out.println("Your Grade is :C-");
else System.out.println("Your Grade is :F");

//System.out.println(res==(a+b));
}}