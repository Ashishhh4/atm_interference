import java.util.Scanner;
class marks{
    public void student(){
        Scanner sc=new Scanner(System.in);
        int subject_1,subject_2,subject_3,subject_4;
        do {
            System.out.print("marks in  maths:");
            subject_1 = sc.nextInt();
        }while(subject_1<=0 || subject_1>=100);
        do {
            System.out.print("marks in science:");
            subject_2 = sc.nextInt();
        }while(subject_2<=0 || subject_2>=100);
        do {
            System.out.print("marks in social_science:");
            subject_3 = sc.nextInt();
    }while(subject_3<=0 || subject_3>=100);
        do {
            System.out.print("marks in computer_science:");
            subject_4 = sc.nextInt();
        }while(subject_4<=0 || subject_4>=100);
        int total_marks=(subject_1+subject_2+subject_3+subject_4);
        System.out.println("the total marks are:"+total_marks);
        total_marks=(subject_1+subject_2+subject_3+subject_4)/4;
        System.out.println("the average marks are:"+total_marks);
     if(total_marks>=90){
         System.out.println(" the corresponding grade is :A+");
     }
     else if(total_marks>=80){
         System.out.println("the corresponding grade is:A");
     }
        else if(total_marks>=70){
            System.out.println("the corresponding grade is:B+");
        }
        else if(total_marks>=60){
            System.out.println("the corresponding grade is:B");
        }
     else if(total_marks>=50){
         System.out.println("the corresponding grade is:c+");
     }
     else if(total_marks>=40){
         System.out.println("the corresponding grade is:c");
     }
     else if(total_marks<=33){
         System.out.println("the corresponding grade is:f");
     }
    }
}
class student_grade_calculator{
    public static void main(String[] args) {
marks m=new marks();
m.student();
    }
}