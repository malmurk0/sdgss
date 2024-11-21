abstract class Marks{


    abstract void getPerceantage();



}
class A extends Marks {

    private int points1;
    private int points2;
    private int points3;

    public A(int points1, int points2, int points3) {

        this.points1 = points1;
        this.points2 = points2;
        this.points3 = points3;
    }

    public void getPerceantage() {
        int pointsA = (points1 + points2 + points3) / 3;

    }
}


 class B extends Marks{
    private int points1;
    private int points2;
    private int points3;
    private int points4;

    public B(int points1, int points2, int points3, int points4) {

        this.points1 = points1;
        this.points2 = points2;
        this.points3 = points3;
        this.points4 = points4;
    }
        void getPerceantage(){

            int pointsB= (points1+points2+points3+points4) /4;
            System.out.println(pointsB);




        }


}







public class Main {
    public static void main(String[] args) {

        A a= new A(10 ,23,45);
        B b = new B(56,87,99,100);
        b.getPerceantage();
        a.getPerceantage();

        }
    }

