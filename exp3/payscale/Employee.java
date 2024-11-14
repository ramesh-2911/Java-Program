package payscale;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
class Employee {
String emp_name;
String emp_id;
String emp_address;
String emp_mail_id;
String emp_mobile_no;
int basic_pay;
int per_day_pay;
int current_basic_pay; int
da, hra, pf, gross_pay; int
net_pay;
int no_of_days_in_current_month;
int no_of_days_worked;
Calendar cal;
Scanner input;
Employee() {
input = new Scanner(System.in);
cal = new GregorianCalendar();
no_of_days_in_current_month =
cal.getActualMaximum(Calendar.DAY_OF_MONTH);
getUserBasicDetails();
}
public void generatePaySlip() {
this.da = (this.current_basic_pay / 100) * 97;
this.hra = (this.current_basic_pay / 100) * 12; 
this.pf = (int) ((this.current_basic_pay / 100) * 0.1);
this.gross_pay = this.current_basic_pay + da + hra + pf;
this.net_pay = gross_pay - pf;
}
public void displayPaySlip() {
System.out.println("Name: " + this.emp_name);
System.out.println("ID: " + this.emp_id);
System.out.println("Address: " + this.emp_address);
System.out.println("MailID: " + this.emp_mail_id);
System.out.println("Mobile No: " + this.emp_mobile_no);
System.out.println("\nEarnings");
System.out.println("--------");
System.out.println("BASIC Pay: " + current_basic_pay + " Rs");
System.out.println("DA : " + da + " Rs");
System.out.println("HRA : " + hra + " Rs");
System.out.println("\nDeductions");
System.out.println("----------");
System.out.println("PF : " + pf + " Rs");
System.out.println("GROSS Pay: " + gross_pay + " Rs");
System.out.println("NET Pay: " + net_pay + " Rs");
}
public void getUserBasicDetails() {
System.out.println("Enter Details");
System.out.println("Name: ");
this.emp_name = input.next();
System.out.println("ID: ");
this.emp_id = input.next();
System.out.println("Address: ");
this.emp_address = input.next();
System.out.println("MailID: ");
this.emp_mail_id = input.next();
System.out.println("Mobile No:");
this.emp_mobile_no = input.next();
}
public void computeCurrentBasicPay(String empType) { this.per_day_pay
= this.basic_pay / no_of_days_in_current_month;
System.out.println("\nBasic Pay of " + empType + " " + this.basic_pay + " for "
+ this.no_of_days_in_current_month + " days");
System.out.println("This month this " + empType + " gets " + this.per_day_pay + "INR as basic pay per day");
System.out.println("Enter no.of days worked by " + empType + " including CL,WH, FH and excluding LWP:");
this.no_of_days_worked = input.nextInt();
if (no_of_days_worked <= no_of_days_in_current_month) {
this.current_basic_pay = this.per_day_pay * no_of_days_worked;
System.out.println("Programmer");
System.out.println("----------");
generatePaySlip();
} else {
System.out.println("Sorry Please Enter Valid Days");
}
}
protected void finalize() {
input.close();
System.exit(0);
}
}
