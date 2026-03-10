import java.util.Scanner;
class ATMDriver 
{
	static{
		 System.out.println("\n=============================\n");
		 System.out.println("!  Welcome to our ATM  !");
		 System.out.println("\n=============================\n");
	}
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   boolean exit=true;
	   Bank b1=new Bank();
	   while(exit){
		    System.out.println("\n=============================\n");
		    System.out.println("Enter your choice:\n1.CreateAccount \n2.Check Balance \n3.Withdraw \n4.Change Pin \n5.Deposite \n6.AccountDetails \n7.Exit");
	        int choice=sc.nextInt();
			System.out.println("\n=============================\n");
		    switch(choice){
			   case 1:
			   {
				   System.out.println("Enter Your Name:");
				   String userName=sc.next();
				   System.out.println("Enter the Amount:");
				   double amount=sc.nextDouble();
				   if(amount>=0){
					   amount=amount;
				   }
				   else{
					   System.out.println("\n=============================\n");
					   System.out.println("The Amount should not be negative:");
					   System.out.println("\n=============================\n");
					   break;
				   }
				   System.out.println("Enter Your Password the length should be 4:");
				   String password=sc.next();
				   if(password.length()==4){
					   int pwd=Integer.parseInt(password);
					   int acc_no=(int)Math.random()+123445;
				       System.out.println("\n=============================\n");
				       b1.createAccount(new Account(amount,pwd,acc_no,new User(userName)));
				       System.out.println("\n=============================\n");
				   }
				   else{
					   System.out.println("\n=============================\n");
					   System.out.println("Password length must should be 4");
					   System.out.println("\n=============================\n");
					   break;
				   }
			   }break;
			   case 2:
			   {
				   System.out.println("Enter Your Password:");
				   int pwd=sc.nextInt();
				   System.out.println("\n=============================\n");
				   b1.balanceEnquiry(pwd);
				   System.out.println("\n=============================\n");
			   }break;
			   case 3:
			   {
				   System.out.println("Enter Your Amount:");
				   double amount=sc.nextDouble();
				   System.out.println("Enter Your Password:");
				   int pwd=sc.nextInt();
				   if(amount>=0){
					   amount=amount;
				   }
				   else{
					   System.out.println("\n=============================\n");
					   System.out.println("The Amount should not be negative:");
					   System.out.println("\n=============================\n");
					   break;
				   }
				   System.out.println("\n=============================\n");
				   b1.withdraw(pwd,amount);
				   System.out.println("\n=============================\n");
			   }break;
			   case 4:
			   {
				   
				   System.out.println("Enter Your Old Password:");
				   int oldPwd=sc.nextInt();
				   if(oldPwd==b1.a.pwd){
				   System.out.println("Enter Your New Password:");
				   String password=sc.next();
				   if(password.length()==4){
				   int newPwd=Integer.parseInt(password);
				   System.out.println("\n=============================\n");
				   b1.changePwd(oldPwd,newPwd);
				   System.out.println("\n=============================\n");
				   }
				   else{
					   System.out.println("\n=============================\n");
					   System.out.println("Password length must should be 4");
					   System.out.println("\n=============================\n");
					   break;
				   }
				   }
				   else{
					   System.out.println("\n=============================\n");
					   System.out.println("Incorrect Password");
					   System.out.println("\n=============================\n");
				   }
			   }break;
			   case 5:
			   {
				   System.out.println("Enter Your Amount:");
				   double amount=sc.nextDouble();
				   System.out.println("Enter Your Password:");
				   int pwd=sc.nextInt();
				   if(amount>=0){
					   amount=amount;
				   }
				   else{
					   System.out.println("\n=============================\n");
					   System.out.println("The Amount should not be negative:");
					   System.out.println("\n=============================\n");
					   break;
					   
				   }
				   System.out.println("\n=============================\n");
				   b1.deposite(pwd,amount);
				   System.out.println("\n=============================\n");
			   }break;
			   case 6:
			   {   
				   System.out.println("Enter Your Password:");
				   int pwd=sc.nextInt();
				   System.out.println("\n=============================\n");
				   b1.accountDetails(pwd);
				   System.out.println("\n=============================\n");
			   }break;
			   case 7:{
				   exit=false;
				   System.out.println("\n=============================\n");
				   System.out.println("Thank you for visting \n  Please Agin Vist!");
				   System.out.println("\n=============================\n");
			   }break;
			   default :{
				    System.out.println("\n=============================\n");
				   System.out.println("Invaild Choice!!!");
				   System.out.println("\n=============================\n");
			   }
		   }
	   }
	}
}
