package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {
       
    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;


    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        // TODO Auto-generated constructor stub
        this.mParkingSpaces = 0;
        this.mBusinessName = null;
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName)
    {
        super(length, width, lotLength, lotWidth);
        // TODO Auto-generated constructor stub
        this.mBusinessName = businessName;
        this.mParkingSpaces = 0;
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces)
    {
        super(length, width, lotLength, lotWidth);
        // TODO Auto-generated constructor stub
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
        sTotalOffices++;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (getClass() != obj.getClass())
            return false;
        Office other = (Office) obj;
        if (mParkingSpaces != other.mParkingSpaces)
        {
           // System.out.println("diff parkings");
            return false;
        }
        if (((Building) obj).calcBuildingArea()!= other.calcBuildingArea())
        {
           // System.out.println("diff build area");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Business: ");
        if (mBusinessName!= null) {
            builder.append(mBusinessName);
            builder.append(";");
        } else {
            builder.append("unoccupied ");
        }

        if (mParkingSpaces>0) {
            builder.append("has ");
            builder.append(mParkingSpaces);
            builder.append("parking spaces");
            builder.append(";");
        }
        builder.append("(");
        builder.append("total offices: ");
        builder.append(sTotalOffices);
        builder.append(")");
        return builder.toString();
    }
    
}
