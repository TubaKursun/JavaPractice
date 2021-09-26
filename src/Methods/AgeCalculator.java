package Methods;

public class AgeCalculator {

    public void ageCalculator(int birthYear){

        int age = 2021-birthYear;
        System.out.println("your age is "+age);

    }

    public static void main(String[] args) {

        AgeCalculator jerry = new AgeCalculator();
        jerry.ageCalculator(2013);

    }

}
