package BussinessLayer.entities;

public class demo {
public static void main(String[] args) {
String hello = "";
String mail="lavan.tho@fpt.edu.vn";
String rs=mail.substring(0,mail.indexOf("@"));
String domain=mail.substring(mail.indexOf("@"));
String demo[]=rs.split("[.]");
for(String x:demo) {
	hello+=x;

}
System.out.println(hello.concat(domain));
}
}
