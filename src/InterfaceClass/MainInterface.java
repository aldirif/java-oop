package InterfaceClass;

public class MainInterface {
    public static void main(String[] args) {
        HasBrand brand = new HasBrandImpl("Indo Copy", 2000);
        System.out.println("Brand Name "+ brand.getBrand());
        System.out.println("Brand Price "+ brand.getPrice());
    }
}
