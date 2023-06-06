public class RewardValue

        /*
         * This class must satisfy the following requirements:
         * RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
         * RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
         * RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
         * RewardValue must convert from miles to cash at a rate of 0.0035.
         *
         * @author Satya Padala
         * */
{
    private final double cashValue;
    private final double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue=cashValue / 0.0035;
    }

    public RewardValue(double cashValue, double milesValue) {
        this.milesValue = milesValue;
        this.cashValue = cashValue * 0.0035;
    }

    /*
     * Retrieves the cash value of the RewardValue.
     *
     * @return cashValue
     */
    public double getCashValue() {
        return cashValue;
    }

    /*
     * Retrieves the miles value of the RewardValue.
     *
     * @return milesValue
     */
    public double getMilesValue() {
        return milesValue;
    }
}
