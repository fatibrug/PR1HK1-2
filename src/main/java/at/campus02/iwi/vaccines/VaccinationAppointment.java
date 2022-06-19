package at.campus02.iwi.vaccines;

public class VaccinationAppointment {

    public int calculateRiskClass(int age, boolean majorIllness, boolean contactOfPregnantPerson,
                                  boolean workingInHealthSector, boolean workingInEducationSector,
                                  boolean baseRiskFactor){
        int riskClass = 0;
        riskClass = age / 10;

        if(majorIllness){
            riskClass = riskClass + 3;

        }else if(contactOfPregnantPerson){
            riskClass = riskClass + 2;
        }
        else if(workingInHealthSector){
            riskClass = riskClass + 2;
        }
        else if(workingInEducationSector){
            riskClass = riskClass + 1;
        }
        else if(baseRiskFactor){
            riskClass = riskClass + 1;
        }

        return riskClass;
    }
    public String[] calculateMontAndVaccine(int age, int riskClass) {

        String[] montOfVaccinationAndVaccine = new String[2];
        String month = " ";
        String vaccine = " ";

        if (riskClass >= 10) {
            month = "January";
        } else if (riskClass == 9) {
            month = "February";
        } else if (riskClass >= 7) {
            month = "March";
        } else if (riskClass == 6) {
            month = "April";
        } else if (riskClass >= 4) {
            month = "May";
        } else if (riskClass >= 2) {
            month = "June";
        } else {
            month = "July";
        }
        montOfVaccinationAndVaccine[0] = month;

        if (age >= 65 || age <= 18) {
            vaccine = "Pfizer";
        } else if (age >= 50) {
            vaccine = "Moderna";
        } else if (age >= 18) {
            vaccine = "AstraZeneca";
        }
        montOfVaccinationAndVaccine[1] = vaccine;


        return montOfVaccinationAndVaccine;
    }

}
