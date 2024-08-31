package helper;

public class PersonClasspath
{
    String name;

    public PersonClasspath(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[name=" + name + "]";
    }
}
