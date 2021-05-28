class FilmJones  { 
    
    public static String deci(String message) {

	        int chiffreCle = message.length() /2;

	        String sousChaine = message.substring(5, (chiffreCle + 5)).toString();

	        String messageReplace = sousChaine.replace("@#?", " ");

	        String reverseMessage = new StringBuilder(messageReplace).reverse().toString();

	        return reverseMessage;
	    }

	    public static void main(String[] args) {
	        System.out.println(deci("0@sn9sirppa@#?ia'jgtvryko1"));
	        System.out.println(deci("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
	        System.out.println(deci("aopi?sedohtém@#?sedhtmg+p9l!"));
	        System.out.println(deci("aopi?alocacoc@#?edhtmg+p9l!"));
	        
	       
	    }



}

