import java.util.*;  
class pb 
{  
    public static void main(String[] args) 
    {  
        System.out.print("Enter Number of Process: ");  
        try (Scanner sc = new Scanner(System.in)) {
			int numberOfProcess = sc.nextInt(); 
			String process[] = new String[numberOfProcess];  
			int burstTime[] = new int[numberOfProcess];  
			int priority[] = new int[numberOfProcess]; 
			int p = 1;  
			for (int i = 0; i < numberOfProcess; i++) 
			{ 
			    process[i] = ""+p;  p++; 
			} 
			for (int i = 0; i < numberOfProcess; i++) 
			{ 
			    System.out.println ("enter process " + (i+1) + " burst time:");  
			    burstTime[i] = sc.nextInt(); 
			    System.out.println ("enter process " + (i+1) + " prority time:");  
			    priority[i] = sc.nextInt(); 
			} 
			int temp;  
			String temp2;  
			for (int i = 0; i < numberOfProcess - 1; i++) 
			{  
			    for (int j = 0; j < numberOfProcess - 1; j++) 
			    {  
			        if (priority[j] > priority[j + 1]) 
			        {  
			            temp = priority[j]; 
			            priority[j] = priority[j + 1];  
			            priority[j + 1] = temp; 
			            temp = burstTime[j];  
			            burstTime[j] = burstTime[j + 1];  
			            burstTime[j + 1] = temp; 
			            temp2 = process[j];  
			            process[j] = process[j + 1];  
			            process[j + 1] = temp2; 
			        } 
			    } 
			} 
			int TAT[] = new int[numberOfProcess + 1];  
			int waitingTime[] = new int[numberOfProcess + 1]; 
			for (int i = 0; i < numberOfProcess; i++) 
			{  
			    TAT[i] = burstTime[i] + waitingTime[i];  
			    waitingTime[i + 1] = TAT[i]; 
			} 
			int totalWT = 0;  
			int totalTAT = 0;  
			double avgWT;  
			double avgTAT; 
			System.out.println("Process     BT      WT        TAT");  
			for (int i = 0; i < numberOfProcess; i++) 
			{ 
			    System.out.println(process[i] + "          " + burstTime[i] + "       " +  waitingTime[i] + "         " + (TAT[i]));  
			    totalTAT += (waitingTime[i] + burstTime[i]);  
			    totalWT += waitingTime[i]; 
			} 
			avgWT = totalWT / (double) numberOfProcess;  
			avgTAT = totalTAT / (double) numberOfProcess; 
			System.out.println("\n Average Wating Time: " + avgWT); 
			System.out.println(" Average Turn Around Time: " + avgTAT);
		} 
    } 
 } 