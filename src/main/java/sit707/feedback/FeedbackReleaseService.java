package sit707.feedback;

public class FeedbackReleaseService {

    public String checkFeedbackStatus(String studentId, String taskId) {

        if (studentId == null || studentId.trim().isEmpty()) {
            return "Student ID Required";
        }

        if (taskId == null || taskId.trim().isEmpty()) {
            return "Task ID Required";
        }

        if (!studentId.matches("s\\d{9}")) {
            return "Invalid Student ID Format";
        }

        if (taskId.equals("SIT707-8.1P")) {
            return "Feedback Available";
        }

        if (taskId.equals("SIT707-9.1P")) {
            return "Feedback Pending";
        }

        return "Task Not Found";
    }
}