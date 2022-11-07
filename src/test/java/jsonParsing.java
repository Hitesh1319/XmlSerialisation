import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class jsonParsing {
    public static void main(String[] args) throws IOException {

        byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\HiteshSharma\\IdeaProjects\\PlainOldJavaObject\\src\\test\\java\\Data.json"));
        ObjectMapper mapper = new ObjectMapper();

        PersonalDetail person = mapper.readValue(jsonData, PersonalDetail.class);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getEmail());
        System.out.println(person.getAddress().getCountry());
        System.out.println(person.getAddress().getState());
        System.out.println(person.getAddress().getAbc().getDistrict());
        System.out.println(person.getAddress().getAbc().getPin());
    }
}
