public class ModeratorUI {

    public ModeratorUI() {
        boolean banQuizButton;
        boolean banUserButton;
    }

    public boolean processBan(boolean banButton) {
        return banButton;
    }

    public boolean banQuiz(boolean banQuizButton) {
        return processBan(banQuizButton);
    }

    public boolean banUser(boolean banUserButton) {
        return processBan(banUserButton);
    }

}