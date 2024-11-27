import java.util.Scanner;
public class Quiz{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Hello Ayoive!! Welcome to your game!!");

int score=0;


System.out.println("A. What is the capital city of Bangladesh?");
System.out.println("1. Dhaka");
System.out.println("2. Chattagram");
System.out.println("3. Rajshahi");
System.out.println(" Enter your answer:");
int res = sc.nextInt();
if (res==1)
 {
 System.out.println("Right!!");
 score+=5;
 }
else
 {
System.out.println(" Wrong Answer!!");
System.out.println("Correct answer is: 1. Dhaka");
score-=1;
 }


System.out.println("B. What is the full meaning of ICT?");
System.out.println("1.Information Communication Technology ");
System.out.println("2.Information and Communicate Technology  ");
System.out.println("3. Information and Communication Technology ");
System.out.println(" Enter your answer");
res = sc.nextInt();
if (res==3)
 {
System.out.println("Right!!");
score+=5;
 }
else 
 {
System.out.println(" Wrong Answer!!");
System.out.println("Correct answer is: 3. Information and Communication Technology ");
score-=1;
 }

System.out.println("C. What is the square root of 64?");
System.out.println("1. 7");
System.out.println("2. 8");
System.out.println("3. 9 ");
System.out.println(" Enter your answer");
res = sc.nextInt();
if (res==2)
{
System.out.println("Right!!");
score+=5;
}
else {
System.out.println(" Wrong Answer!!");
System.out.println("Correct answer is 2. 8 ");
score-=1;
}

System.out.println("D. Which animal is known as the king of jungle?");
System.out.println("1. Tiger");
System.out.println("2. Loin");
System.out.println("3. Elephant ");
System.out.println(" Enter your answer");
res = sc.nextInt();
if (res==2)
{
System.out.println("Right!!");
score+=5;
}
else {
System.out.println(" Wrong Answer!!");
System.out.println("Correct answer is: 2. Lion ");
score-=1;
}

System.out.println("E. Which plane is knows as the Red planet?");
System.out.println("1. Venus");
System.out.println("2. Mars");
System.out.println("3. Jupiter ");
System.out.println(" Enter your answer");
res = sc.nextInt();
if (res==2)
{
System.out.println("Right!!");
score+=5;
}
else {
System.out.println(" Wrong Answer!!");
System.out.println("Correct answer is: 2. Mars ");
score-=1;
}

System.out.println("Your final score is : "+score);
}}