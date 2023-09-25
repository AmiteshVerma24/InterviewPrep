package Questions.Strings;
// https://leetcode.com/problems/defanging-an-ip-address/description/
 class defanging_address {
    public static void main(String[] args) {
        System.out.println(defangIPaddr( "255.100.50.0"));
    }
    public static String defangIPaddr(String address) {
        StringBuilder stb = new StringBuilder();
        for(int i = 0 ; i < address.length() ; i++){
            if(address.charAt(i) == '.'){
                stb.append("[.]");
            }else{
                stb.append(address.charAt(i));
            }
        }
        System.out.println(stb);
        return stb.toString();
    }
}
