package io.github.ericdriggs.selectiondispenser.dispenser.turnstyle;

/**
 * Created by edriggs on 10/12/15.
 */
public class FireTurnstyleEventRunnable implements Runnable{
    private boolean isSuccess = false;
    private final TurnstileLane turnstyleLane;
    private final TurnstileController turnstyleController;

    public FireTurnstyleEventRunnable(TurnstileLane turnstyleLane, TurnstileController turnstyleController) {
        this.turnstyleLane = turnstyleLane;
        this.turnstyleController = turnstyleController;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void run() {
        turnstyleController.fireLaneEvent(turnstyleLane);
        isSuccess = true;
    }
}
