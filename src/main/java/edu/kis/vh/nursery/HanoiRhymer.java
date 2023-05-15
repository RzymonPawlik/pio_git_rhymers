package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int INT2 = 0;
    private int totalRejected = INT2;

    /**
     *
     * @return totalRejected
     */
    protected int reportRejected() {
        return totalRejected;
    }
    /**
     * funkcja liczy ile razzy został spełniony warunek
     * @param in liczba podlegająca zwiększeniu
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
