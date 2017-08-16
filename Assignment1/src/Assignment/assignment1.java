package Assignment;
import java.util.Scanner;
import java.lang.*;
public class assignment1 {
	public static void main(String[] args){
		movie[] train_data = new movie[4];
		movie[] test_data = new movie[1];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<4;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			String cate = sc.next();
			train_data[i]= new movie(x,y,cate);
		}
		for(int i = 0;i<1;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			String cate = "Unkown";
			test_data[i]= new movie(x,y,cate);
		}
		float least=0;
		int least_index = 0;
		float[] euc = new float[4];
		for(int j = 0;j<1;j++){
			for(int i = 0;i<4;i++){
				euc[i] = (float) Math.hypot(train_data[i].actions-test_data[j].actions,train_data[i].comedy-test_data[j].comedy);
				System.out.println(euc[i]);
				if((least==0)&(euc[i]!=0.0)){
					least = euc[i];
					least_index = i;
				}
				else if(euc[i]<least){
					least = euc[i];
					least_index = i;
				}
			}
		}
		
		System.out.println(train_data[least_index].cate);
		
		
		
	}

}
