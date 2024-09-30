import java.util.Scanner;

public class NCRandNPR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select 1 to calculate nCr and 2 for nPr : ");
        int val= in.nextInt();
        System.out.print("Enter the total number of objects (n) : ");
        int n = in.nextInt();
        int tempN=n;
        int nFactor= 1;
        System.out.print("Enter the number of selected objects (r) : ");
        int r = in.nextInt();
        int tempR= r;
        int rFactor= 1;
        int nrFactor = 1;
        int tempNR = n-r;
        while(tempNR > 0){
            nrFactor*=tempNR;
            tempNR--;
        }
        while(tempN > 0){
            nFactor*=tempN;
            tempN--;
        }
        while(tempR > 0){
            rFactor*=tempR;
            tempR--;
        }
        switch (val){
            case 1 : {
                long nCr= nFactor / (rFactor * nrFactor);
                System.out.println("The Value of Combination is : "+ nCr);
                break;
            }
            case 2 : {
                long nPr= nFactor / nrFactor;
                System.out.println("The Value of Permutation is : "+ nPr);
                break;
            }
        }
    }
}
