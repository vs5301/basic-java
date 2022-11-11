 import java.util.Scanner; 
 class rr 
 { 
    public static void main(String args[]) 
    { 
        int n,i,qt,count=0,temp,sq=0,bt[],wt[],tat[],rem_bt[];  
        float awt=0,atat=0; 
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number of process: "); 
			n = sc.nextInt();  
			int[] at=new int[n];  
			bt = new int[n];  
			wt = new int[n];  
			tat = new int[n];  
			rem_bt = new int[n]; 
			System.out.print("Enter the quantum time: ");  
			qt = sc.nextInt();  
			for(i=0;i<n;i++) 
			{ 
			    System.out.println ("enter process " + (i+1) + " arrival time:");  
			    at[i] = sc.nextInt(); 
			    System.out.println ("enter process " + (i+1) + " burst time:");  
			    bt[i] = sc.nextInt();  rem_bt[i] = bt[i]; 
			} 
			while(true) 
			{ 
			    for (i=0,count=0;i<n;i++) 
			    { 
			        temp = qt;  
			        if(rem_bt[i] == 0) 
			        { 
			            count++;  
			            continue; 
			        } 
			        if(rem_bt[i]>qt) 
			            rem_bt[i]= rem_bt[i] - qt;  
			        else if(rem_bt[i]>=0) 
			        { 
			            temp = rem_bt[i];  
			            rem_bt[i] = 0; 
			        } 
			        sq = sq + temp;  
			        tat[i] = sq -at[i]; 
			    } 
			    if(n == count)  
			    break; 
			} 
			System.out.println("\nPNo    AT     BT      TAT     WT  ");  
			for(i=0;i<n;i++) 
			{ 
			    wt[i]=tat[i]-bt[i];  
			    awt=awt+wt[i];  
			    atat=atat+tat[i]; 
			    System.out.println((i+1)+"\t"+at[i]+"\t"+bt[i]+"\t"+tat[i]+"\t"+wt[i]); 
			}
		} 
        awt=awt/n;  
        atat=atat/n; 
        System.out.println("\nAverage waiting Time = "+awt+"\n"); 
        System.out.println("Average turnaround time = "+atat); 
    } 
 }
