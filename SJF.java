import java.util.*; 
 class sjf
 {  
    public static void main(String args[]) 
        { 
            try (Scanner sc = new Scanner(System.in)) {
				System.out.println ("Enter no of process:");  
				int n = sc.nextInt();  
				int pid[] = new int[n];  
				int at[] = new int[n];  
				int bt[] = new int[n];  
				int ct[] = new int[n];  
				int ta[] = new int[n];  
				int wt[] = new int[n];  
				int f[] = new int[n];  
				int st=0, tot=0;  
				float avgwt=0, avgta=0; 
				for(int i=0;i<n;i++) 
				{ 
				    System.out.println ("Enter process " + (i+1) + " arrival time:");  
				    at[i] = sc.nextInt(); 
				    System.out.println ("Enter process " + (i+1) + " burst time:");  
				    bt[i] = sc.nextInt();  
				    pid[i] = i+1;  
				    f[i] = 0; 
				}   
				while(true) 
				{ 
				    int c=n, min=999;  
				    if (tot == n)  
				    break; 
				    for (int i=0; i<n; i++) 
				    { 
				        if ((at[i] <= st) && (f[i] == 0) && (bt[i]<min)) 
				        { 
				            min=bt[i];  c=i; 
				        } 
				    } 
				    if (c==n)  
				    st++;  
				    else 
				    { 
				        ct[c]=st+bt[c];  
				        st+=bt[c];  
				        ta[c]=ct[c]-at[c];  
				        wt[c]=ta[c]-bt[c];  
				        f[c]=1;  
				        tot++; 
				    } 
				} 
				System.out.println("\nPNo    AT     BT      CT     TAT     WT  ");  
				for(int i=0;i<n;i++) 
				{ 
				    avgwt+= wt[i];  
				    avgta+= ta[i]; 
				    System.out.println(pid[i]+"\t"+at[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+ta[i]+"\t"+wt[i]); 
				} 
				System.out.println ("\naverage tat is "+ (float)(avgta/n)); 
				System.out.println ("average wt is "+ (float)(avgwt/n));
			} 
        } 
 } 
