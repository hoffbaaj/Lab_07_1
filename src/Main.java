public class Main {
    public static void main(String[] args)
    {
        for(int x=0; x <= 30; x++)
        {
            System.out.println(x);
        }

        //----------------------------------------------------------------------------------------------------
        for(int l = 0; l < 3; l++)
        {
            System.out.println();
        }

        for(int x=30; x >= 0; x--)
        {
            System.out.println(x);
        }

//---------------------------------------------------------------------------------------------------------------
        for(int l = 0; l < 3; l++)
        {
            System.out.println();
        }

        for(int x=0; x <= 18; x+=3)
        {
            System.out.println(x);
        }
//---------------------------------------------------------------------------------------------------------------------
        for(int l = 0; l < 3; l++)
        {
            System.out.println();
        }

        for(int x=10; x >= 0; x-=2)
        {
            System.out.println(x);
        }
        //-----------------------------------------------------------------------------------------
        for(int l = 0; l < 3; l++)
        {
            System.out.println();
        }

        for(int x=10; x >= 0; x-=2)
        {
            System.out.println(x);
        }
        //----------------------------------------------------------------------
        for(int l = 0; l < 3; l++)
        {
            System.out.println();
        }

        for(int r=1; r <= 5; r++)
        {

            for(int c=1; c<=r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //---------------------------------------------------------------------------
        /*for(int l = 0; l < 3; l++)
        {
            System.out.println();
        }
        for(int r=1; r <= 5; r++)
        {
            for(int c=1; c<=r; c--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    */
        for (int l = 0; l < 3; l++) //blank lines
        {
            System.out.println();
        }

        for (int r = 5; r >= 1; r--)
        {
            for (int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //-------------------------------------------------------------------------------
        for(int l = 0; l < 3; l++)
        {
            System.out.println();
        }

        for(int r=1; r <= 5; r++)
        {
            for(int c=1; c<=5; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}