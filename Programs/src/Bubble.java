
public class Bubble {
	public static void main(String[] args) {
		int [] arr= {2,33,1,55,24,6,17,15,19,38,5};
		int temp;
		for(int j=0; j<arr.length;j++){
			
		for(int i =0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		}
		for(int k=0; k<arr.length;k++){
			System.out.println(arr[k]);
		}
	}

}
