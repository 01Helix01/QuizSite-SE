import org.junit.jupiter.api.Test;

class ModeratorUITest {

    private void processBan(boolean banButton) {}

    @org.junit.jupiter.api.Test
    void banQuiz() {
        processBan(true);
        processBan(false);
    }

    @org.junit.jupiter.api.Test
    void banUser() {
        processBan(true);
        processBan(false);
    }

}