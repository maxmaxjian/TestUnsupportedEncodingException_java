
import javax.xml.ws.http.HTTPException;
import java.io.UnsupportedEncodingException;

public class Solution {

    public static void main(String[] args) {
        Exception ex = new UnsupportedEncodingException("UnsupportedEncodingException");
        System.out.println(ex.getMessage());
        Exception e = new IllegalStateException("IllegalStateException");
        System.out.println(e.getMessage());
        Exception exp = new HTTPException(400);
        System.out.println(((HTTPException)exp).getStatusCode());
    }
}
