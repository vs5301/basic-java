import java.util.Scanner;

public class Banker_dd
{
    private int processes, resources, max[][], allocate[][],need[][], available[];
    public static void main(String[] args) 
    {
        System.out.println("******* Deadlock detection algorithm *******");
        new Banker_dd().input();
        new Banker_dd().show();
        new Banker_dd().cal();
    }

    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of processes: ");
        processes=sc.nextInt();  
        System.out.print("Enter no. of resources: ");
        resources=sc.nextInt(); 
        need=new int[processes][resources];  
        max=new int[processes][resources];
        allocate=new int[processes][resources];
        available=new int[resources];
        System.out.println("Enter allocation matrix -->");
        for(int i=0;i<processes;i++)
        for(int j=0;j<resources;j++)
            allocate[i][j]=sc.nextInt(); 
        System.out.println("Enter max matrix -->");
        for(int i=0;i<processes;i++)
        for(int j=0;j<resources;j++)
        max[i][j]=sc.nextInt();  
        System.out.println("Enter available matrix -->");
        for(int j=0;j<resources;j++)
            available[j]=sc.nextInt();  
        sc.close();          
    }

    public void show()
    {
        System.out.println("Processes     Allocation     Max     Available");
        for(int i=0;i<processes;i++)
        {
            System.out.println("P"+(i+1));
            System.out.println("       ");
            for(int j=0;j<resources;j++)
            {
                System.out.println("  "+allocate[i][j]);
            }
            System.out.println("       ");
            for(int j=0;j<resources;j++)
            {
                System.out.println("  "+max[i][j]);
            }
            System.out.println("       ");
            if(i==0)
            {
                for(int j=0;j<resources;j++)
                {
                    System.out.println("  "+available[j]); 
                }
            }
        }
    }

    public void cal()
    {
        int finish[],flag=1, k;
        int dead[];
        int i,j;
        finish=new int[100];
        dead=new int[100];
        for(i=0;i<processes;i++)
           {
                finish[i]=0;
           }
        for(i=0;i<processes;i++)
           {
                for(j=0;j<resources;j++)
                {
                    need[i][j]=max[i][j]-allocate[i][j];
                }
           }
        while(flag==1)
           {
                flag=0;
                for(i=0;i<processes;i++)
                    {
                        int c=0;
                        for(j=0;j<resources;j++)
                        {
                            if((finish[i]==0)&&(need[i][j]<=available[j]))
                                {
                                    c++;
                                    if(c==resources)
                                    {
                                        for(k=0;k<resources;k++)
                                        {
                                            available[k]+=allocate[i][j];
                                            finish[i]=1;
                                            flag=1;
                                        }
                                        if(finish[i]==1)
                                        {
                                            i=processes;
                                        }
                                    }
                                }
                        }
                    }
            }
            j=0;
            flag=0;
            for(i=0;i<processes;i++)
            {
                if(finish[i]==0)
                {
                    dead[j]=i;
                    j++;
                    flag=1;
                }
           }
            if(flag==1)
            {

                System.out.println("\n\nSystem is in Deadlock and the Deadlock process are\n");
                for(i=0;i<processes;i++)
                {
                    System.out.println("P"+dead[i]);
                }
            }
            else
            {
                System.out.println("No deadlock occure");
            }
}  
}