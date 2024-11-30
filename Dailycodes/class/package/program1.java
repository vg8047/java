import  Company.Techinfo;

import  Employee.Employeeinfo;

class Demo{

	public static void main(String[] args){

		Techinfo tf = new Techinfo();

		Employeeinfo ef = new Employeeinfo();

		tf.Techstack();

		System.out.println(ef.empid);

		System.out.println(ef.empname);

		System.out.println(ef.Devtype);

		System.out.println(ef.salary);
	}
}
