package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    // TODO - Put your code here.
    private int mLength;
    private int mWidth;
    private int ntmLotLength;
    private int mLotWidth;

    public Building (int length, int width, int lotLength, int lotWidth)
    {
        this.mLength = length;
        this.mWidth = width;
        this.ntmLotLength = lotLength;
        this.mLotWidth = lotWidth;
    }



    public int getLength() {
        return mLength;
    }



    public void setLength(int mLength) {
        this.mLength = mLength;
    }



    public int getWidth() {
        return mWidth;
    }



    public void setWidth(int mWidth) {
        this.mWidth = mWidth;
    }



    public int getLotLength() {
        return ntmLotLength;
    }



    public void setLotLength(int ntmLotLength) {
        this.ntmLotLength = ntmLotLength;
    }



    public int getLotWidth() {
        return mLotWidth;
    }



    public void setLotWidth(int mLotWidth) {
        this.mLotWidth = mLotWidth;
    }



    public int calcBuildingArea()
    {
        return mLength*mWidth;
    }

    public int calcLotArea() {
        return ntmLotLength*mLotWidth;
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Building [mLength=");
        builder.append(mLength);
        builder.append(", mWidth=");
        builder.append(mWidth);
        builder.append(", ntmLotLength=");
        builder.append(ntmLotLength);
        builder.append(", mLotWidth=");
        builder.append(mLotWidth);
        builder.append("]");
        return builder.toString();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Building other = (Building) obj;
        if (mLength != other.mLength)
            return false;
        if (mLotWidth != other.mLotWidth)
            return false;
        if (mWidth != other.mWidth)
            return false;
        if (ntmLotLength != other.ntmLotLength)
            return false;
        return true;
    }
    
}
