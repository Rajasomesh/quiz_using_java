import java.util.Scanner;

public class Questionservice {
    Question questions[]=new Question[5];
    public Questionservice()
    {
         questions[0] = new Question(1,
        "Size of int in Java?",
        "2",
        "6",
        "8",
        "4",
        "4");

questions[1] = new Question(2,
        "Which keyword is used to inherit a class?",
        "implement",
        "extends",
        "inherits",
        "super",
        "extends");

questions[2] = new Question(3,
        "Which method is the entry point of Java?",
        "start()",
        "main()",
        "run()",
        "init()",
        "main()");

questions[3] = new Question(4,
        "Which of these is not a primitive type?",
        "int",
        "float",
        "String",
        "char",
        "String");

questions[4] = new Question(5,
        "JVM stands for?",
        "Java Variable Machine",
        "Java Virtual Machine",
        "Joint Virtual Method",
        "Java Verified Machine",
        "Java Virtual Machine");
    }
    public void playquiz()
    {   int score=0;
        for(Question q:questions){
        System.out.println("question no" +q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        Scanner sc=new Scanner (System.in);
        String ans=sc.nextLine();
        if(ans.equals(q.getAnswer()))
        {   score++;
            System.out.println("Correct Answer Your score is "+score);
            

        }
        else
        {
            System.out.println("Wrong Answer Your score is "+score);
        }
    }
    System.out.println("Quiz completed. Your final score is: " + score);
    }
}
