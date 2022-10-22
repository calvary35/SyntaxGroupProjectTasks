package GroupProjects.GroupProject3;

/*
We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
 */
 class main{
    public static void main(String[] args) {
        System.out.println(new A(85, 91, 94).getPercentage());
        System.out.println(new B(81, 93, 87, 94).getPercentage());

    }
}

 public abstract class Marks {
    abstract int getPercentage();
}

class A extends Marks {
   int history;
    int science;
    int math;

    A(int science, int math, int history) {
        this.science = science;
        this.math = math;
        this.history = history;
    }
    int getPercentage() {
       int average= (math+science+history)/3;

               return average;
    }

}
class B extends Marks{
  int music;
    int history;
    int science;
    int math;
    B(int science, int math, int history, int music){
this.history=history;
this.math=math;
this.science=science;
this.music=music;
    }
    int getPercentage() {
        int average= (math+science+history)/3;

        return average;
    }

}