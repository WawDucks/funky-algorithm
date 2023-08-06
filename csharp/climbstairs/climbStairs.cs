using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CEM.Desktop.IT.GITHUB.funky-algorithm.csharp.climbstairs
{
    public class climbstairs {
    public int ClimbStairs(int n) {
        int[] data = new int[n+1];
        data[0]=1;
        data[1]=1;

        for(int index=2; index<=n; index++)
            data[index]= data[index-1]+data[index-2];

            return data[n];
        }
}
}