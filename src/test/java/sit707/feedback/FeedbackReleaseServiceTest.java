package sit707.feedback;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FeedbackReleaseServiceTest {

    FeedbackReleaseService service = new FeedbackReleaseService();

    @Test
    public void shouldReturnFeedbackAvailableForReleasedTask() {

        String result = service.checkFeedbackStatus("s224659226", "SIT707-8.1P");

        assertEquals("Feedback Available", result);
    }

    @Test
    public void shouldReturnFeedbackPendingForPendingTask() {

        String result = service.checkFeedbackStatus("s224659226", "SIT707-9.1P");

        assertEquals("Feedback Pending", result);
    }

    @Test
    public void shouldReturnTaskNotFoundForUnknownTask() {

        String result = service.checkFeedbackStatus("s224659226", "SIT999");

        assertEquals("Task Not Found", result);
    }

    @Test
    public void shouldReturnStudentIdRequiredWhenStudentIdIsEmpty() {

        String result = service.checkFeedbackStatus("", "SIT707-8.1P");

        assertEquals("Student ID Required", result);
    }

    @Test
    public void shouldReturnTaskIdRequiredWhenTaskIdIsEmpty() {

        String result = service.checkFeedbackStatus("s224659226", "");

        assertEquals("Task ID Required", result);
    }

    @Test
    public void shouldReturnInvalidStudentIdFormat() {

        String result = service.checkFeedbackStatus("12345", "SIT707-8.1P");

        assertEquals("Invalid Student ID Format", result);
    }

    @Test
    public void shouldReturnStudentIdRequiredWhenStudentIdIsNull() {

        String result = service.checkFeedbackStatus(null, "SIT707-8.1P");

        assertEquals("Student ID Required", result);
    }

    @Test
    public void shouldReturnTaskIdRequiredWhenTaskIdIsNull() {

        String result = service.checkFeedbackStatus("s224659226", null);

        assertEquals("Task ID Required", result);
    }
}