class Solution {
    public String solution(String new_id) {
        String result = "";
        result = first(new_id);
        result = second(result);
        result = third(result);
        result = fourth(result);
        result = fifth(result);
        result = sixth(result);
        result = seventh(result);
        
        return result;
    }
    
    public String first(String id) {
        return id.toLowerCase();
    }
    
    public String second(String id) {
        StringBuilder sb = new StringBuilder();
        
        for (String token : id.split("")) {
            if (token.matches("[a-z]")) sb.append(token);
            if (token.matches("[0-9]")) sb.append(token);
            if (token.matches("[-]")) sb.append(token);
            if (token.matches("[_]")) sb.append(token);
            if (token.matches("[.]")) sb.append(token);
        }
        return sb.toString();
    }
    
    public String third(String id) {
        return id.replaceAll("[.]{2,}", ".");
    }
    
    public String fourth(String id) {
        if (id.startsWith(".")) id = id.substring(1);
        if (id.endsWith(".")) id = id.substring(0, id.length() - 1);
        return id;
    }
    
    public String fifth(String id) {
        if (id.isEmpty()) return "a";
        return id;
    }
    
    public String sixth(String id) {
        if (id.length() >= 16) id = id.substring(0, 15);
        if (id.endsWith(".")) id = id.substring(0, id.length() - 1);
        return id;
    }
    
    public String seventh(String id) {
        StringBuilder sb = new StringBuilder(id);
        while (sb.length() < 3) {
            sb.append(id.charAt(id.length() - 1));
        }
        return sb.toString();
    }
}