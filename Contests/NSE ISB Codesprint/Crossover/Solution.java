/**
 * https://www.hackerrank.com/contests/nse-isb-codesprint/challenges/crossover
 *
 * @author Darpan Dodiya
 */

import java.io.*;
import java.text.*;
import java.math.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigDecimal[] stockArr = new BigDecimal[n];
        double STMA1 = 0D;
        double LTMA1 = 0D;
        double STMA2 = 0D;
        double LTMA2 = 0D;
        
        stockArr[0] = BigDecimal.valueOf(in.nextInt());
        for (int i = 1; i < n; i++) {
            stockArr[i] = stockArr[i-1].add(BigDecimal.valueOf(in.nextInt()));
        }

        int STPERIOD = 60;
        int LTPERIOD = 300;
        
        STMA1 = ((stockArr[LTPERIOD-1].subtract(stockArr[LTPERIOD-STPERIOD-1])).divide(BigDecimal.valueOf(STPERIOD), 2, RoundingMode.HALF_UP)).doubleValue();
        LTMA1 = (stockArr[LTPERIOD-1].divide(BigDecimal.valueOf(LTPERIOD), 2, RoundingMode.HALF_UP)).doubleValue();
        
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.UNNECESSARY);
        
        for(int i = LTPERIOD; i<n; i++) {
            STMA2 = ((stockArr[i].subtract(stockArr[i-STPERIOD])).divide(BigDecimal.valueOf(STPERIOD), 2, RoundingMode.HALF_UP)).doubleValue();
            LTMA2 = ((stockArr[i].subtract(stockArr[i-LTPERIOD])).divide(BigDecimal.valueOf(LTPERIOD), 2, RoundingMode.HALF_UP)).doubleValue();
            
            if((STMA1 > LTMA1  && STMA2 <= LTMA2)
                    || (STMA1 < LTMA1  && STMA2 >= LTMA2)
                    || (STMA1 == LTMA1  && STMA2 != LTMA2)) {
                System.out.println((i+1) + " " + df.format(STMA2) + " " + df.format(LTMA2));
            }
            STMA1 = STMA2;
            LTMA1 = LTMA2;
        }
    }
}
