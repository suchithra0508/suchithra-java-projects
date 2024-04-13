import java.util.Scanner;

public class practise {

    public static void main(String[] args) {
        
                int English=86;
                int Physics=90;
                int LAAC=82;
                int Chemistry=89;
                int EDC=75;
                double year1_percentage=(English+Physics+LAAC+Chemistry+EDC)/500d*100;
                int DS=79;
                int LICA=90;
                int ECA=83;
                int DSD=87;
                int  EMTL=78;
                double year2_percentage=(DS +LICA+ECA+DSD+EMTL)/500d*100;
                int VLSI=78;
                int DSP=90;
                int MPMC=89;
                int CS=88;
                int DCNS=93;
                double  year3_percentage=(VLSI+DSP+MPMC+CS+DCNS)/500d*100;
                int AWP=90;
                int CN=78;
                int EMI=79;
                int EG=81;
                int BEFA=88;
                double  year4_percentage=(AWP+CN+EMI+EG+BEFA)/500d*100;
                System.out.println("Enter the year");
        Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        switch(S){
            case 1:
            System.out.println("1st year result:");
            int A =sc.nextInt();
            if(A==1){
               
                System.out.println("English: "+English);
                System.out.println("Physics: "+Physics);
                System.out.println("LAAC: "+LAAC);
                System.out.println("Chemistry: "+Chemistry);
                System.out.println("EDC: "+EDC);

System.out.println("1st year result:"+year1_percentage);

            }
            break;
            case 2 :
            System.out.println("2nd year result:");
            int B=sc.nextInt();
            if(B ==2){
               
               System.out.println(" DS: "+  DS);
               System.out.println("LICA: "+ LICA);
               System.out.println("ECA:"+ECA);
               System.out.println("DSD:"+DSD);
               System.out.println("EMTL:"+EMTL);

               System.out.println("2nd year result: "+ year2_percentage);
            }
            break;
            case 3:
            System.out.println("3rd year result:");
            int C =sc.nextInt();
            if (C==3) {
                
                System.out.println("VLSI: "+VLSI);
                System.out.println("MPMC:"+MPMC);
                System.out.println("DSD: "+DSD);
                System.out.println("CS:"+CS);
                 System.out.println("DCNS:"+DCNS);

                System.out.println("3rd year result: "+year3_percentage);

                
            }
            break;
            case 4:
            System.out.println("4th year result:");
            int D=sc.nextInt();
            if (D==4) {
               
                System.out.println("AWP: "+AWP);
                System.out.println("EMI: "+EMI);
                System.out.println("CN: "+CN);
                System.out.println("EG:"+EG);
                System.out.println("BEFA:"+BEFA);
                System.out.println("4th year result: "+ year4_percentage);
                
            }
            break;
            case 5:
            System.out.println("overall PERC");
            int E=sc.nextInt();
            if(E==5){
                double overall_PERC=( year1_percentage+year2_percentage+year3_percentage + year4_percentage)/4;
                System.out.println("overall_PERC: "+overall_PERC);
            }
            break;
            default:
          
            System.out.println("details not found");
        }
        sc.close();
    }

}