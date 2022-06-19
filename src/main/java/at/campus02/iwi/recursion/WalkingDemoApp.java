package at.campus02.iwi.recursion;

public class WalkingDemoApp {

    public static void main(String[] args) {

        walk(6, 2);
    }

    public static void walk(int countSteps, int currentStep){

        if(countSteps >= currentStep){
            System.out.println("Steps forward: " + currentStep);
        walk(countSteps, currentStep+1);}
        if(currentStep < countSteps){
            System.out.println("Step backward: " + currentStep);
        }
    }

}
