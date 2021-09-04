class Bank{
	//class states 
	long AccNo;
	String Branch;
	String Acc_Type;
	float  Amount;
	
	
	//Class Constructor
	Bank(){
		System.out.println("------------Class Constructor Initiated-------------");
	}
	
	//Class Metrhod 
	//Writing data in the main Method
	void Write_Data(long AccNo, String Branch, String Acc_Type, float Amount) {
		this.AccNo = AccNo;
		this.Branch = Branch;
		this.Acc_Type = Acc_Type;
		this.Amount = Amount;
		System.out.println("------------Data Written in Registered User-----------");
		System.out.println("\n");
	}
	// Writting out Data
	void Display_Data() {
	
		
		System.out.println("Account Number:  " + this.AccNo);
		System.out.println("Bank Branch:  " + this.Branch);
		System.out.println("Type_Of_Account:  " + this.Acc_Type);
		System.out.println("Account Balance:  " + this.Amount);
		
	}
	
}


//Inherittance
//Three types of Inheritance 
//Single Level - One parent One Child 
//Multilevel - One Parent to One Child to One Grand Child


class User extends Bank{ //IS-A Relationship
	// User becomes the child 0bject while bank is the parent but User is still an Object
    // User States
	String Name;
	long Phone_Number;
	String Address;
	
	//Wite data in the User Class
	//But this time were Overloading in order to get the full dta diplayed
	
	void Write_Data(long AccNo, String Branch, String Acc_Type, float Amount, String Name,long Phone_Number, String Address) {
		System.out.println("\n");
		this.AccNo = AccNo;
		this.Branch = Branch;
		this.Acc_Type = Acc_Type;
		this.Amount = Amount;
		this.Name = Name;
		this.Phone_Number = Phone_Number;
		this.Address = Address;
		System.out.println("------------Data Written in Bank  User-----------");
		
	}
	//Displaying data in the user but since the data is Inherrited we  have to Overload
	//Data Overloasing
void Display_Data() {
	
		
		System.out.println("Account Number:  " + this.AccNo);
		System.out.println("Bank Branch:  " + this.Branch);
		System.out.println("Type_Of_Account:  " + this.Acc_Type);
		System.out.println("Account Balance:  " + this.Amount);
		System.out.println("Account Holder Name:  " + this.Name);
		System.out.println("Account Holder Mobile Number:  " + this.Phone_Number);
		System.out.println("Account Holder Address:  " + this.Address);
		
	}
	
	
}

public class bankAccount {

	public static void main(String[] args) {
		
		//Parent Class
		Bank Registered_Account = new Bank();
		
		Registered_Account.Write_Data(127_3577_450, "Dagoreti", "Savings Account", 5000);
		
		Registered_Account.Display_Data();
		
		//Creating New Object in the Xtended Class  (Child Class)
		User Account_1 = new User();
		
		Account_1.Write_Data(1273_5774_50, "Kibra", "Savings Account", 50000, "Maxwel Ochieng",704407239, "Nairobi");
		
		Account_1.Display_Data();
	}
	
}
