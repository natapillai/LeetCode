public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        System.out.println(strs);

        StringBuffer sb = new StringBuffer();

        for(String str: strs){
            sb.append(str.length());
            sb.append("*");
            sb.append(str);
        }

        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> list = new ArrayList<>();

        int count = 0;

        while(count < s.length()){
            int starIndex = s.indexOf('*', count);
            int size = Integer.parseInt(s.substring(count, starIndex));
            count = starIndex + 1;
            list.add(s.substring(count,count + size));
            count+=size;
        }

        return list;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));