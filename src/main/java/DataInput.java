import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class DataInput {

    public static MovieLibrary getMoviesToList(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        MovieLibrary movieLibrary = mapper.readValue(file, MovieLibrary.class);
        return movieLibrary;
    }
}
