import java.util.*;
import java.text.DecimalFormat;
class Example{	
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		Random rand=new Random();
		
		
		System.out.print("input the number of students : ");
		final int N = input.nextInt();
		
		System.out.print("input the number of subjects : ");
		final int S = input.nextInt();
		
		int[][] marks = new int[N][S];
		
		int stNumber=1001;
		
		for(int j=0; j<N; j++){
		for(int i=0; i<S; i++){
			marks[j][i]=rand.nextInt(101);
			}
		}
		int[] stTot=new int[N];
		for(int j=0; j<N; j++){
			int total=0;
		for(int i=0; i<S; i++){
			total+=marks[j][i];
			}
			stTot[j]=total;
		}
		
		int[] stMax=new int[N];
		for(int j=0; j<N; j++){
			int max=0;
		for(int i=0; i<S; i++){
			if(marks[j][i]>max){
				max=marks[j][i];
				}
			}
			stMax[j]=max;
		}
		int[] stMin=new int[N];
		for(int j=0; j<N; j++){
			int min=100;
		for(int i=0; i<S; i++){
			if(marks[j][i]<min){
				min=marks[j][i];
				}
			}
			stMin[j]=min;
		}
		
		double[] stAvg=new double[N];
		double noOfSub=S;
		for(int j=0; j<N; j++){
			stAvg[j]=stTot[j]/noOfSub;
		
		}
		
		char[] grade=new char[N];
		for(int j=0; j<N; j++){
				
				grade[j]=stAvg[j]>=75? 'A' : stAvg[j]>=65? 'B' : stAvg[j]>=45? 'C' : 'D';
				
				}
		int[] teaMax=new int[S];
		for(int i=0; i<S; i++){
		int max=0;
		for(int j=0; j<N; j++){
			if(marks[j][i]>max){
				max=marks[j][i];
				}
			}
			teaMax[i]=max;
		}
		int[] teaMin=new int[S];
		for(int i=0; i<S; i++){
		int min=100;
		for(int j=0; j<N; j++){
			if(marks[j][i]<min){
				min=marks[j][i];
				}
			}
			teaMin[i]=min;
		}
		int[] teaTot=new int[S];
		for(int i=0; i<S; i++){
			int total=0;
		for(int j=0; j<N; j++){
			total+=marks[j][i];
			}
			teaTot[i]=total;
		}
		double[] teaAvg=new double[S];
		double noOfStudent=N;
		for(int i=0; i<S; i++){
			teaAvg[i]=teaTot[i]/noOfStudent;
		
		}
		char[] tGrade=new char[S];
		for(int i=0; i<S; i++){
				
				tGrade[i]=teaAvg[i]>=75? 'A' : teaAvg[i]>=65? 'B' : teaAvg[i]>=45? 'C' : 'D';
				
				}
		
		System.out.print(" StNo\t");
		for(int i=0; i<S; i++){
			System.out.print("Sub"+(i+1)+"\t");
			}
			System.out.print("max\tmin\ttotal\taverage\t grade");
			System.out.println();
			
		for(int j=0; j<N; j++){
			System.out.print(" "+stNumber+"\t");
		for(int i=0; i<S; i++){
			System.out.print(marks[j][i]+"\t");
			}
			System.out.print(stMax[j]+"\t"+stMin[j]+"\t"+stTot[j]+"\t"+df2.format(stAvg[j])+"\t "+grade[j]);
			System.out.println();
			stNumber++;
		}
		
		
		System.out.print("\nMax\t");
		for(int i=0; i<S; i++){
			System.out.print(teaMax[i]+"\t");
		}
		System.out.println();
		
		System.out.print("Min\t");
		for(int i=0; i<S; i++){
			System.out.print(teaMin[i]+"\t");
		}
		System.out.println();
		System.out.print("Total\t");
		for(int i=0; i<S; i++){
			System.out.print(teaTot[i]+"\t");
			}
		System.out.println();
		System.out.print("Average\t");
		for(int i=0; i<S; i++){
			System.out.print(df2.format(teaAvg[i])+"\t");
			}
		System.out.println();
		System.out.print("Grade\t");
		for(int i=0; i<S; i++){
			System.out.print(tGrade[i]+"\t");
			}			
	}

}
