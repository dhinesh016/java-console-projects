class Account 
{
	double availableBalance;
	int pwd;
	int acc_no;
	User u;
	Account(double availableBalance,int pwd,int acc_no,User u){
		this.availableBalance=availableBalance;
		this.pwd=pwd;
		this.acc_no=acc_no;
		this.u=u;
	}
}
