package Models;

import java.time.LocalDate;
public class Aircraft {
    int Id;
    int SittingCapacity;
    String Model;
    LocalDate DateOfManufacturing; // to calc age of aircraft
    int No_PastProblems;

    Aircraft(int id, int SittingCapacity,String Model,LocalDate DateOfManufacturing, int No_PastProblems){
        this.Id=id;
        this.SittingCapacity = SittingCapacity;
        this.Model= Model;
        this.DateOfManufacturing= DateOfManufacturing;
        this.No_PastProblems=No_PastProblems;
    }
}
