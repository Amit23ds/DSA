public class Codec {
    List<String> temp=new ArrayList<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        temp.add(longUrl);
        return String.valueOf(temp.size()-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return temp.get(Integer.parseInt(shortUrl));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));