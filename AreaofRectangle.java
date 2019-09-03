class Area{
	public static void main(String []args){
		if(args.length==2){
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a*b;
			System.out.print("Area is : "+c);
		}
		else
			System.out.println("Enter only two argument");
	}
}
