public class towerofhanoi {


    publicclassSolution{
        publicstaticvoidtowerOfHanoi(intn,Stringsrc,Stringhelper,Stringdest)
         {
            if(n==1) {System.out.println("transfer disk "+n+"from "+src+" to "+dest);return;}
            //transfer top n-1 from src to helper usingdest as 'helper'
            towerOfHanoi(n-1,src,dest,helper);
            //transfer nth from src to dest
            System.out.println("transfer disk "+n+"from "+src+" to "+helper);
            //transfer n-1 from helper to dest using srcas 'helper'
            towerOfHanoi(n-1,helper,src,dest);
        }
        publicstaticvoidmain(Stringargs[]) {intn=4;towerOfHanoi(n,"A","B","C");}
    }
    

    
}
