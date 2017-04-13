package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {
       
    // TODO - Put your code here.
    private final boolean mSecondFloor;


    public Cottage(int dimension, int lotLength, int lotWidth)
    {
        super(dimension, dimension, lotLength, lotWidth);
        // TODO Auto-generated constructor stub
        mSecondFloor = false;
    }

    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean
            secondFloor)
    {
        super(dimension, dimension, lotLength, lotWidth, owner);
        // TODO Auto-generated constructor stub
        this.mSecondFloor = secondFloor;

    }

    public boolean hasSecondFloor() {
        return mSecondFloor;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Owner: ");
        if (this.getOwner()!= null){
            builder.append(this.getOwner());
        } else {
            builder.append("n/a");
        }
        builder.append(";");
        builder.append("is a cottage;");
        if (mSecondFloor== true) {
            builder.append("has second floor");
            builder.append(";");
        }

        return builder.toString();
    }



}

