public class ParkingSystem
{

    private int big = 0, mid = 0, small = 0;


    public ParkingSystem(int big, int medium, int small)
    {
        this.big = big;
        this.mid = medium;
        this.small = small;
    }

    public bool AddCar(int carType)
    {
        if (carType == 1 && big > 0)
        {
            big--;
            return true;
        }
        else if (carType == 2 && mid > 0)
        {
            mid--;
            return true;
        }
        else if (carType == 3 && small > 0)
        {
            small--;
            return true;
        }
        return false;
    }
}