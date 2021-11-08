package aviary;

public enum AviarySize {
    SMALL(2),
    MEDIUM(5),
    LARGE(8),
    HUGE(10);

    private final int size;

    AviarySize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
