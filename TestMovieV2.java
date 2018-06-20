
 /**
 * This class demonstrates the insertion sort algorithm.
 *
 * @author Briana Berger
 * @version 06/17/17
 */

public class TestMovieV2
{
    public static void main(String[] args)
    {
        Movie[] movies = new Movie[10];
        Movie[] sorted = new Movie[10];

        movies[0] = new Movie("La La Land", 2016, "Summit Entertainment");
        movies[1] = new Movie("The Big Sick", 2017,"Lionsgate");
        movies[2] = new Movie("Gifted", 2017, "Fox Searchlight Pictures");
        movies[3] = new Movie("Hidden Figures", 2016, "20th Century Fox");
        movies[4] = new Movie("Mulan", 1988, "Walt Disney");
        movies[5] = new Movie("One Day", 2011, "Random House Films");
        movies[6] = new Movie("Becoming Jane", 2007, "HanWay Films");
        movies[7] = new Movie("Brooklyn", 2015, "BBC Films");
        movies[8] = new Movie("Divergent", 2014, "Lionsgate");
        movies[9] = new Movie("Harry Potter", 2001, "Warner Bros");
        
        System.out.println("    <<<< Before Sorting >>>> \n");
        printArray(movies);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by title ascending - passing an array and order >>>>\n");
        sorted = insertionTitle(movies, 1);
        printArray(sorted);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by title descending - passing an array and order >>>>\n");
        sorted = insertionTitle(movies, 2);
        printArray(sorted);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by year ascending - passing an array and order >>>>\n");
        sorted = insertionYear(movies, 1);
        printArray(sorted);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by year descending - passing an array and order >>>>\n");
        sorted = insertionYear(movies, 2);
        printArray(sorted);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by studio ascending - passing an array and order >>>>\n");
        sorted = insertionStudio(movies, 1);
        printArray(sorted);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by studio descending - passing an array and order >>>>\n");
        sorted = insertionStudio(movies, 2);
        printArray(sorted);
    }
    
    public static void printArray(Movie[] source)
    {
        for(int i = 0; i < source.length; i++)
            System.out.println(source[i]);
            
        System.out.println();
    }
    
    public static Movie[] insertionTitle(Movie[] source, int order)
    {
        Movie[] dest = new Movie[source.length];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if(order == 1)
                {
                    if(next.getTitle().compareTo(dest[k-1].getTitle()) > 0)
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
                else if (order == 2)
                {
                    if(next.getTitle().compareTo(dest[k-1].getTitle()) < 0)
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
            }
            dest[insertIndex] = next;
        }
        return dest;
    }
    
    public static Movie[] insertionYear(Movie[] source, int order)
    {
        Movie[] dest = new Movie[source.length];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if(order == 1)
                {
                    if(next.getYear() > dest[k-1].getYear())
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
                else if (order == 2)
                {
                    if(next.getYear() < dest[k-1].getYear())
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
            }
            dest[insertIndex] = next;
        }
        return dest;
    }
    
    public static Movie[] insertionStudio(Movie[] source, int order)
    {
        Movie[] dest = new Movie[source.length];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if(order == 1)
                {
                    if(next.getStudio().compareTo(dest[k-1].getStudio()) > 0)
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
                else if (order == 2)
                {
                    if(next.getStudio().compareTo(dest[k-1].getStudio()) < 0)
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
            }
            dest[insertIndex] = next;
        }
        return dest;
    }
} // end of class
