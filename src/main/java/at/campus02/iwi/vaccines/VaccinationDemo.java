package at.campus02.iwi.vaccines;

import java.util.Arrays;

public class VaccinationDemo {

    public static void main(String[] args) {

        VaccinationAppointment case1 = new VaccinationAppointment();
        VaccinationAppointment case2 = new VaccinationAppointment();


        System.out.println(case1.calculateRiskClass(70, true, false, false, false, false));
        System.out.println(Arrays.toString(case1.calculateMontAndVaccine(65, 9)));

        System.out.println(case2.calculateRiskClass(30, false, true, true, false, false));
        System.out.println(Arrays.toString(case2.calculateMontAndVaccine(30, 5)));
    }
}
