package Methods;

public class BodyIndex {

    //let's do for kg and meter
    public double bmi(int kg, double meter) {
        //we need to divier kg to square of meter

        double squaremeter = meter * meter;
        return kg / squaremeter;
    }
    // we are asked to calculate bmi for US

    public double bmi(double pound, double feet, int inch) {


        double kilogram = pound * 0.45;
        double meter = feet * 0.3 + inch * 0.025;
        double squareMeter = meter * meter;

        return kilogram / squareMeter;

    }

    public static void main(String[] args) {
        BodyIndex bodyIndex = new BodyIndex();
        System.out.println(bodyIndex.bmi(79, 1.8));
        System.out.println(bodyIndex.bmi(174, 5, 10));
    }
}
//What is overloading?
// Using same method name with different parameter.
//if method name is same and parameters are different it is an overLoading
// access modifier static or non static or return type is not important for overloading

//advantages of overloading
// It increases the readability of code
// It is more flexible, so we can call same method with different parameters
// code looks cleaner
// we can use the same method which saves memory for us.
// it increases the re-usability of the code
