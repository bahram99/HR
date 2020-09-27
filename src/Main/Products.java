package Main;

public class Products {
    private int id;
    private int pro_number;
    private String pro_name;
    protected int category_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPro_number() {
        return pro_number;
    }

    public void setPro_number(int pro_number) {
        this.pro_number = pro_number;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
