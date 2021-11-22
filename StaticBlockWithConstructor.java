public class StaticBlockWithConstructor {
public static void main(String[] args)
{
    new BlockAndConstructor();
    new BlockAndConstructor();
}
}

class BlockAndConstructor
{
    static
    {
        System.out.println("Static Block Called");
    }
    BlockAndConstructor()
    {
        System.out.println("Constructor Called");
    }
}

/*
Output -
Static Block Called
Constructor Called
Constructor Called
 */