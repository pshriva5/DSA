
public class LicenceKeyFormatting {

	public static void main(String[] args) {
		licenseKeyFormatting("3jZ-e-9-w3h",3);

	}


//    public static String licenseKeyFormatting(String S, int K) {
//        String Str = S.replaceAll("-","").toUpperCase();
//        char[] chr = Str.toCharArray();
//        int dash = Str.length()/K;
//        char[] ch = new char[Str.length()+dash];
//        int count = 0;
//        int j =0;
//        for (int i=Str.length()-1; i>=0; i--){
//            ch[j++] = chr[i];
//            count++;
//            if (count==K){
//                count=0;
//                ch[j++]='-';
//            } 
//            for(char c : ch){
//            	System.out.println(c);
//            }
//            
//        }
//        return ch.toString();
//    }
//    }

//public static String licenseKeyFormatting(String S, int K) {
//    String Str = S.replaceAll("-","").toUpperCase();
//    int firstG = Str.length()%K;
//    int count = 0;
//    StringBuilder sb = new StringBuilder();
//    if(firstG!=0) {
//    for (int i=0; i<=firstG-1; i++){
//      sb.append(Str.charAt(i));
//        
//    }
//    if(Str.length()!=1) {
//    sb.append("-");
//    }
//    }
//    for (int i=firstG; i<=Str.length()-1; i++){
//        sb.append(Str.charAt(i));
//        count++;
//        if(count==K) {
//        	count = 0;
//        	if(i!=Str.length()-1) {
//        	sb.append("-");
//        	}
//        }
//       
//      }
//    System.out.println(sb.toString());
//    return sb.toString();
//}
//}
	
	
	
	
	
	
	public static String licenseKeyFormatting(String S, int K) {
	    String Str = S.replaceAll("-","").toUpperCase();
	    int firstG = Str.length()%K;
	    int count = 0;
	    StringBuilder sb = new StringBuilder();
	    for (int i=0; i<=Str.length()-1; i++){
	    	if(i<=firstG-1) {
	    		sb.append(Str.charAt(i));
	    		continue;
	    	}
	    	if(i!=Str.length()-1 && i==firstG){
	    		sb.append("-");
	    		
	    		}
	        sb.append(Str.charAt(i));
	        count++;
	        if(count==K) {
	        	count = 0;
	        	if(i!=Str.length()-1) {
	        	sb.append("-");
	        	}
	        }
	       
	      }
	    System.out.println(sb.toString());
	    return sb.toString();
	}
	}
