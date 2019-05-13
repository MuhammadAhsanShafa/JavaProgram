class bubble {
public static void main(string args[])	{
	int nums[]={2,4,7,6,3,5,19,15,14,20};
	int a;b;t;
	int size;
	size=10;
	system.out.print("orignal array is:");
	for(int i=0; i<size; i++)
	system.out.print("  " +nums[i]);
	system.out.println();
	for(int a=1;a<size;a++)
	for(int b=size-1;b>=a;b--){
	if(nums[b-1]>nums[b]){
	t=nums[b-1];
	nums[b-1]=nums[b];
	t=nums[b];

	}

	}
	system.out.print("sorted array is:");
	for(int i=0; i<size; i++)
	system.out.print("  " +nums[i]);
	system.out.println();
}
}