interface ATM
{
	void createAccount(Account a);
	void balanceEnquiry(int pwd);
	void withdraw(int pwd,double amount);
	void changePwd(int oldPwd,int newPwd);
	void deposite(int pwd,double amount);
} 

