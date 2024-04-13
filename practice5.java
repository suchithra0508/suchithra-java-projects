import java.util.Scanner;
public class project5 {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter your Roll Number");
        String rollNo = sc.next();
                int laac=97;
                int chem=89;
                int bee=93;
                int eng=94;
                int edc=98;
                double year1_perc=(laac+chem+bee+eng+edc)/500d*100;
                int devc=96;
                int ap=94;
                int pps=92;
                int eg= 87;
                int na=93;
                double year2_perc=(devc+ap+pps+eg+na)/500d*100;
                int edc1=94;
                int ssp=95;
                int dsd=96;
                int ds=96;
                int uhv=92;
                double  year3_perc=(edc1+ssp+dsd+ds+uhv)/500d*100;
                int cvtt=97;
                int adc=96;
                int lica=96;
                int eca=75;
                int emtl=88;
                double  year4_perc=(cvtt+adc+lica+eca+emtl)/500d*100;
                int coa=86;
                int awp=81;
                int mpmc=93;
                int dcns=93;
                int emi=92;
                double  year5_perc=(coa+awp+mpmc+dcns+emi)/500d*100;
                System.out.println("Enter the year");
        int S=sc.nextInt();
        System.out.println(name+" "+rollNo);
        switch(S){
            case 1:
            System.out.println("1st year result:");
            
               
                System.out.println("laac: "+laac);
                System.out.println("chem: "+chem);
                System.out.println("bee: "+bee);
                System.out.println("eng: "+eng);
                System.out.println("edc: "+edc);

System.out.println("1st year result:"+year1_perc);
break;

           
            case 2 :
            System.out.println("2nd year result:");

               
               System.out.println(" devc: "+  devc);
               System.out.println("ap: "+ ap);
               System.out.println("pps:"+pps);
               System.out.println("eg:"+eg);
               System.out.println("na:"+na);

               System.out.println("2nd year result: "+ year2_perc);
      break;     
            case 3:
            System.out.println("3rd year result:");
            
                
                System.out.println("edc1: "+edc1);
                System.out.println("ssp:"+ssp);
                System.out.println("dsd: "+dsd);
                System.out.println("ds"+ds);
                 System.out.println("uhv:"+uhv);

                System.out.println("3rd year result: "+year3_perc);
break;
                
           
            case 4:
            System.out.println("4th year result:");
            
               
                System.out.println("cvtt: "+cvtt);
                System.out.println("adc: "+adc);
                System.out.println("lica:"+lica);
                System.out.println("eca:"+eca);
                System.out.println("emtl:"+emtl);
                System.out.println("4th year result: "+ year4_perc);
      break;          
            
            case 5:
            System.out.println("5th year result:");
            
               
                System.out.println("coa: "+cvtt);
                System.out.println("awp: "+adc);
                System.out.println("mpmc:"+lica);
                System.out.println("dcns"+eca);
                System.out.println("emi:"+emtl);
                System.out.println("5th year result: "+ year5_perc);
                
           break;
            
            case 6:
            System.out.println("overall PERC");
    
                double overall_PERC=( year1_perc+year2_perc+year3_perc + year4_perc + year5_perc)/5;
                System.out.println("overall_PERC: "+overall_PERC);
          break;
            
            default:
          
            System.out.println("details not found");
        }
        sc.close();
    }

}