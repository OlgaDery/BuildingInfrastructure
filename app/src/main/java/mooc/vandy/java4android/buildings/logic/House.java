package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
        // TODO Auto-generated constructor stub
        this.mOwner = null;
        this.mPool = false;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner)
    {
        super(length, width, lotLength, lotWidth);
        // TODO Auto-generated constructor stub
        this.mOwner = owner;

    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool)
    {
        super(length, width, lotLength, lotWidth);
        // TODO Auto-generated constructor stub
        this.mOwner = owner;
        this.mPool = pool;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public boolean hasPool() {
        return mPool;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Owner: ");
        if (mOwner!= null){
            builder.append(mOwner);
        } else {
            builder.append("n/a");
        }
        builder.append("; ");
        builder.append("has a big open space");
        if (mPool== true)
        {
            builder.append("; ");
            builder.append("has a swimming pool");

        }
        return builder.toString();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        House other = (House) obj;

        if (mPool != other.mPool)
            return false;
        else {
            if (((Building) obj).calcBuildingArea()!= other.calcBuildingArea()) {
                return false;
            }
        }
        return true;
    }


}
