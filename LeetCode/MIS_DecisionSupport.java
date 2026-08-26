/**
 * Aug 26 Streak: MIS Logic Simulation
 * Concept: Decision Support System (DSS)
 * Relates to: Deloitte ERP Role & MIS Exam
 */
public class MIS_DecisionSupport {
    public static String getBusinessRecommendation(int inventory, int demand) {
        if (inventory < demand) {
            return "Action: INCREASE PRODUCTION. Reason: High Demand Gap.";
        } else if (inventory > demand * 2) {
            return "Action: DISCOUNT SALES. Reason: Overstock Risk.";
        } else {
            return "Action: MAINTAIN LEVEL. Reason: Optimal Supply Chain.";
        }
    }

    public static void main(String[] args) {
        System.out.println(getBusinessRecommendation(50, 100));
        System.out.println(getBusinessRecommendation(200, 50));
    }
}