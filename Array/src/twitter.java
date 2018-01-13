public class twitter {
	public static void main(String[] args) {
		String enc = "Atvt hrqgse, Cnikg";
		String dec = "Your friend, Alice";
		String key = "";
		for (int i = 0; i < enc.length(); i++) {
			if (enc.charAt(i) >= 65 && enc.charAt(i) <= 122) {
				int k = enc.charAt(i) - dec.charAt(i);
				if(k < 0) {
					k = 26 + k;
				}
				key = key + k;
			}
		}
		System.out.println(key);
		
		
		/*char c = ' ';
		int b = c;
		System.out.println(b);*/
		
		String msg = "Bjj rwkcs dwpyp fwz ovors wxjs vje tcez fqg"
				+ "";
		String d = decrypt(msg, key);
		System.out.println(d);
	}

	private static String decrypt(String msg, String key) {
		// TODO Auto-generated method stub
		int k = 0;
		String d = "";
		for(int i = 0; i < msg.length(); i++) {
			if(k == key.length()) {
				k = 0;
			}
			if (msg.charAt(i) >= 65 && msg.charAt(i) <= 122) {
				int r = key.charAt(k) - 48;
				int ch = msg.charAt(i) - r;
				if((msg.charAt(i) >=65 && msg.charAt(i) <= 90) && ch < 65) {
					ch = ch + 26;
				}else if((msg.charAt(i) >=97 && msg.charAt(i) <= 122) &&ch < 97) {
					ch = ch + 26;
				}
				char c = (char)ch;
				d = d + c;
				k++;
			}else {
				d = d + msg.charAt(i);
			}
			
		}
		return d;
	}
}