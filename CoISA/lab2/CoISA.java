package lab2;

public class CoISA {
    public static void main(String[] args) {
        testRest();
        System.out.println("-----");
        testOnlineTime();
        System.out.println("-----");
        testCourse();
        System.out.println("-----");
        testSummaries();
    }
    public static void testRest() {
        Rest rest = new Rest();
        System.out.println(rest.getStatus());
        rest.setRestHours(30);
        rest.setWeeks(1);
        System.out.println(rest.getStatus());
        rest.setRestHours(26);
        rest.setWeeks(2);
        System.out.println(rest.getStatus());
        rest.setRestHours(26);
        rest.setWeeks(1);
        System.out.println(rest.getStatus());
    }
    private static void testOnlineTime() {
        OnlineTime lp2 = new OnlineTime("LP2", 30);
        lp2.addOnlineTime(10);
        System.out.println(lp2.reachedGoal());
        lp2.addOnlineTime(10);
        lp2.addOnlineTime(10);
        System.out.println(lp2.reachedGoal());
        lp2.addOnlineTime(2);
        System.out.println(lp2.reachedGoal());
        System.out.println(lp2.toString());
        OnlineTime p2 = new OnlineTime("P2");
        System.out.println(p2.toString());
    }
    private static void testCourse() {
        Course prog2 = new Course("PROGRAMMING 2");
        prog2.addHours(4);
        prog2.addGrade(1, 5.0);
        prog2.addGrade(2, 6.0);
        prog2.addGrade(3, 7.0);
        System.out.println(prog2.isApproved());
        prog2.addGrade(4, 10.0);
        System.out.println(prog2.isApproved());
        System.out.println(prog2.toString());
    }
    private static void testSummaries() {
        SummaryRegistry mySummaries = new SummaryRegistry(100);

        mySummaries.addSummary("Classes", "Classes define a type and the code base for creating objects.");
        mySummaries.addSummary("Type", "Identifies the semantics (operations and meanings) of a data set.");

        String[] summaries = mySummaries.getSummaries();

        for (int i = 0; i < mySummaries.countSummaries(); i++) {
            System.out.println(summaries[i]);
        }

        System.out.println();
        System.out.println("Summaries: ");
        System.out.println(mySummaries.printSummaries());
        System.out.println(mySummaries.hasSummary("Classes"));
        System.out.println(mySummaries.hasSummary("Objects"));
    }
}
