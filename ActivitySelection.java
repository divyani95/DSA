//

import java.util.*;

class Activity implements Comparable<Activity> {
    int startTime;
    int finishTime;

    public Activity(int startTime, int finishTime) {
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

   
    public int compareTo(Activity other) {
        return this.finishTime - other.finishTime;
    }
}

public class ActivitySelection {
    public static List<Activity> selectActivities(Activity[] activities) {
        List<Activity> selectedActivities = new ArrayList<>();
        if (activities.length == 0)
            return selectedActivities;

        // Sort activities based on their finish times
        Arrays.sort(activities);

        // Select the first activity as it has the earliest finish time
        selectedActivities.add(activities[0]);
        
        // Consider rest of the activities
        for (int i = 1; i < activities.length; i++) {
            // If the start time of the current activity is greater than or equal to
            // the finish time of the previously selected activity, then select this activity
            if (activities[i].startTime >= selectedActivities.get(selectedActivities.size() - 1).finishTime) {
                selectedActivities.add(activities[i]);
            }
        }
        
        return selectedActivities;
    }

    public static void main(String[] args) {
        Activity[] activities = {
            new Activity(1, 4),
            new Activity(3, 5),
            new Activity(0, 6),
            new Activity(5, 7),
            new Activity(3, 8),
            new Activity(5, 9),
            new Activity(6, 10),
            new Activity(8, 11),
            new Activity(8, 12),
            new Activity(2, 13),
            new Activity(12, 14)
        };

        List<Activity> selectedActivities = selectActivities(activities);

        System.out.println("Selected Activities:");
        for (Activity activity : selectedActivities) {
            System.out.println("[" + activity.startTime + ", " + activity.finishTime + "]");
        }
    }
}




