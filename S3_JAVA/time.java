package S3_JAVA;

class Time implements Comparison {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public boolean isGreater(Time other) {
        if (this.hours > other.hours || (this.hours == other.hours && this.minutes > other.minutes)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isLess(Time other) {
        if (this.hours < other.hours || (this.hours == other.hours && this.minutes < other.minutes)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isEqual(Time other) {
        return this.hours == other.hours && this.minutes == other.minutes;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }
}
