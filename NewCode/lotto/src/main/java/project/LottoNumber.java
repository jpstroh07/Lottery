package project;

public class LottoNumber {

    private int value;
    private boolean isDrawn;
    private boolean isSuperNumber;

    public LottoNumber(int pValue, boolean pSuper) {
        this.value = pValue;
        this.isSuperNumber = pSuper;
        isDrawn = false;
    }

    public int getValue() {
        return value;
    }

    public boolean isDrawn() {
        return isDrawn;
    }

    public void setDrawn() {
        this.isDrawn = true;
    }

    public boolean isSuperNumber() {
        return isSuperNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LottoNumber other = (LottoNumber) obj;
        if (value != other.value)
            return false;
        if (isSuperNumber != other.isSuperNumber)
            return false;
        return true;
    }
}