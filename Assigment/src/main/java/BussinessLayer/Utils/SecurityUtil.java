package BussinessLayer.Utils;

import java.util.List;

import BussinessLayer.entities.User;

public class SecurityUtil {
	public static boolean checkMailClone(String mail,List<User> list) {
		String domain=mail.substring(mail.lastIndexOf("@")),temp="";
		String user=mail.substring(0,mail.indexOf("@"));
		String[]rs=user.split("[.]");
		if(user.contains("+")) {
			return true;
		}
		for(String x:rs) {
			temp+=x;
		}
		for(User x:list) {
			if(temp.concat(domain).equals(x.getEmail())) {
				return true;
			}
		}
		return false;
	}
	public static boolean isXSS(String text) {
		if(text.contains("<script>")) {
			return true;
		}
		return false;
	}
	public static boolean isFileUploadVul(String filename) {
		String extendFileName=filename.substring(filename.lastIndexOf("."));
		String template[]= {".gif",".jpg",".jpeg",".png",".ico",".tiff"};
		for(String x:template) {
			if(extendFileName.equalsIgnoreCase(x)) {
				return false;
			}
		}
		return true;
	}
	public static String hashNameFile(String filename) {
		if(isFileUploadVul(filename)) {
			return null;
		}
		String name=filename.substring(filename.lastIndexOf("."));
		String extend=filename.substring(filename.lastIndexOf("."));
		String hash=HashUtil.MD5(name);
		return hash.concat(extend);
		
	}
	


}
