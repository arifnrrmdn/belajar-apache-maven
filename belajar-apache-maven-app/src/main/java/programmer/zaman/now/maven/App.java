package programmer.zaman.now.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();

        Person person1 = new Person("Arif Nur Ramadhan");

        String json = gson.toJson(person1);
        System.out.println(json);

    }
}
