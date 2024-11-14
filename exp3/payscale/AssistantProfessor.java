
package payscale;
import java.util.Scanner;

public class AssistantProfessor extends Employee {
public AssistantProfessor() {
super();
computeAssistantProfessorPay();
}
public void computeAssistantProfessorPay() {
System.out.println("Enter Basic pay of AssistantProfessor [enter -1 for Default [BP= 25000]]:");
Scanner input=new Scanner(System.in);
this.basic_pay = input.nextInt();
if (this.basic_pay == -1) {
this.basic_pay = 25000;
System.out.println("Default Pay Taken");
}
computeCurrentBasicPay("AssistantProfessor");
generatePaySlip();
displayPaySlip();
}
}
