package com.example.demo.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Report {

    @Id
    @GeneratedValue
    private Long id;
    private Instant timestamp;

    @ManyToOne
    private Employee employee;

    private int rightShoulderDiscomfort;
    private int leftShoulderDiscomfort;
    private int upperBackDiscomfort;
    private int lowerBackDiscomfort;
    private int rightHipDiscomfort;
    private int leftHipDiscomfort;
    private int rightThighDiscomfort;
    private int leftThighDiscomfort;
    private int rightKneeDiscomfort;
    private int leftKneeDiscomfort;

    private int durationOfUse;
    private int likelyToRecommend;
    private int whatIfYouCouldntUse;
    private int effortDuringADayWithSuit;
    private int effortWhileWearing;
    private int effortDuringHeaviestLift;

    private int comfortWhileWorking;
    private int comfortWhileWalking;
    private int comfortWhileSteppingUpDown;
    private int comfortWhileDriving;
    private int comfortDuringBreaks;
    private int reducesDiscomfort;
    private int feelsHot;
    private int lightEnoughForFullShift;
    private int fullRangeOfMotion;
    private int wouldLikeToUseFrequently;
    private int tooComplex;
    private int easyToUse;
    private int wouldNeedTechnicalPerson;
    private int suitIsWellIntegrated;
    private int tooMuchInconsistency;
    private int mostWouldFindEasy;
    private int tooCumbersome;
    private int iFeltConfident;
    private int neededToLearnALot;
    private int hasBeenUseful;
    private int idLikeToContinueWearing;
    private int feelSafe;
    private int canMoveNaturally;
    private int useToolsNormally;
    private int wouldUseDaily;
    private int easyToPutOn;
    private int easyToTakeOff;
    private int reducesWorkFatigue;
    private int improvesWorkPerformance;
    private int preventLowBackInjury;
    private int reliableAndDurable;
    private int allOrSomeTasks;

    private String whichTasks;
    private int daysToGetUsedToIt;
    private String longTermEffects;
    private String whatDoYouLikeAboutIt;
    private String whatDoYouHateAboutIt;
    private String additionalNotes;


    public Report() {
    }

    public Report(int rs, int ls, int ub, int lb, int rh, int lh, int rt, int lt, int rk, int lk) {
        rightShoulderDiscomfort = rs;
        leftShoulderDiscomfort = ls;
        upperBackDiscomfort = ub;
        lowerBackDiscomfort = lb;
        rightHipDiscomfort = rh;
        leftHipDiscomfort = lh;
        leftThighDiscomfort = lt;
        rightThighDiscomfort = rt;
        leftKneeDiscomfort = lk;
        rightKneeDiscomfort = rk;
        timestamp = Instant.now();
    }

    public Report(int rs, int ls, int ub, int lb, int rh, int lh, int rt, int lt, int rk, int lk,
                  int dou, int ltr, int wicu, int edd, int ew, int edhl,
                  int cwwear, int cwwalk, int cws, int cwd, int cdb, int rd, int fh, int lffs,
                  int frange, int wlf, int tc, int etu, int wntp, int swi, int tmi, int mwfe,
                  int tcumb, int ifc, int ntla, int hbu, int iltcw, int ifs, int cmn, int utn,
                  int wud, int etpo, int etto, int rwf, int iwp, int plbi, int rad, int aost,
                  String wt, int dtgu,
                  String longTermEffects, String whatDoYouLikeAboutIt, String whatDoYouHateAboutIt,
                          String additionalNotes) {

        rightShoulderDiscomfort = rs;
        leftShoulderDiscomfort = ls;
        upperBackDiscomfort = ub;
        lowerBackDiscomfort = lb;
        rightHipDiscomfort = rh;
        leftHipDiscomfort = lh;
        leftThighDiscomfort = lt;
        rightThighDiscomfort = rt;
        leftKneeDiscomfort = lk;
        rightKneeDiscomfort = rk;

        durationOfUse = dou;
        likelyToRecommend = ltr;
        whatIfYouCouldntUse = wicu;
        effortDuringADayWithSuit = edd;
        effortWhileWearing = ew;
        effortDuringHeaviestLift = edhl;
        comfortWhileWorking = cwwear;
        comfortWhileWalking = cwwalk;
        comfortWhileSteppingUpDown = cws;
        comfortWhileDriving = cwd;
        comfortDuringBreaks = cdb;
        reducesDiscomfort = rd;
        feelsHot = fh;
        lightEnoughForFullShift = lffs;
        fullRangeOfMotion = frange;
        wouldLikeToUseFrequently = wlf;
        tooComplex =  tc;
        easyToUse = etu;
        wouldNeedTechnicalPerson = wntp;
        suitIsWellIntegrated = swi;
        tooMuchInconsistency = tmi;
        mostWouldFindEasy = mwfe;
        tooCumbersome = tcumb;
        iFeltConfident = ifc;
        neededToLearnALot = ntla;
        hasBeenUseful = hbu;
        idLikeToContinueWearing = iltcw;
        feelSafe = ifs;
        canMoveNaturally = cmn;
        useToolsNormally = utn;
        wouldUseDaily = wud;
        easyToPutOn = etpo;
        easyToTakeOff = etto;
        reducesWorkFatigue = rwf;
        improvesWorkPerformance = iwp;
        preventLowBackInjury = plbi;
        reliableAndDurable = rad;
        allOrSomeTasks = aost;

        whichTasks = wt;
        daysToGetUsedToIt = dtgu;
        this.longTermEffects = longTermEffects;
        this.whatDoYouLikeAboutIt = whatDoYouLikeAboutIt;
        this.whatDoYouHateAboutIt = whatDoYouHateAboutIt;
        this.additionalNotes = additionalNotes;
        timestamp = Instant.now();



    }






    public Long getId() {
        return id;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getRightShoulderDiscomfort() {
        return rightShoulderDiscomfort;
    }

    public int getLeftShoulderDiscomfort() {
        return leftShoulderDiscomfort;
    }

    public int getUpperBackDiscomfort() {
        return upperBackDiscomfort;
    }

    public int getLowerBackDiscomfort() {
        return lowerBackDiscomfort;
    }

    public int getRightHipDiscomfort() {
        return rightHipDiscomfort;
    }

    public int getLeftHipDiscomfort() {
        return leftHipDiscomfort;
    }

    public int getRightThighDiscomfort() {
        return rightThighDiscomfort;
    }

    public int getLeftThighDiscomfort() {
        return leftThighDiscomfort;
    }

    public int getRightKneeDiscomfort() {
        return rightKneeDiscomfort;
    }

    public int getLeftKneeDiscomfort() {
        return leftKneeDiscomfort;
    }

    public int getDurationOfUse() {
        return durationOfUse;
    }

    public int getLikelyToRecommend() {
        return likelyToRecommend;
    }

    public int getWhatIfYouCouldntUse() {
        return whatIfYouCouldntUse;
    }

    public int getEffortDuringADayWithSuit() {
        return effortDuringADayWithSuit;
    }

    public int getEffortWhileWearing() {
        return effortWhileWearing;
    }

    public int getEffortDuringHeaviestLift() {
        return effortDuringHeaviestLift;
    }

    public int getComfortWhileWorking() {
        return comfortWhileWorking;
    }

    public int getComfortWhileWalking() {
        return comfortWhileWalking;
    }

    public int getComfortWhileSteppingUpDown() {
        return comfortWhileSteppingUpDown;
    }

    public int getComfortWhileDriving() {
        return comfortWhileDriving;
    }

    public int getComfortDuringBreaks() {
        return comfortDuringBreaks;
    }

    public int getReducesDiscomfort() {
        return reducesDiscomfort;
    }

    public int getFeelsHot() {
        return feelsHot;
    }

    public int getLightEnoughForFullShift() {
        return lightEnoughForFullShift;
    }

    public int getFullRangeOfMotion() {
        return fullRangeOfMotion;
    }

    public int getWouldLikeToUseFrequently() {
        return wouldLikeToUseFrequently;
    }

    public int getTooComplex() {
        return tooComplex;
    }

    public int getEasyToUse() {
        return easyToUse;
    }

    public int getWouldNeedTechnicalPerson() {
        return wouldNeedTechnicalPerson;
    }

    public int getSuitIsWellIntegrated() {
        return suitIsWellIntegrated;
    }

    public int getTooMuchInconsistency() {
        return tooMuchInconsistency;
    }

    public int getMostWouldFindEasy() {
        return mostWouldFindEasy;
    }

    public int getTooCumbersome() {
        return tooCumbersome;
    }

    public int getiFeltConfident() {
        return iFeltConfident;
    }

    public int getNeededToLearnALot() {
        return neededToLearnALot;
    }

    public int getHasBeenUseful() {
        return hasBeenUseful;
    }

    public int getIdLikeToContinueWearing() {
        return idLikeToContinueWearing;
    }

    public int getFeelSafe() {
        return feelSafe;
    }

    public int getCanMoveNaturally() {
        return canMoveNaturally;
    }

    public int getUseToolsNormally() {
        return useToolsNormally;
    }

    public int getWouldUseDaily() {
        return wouldUseDaily;
    }

    public int getEasyToPutOn() {
        return easyToPutOn;
    }

    public int getEasyToTakeOff() {
        return easyToTakeOff;
    }

    public int getReducesWorkFatigue() {
        return reducesWorkFatigue;
    }

    public int getImprovesWorkPerformance() {
        return improvesWorkPerformance;
    }

    public int getPreventLowBackInjury() {
        return preventLowBackInjury;
    }

    public int getReliableAndDurable() {
        return reliableAndDurable;
    }

    public int getAllOrSomeTasks() {
        return allOrSomeTasks;
    }

    public String getWhichTasks() {
        return whichTasks;
    }

    public int getDaysToGetUsedToIt() {
        return daysToGetUsedToIt;
    }

    public String getLongTermEffects() {
        return longTermEffects;
    }

    public String getWhatDoYouLikeAboutIt() {
        return whatDoYouLikeAboutIt;
    }

    public String getWhatDoYouHateAboutIt() {
        return whatDoYouHateAboutIt;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }
}



