package MyString;

// Creating an Immutable class

public class MyString
{
    final String rts;
    MyString(String s)
    {
        this.rts = s;
    }
    public String get()
    {
        return rts;
    }

}
