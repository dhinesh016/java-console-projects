class Bank implements ATM 
{
	Account a;
	public void createAccount(Account a){
		if(this.a==null){
			this.a=a;
			System.out.println("Account Created Successfully");
			System.out.println("\nPlease Collect Your Account: "+a.acc_no);
		}
		else{
			System.out.println("Already one Account is Available");
		}
	}
	public void balanceEnquiry(int pwd){
		if(this.a==null){
			System.out.println("There is no Account to Display");
		}
		else{
			if(pwd==a.pwd){
				System.out.println("Your Balnce is :"+a.availableBalance);
			}
			else{
				System.out.println("Password is incorect");
				}
		}
	}
	public void withdraw(int pwd,double amount){
		if(this.a==null){
			System.out.println("There is no Account to Display");
		}
		else{
			if(pwd==a.pwd){			
				if(amount<=a.availableBalance){
					a.availableBalance-=amount;
					System.out.println("Amount Debited Sucessfully");
				}
				else{
					System.out.println("Insufficient balance");
				}
			}
		    else{
				System.out.println("Password is incorect");
				}
		}
	}
	public void changePwd(int oldPwd,int newPwd){
		if(this.a==null){
			System.out.println("There is no Account to Display");
		}
		else{
			if(oldPwd==a.pwd){			
				a.pwd=newPwd;
				System.out.println("Password changed Successfully");
			}
		    else{
				System.out.println("Password is incorect");
			}
		}
	}
	public void deposite(int pwd,double amount){
		if(this.a==null){
			System.out.println("There is no Account to Display");
		}
		else{
			if(pwd==a.pwd){			
					a.availableBalance+=amount;
					System.out.println("Amount credited Sucessfully");
			}
		    else{
				System.out.println("Password is incorect");
				}
		}
	}
	public void accountDetails(int pwd){
		if(this.a==null){
			System.out.println("There is no Account to Display");
		}
		else{
			if(pwd==a.pwd){			
					System.out.println("=====Account Details=====");
					System.out.println("Account HolderName:"+a.u.userName);
					System.out.println("Account Nummber:"+a.acc_no);
					System.out.println("AvailableBalance:"+a.availableBalance);
					System.out.println("Password:"+a.pwd);
			}
		    else{
				System.out.println("Password is incorect");
				}
		}
	}
}
