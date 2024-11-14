package payscale;
import java.util.Scanner;
public class Programmer extends Employee {
public Programmer() {
super();
computeProgrammerPay();
}
public void computeProgrammerPay() {
System.out.println("Enter Basic pay of Programmer [enter -1 for Default [BP =30000]]:");
Scanner input=new Scanner(System.in);
this.basic_pay = input.nextInt();
if (this.basic_pay == -1) {
this.basic_pay = 30000;
System.out.println("Default Pay Taken");
}
computeCurrentBasicPay("Programmer");
generatePaySlip();
displayPaySlip();
}
}
