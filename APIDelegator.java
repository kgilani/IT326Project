//APIDelegator class contains methods and variables pertaining to the retrieval of information from any API
import java.util.HashMap;

interface APIDelegator {
    private final String URI;
    private final String API_KEY;

    private String get(String uriExtension);
    private String post(String uriExtension, HashMap<?,?> body);
}
