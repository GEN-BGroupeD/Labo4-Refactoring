package ch.heigvd.gen2019;

public class Product {
    public static final int SIZE_NOT_APPLICABLE = -1;
    private String code;
    private int color;
    private int size;
    private double price;
    private String currency;

    public Product(String code, int color, int size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    String getColor() {
        switch (color) {
            case 1:
                return "blue";
            case 2:
                return "red";
            case 3:
                return "yellow";
            default:
                return "no color";
        }
    }

    String getSize() {
        switch (size) {
            case 1:
                return "XS";
            case 2:
                return "S";
            case 3:
                return "M";
            case 4:
                return "L";
            case 5:
                return "XL";
            case 6:
                return "XXL";
            default:
                return "Invalid Size";
        }
    }

    void getProductContents(StringBuffer sb) {
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(getColor());
        sb.append("\", ");

        if (size != SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"");
            sb.append(getSize());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(getCurrency());
        sb.append("\"}, ");
    }
}