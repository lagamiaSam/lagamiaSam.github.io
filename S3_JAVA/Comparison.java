package S3_JAVA;

public interface Comparison {
    boolean isGreater(Time other);
    boolean isLess(Time other);
    boolean isEqual(Time other);
}
