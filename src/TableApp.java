import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TableApp
{

    public static void main(String[] args) throws IOException
    {
        String name = null;
        int year = 0;
        int prod = 0;

        BufferedReader input = new BufferedReader(new InputStreamReader(
                System.in));

        Obiect product = new Obiect(name, year, prod);

        Obiect[] productsArray = new Obiect[3];

        for (int i = 0; i < productsArray.length; i++)
        {

            System.out.println("Wpisz nazwę produktu lub naciśnij # by zatrzymać: ");
            name = input.readLine();

            if (!("#".equals(name)))
            {

                productsArray[i] = product;
                product.setProductName(name);

                System.out.println("Wpisz datę produkcji: ");
                year = Integer.parseInt(input.readLine());
                productsArray[i] = product;
                product.setProductionYear(year);

                System.out.println("Wpisz ilość produktów: ");
                prod = Integer.parseInt(input.readLine());
                productsArray[i] = product;
                product.setProductionNumber(prod);

                productsArray[i] = new Obiect(name, year, prod);

            }

        }

    }
}
