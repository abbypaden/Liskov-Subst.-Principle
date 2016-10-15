package liskovsubstitutionprinciple;

public class SchoolStaff {
    
    private String name;
    
    
    private void makeAnnouncements(){
        System.out.println("made accouncements...");
    }
    private void takeAttendance(){
        System.out.println("took attendance...");
    }
    private void collectPaperwork(){
        System.out.println("collected paperwork...");
    }
    private void conductHallwayDuties(){
        System.out.println("conducted hallway duties...");
    }
    
    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendance();
        collectPaperwork();
        conductHallwayDuties();
    }
    
}
