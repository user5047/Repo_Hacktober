/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 0;
        int j = n;
        int mid = 0;
        while(i <= j){
            mid = (i + j) / 2;
            if(isBadVersion(mid)){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return i;
    }
}
