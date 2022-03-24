package data;

/**
 *
 * @author hoangduongngg
 */
import java.io.*;
import java.util.*;
import business.*;
public class ProductIO {
    public static Product getProduct(String code, String filepath) {
        try {
            File file = new File(filepath);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                String productCode = t.nextToken();
                if (code.equalsIgnoreCase(productCode)) {
                    String description = t.nextToken();
                    double price = Double.parseDouble(t.nextToken());
                    Product p = new Product();
                    p.setCode(code);
                    p.setDescription(description);
                    p.setPrice(price);
                    in.close();
                    return p;
                }
               line = in.readLine();
            }
            in.close();
            return null;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static ArrayList<Product> getProducts(String filepath) {
        ArrayList<Product> products = new ArrayList<>();
        File file = new File(filepath);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                // Tao bien san pham
                StringTokenizer t = new StringTokenizer(line, "|");
                String code = t.nextToken();
                String description = t.nextToken();
                double price = Double.parseDouble(t.nextToken());
                Product p = new Product();
                p.setCode(code);
                p.setDescription(description);
                p.setPrice(price);
                
                // Them san pham vao danh sach
                products.add(p);
                line = in.readLine();
            }
            in.close();
            return products;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
