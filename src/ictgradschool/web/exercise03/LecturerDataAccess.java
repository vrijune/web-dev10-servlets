package ictgradschool.web.exercise03;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Class to return an array of Lecturer objects.
 * Typically data would come from a database.
 * */
public class LecturerDataAccess {

    public static Lecturer[] getLecturersArray() {

        String[] noPapers = {};
        String[] introductoryPapers = {"CompSci101", "CompSci111"};
        String[] coreStage1Papers = {"CompSci101", "CompSci105"};
        String[] allStageOnePapers = {"CompSci111", "CompSci101", "CompSci105"};
        String[] stageTwoPapers = {"CompSci210", "CompSci220", "CompSci225", "CompSci230"};
        Lecturer[] lecturers = new Lecturer[6];
        lecturers[0] = new Lecturer("Sad Sack", 86302, introductoryPapers, false);
        lecturers[1] = new Lecturer("Ali Katt", 49123, introductoryPapers, false);
        lecturers[2] = new Lecturer("Earl Lee Riser", 40879, allStageOnePapers, true);
        lecturers[3] = new Lecturer("Candy Kane", 50876, stageTwoPapers, false);
        lecturers[4] = new Lecturer("Tom Katt", 30869, noPapers, false);
        lecturers[5] = new Lecturer("Carrie Oakey", 30987, coreStage1Papers, true);

        return lecturers;
    }

}
